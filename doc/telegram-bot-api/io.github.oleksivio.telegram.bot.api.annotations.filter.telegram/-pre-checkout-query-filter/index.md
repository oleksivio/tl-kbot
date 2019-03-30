[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [PreCheckoutQueryFilter](./index.md)

# PreCheckoutQueryFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class PreCheckoutQueryFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PreCheckoutQueryFilter(from: `[`UserFilter`](../-user-filter/index.md)` = UserFilter(status = AnnotationState.OFF), validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], currency: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), totalAmount: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), invoicePayload: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), shippingOptionId: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), orderInfo: `[`OrderInfoFilter`](../-order-info-filter/index.md)` = OrderInfoFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [currency](currency.md) | `val currency: <ERROR CLASS>` |
| [from](from.md) | `val from: `[`UserFilter`](../-user-filter/index.md) |
| [invoicePayload](invoice-payload.md) | `val invoicePayload: <ERROR CLASS>` |
| [orderInfo](order-info.md) | `val orderInfo: `[`OrderInfoFilter`](../-order-info-filter/index.md) |
| [shippingOptionId](shipping-option-id.md) | `val shippingOptionId: <ERROR CLASS>` |
| [totalAmount](total-amount.md) | `val totalAmount: <ERROR CLASS>` |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
