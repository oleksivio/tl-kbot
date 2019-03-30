[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [InvoiceFilter](./index.md)

# InvoiceFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class InvoiceFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InvoiceFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], title: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), description: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), startParameter: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), currency: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), totalAmount: <ERROR CLASS> = IntegerFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [currency](currency.md) | `val currency: <ERROR CLASS>` |
| [description](description.md) | `val description: <ERROR CLASS>` |
| [startParameter](start-parameter.md) | `val startParameter: <ERROR CLASS>` |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [title](title.md) | `val title: <ERROR CLASS>` |
| [totalAmount](total-amount.md) | `val totalAmount: <ERROR CLASS>` |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
