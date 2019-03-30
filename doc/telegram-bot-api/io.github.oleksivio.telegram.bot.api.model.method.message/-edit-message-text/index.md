[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.message](../index.md) / [EditMessageText](./index.md)

# EditMessageText

`data class EditMessageText : EditAction<`[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>`

**See Also**

[editMessageText](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `EditMessageText(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, inlineMessageId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, disableWebPagePreview: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, inlineKeyboardMarkup: `[`InlineKeyboardMarkup`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-inline-keyboard-markup/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>chat_id Integer or [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Required if inline_message_id is not specified. Unique identifier for the target chat |
| [disableWebPagePreview](disable-web-page-preview.md) | `val disableWebPagePreview: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_web_page_preview [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalDisables link previews for links in this message |
| [inlineKeyboardMarkup](inline-keyboard-markup.md) | `val inlineKeyboardMarkup: `[`InlineKeyboardMarkup`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-inline-keyboard-markup/index.md)`?`<br>reply_markup InlineKeyboardMarkup Optional A JSON-serialized object for an inline keyboard. |
| [inlineMessageId](inline-message-id.md) | `val inlineMessageId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>inline_message_id [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Required if chat_id and message_id are not specified. Identifier of the inline message |
| [messageId](message-id.md) | `val messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>message_id [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalRequired if inline_message_id is not specified. Identifier of the sent message |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [parseMode](parse-mode.md) | `val parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>parse_mode [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption. |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<MessageResponse>` |
| [text](text.md) | `val text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>text String New text of the message |
