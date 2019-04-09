[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.payments](../index.md) / [AnswerShippingQuery](./index.md)

# AnswerShippingQuery

`class AnswerShippingQuery : Action<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

**See Also**

[answerShippingQuery](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AnswerShippingQuery(shippingQueryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, ok: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, shippingOptions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ShippingOption`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-shipping-option/index.md)`>? = null, errorMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [errorMessage](error-message.md) | `val errorMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>error_message [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Required if ok is False. Error message in human readable form that explains why it is impossible to complete the order (e.g. "Sorry, delivery to your desired address is unavailable'). Telegram will display this message to the user. |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ok](ok.md) | `val ok: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>ok Boolean Yes Specify True if delivery to the specified address is possible and False if there are any problems (for example, if delivery to the specified address is not possible) |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<BooleanResponse>` |
| [shippingOptions](shipping-options.md) | `val shippingOptions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ShippingOption`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-shipping-option/index.md)`>?`<br>shipping_options Array of ShippingOption Optional Required if ok is True. A JSON-serialized array of available shipping options. |
| [shippingQueryId](shipping-query-id.md) | `val shippingQueryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>shipping_query_id String Yes Unique identifier for the query to be answered |
