[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResultPhoto](./index.md)

# InlineQueryResultPhoto

`class InlineQueryResultPhoto : `[`TitledInlineResult`](../-titled-inline-result/index.md)

[InlineQueryResultPhoto](https://core.telegram.org/bots/api/#inlinequeryresultphoto)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResultPhoto(photoUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, photoWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, photoHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "photo")`<br>[InlineQueryResultPhoto](https://core.telegram.org/bots/api/#inlinequeryresultphoto) |

### Properties

| Name | Summary |
|---|---|
| [description](description.md) | `var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>description [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Short description of the result |
| [photoHeight](photo-height.md) | `var photoHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>photo_height Integer Optional. Height of the photo |
| [photoUrl](photo-url.md) | `var photoUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>photo_url String A valid URL of the photo. Photo must be in jpeg format. Photo size must not exceed 5MB |
| [photoWidth](photo-width.md) | `var photoWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>photo_width Integer Optional. Width of the photo |
| [thumbUrl](thumb-url.md) | `var thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>thumb_url String URL of the thumbnail for the photo |
| [type](type.md) | `val type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>type String Type of the result |

### Inherited Properties

| Name | Summary |
|---|---|
| [title](../-titled-inline-result/title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>title String Title for the result |
