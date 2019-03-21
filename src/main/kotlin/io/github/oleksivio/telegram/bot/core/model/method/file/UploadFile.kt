package io.github.oleksivio.telegram.bot.core.model.method.file

import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.method.Action
import io.github.oleksivio.telegram.bot.core.model.method.ActionMap

abstract class UploadFile<RES> : Action<RES>() {

    fun toActionMap(): ActionMap {
        val actionMap = ActionMap()
        actionMap.putString(ApiDict.METHOD_KEY, method)
        actionMap.fill()
        return actionMap
    }

    abstract fun ActionMap.fill()

}
