[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.payments](../index.md) / [PreCheckoutQuery](./index.md)

# PreCheckoutQuery

`data class PreCheckoutQuery : IUserFrom`

[PreCheckoutQuery](https://core.telegram.org/bots/api/#precheckoutquery)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PreCheckoutQuery(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, from: `[`User`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`?, currency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, totalAmount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, invoicePayload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, shippingOptionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, orderInfo: `[`OrderInfo`](../-order-info/index.md)`? = null)`<br>[PreCheckoutQuery](https://core.telegram.org/bots/api/#precheckoutquery) |

### Properties

| Name | Summary |
|---|---|
| [currency](currency.md) | `var currency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [from](from.md) | `var from: `[`User`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`?`<br>To setup filter: |
| [id](id.md) | `var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>id String Unique query identifier |
| [invoicePayload](invoice-payload.md) | `var invoicePayload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [orderInfo](order-info.md) | `var orderInfo: `[`OrderInfo`](../-order-info/index.md)`?`<br>To setup filter: |
| [shippingOptionId](shipping-option-id.md) | `var shippingOptionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [totalAmount](total-amount.md) | `var totalAmount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>To setup filter: |
