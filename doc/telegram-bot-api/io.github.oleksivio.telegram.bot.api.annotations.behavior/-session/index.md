[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.behavior](../index.md) / [Session](./index.md)

# Session

`@Target([AnnotationTarget.CLASS]) annotation class Session`

Annotation to mark class as session.

When bot receive update which passed all
[primitive](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/index.md) and
[composite](../../io.github.oleksivio.telegram.bot.api.annotations.filter.composite/index.md) filters
to method annotated by [Session.Initial](-initial/index.md) session class marked as active and
all next updates will be received only by this session class.

When bot receive update than can't passed filter to one of [Session.Order](-order/index.md) method

* if session class  has method annotated by [Session.Error](-error/index.md) with
[Session.Error.value](-error/value.md) equals [Session.Order.value](-order/value.md) method
annotated by [Session.Error](-error/index.md)  will be invoked
* else session will be wait valid message with no response.

When bot receive update which passed all
[primitive](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/index.md) and
[composite](../../io.github.oleksivio.telegram.bot.api.annotations.filter.composite/index.md) filters
to method annotated by [Session.Cancel](-cancel/index.md) session class market as inactive and
bot return to normal mode

Class that marked by this annotation must include:

* only one method annotated with [Session.Initial](-initial/index.md)
* only one method annotated with [Session.Cancel](-cancel/index.md)
* one or more method annotated with [Session.Order](-order/index.md)
* one or more method annotated with [Session.Error](-error/index.md)

For every [Session.Order](-order/index.md) method must be only one method
with [Session.Error](-error/index.md) with same order value

Could be more than one [Session.Order](-order/index.md) function with same value,
but it must have different filter

[Example](https://github.com/oleksivio/example-bot/blob/master/src/main/kotlin/telegram/bot/example/UserSessionExample.kt)

### Annotations

| Name | Summary |
|---|---|
| [Cancel](-cancel/index.md) | `annotation class Cancel` |
| [Error](-error/index.md) | `annotation class Error` |
| [Initial](-initial/index.md) | `annotation class Initial` |
| [Order](-order/index.md) | `annotation class Order` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Session(value: `[`SessionType`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-session-type/index.md)`)`<br>Annotation to mark class as session. |

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `val value: `[`SessionType`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-session-type/index.md) |
