package io.github.oleksivio.tl.kbot.server.api.model.method

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import io.github.oleksivio.tl.kbot.server.api.model.CommonResponse
import kotlin.reflect.KClass

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
abstract class Action<RES> {

    abstract val method: String

    abstract val resultWrapperClass: KClass<out CommonResponse<RES>>

}
