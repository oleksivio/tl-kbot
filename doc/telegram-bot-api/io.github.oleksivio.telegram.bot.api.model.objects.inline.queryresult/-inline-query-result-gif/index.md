[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResultGif](./index.md)

# InlineQueryResultGif

`data class InlineQueryResultGif : `[`TitledInlineResult`](../-titled-inline-result/index.md)

[InlineQueryResultGif](https://core.telegram.org/bots/api/#inlinequeryresultgif)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResultGif(gifUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, gifWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, gifHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, gifDuration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "gif")`<br>[InlineQueryResultGif](https://core.telegram.org/bots/api/#inlinequeryresultgif) |

### Properties

| Name | Summary |
|---|---|
| [gifDuration](gif-duration.md) | `var gifDuration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>gif_duration Integer Optional. Duration of the GIF |
| [gifHeight](gif-height.md) | `var gifHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>gif_height Integer Optional. Height of the GIF |
| [gifUrl](gif-url.md) | `var gifUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>gif_url String A valid URL for the GIF file. File size must not exceed 1MB |
| [gifWidth](gif-width.md) | `var gifWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>gif_width Integer Optional. Width of the GIF |
| [thumbUrl](thumb-url.md) | `var thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>thumb_url String URL of the static thumbnail for the result (jpeg or gif) |
| [type](type.md) | `val type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>type String Type of the result |

### Inherited Properties

| Name | Summary |
|---|---|
| [title](../-titled-inline-result/title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>title String Title for the result |
