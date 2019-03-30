[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.result](../index.md) / [HandlerResult](./index.md)

# HandlerResult

`class HandlerResult`

Used to return result from receiver functions.
For example when in [Session](../../io.github.oleksivio.telegram.bot.api.annotations.behavior/-session/index.md) annotated class
rises error with [HandlerResult.error](error.md) you can invoke error handler

### Properties

| Name | Summary |
|---|---|
| [isPassed](is-passed.md) | `val isPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Internal |

### Functions

| Name | Summary |
|---|---|
| [hasCancelSession](has-cancel-session.md) | `fun hasCancelSession(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Internal |
| [hasError](has-error.md) | `fun hasError(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Internal |
| [hasSuccess](has-success.md) | `fun hasSuccess(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Internal |

### Companion Object Functions

| Name | Summary |
|---|---|
| [cancelSession](cancel-session.md) | `fun cancelSession(): `[`HandlerResult`](./index.md)<br>Receiver function result to deactivate [io.github.oleksivio.telegram.bot.api.annotations.behavior.Session](../../io.github.oleksivio.telegram.bot.api.annotations.behavior/-session/index.md) annotated class |
| [error](error.md) | `fun error(): `[`HandlerResult`](./index.md)<br>Receiver function result to invoke [io.github.oleksivio.telegram.bot.api.annotations.behavior.Session.Error](../../io.github.oleksivio.telegram.bot.api.annotations.behavior/-session/-error/index.md) in [io.github.oleksivio.telegram.bot.api.annotations.behavior.Session](../../io.github.oleksivio.telegram.bot.api.annotations.behavior/-session/index.md) annotated class |
| [pass](pass.md) | `fun pass(): `[`HandlerResult`](./index.md)<br>Internal |
| [success](success.md) | `fun success(): `[`HandlerResult`](./index.md)<br>Receiver function result when function was successfully finished. |
