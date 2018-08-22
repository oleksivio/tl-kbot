package ru.ioleksiv.telegram.bot.core.controller.network;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestOperations;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.Action;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

import java.util.Optional;

@Controller
public class ActionNetworker extends Networker {
    public ActionNetworker(RestOperations template,
                           @Value("${telegram.bot.token}") String token) {
        super(template, token);
    }

    public <T extends CommonResponse> Optional<T> run(Action action,
                                                      Class<T> clazz,
                                                      Optional<NetworkError> networkErrorOpt) {
        SafelyWrapper<T> postSafely = (template, url) -> template.postForEntity(url, action, clazz).getBody();

        return safelyRun(postSafely, networkErrorOpt);
    }

}

