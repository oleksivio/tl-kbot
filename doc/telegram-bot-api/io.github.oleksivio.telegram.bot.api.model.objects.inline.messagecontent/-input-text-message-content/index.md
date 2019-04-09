[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.messagecontent](../index.md) / [InputTextMessageContent](./index.md)

# InputTextMessageContent

`class InputTextMessageContent : `[`InputMessageContent`](../-input-message-content.md)

[InputTextMessageContent](https://core.telegram.org/bots/api/#inputtextmessagecontent)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InputTextMessageContent(messageText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, disableWebPagePreview: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)`<br>[InputTextMessageContent](https://core.telegram.org/bots/api/#inputtextmessagecontent) |

### Properties

| Name | Summary |
|---|---|
| [disableWebPagePreview](disable-web-page-preview.md) | `var disableWebPagePreview: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_web_page_preview Boolean Optional. Disables link previews for links in the sent message |
| [messageText](message-text.md) | `var messageText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>message_text String Text of the message to be sent, 1-4096 characters |
| [parseMode](parse-mode.md) | `var parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>parse_mode [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in your bot's message. |
