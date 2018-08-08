package ru.ioleksiv.telegram.bot.core.controller.network;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestOperations;
import ru.ioleksiv.telegram.bot.api.model.ErrorResponse;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

import java.io.IOException;
import java.util.Optional;

class Networker {
    private static final Logger LOG = LoggerFactory.getLogger(Handler.class);

    private static final String TELEGRAM_SERVER_URL = "https://api.telegram.org/bot";
    private static final char URL_SEPARATOR = '/';
    private final RestOperations template;
    private final String url;

    Networker(RestOperations template,
              String token) {
        url = TELEGRAM_SERVER_URL + token + URL_SEPARATOR;
        this.template = template;
    }

    <T extends CommonResponse> Optional<T> safelyRun(@NotNull SafelyWrapper<T> networker,
                                                     @Nullable NetworkError networkError) {
        try {
            return Optional.of(networker.make(template, url));
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

}

