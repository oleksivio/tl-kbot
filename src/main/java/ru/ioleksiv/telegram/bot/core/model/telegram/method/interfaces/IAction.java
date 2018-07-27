package ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.internal.jline.internal.Nullable;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface IAction<RES> {

    @JsonIgnore
    @Nullable
    RES run();

    @JsonProperty("method")
    String getMethod();

    @JsonIgnore
    Class<? extends CommonResponse<RES>> getResultWrapperClass();
}
