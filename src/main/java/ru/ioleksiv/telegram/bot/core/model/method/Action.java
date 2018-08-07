package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

import java.util.Optional;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Action<RES> {

    @JsonIgnore
    public abstract Optional<RES> send();

    @JsonIgnore
    protected abstract Class<? extends CommonResponse<RES>> getResultWrapperClass();
}
