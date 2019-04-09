[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.sticker](../index.md) / [AddStickerToSet](./index.md)

# AddStickerToSet

`data class AddStickerToSet : Action<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

**See Also**

[addStickerToSet](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AddStickerToSet(userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, pngSticker: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, emojis: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, maskPosition: `[`MaskPosition`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-mask-position/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [emojis](emojis.md) | `val emojis: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>emojis String Yes One or more emoji corresponding to the sticker |
| [maskPosition](mask-position.md) | `val maskPosition: `[`MaskPosition`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-mask-position/index.md)`?`<br>mask_position MaskPosition Optional A JSON-serialized object for position where the mask should be placed on faces |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>name String Yes Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only english letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in “*by*”. &lt;bot_username&gt; is case insensitive. 1-64 characters. &lt;/bot_username&gt; |
| [pngSticker](png-sticker.md) | `val pngSticker: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>png_sticker  String Yes Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. Pass a file_id as a String to send a file that already exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<BooleanResponse>` |
| [userId](user-id.md) | `val userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>user_id Integer Yes User identifier of created sticker set owner |
