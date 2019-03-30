[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.primitive](../index.md) / [BooleanFilter](./index.md)

# BooleanFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class BooleanFilter`

[BooleanFilter](./index.md) annotation used for filtering incoming
[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) value.

### Parameters

`state` - [BooleanState](../../io.github.oleksivio.telegram.bot.api.model.annotation/-boolean-state/index.md) is enum filtering condition
it could be TRUE, FALSE and NON_NULL

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BooleanFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, state: `[`BooleanState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-boolean-state/index.md)` = BooleanState.NON_NULL)`<br>[BooleanFilter](./index.md) annotation used for filtering incoming [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) value. |

### Properties

| Name | Summary |
|---|---|
| [state](state.md) | `val state: `[`BooleanState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-boolean-state/index.md)<br>[BooleanState](../../io.github.oleksivio.telegram.bot.api.model.annotation/-boolean-state/index.md) is enum filtering condition it could be TRUE, FALSE and NON_NULL |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
