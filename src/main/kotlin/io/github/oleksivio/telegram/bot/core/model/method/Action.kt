package io.github.oleksivio.telegram.bot.core.model.method

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import io.github.oleksivio.telegram.bot.core.model.CommonResponse
import kotlin.reflect.KClass

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
abstract class Action<RES> {

    @get:JsonIgnore
    protected abstract val resultWrapperClass: KClass<out CommonResponse<RES>>

    @JsonIgnore
    abstract fun send(): RES?
}
