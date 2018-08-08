package ru.ioleksiv.telegram.bot.core.controller.network;

import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

import java.util.Optional;

@Controller
public class FileNetworker extends Networker {
    private static final Logger LOG = LoggerFactory.getLogger(Handler.class);

    public FileNetworker(RestOperations template,
                         @Value("${telegram.bot.token}") String token) {
        super(template, token);
    }

    public <T extends CommonResponse> Optional<T> run(MultiValueMap<String, Object> requestMap,
                                                      Class<T> clazz,
                                                      @Nullable NetworkError networkError) {
        SafelyWrapper<T> uploadSafely = (template, url) -> {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);

            HttpEntity<MultiValueMap<String, Object>> requestEntity =
                    new HttpEntity<>(requestMap, headers);

            return template.postForObject(url, requestEntity, clazz);
        };

        return safelyRun(uploadSafely, networkError);
    }

}

