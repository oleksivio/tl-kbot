[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResultMpeg4Gif](./index.md)

# InlineQueryResultMpeg4Gif

`data class InlineQueryResultMpeg4Gif : `[`TitledInlineResult`](../-titled-inline-result/index.md)

[InlineQueryResultMpeg4Gif](https://core.telegram.org/bots/api/#inlinequeryresultmpeg4gif)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResultMpeg4Gif(mpeg4Url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, mpeg4Width: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, mpeg4Height: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, mpeg4Duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "mpeg4gif")`<br>[InlineQueryResultMpeg4Gif](https://core.telegram.org/bots/api/#inlinequeryresultmpeg4gif) |

### Properties

| Name | Summary |
|---|---|
| [mpeg4Duration](mpeg4-duration.md) | `var mpeg4Duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>mpeg4_duration Integer Optional. Video duration |
| [mpeg4Height](mpeg4-height.md) | `var mpeg4Height: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>mpeg4_height Integer Optional. Video height |
| [mpeg4Url](mpeg4-url.md) | `var mpeg4Url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>mpeg4_url String A valid URL for the MP4 file. File size must not exceed 1MB |
| [mpeg4Width](mpeg4-width.md) | `var mpeg4Width: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>mpeg4_width Integer Optional. Video width |
| [thumbUrl](thumb-url.md) | `var thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>thumb_url String URL of the static thumbnail (jpeg or gif) for the result |
| [type](type.md) | `val type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>type String Type of the result |

### Inherited Properties

| Name | Summary |
|---|---|
| [title](../-titled-inline-result/title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>title String Title for the result |
