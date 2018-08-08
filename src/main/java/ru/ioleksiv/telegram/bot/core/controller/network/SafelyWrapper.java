package ru.ioleksiv.telegram.bot.core.controller.network;

import org.springframework.web.client.RestOperations;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

interface SafelyWrapper<T extends CommonResponse> {
    T make(RestOperations template, String url);
}
