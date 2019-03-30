[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResult](./index.md)

# InlineQueryResult

`abstract class InlineQueryResult : ITelegram`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResult()` |

### Properties

| Name | Summary |
|---|---|
| [id](id.md) | `var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>id String Unique identifier for this result, 1-64 bytes |
| [replyMarkup](reply-markup.md) | `var replyMarkup: `[`InlineKeyboardMarkup`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-inline-keyboard-markup/index.md)`?`<br>reply_markup InlineKeyboardMarkup Optional. Inline keyboard attached to the message |

### Inheritors

| Name | Summary |
|---|---|
| [ContentInlineResult](../-content-inline-result/index.md) | `abstract class ContentInlineResult : `[`InlineQueryResult`](./index.md) |
| [InlineQueryResultGame](../-inline-query-result-game/index.md) | `class InlineQueryResultGame : `[`InlineQueryResult`](./index.md)<br>[InlineQueryResultGame](https://core.telegram.org/bots/api/#inlinequeryresultgame) |
