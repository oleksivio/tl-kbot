[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [PreCheckoutQueryFilter](./index.md)

# PreCheckoutQueryFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class PreCheckoutQueryFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PreCheckoutQueryFilter(from: `[`UserFilter`](../-user-filter/index.md)` = UserFilter(status = AnnotationState.OFF), validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], currency: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), totalAmount: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), invoicePayload: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), shippingOptionId: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), orderInfo: `[`OrderInfoFilter`](../-order-info-filter/index.md)` = OrderInfoFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [currency](currency.md) | `val currency: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [from](from.md) | `val from: `[`UserFilter`](../-user-filter/index.md) |
| [invoicePayload](invoice-payload.md) | `val invoicePayload: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [orderInfo](order-info.md) | `val orderInfo: `[`OrderInfoFilter`](../-order-info-filter/index.md) |
| [shippingOptionId](shipping-option-id.md) | `val shippingOptionId: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [totalAmount](total-amount.md) | `val totalAmount: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
