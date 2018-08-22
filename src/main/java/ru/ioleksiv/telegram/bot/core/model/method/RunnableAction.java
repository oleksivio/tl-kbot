package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

import java.util.Optional;

public abstract class RunnableAction<RES> extends NetworkErrorAction<RES> {
    private final String method;
    private final ActionNetworker actionNetworker;

    protected RunnableAction(String method, ActionNetworker actionNetworker) {
        this.method = method;
        this.actionNetworker = actionNetworker;
    }

    @Override
    public Optional<RES> send() {
        return actionNetworker.run(this,
                                   getResultWrapperClass(),
                                   getNetworkErrorListener())
                .map(CommonResponse::get);

    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

}
