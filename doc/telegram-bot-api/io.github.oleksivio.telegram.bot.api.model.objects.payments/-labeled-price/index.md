[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.payments](../index.md) / [LabeledPrice](./index.md)

# LabeledPrice

`data class LabeledPrice : ITelegram`

[LabeledPrice](https://core.telegram.org/bots/api/#labeledprice)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LabeledPrice(label: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, amount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)`<br>[LabeledPrice](https://core.telegram.org/bots/api/#labeledprice) |

### Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | `var amount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>amount Integer Price of the product in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies). |
| [label](label.md) | `var label: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>label String Portion label |
