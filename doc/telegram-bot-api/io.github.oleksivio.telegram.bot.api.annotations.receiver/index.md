[telegram-bot-api](../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.receiver](./index.md)

## Package io.github.oleksivio.telegram.bot.api.annotations.receiver

Package contains all available receivers. Receiver annotation used for 
mark function to receive incoming telegram object.

For example [@MessageReceiver](-message-receiver/index.md)
is used for receive [Message](../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md) by annotated function

Function annotated with receiver must return [HandleResult](../io.github.oleksivio.telegram.bot.api.model.result/-handler-result/index.md) or [Unit](#)

### Annotations

| Name | Summary |
|---|---|
| [CallbackQueryReceiver](-callback-query-receiver/index.md) | `annotation class CallbackQueryReceiver` |
| [ChannelPostReceiver](-channel-post-receiver/index.md) | `annotation class ChannelPostReceiver` |
| [ChosenInlineResultReceiver](-chosen-inline-result-receiver/index.md) | `annotation class ChosenInlineResultReceiver` |
| [EditedChannelPostReceiver](-edited-channel-post-receiver/index.md) | `annotation class EditedChannelPostReceiver` |
| [EditedMessageReceiver](-edited-message-receiver/index.md) | `annotation class EditedMessageReceiver` |
| [InlineQueryReceiver](-inline-query-receiver/index.md) | `annotation class InlineQueryReceiver` |
| [MessageReceiver](-message-receiver/index.md) | `annotation class MessageReceiver`<br>All functions annotated by [MessageReceiver](-message-receiver/index.md) must have one input parameter [Message](../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md) type |
| [PreCheckoutQueryReceiver](-pre-checkout-query-receiver/index.md) | `annotation class PreCheckoutQueryReceiver` |
| [ShippingQueryReceiver](-shipping-query-receiver/index.md) | `annotation class ShippingQueryReceiver` |
