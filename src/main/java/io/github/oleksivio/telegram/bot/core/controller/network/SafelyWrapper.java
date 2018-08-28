package io.github.oleksivio.telegram.bot.core.controller.network;

import org.springframework.web.client.RestOperations;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

interface SafelyWrapper<T extends CommonResponse> {
    T make(RestOperations template, String url);
}
