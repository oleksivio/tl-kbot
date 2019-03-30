[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.file](../index.md) / [SendPhotoFile](./index.md)

# SendPhotoFile

`data class SendPhotoFile : UploadMediaFile`

**See Also**

[sendPhoto](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SendPhotoFile(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, photo: FileSystemResource, caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [caption](caption.md) | `val caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>caption	String	Optional	Document caption (may also be used when resending documents by file_id), 0-1024 characters |
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>chat_id Integer Yes Unique identifier for the target chat |
| [disableNotification](disable-notification.md) | `val disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_notification	Boolean	Optional	Sends the message silently. Users will receive a notification with no sound. |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [parseMode](parse-mode.md) | `val parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption. |
| [photo](photo.md) | `val photo: FileSystemResource`<br>photo  String  Photo to send. Pass a file_id as String to send a photo that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get a photo from the Internet |
| [replyMarkup](reply-markup.md) | `val replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`?`<br>reply_markup	InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply	Optional	Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user. |
| [replyToMessageId](reply-to-message-id.md) | `val replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>reply_to_message_id	Integer	Optional	If the message is a reply, ID of the original message |

### Functions

| Name | Summary |
|---|---|
| [fill](fill.md) | `fun ActionMap.fill(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
