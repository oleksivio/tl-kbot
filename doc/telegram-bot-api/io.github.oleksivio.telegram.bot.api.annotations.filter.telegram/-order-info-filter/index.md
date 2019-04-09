[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [OrderInfoFilter](./index.md)

# OrderInfoFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class OrderInfoFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OrderInfoFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], name: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), phoneNumber: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), email: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), shippingAddress: `[`ShippingAddressFilter`](../-shipping-address-filter/index.md)` = ShippingAddressFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [email](email.md) | `val email: <ERROR CLASS>` |
| [name](name.md) | `val name: <ERROR CLASS>` |
| [phoneNumber](phone-number.md) | `val phoneNumber: <ERROR CLASS>` |
| [shippingAddress](shipping-address.md) | `val shippingAddress: `[`ShippingAddressFilter`](../-shipping-address-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
