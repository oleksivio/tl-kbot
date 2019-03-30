[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects](../index.md) / [Update](./index.md)

# Update

`data class Update : ITelegram`

[Update](https://core.telegram.org/bots/api/#update)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Update(updateId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 0, message: `[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`? = null, editedMessage: `[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`? = null, channelPost: `[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`? = null, editedChannelPost: `[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`? = null, inlineQuery: `[`InlineQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline/-inline-query/index.md)`? = null, chosenInlineResult: `[`ChosenInlineResult`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline/-chosen-inline-result/index.md)`? = null, callbackQuery: `[`CallbackQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-callback-query/index.md)`? = null, shippingQuery: `[`ShippingQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-shipping-query/index.md)`? = null, preCheckoutQuery: `[`PreCheckoutQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-pre-checkout-query/index.md)`? = null)`<br>[Update](https://core.telegram.org/bots/api/#update) |

### Properties

| Name | Summary |
|---|---|
| [callbackQuery](callback-query.md) | `var callbackQuery: `[`CallbackQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-callback-query/index.md)`?`<br>[io.github.oleksivio.telegram.bot.api.annotations.receiver.ShippingQueryReceiver](../../io.github.oleksivio.telegram.bot.api.annotations.receiver/-shipping-query-receiver/index.md) for create receiver |
| [channelPost](channel-post.md) | `var channelPost: `[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`?`<br>[io.github.oleksivio.telegram.bot.api.annotations.receiver.ChannelPostReceiver](../../io.github.oleksivio.telegram.bot.api.annotations.receiver/-channel-post-receiver/index.md) for create receiver |
| [chosenInlineResult](chosen-inline-result.md) | `var chosenInlineResult: `[`ChosenInlineResult`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline/-chosen-inline-result/index.md)`?`<br>[io.github.oleksivio.telegram.bot.api.annotations.receiver.ChosenInlineResultReceiver](../../io.github.oleksivio.telegram.bot.api.annotations.receiver/-chosen-inline-result-receiver/index.md) for create receiver |
| [editedChannelPost](edited-channel-post.md) | `var editedChannelPost: `[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`?`<br>[io.github.oleksivio.telegram.bot.api.annotations.receiver.EditedChannelPostReceiver](../../io.github.oleksivio.telegram.bot.api.annotations.receiver/-edited-channel-post-receiver/index.md) for create receiver |
| [editedMessage](edited-message.md) | `var editedMessage: `[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`?`<br>[io.github.oleksivio.telegram.bot.api.annotations.receiver.EditedMessageReceiver](../../io.github.oleksivio.telegram.bot.api.annotations.receiver/-edited-message-receiver/index.md) for create receiver |
| [inlineQuery](inline-query.md) | `var inlineQuery: `[`InlineQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline/-inline-query/index.md)`?`<br>[io.github.oleksivio.telegram.bot.api.annotations.receiver.InlineQueryReceiver](../../io.github.oleksivio.telegram.bot.api.annotations.receiver/-inline-query-receiver/index.md) for create receiver |
| [message](message.md) | `var message: `[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`?`<br>[io.github.oleksivio.telegram.bot.api.annotations.receiver.MessageReceiver](../../io.github.oleksivio.telegram.bot.api.annotations.receiver/-message-receiver/index.md) for create receiver |
| [preCheckoutQuery](pre-checkout-query.md) | `var preCheckoutQuery: `[`PreCheckoutQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-pre-checkout-query/index.md)`?`<br>[io.github.oleksivio.telegram.bot.api.annotations.receiver.PreCheckoutQueryReceiver](../../io.github.oleksivio.telegram.bot.api.annotations.receiver/-pre-checkout-query-receiver/index.md) for create receiver |
| [shippingQuery](shipping-query.md) | `var shippingQuery: `[`ShippingQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-shipping-query/index.md)`?`<br>[io.github.oleksivio.telegram.bot.api.annotations.receiver.ShippingQueryReceiver](../../io.github.oleksivio.telegram.bot.api.annotations.receiver/-shipping-query-receiver/index.md) for create receiver |
| [updateId](update-id.md) | `var updateId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>update_id |
