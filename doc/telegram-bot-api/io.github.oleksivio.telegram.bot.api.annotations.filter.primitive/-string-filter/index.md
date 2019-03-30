[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.primitive](../index.md) / [StringFilter](./index.md)

# StringFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class StringFilter`

[StringFilter](./index.md) annotation is used to filter incoming [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value

### Parameters

`regExp` -
* pass only math strings

`equalWith` -
* pass string which equal with one of input string

`startWith` -
* pass string which start with one of input string

`endWith` -
* pass string which end with one of input string

`contain` -
* pass string which contain one of input string

`notContain` -
* pass string which not contain any of input string

`notStartWith` -
* pass string which not start with any of input string

`notEndWith` -
* pass string which not end with any of input string

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StringFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, regExp: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "", equalWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], startWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], endWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], contain: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], notContain: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], notStartWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], notEndWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [])`<br>[StringFilter](./index.md) annotation is used to filter incoming [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value |

### Properties

| Name | Summary |
|---|---|
| [contain](contain.md) | `val contain: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<ul><li>pass string which contain one of input string</li></ul> |
| [endWith](end-with.md) | `val endWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<ul><li>pass string which end with one of input string</li></ul> |
| [equalWith](equal-with.md) | `val equalWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<ul><li>pass string which equal with one of input string</li></ul> |
| [notContain](not-contain.md) | `val notContain: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<ul><li>pass string which not contain any of input string</li></ul> |
| [notEndWith](not-end-with.md) | `val notEndWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<ul><li>pass string which not end with any of input string</li></ul> |
| [notStartWith](not-start-with.md) | `val notStartWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<ul><li>pass string which not start with any of input string</li></ul> |
| [regExp](reg-exp.md) | `val regExp: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<ul><li>pass only math strings</li></ul> |
| [startWith](start-with.md) | `val startWith: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<ul><li>pass string which start with one of input string</li></ul> |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
