[telegram-bot-api](../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.message](./index.md)

## Package io.github.oleksivio.telegram.bot.api.model.method.message

Package contain all telegram server message actions(send, edit, delete)

### Types

| Name | Summary |
|---|---|
| [DeleteMessage](-delete-message/index.md) | `data class DeleteMessage : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [EditMessageCaption](-edit-message-caption/index.md) | `data class EditMessageCaption : EditAction<`[`Message`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>` |
| [EditMessageMedia](-edit-message-media/index.md) | `data class EditMessageMedia : EditAction<`[`Message`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>` |
| [EditMessageReplyMarkup](-edit-message-reply-markup/index.md) | `class EditMessageReplyMarkup : EditAction<`[`Message`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>` |
| [EditMessageText](-edit-message-text/index.md) | `data class EditMessageText : EditAction<`[`Message`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>` |
| [ForwardMessage](-forward-message/index.md) | `data class ForwardMessage : ChatAction<`[`Message`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>` |
| [SendContact](-send-contact/index.md) | `class SendContact : MessageAction` |
| [SendMessage](-send-message/index.md) | `data class SendMessage : FormattedMessageAction` |
