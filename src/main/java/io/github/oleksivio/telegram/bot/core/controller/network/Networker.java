package io.github.oleksivio.telegram.bot.core.controller.network;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.oleksivio.telegram.bot.api.model.ErrorResponse;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestOperations;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

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

    <T extends CommonResponse> Optional<T> safelyRun(SafelyWrapper<T> networker,
                                                     Optional<NetworkError> networkErrorOpt) {
        try {
            return Optional.of(networker.make(template, url));
        }
        catch (HttpClientErrorException httpException) {
            networkErrorOpt.ifPresent(networkError -> {
                parseErrorResponse(httpException).ifPresent(networkError::onServerError);
            });
        }
        catch (RestClientException e) {
            LOG.error("", e);
        }
        return Optional.empty();
    }

    private static Optional<ErrorResponse> parseErrorResponse(HttpClientErrorException exception) {
        String serverException = exception.getResponseBodyAsString();
        try {
            ErrorResponse errorResponse = new ObjectMapper().readValue(serverException, ErrorResponse.class);
            return Optional.of(errorResponse);
        }
        catch (IOException ignored) {

        }

        return Optional.empty();

    }

}

