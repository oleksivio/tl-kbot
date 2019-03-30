[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.sticker](../index.md) / [CreateNewStickerFileSet](./index.md)

# CreateNewStickerFileSet

`data class CreateNewStickerFileSet : UploadFile<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

**See Also**

[createNewStickerSet](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CreateNewStickerFileSet(userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, pngSticker: FileSystemResource, emojis: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, containsMasks: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, maskPosition: `[`MaskPosition`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-mask-position/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [containsMasks](contains-masks.md) | `val containsMasks: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>contains_masks [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalPass True, if a set of mask stickers should be created |
| [emojis](emojis.md) | `val emojis: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>emojis String Yes One or more emoji corresponding to the sticker |
| [maskPosition](mask-position.md) | `val maskPosition: `[`MaskPosition`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-mask-position/index.md)`?`<br>mask_position MaskPosition Optional A JSON-serialized object for position where the mask should be placed on faces |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>name String Yes Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only english letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in “*by*”. &lt;bot_username&gt; is case insensitive. 1-64 characters. &lt;/bot_username&gt; |
| [pngSticker](png-sticker.md) | `val pngSticker: FileSystemResource`<br>png_sticker InputFile  Yes Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. upload a new one using multipart/form-data. |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<BooleanResponse>` |
| [title](title.md) | `val title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>title String Yes Sticker set title, 1-64 characters |
| [userId](user-id.md) | `val userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>user_id Integer Yes User identifier of created sticker set owner |

### Functions

| Name | Summary |
|---|---|
| [fill](fill.md) | `fun ActionMap.fill(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
