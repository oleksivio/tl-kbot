[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.message](../index.md) / [SendMessage](./index.md)

# SendMessage

`data class SendMessage : FormattedMessageAction`

**See Also**

[sendMessage](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SendMessage(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, disableWebPagePreview: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [disableNotification](disable-notification.md) | `val disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_notification [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalSends the message silently. Users will receive a notification with no sound. |
| [disableWebPagePreview](disable-web-page-preview.md) | `val disableWebPagePreview: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_web_page_preview [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalDisables link previews for links in this message |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [parseMode](parse-mode.md) | `val parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>parse_mode [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in your bot's message. |
| [replyMarkup](reply-markup.md) | `val replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`?`<br>reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user. |
| [replyToMessageId](reply-to-message-id.md) | `val replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>reply_to_message_id [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalIf the message is a reply, ID of the original message |
| [text](text.md) | `val text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>text String Text of the message to be sent |
