package ru.ioleksiv.telegram.bot.core.controller.network;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestOperations;
import ru.ioleksiv.telegram.bot.api.model.ErrorResponse;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.method.Action;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

import java.io.IOException;
import java.util.Optional;

@Controller
public class Networker {
    private static final Logger LOG = LoggerFactory.getLogger(Handler.class);

    private static final String TELEGRAM_SERVER_URL = "https://api.telegram.org/bot";
    private static final char URL_SEPARATOR = '/';
    private final RestOperations template;
    private final String url;

    public Networker(RestOperations template,
                     @Value("${telegram.bot.token}") String token) {
        this.url = TELEGRAM_SERVER_URL + token + URL_SEPARATOR;
        this.template = template;
    }

    //FIXME combine run and upload methods.

    public <T extends CommonResponse> Optional<T> run(Action action,
                                                      Class<T> clazz,
                                                      @Nullable NetworkError networkError) {
        try {
            return Optional.of(template.postForEntity(url, action, clazz).getBody());
        }
        catch (HttpClientErrorException httpException) {
            if (networkError != null) {
                networkError.onServerError(parseErrorResponse(httpException));
            }
        }
        catch (RestClientException e) {
            LOG.error("", e);
        }
        return Optional.empty();
    }

    @Nullable
    private static ErrorResponse parseErrorResponse(HttpClientErrorException exception) {
        String serverException = exception.getResponseBodyAsString();
        try {
            return new ObjectMapper().readValue(serverException, ErrorResponse.class);
        }
        catch (IOException ignored) {

        }

        return null;

    }

    public <T extends CommonResponse> Optional<T> upload(MultiValueMap<String, Object> requestMap,
                                                         Class<T> clazz,
                                                         @Nullable NetworkError networkError) {
        try {

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);

            HttpEntity<MultiValueMap<String, Object>> requestEntity =
                    new HttpEntity<>(requestMap, headers);

            return Optional.of(template.postForObject(url, requestEntity, clazz));
        }
        catch (HttpClientErrorException httpException) {
            if (networkError != null) {
                networkError.onServerError(parseErrorResponse(httpException));
            }
        }
        catch (RestClientException e) {
            LOG.error("", e);
        }
        return Optional.empty();

    }

}

