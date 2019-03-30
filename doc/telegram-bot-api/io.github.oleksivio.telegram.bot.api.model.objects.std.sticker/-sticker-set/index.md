[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.sticker](../index.md) / [StickerSet](./index.md)

# StickerSet

`data class StickerSet : ITelegram`

[StickerSetResponse](https://core.telegram.org/bots/api/#stickerset)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickerSet(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, containsMasks: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, stickers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Sticker`](../-sticker/index.md)`> = ArrayList())`<br>[StickerSetResponse](https://core.telegram.org/bots/api/#stickerset) |

### Properties

| Name | Summary |
|---|---|
| [containsMasks](contains-masks.md) | `var containsMasks: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>contains_masks Boolean True, if the sticker set contains masks |
| [name](name.md) | `var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>name String Sticker set name |
| [stickers](stickers.md) | `var stickers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Sticker`](../-sticker/index.md)`>`<br>stickers Array of Sticker List of all set stickers |
| [title](title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>title String Sticker set title |
