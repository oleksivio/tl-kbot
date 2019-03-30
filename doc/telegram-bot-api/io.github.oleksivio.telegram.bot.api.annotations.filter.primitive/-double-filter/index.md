[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.primitive](../index.md) / [DoubleFilter](./index.md)

# DoubleFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class DoubleFilter`

[DoubleFilter](./index.md) annotation is used to filter incoming [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) value

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
| [&lt;init&gt;](-init-.md) | `DoubleFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, lessThan: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)` = java.lang.Double.MAX_VALUE, lessOrEqual: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)` = java.lang.Double.MAX_VALUE, greatThan: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)` = java.lang.Double.MIN_VALUE, greatOrEqual: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)` = java.lang.Double.MIN_VALUE, equal: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)` = java.lang.Double.NaN)`<br>[DoubleFilter](./index.md) annotation is used to filter incoming [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) value |

### Properties

| Name | Summary |
|---|---|
| [equal](equal.md) | `val equal: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<ul><li>passes only equal values</li></ul> |
| [greatOrEqual](great-or-equal.md) | `val greatOrEqual: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<ul><li>passes great and equals values</li></ul> |
| [greatThan](great-than.md) | `val greatThan: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<ul><li>passes only great values</li></ul> |
| [lessOrEqual](less-or-equal.md) | `val lessOrEqual: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<ul><li>passes  less and equal values</li></ul> |
| [lessThan](less-than.md) | `val lessThan: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<ul><li>passes only less values</li></ul> |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
