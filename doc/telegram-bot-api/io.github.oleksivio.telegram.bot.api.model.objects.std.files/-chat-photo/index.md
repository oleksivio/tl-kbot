[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.files](../index.md) / [ChatPhoto](./index.md)

# ChatPhoto

`data class ChatPhoto : ITelegram`

[ChatPhoto](https://core.telegram.org/bots/api/#chatphoto)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ChatPhoto(smallFileId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, bigFileId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[ChatPhoto](https://core.telegram.org/bots/api/#chatphoto) |

### Properties

| Name | Summary |
|---|---|
| [bigFileId](big-file-id.md) | `var bigFileId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>big_file_id String Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo download. |
| [smallFileId](small-file-id.md) | `var smallFileId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>small_file_id String Unique file identifier of small (160x160) chat photo. This file_id can be used only for photo download. |
