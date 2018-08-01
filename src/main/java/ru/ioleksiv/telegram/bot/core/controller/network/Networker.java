package ru.ioleksiv.telegram.bot.core.controller.network;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestOperations;
import ru.ioleksiv.telegram.bot.core.api.model.ErrorResponse;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.Action;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

import java.io.IOException;

public class Networker {
    private static final Logger LOG = LoggerFactory.getLogger(Handler.class);

    private static final String TELEGRAM_SERVER_URL = "https://api.telegram.org/bot";
    private static final char URL_SEPARATOR = '/';
    private final RestOperations template;
    private final String url;

    public Networker(RestOperations template,
                     String token) {
        this.url = TELEGRAM_SERVER_URL + token + URL_SEPARATOR;
        this.template = template;
    }


    //FIXME union run and upload methods.

    @Nullable
    public <T extends CommonResponse> T run(Action action,
                                            Class<T> clazz,
                                            @Nullable NetworkError networkError) {
        try {
            return template.postForEntity(url, action, clazz).getBody();
        }
        catch (HttpClientErrorException httpException) {
            if (networkError != null) {
                networkError.onServerError(parseErrorResponse(httpException));
            }
        }
        catch (RestClientException e) {
            LOG.error("", e);
        }
        return null;
    }

    @Nullable
    public <T extends CommonResponse> T upload(MultiValueMap<String, Object> requestMap,
                                               Class<T> clazz,
                                               @Nullable NetworkError networkError) {
        try {

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);

            HttpEntity<MultiValueMap<String, Object>> requestEntity =
                    new HttpEntity<>(requestMap, headers);

            return template.postForObject(url, requestEntity, clazz);
        }
        catch (HttpClientErrorException httpException) {
            if (networkError != null) {
                networkError.onServerError(parseErrorResponse(httpException));
            }
        }
        catch (RestClientException e) {
            LOG.error("", e);
        }
        return null;

    }

    @Nullable
    private static ErrorResponse parseErrorResponse(HttpClientErrorException exception){
        String serverException = exception.getResponseBodyAsString();
        try {
            return new ObjectMapper().readValue(serverException, ErrorResponse.class);
        } catch (IOException ignored){

        }

        return null;

    }

}

