[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [ContentInlineResult](./index.md)

# ContentInlineResult

`abstract class ContentInlineResult : `[`InlineQueryResult`](../-inline-query-result/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ContentInlineResult()` |

### Properties

| Name | Summary |
|---|---|
| [inputMessageContent](input-message-content.md) | `var inputMessageContent: `[`InputMessageContent`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline.messagecontent/-input-message-content.md)`?`<br>input_message_content InputMessageContent Optional. Content of the message to be sent |

### Inherited Properties

| Name | Summary |
|---|---|
| [id](../-inline-query-result/id.md) | `var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>id String Unique identifier for this result, 1-64 bytes |
| [replyMarkup](../-inline-query-result/reply-markup.md) | `var replyMarkup: `[`InlineKeyboardMarkup`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-inline-keyboard-markup/index.md)`?`<br>reply_markup InlineKeyboardMarkup Optional. Inline keyboard attached to the message |

### Inheritors

| Name | Summary |
|---|---|
| [CaptionInlineResult](../-caption-inline-result/index.md) | `abstract class CaptionInlineResult : `[`ContentInlineResult`](./index.md) |
| [InlineQueryResultArticle](../-inline-query-result-article/index.md) | `class InlineQueryResultArticle : `[`ContentInlineResult`](./index.md)<br>[InlineQueryResultArticle](https://core.telegram.org/bots/api/#inlinequeryresultarticle) |
| [InlineQueryResultCachedSticker](../-inline-query-result-cached-sticker/index.md) | `class InlineQueryResultCachedSticker : `[`ContentInlineResult`](./index.md)<br>[InlineQueryResultCachedSticker](https://core.telegram.org/bots/api/#inlinequeryresultcachedsticker) |
| [InlineQueryResultContact](../-inline-query-result-contact/index.md) | `data class InlineQueryResultContact : `[`ContentInlineResult`](./index.md)<br>[InlineQueryResultContact](https://core.telegram.org/bots/api/#inlinequeryresultcontact) |
