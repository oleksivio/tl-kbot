package ru.ioleksiv.telegram.bot.core.controller.network;

import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestOperations;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.exceptions.NetworkerException;
import ru.ioleksiv.telegram.bot.core.model.actions.IServerApi;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;

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

    @Nullable
    public <T extends CommonResponse> T run(IServerApi action, Class<T> clazz) throws NetworkerException {
        try {
            return template.postForEntity(url, action, clazz).getBody();
        }
        catch (RestClientException e) {
            LOG.error("", e);
            throw new NetworkerException();
        }
    }

}
