[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [SuccessfulPaymentFilter](./index.md)

# SuccessfulPaymentFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class SuccessfulPaymentFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SuccessfulPaymentFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], currency: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), totalAmount: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md)` = IntegerFilter(status = AnnotationState.OFF), invoicePayload: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), shippingOptionId: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md)` = NotNullFilter(status = AnnotationState.OFF), orderInfo: `[`OrderInfoFilter`](../-order-info-filter/index.md)` = OrderInfoFilter(status = AnnotationState.OFF), telegramPaymentChargeId: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md)` = NotNullFilter(status = AnnotationState.OFF), providerPaymentChargeId: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md)` = NotNullFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [currency](currency.md) | `val currency: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [invoicePayload](invoice-payload.md) | `val invoicePayload: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [orderInfo](order-info.md) | `val orderInfo: `[`OrderInfoFilter`](../-order-info-filter/index.md) |
| [providerPaymentChargeId](provider-payment-charge-id.md) | `val providerPaymentChargeId: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md) |
| [shippingOptionId](shipping-option-id.md) | `val shippingOptionId: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [telegramPaymentChargeId](telegram-payment-charge-id.md) | `val telegramPaymentChargeId: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md) |
| [totalAmount](total-amount.md) | `val totalAmount: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
