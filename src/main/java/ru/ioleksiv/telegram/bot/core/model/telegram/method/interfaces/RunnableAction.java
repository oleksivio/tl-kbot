package ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.internal.jline.internal.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;

public abstract class RunnableAction<RES> implements IAction<RES> {
    private static final Logger LOG = LoggerFactory.getLogger(RunnableAction.class);

    private final String method;
    private final Networker networker;

    protected RunnableAction(String method, Networker networker) {
        this.method = method;
        this.networker = networker;
    }

    @Override
    @Nullable
    public RES run() {
        CommonResponse<RES> commonResponse = networker.run(this, getResultWrapperClass());

        return commonResponse != null ? commonResponse.get() : null;
    }

    @Override
    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

}
