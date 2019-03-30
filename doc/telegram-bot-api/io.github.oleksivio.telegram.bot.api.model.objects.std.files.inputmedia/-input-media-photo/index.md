[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia](../index.md) / [InputMediaPhoto](./index.md)

# InputMediaPhoto

`data class InputMediaPhoto : `[`InputMedia`](../-input-media/index.md)

[InputMediaPhoto](https://core.telegram.org/bots/api/#inputmediaphoto)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InputMediaPhoto(type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, media: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[InputMediaPhoto](https://core.telegram.org/bots/api/#inputmediaphoto) |

### Properties

| Name | Summary |
|---|---|
| [caption](caption.md) | `var caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>caption [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Caption of the photo to be sent, 0-200 characters |
| [media](media.md) | `var media: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>media String File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet, or pass "attach://&lt;file_attach_name&gt;" to upload a new one using multipart/form-data under &lt;file_attach_name&gt; name. &lt;/file_attach_name&gt;&lt;/file_attach_name&gt; |
| [parseMode](parse-mode.md) | `var parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>parse_mode [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption. |
| [type](type.md) | `var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>type String Type of the result, must be photo |
