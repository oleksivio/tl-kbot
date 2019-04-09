[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.result](../index.md) / [HandlerResult](./index.md)

# HandlerResult

`class HandlerResult`

Used to return result from receiver functions.
For example when in [Session](../../io.github.oleksivio.telegram.bot.api.annotations.behavior/-session/index.md) annotated class
rises error with [HandlerResult.error](error.md) you can invoke error handler

### Properties

| Name | Summary |
|---|---|
| [isCancelSession](is-cancel-session.md) | `val isCancelSession: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Internal |
| [isError](is-error.md) | `val isError: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Internal |
| [isPassed](is-passed.md) | `val isPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Internal |
| [isSucess](is-sucess.md) | `val isSucess: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Internal |

### Companion Object Functions

| Name | Summary |
|---|---|
| [cancelSession](cancel-session.md) | `fun cancelSession(): `[`HandlerResult`](./index.md)<br>Receiver function result to deactivate [Session](../../io.github.oleksivio.telegram.bot.api.annotations.behavior/-session/index.md) annotated class |
| [error](error.md) | `fun error(): `[`HandlerResult`](./index.md)<br>Receiver function result to invoke [Session.Error](../../io.github.oleksivio.telegram.bot.api.annotations.behavior/-session/-error/index.md) in [Session](../../io.github.oleksivio.telegram.bot.api.annotations.behavior/-session/index.md) annotated class |
| [pass](pass.md) | `fun pass(): `[`HandlerResult`](./index.md)<br>Internal |
| [success](success.md) | `fun success(): `[`HandlerResult`](./index.md)<br>Receiver function result when function was successfully finished. |
