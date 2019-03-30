package io.github.oleksivio.telegram.bot.api.model.result

/**
 * Used to return result from receiver functions.
 * For example when in [Session][io.github.oleksivio.telegram.bot.api.annotations.behavior.Session] annotated class
 * rises error with [HandlerResult.error] you can invoke error handler
 */
class HandlerResult private constructor(private val state: ResultState) {

    /**
     * Internal
     *
     * @return true if result is pass
     */
    val isPassed: Boolean
        get() = state === ResultState.PASS

    /**
     * Internal
     *
     * @return true if result is error
     */
    val isError = state === ResultState.ERROR

    /**
     * Internal
     *
     * @return true if result is cancel session
     */
    val isCancelSession = state === ResultState.CANCEL_SESSION

    /**
     * Internal
     *
     * @return true if result is success
     */
    val isSucess =  state === ResultState.SUCCESS

    companion object {

        /**
         * Internal
         *
         * Receiver function result when update is not suitable
         */
        fun pass(): HandlerResult {
            return HandlerResult(ResultState.PASS)
        }

        /**
         * Receiver function result when function was successfully finished.
         */
        fun success(): HandlerResult {
            return HandlerResult(ResultState.SUCCESS)
        }

        /**
         * Receiver function result to invoke
         * [Session.Error][io.github.oleksivio.telegram.bot.api.annotations.behavior.Session.Error]
         * in [Session][io.github.oleksivio.telegram.bot.api.annotations.behavior.Session]
         * annotated class
         */
        fun error(): HandlerResult {
            return HandlerResult(ResultState.ERROR)

        }

        /**
         * Receiver function result to deactivate
         * [Session][io.github.oleksivio.telegram.bot.api.annotations.behavior.Session]
         * annotated class
         */
        fun cancelSession(): HandlerResult {
            return HandlerResult(ResultState.CANCEL_SESSION)
        }
    }

}
