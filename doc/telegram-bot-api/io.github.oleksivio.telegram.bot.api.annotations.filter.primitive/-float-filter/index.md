[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.primitive](../index.md) / [FloatFilter](./index.md)

# FloatFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class FloatFilter`

[FloatFilter](./index.md) annotation is used to filter incoming [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) value

### Parameters

`lessThan` -
* passes only less values

`lessOrEqual` -
* passes  less and equal values

`greatThan` -
* passes only great values

`greatOrEqual` -
* passes great and equals values

`equal` -
* passes only equal values

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FloatFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, lessThan: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = java.lang.Float.MAX_VALUE, lessOrEqual: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = java.lang.Float.MAX_VALUE, greatThan: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = java.lang.Float.MIN_VALUE, greatOrEqual: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = java.lang.Float.MIN_VALUE, equal: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = java.lang.Float.NaN)`<br>[FloatFilter](./index.md) annotation is used to filter incoming [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) value |

### Properties

| Name | Summary |
|---|---|
| [equal](equal.md) | `val equal: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<ul><li>passes only equal values</li></ul> |
| [greatOrEqual](great-or-equal.md) | `val greatOrEqual: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<ul><li>passes great and equals values</li></ul> |
| [greatThan](great-than.md) | `val greatThan: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<ul><li>passes only great values</li></ul> |
| [lessOrEqual](less-or-equal.md) | `val lessOrEqual: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<ul><li>passes  less and equal values</li></ul> |
| [lessThan](less-than.md) | `val lessThan: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<ul><li>passes only less values</li></ul> |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
