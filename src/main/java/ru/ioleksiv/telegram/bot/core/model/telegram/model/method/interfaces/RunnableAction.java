package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.interfaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;

public abstract class RunnableAction<T> implements IAction<T> {

    private final String method;
    private final Networker networker;

    protected RunnableAction(String method, Networker networker) {
        this.method = method;
        this.networker = networker;
    }

    @Override
    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @Override
    public T run() {
        CommonResponse<T> commonResponse = networker.run(this, getResultWrapperClass());

        if (commonResponse != null) {
            return commonResponse.get();
        }
        return null;
    }

}
