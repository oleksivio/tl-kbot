[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [ShippingQueryFilter](./index.md)

# ShippingQueryFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class ShippingQueryFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ShippingQueryFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], from: `[`UserFilter`](../-user-filter/index.md)` = UserFilter(status = AnnotationState.OFF), invoicePayload: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), shippingAddress: `[`ShippingAddressFilter`](../-shipping-address-filter/index.md)` = ShippingAddressFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [from](from.md) | `val from: `[`UserFilter`](../-user-filter/index.md) |
| [invoicePayload](invoice-payload.md) | `val invoicePayload: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [shippingAddress](shipping-address.md) | `val shippingAddress: `[`ShippingAddressFilter`](../-shipping-address-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
