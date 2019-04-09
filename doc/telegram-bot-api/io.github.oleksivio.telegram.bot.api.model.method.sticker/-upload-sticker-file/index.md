[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.sticker](../index.md) / [UploadStickerFile](./index.md)

# UploadStickerFile

`data class UploadStickerFile : UploadFile<`[`File`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-file/index.md)`>`

**See Also**

[uploadStickerFile](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UploadStickerFile(userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, pngSticker: FileSystemResource)` |

### Properties

| Name | Summary |
|---|---|
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [pngSticker](png-sticker.md) | `val pngSticker: FileSystemResource`<br>png_sticker InputFile Yes Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<FileResponse>` |
| [userId](user-id.md) | `val userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>user_id Integer Yes User identifier of sticker file owner |

### Functions

| Name | Summary |
|---|---|
| [fill](fill.md) | `fun ActionMap.fill(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
