[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.primitive](../index.md) / [IntegerFilter](./index.md)

# IntegerFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class IntegerFilter`

[IntegerFilter](./index.md) annotation is used to filter incoming [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) value

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
| [&lt;init&gt;](-init-.md) | `IntegerFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, lessThan: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Integer.MAX_VALUE, lessOrEqual: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Integer.MAX_VALUE, greatThan: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Integer.MIN_VALUE, greatOrEqual: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Integer.MIN_VALUE)`<br>[IntegerFilter](./index.md) annotation is used to filter incoming [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) value |

### Properties

| Name | Summary |
|---|---|
| [greatOrEqual](great-or-equal.md) | `val greatOrEqual: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<ul><li>passes great and equals values</li></ul> |
| [greatThan](great-than.md) | `val greatThan: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<ul><li>passes only great values</li></ul> |
| [lessOrEqual](less-or-equal.md) | `val lessOrEqual: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<ul><li>passes  less and equal values</li></ul> |
| [lessThan](less-than.md) | `val lessThan: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<ul><li>passes only less values</li></ul> |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
