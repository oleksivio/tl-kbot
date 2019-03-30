[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.payments](../index.md) / [ShippingOption](./index.md)

# ShippingOption

`data class ShippingOption : ITelegram`

[ShippingOption](https://core.telegram.org/bots/api/#shippingoption)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ShippingOption(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, prices: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`LabeledPrice`](../-labeled-price/index.md)`> = ArrayList())`<br>[ShippingOption](https://core.telegram.org/bots/api/#shippingoption) |

### Properties

| Name | Summary |
|---|---|
| [id](id.md) | `var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>id String Shipping option identifier |
| [prices](prices.md) | `var prices: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`LabeledPrice`](../-labeled-price/index.md)`>`<br>prices Array of LabeledPrice List of price portions |
| [title](title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>title String Option title |
