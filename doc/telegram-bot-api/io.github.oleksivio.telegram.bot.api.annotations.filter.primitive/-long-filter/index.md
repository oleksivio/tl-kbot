[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.primitive](../index.md) / [LongFilter](./index.md)

# LongFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class LongFilter`

[LongFilter](./index.md) annotation is used to filter incoming [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) value

### Parameters

`lessThan` -
* passes only less values

`lessOrEqual` -
* passes  less and equal values

`greatThan` -
* passes only great values

`greatOrEqual` -
* passes great and equals values

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LongFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, lessThan: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = java.lang.Long.MAX_VALUE, lessOrEqual: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = java.lang.Long.MAX_VALUE, greatThan: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = java.lang.Long.MIN_VALUE, greatOrEqual: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = java.lang.Long.MIN_VALUE)`<br>[LongFilter](./index.md) annotation is used to filter incoming [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) value |

### Properties

| Name | Summary |
|---|---|
| [greatOrEqual](great-or-equal.md) | `val greatOrEqual: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<ul><li>passes great and equals values</li></ul> |
| [greatThan](great-than.md) | `val greatThan: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<ul><li>passes only great values</li></ul> |
| [lessOrEqual](less-or-equal.md) | `val lessOrEqual: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<ul><li>passes  less and equal values</li></ul> |
| [lessThan](less-than.md) | `val lessThan: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<ul><li>passes only less values</li></ul> |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
