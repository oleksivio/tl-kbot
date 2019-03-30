[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResultArticle](./index.md)

# InlineQueryResultArticle

`class InlineQueryResultArticle : `[`ContentInlineResult`](../-content-inline-result/index.md)

[InlineQueryResultArticle](https://core.telegram.org/bots/api/#inlinequeryresultarticle)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResultArticle(title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, hideUrl: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, thumbWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, thumbHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "article")`<br>[InlineQueryResultArticle](https://core.telegram.org/bots/api/#inlinequeryresultarticle) |

### Properties

| Name | Summary |
|---|---|
| [description](description.md) | `var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>description [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Short description of the result |
| [hideUrl](hide-url.md) | `var hideUrl: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>hide_url Boolean Optional. Pass True, if you don't want the URL to be shown in the message |
| [thumbHeight](thumb-height.md) | `var thumbHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>thumb_height Integer Optional. Thumbnail height |
| [thumbUrl](thumb-url.md) | `var thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>thumb_url [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Url of the thumbnail for the result |
| [thumbWidth](thumb-width.md) | `var thumbWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>thumb_width Integer Optional. Thumbnail width |
| [title](title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>title String Title of the result |
| [type](type.md) | `val type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>type String Type of the result |
| [url](url.md) | `var url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>url [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. URL of the result |

### Inherited Properties

| Name | Summary |
|---|---|
| [inputMessageContent](../-content-inline-result/input-message-content.md) | `var inputMessageContent: `[`InputMessageContent`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline.messagecontent/-input-message-content.md)`?`<br>input_message_content InputMessageContent Optional. Content of the message to be sent |
