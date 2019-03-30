[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [SuccessfulPaymentFilter](./index.md)

# SuccessfulPaymentFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class SuccessfulPaymentFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SuccessfulPaymentFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], currency: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), totalAmount: <ERROR CLASS> = IntegerFilter(status = AnnotationState.OFF), invoicePayload: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), shippingOptionId: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), orderInfo: `[`OrderInfoFilter`](../-order-info-filter/index.md)` = OrderInfoFilter(status = AnnotationState.OFF), telegramPaymentChargeId: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), providerPaymentChargeId: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [currency](currency.md) | `val currency: <ERROR CLASS>` |
| [invoicePayload](invoice-payload.md) | `val invoicePayload: <ERROR CLASS>` |
| [orderInfo](order-info.md) | `val orderInfo: `[`OrderInfoFilter`](../-order-info-filter/index.md) |
| [providerPaymentChargeId](provider-payment-charge-id.md) | `val providerPaymentChargeId: <ERROR CLASS>` |
| [shippingOptionId](shipping-option-id.md) | `val shippingOptionId: <ERROR CLASS>` |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [telegramPaymentChargeId](telegram-payment-charge-id.md) | `val telegramPaymentChargeId: <ERROR CLASS>` |
| [totalAmount](total-amount.md) | `val totalAmount: <ERROR CLASS>` |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
