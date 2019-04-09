[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.payments](../index.md) / [ShippingQuery](./index.md)

# ShippingQuery

`data class ShippingQuery : IUserFrom`

[ShippingQuery](https://core.telegram.org/bots/api/#shippingquery)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ShippingQuery(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, from: `[`User`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`?, invoicePayload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, shippingAddress: `[`ShippingAddress`](../-shipping-address/index.md)`? = null)`<br>[ShippingQuery](https://core.telegram.org/bots/api/#shippingquery) |

### Properties

| Name | Summary |
|---|---|
| [from](from.md) | `var from: `[`User`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`?`<br>To setup filter: |
| [id](id.md) | `var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>id String Unique query identifier |
| [invoicePayload](invoice-payload.md) | `var invoicePayload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [shippingAddress](shipping-address.md) | `var shippingAddress: `[`ShippingAddress`](../-shipping-address/index.md)`?`<br>To setup filter: |
