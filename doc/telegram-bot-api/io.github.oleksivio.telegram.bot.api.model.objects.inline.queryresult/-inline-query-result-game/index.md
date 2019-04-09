[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResultGame](./index.md)

# InlineQueryResultGame

`class InlineQueryResultGame : `[`InlineQueryResult`](../-inline-query-result/index.md)

[InlineQueryResultGame](https://core.telegram.org/bots/api/#inlinequeryresultgame)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResultGame(gameShortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "game")`<br>[InlineQueryResultGame](https://core.telegram.org/bots/api/#inlinequeryresultgame) |

### Properties

| Name | Summary |
|---|---|
| [gameShortName](game-short-name.md) | `val gameShortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>game_short_name String Short name of the game |
| [type](type.md) | `val type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>type String Type of the result |

### Inherited Properties

| Name | Summary |
|---|---|
| [id](../-inline-query-result/id.md) | `var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>id String Unique identifier for this result, 1-64 bytes |
| [replyMarkup](../-inline-query-result/reply-markup.md) | `var replyMarkup: `[`InlineKeyboardMarkup`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-inline-keyboard-markup/index.md)`?`<br>reply_markup InlineKeyboardMarkup Optional. Inline keyboard attached to the message |
