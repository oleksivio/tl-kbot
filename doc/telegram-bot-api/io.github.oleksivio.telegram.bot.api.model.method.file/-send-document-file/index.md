[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.file](../index.md) / [SendDocumentFile](./index.md)

# SendDocumentFile

`data class SendDocumentFile : UploadMediaFile`

**See Also**

[sendDocument](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SendDocumentFile(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, document: FileSystemResource, thumb: FileSystemResource? = null, caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [caption](caption.md) | `val caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>caption	String	Optional	Document caption (may also be used when resending documents by file_id), 0-1024 characters |
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>chat_id	Integer or String	Yes	Unique identifier for the target chat or username of the target channel |
| [disableNotification](disable-notification.md) | `val disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_notification	Boolean	Optional	Sends the message silently. Users will receive a notification with no sound. |
| [document](document.md) | `val document: FileSystemResource`<br>document	InputFile or String	Yes	File to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a new one using multipart/form-data. More info on Sending Files » |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [parseMode](parse-mode.md) | `val parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption. |
| [replyMarkup](reply-markup.md) | `val replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`?`<br>reply_markup	InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply	Optional	Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user. |
| [replyToMessageId](reply-to-message-id.md) | `val replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>reply_to_message_id	Integer	Optional	If the message is a reply, ID of the original message |
| [thumb](thumb.md) | `val thumb: FileSystemResource?`<br>thumb	InputFile or String	Optional	Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side. The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a new file, so you can pass “attach://&lt;file_attach_name&gt;” if the thumbnail was uploaded using multipart/form-data under &lt;file_attach_name&gt;. More info on Sending Files » |

### Functions

| Name | Summary |
|---|---|
| [fill](fill.md) | `fun ActionMap.fill(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
