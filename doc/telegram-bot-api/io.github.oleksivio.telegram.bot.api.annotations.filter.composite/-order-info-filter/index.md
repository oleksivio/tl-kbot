[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [OrderInfoFilter](./index.md)

# OrderInfoFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class OrderInfoFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OrderInfoFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], name: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), phoneNumber: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), email: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), shippingAddress: `[`ShippingAddressFilter`](../-shipping-address-filter/index.md)` = ShippingAddressFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [email](email.md) | `val email: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [name](name.md) | `val name: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [phoneNumber](phone-number.md) | `val phoneNumber: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [shippingAddress](shipping-address.md) | `val shippingAddress: `[`ShippingAddressFilter`](../-shipping-address-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
