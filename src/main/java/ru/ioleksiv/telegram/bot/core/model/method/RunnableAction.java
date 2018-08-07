package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

import java.util.Optional;

public abstract class RunnableAction<RES> extends NetworkErrorAction<RES> {
    private static final Logger LOG = LoggerFactory.getLogger(RunnableAction.class);

    private final String method;
    private final Networker networker;

    protected RunnableAction(String method, Networker networker) {
        this.method = method;
        this.networker = networker;
    }

    @Override
    public Optional<RES> send() {
        return networker.run(this,
                             getResultWrapperClass(),
                             getNetworkErrorListener())
                .map(CommonResponse::get);

    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

}
