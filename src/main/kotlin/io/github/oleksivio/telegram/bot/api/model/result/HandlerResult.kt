package io.github.oleksivio.telegram.bot.api.model.result

class HandlerResult private constructor(private val state: ResultState) {

    val isPassed: Boolean
        get() = state === ResultState.PASS

    fun hasError(): Boolean {
        return state === ResultState.ERROR
    }

    fun hasCancelSession(): Boolean {
        return state === ResultState.CANCEL_SESSION
    }

    fun hasSuccess(): Boolean {
        return state === ResultState.SUCCESS
    }

    companion object {

        fun pass(): HandlerResult {
            return HandlerResult(ResultState.PASS)
        }

        fun success(): HandlerResult {
            return HandlerResult(ResultState.SUCCESS)
        }

        fun error(): HandlerResult {
            return HandlerResult(ResultState.ERROR)

        }

        fun cancelSession(): HandlerResult {
            return HandlerResult(ResultState.CANCEL_SESSION)
        }
    }

}
