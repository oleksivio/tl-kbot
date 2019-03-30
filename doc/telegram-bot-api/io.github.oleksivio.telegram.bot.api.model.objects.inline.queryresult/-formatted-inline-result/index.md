[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [FormattedInlineResult](./index.md)

# FormattedInlineResult

`abstract class FormattedInlineResult : `[`CaptionInlineResult`](../-caption-inline-result/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FormattedInlineResult()` |

### Properties

| Name | Summary |
|---|---|
| [parseMode](parse-mode.md) | `var parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>parse_mode [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption. |

### Inherited Properties

| Name | Summary |
|---|---|
| [caption](../-caption-inline-result/caption.md) | `var caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>caption [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Caption, 0-200 characters |

### Inheritors

| Name | Summary |
|---|---|
| [InlineQueryResultCachedAudio](../-inline-query-result-cached-audio/index.md) | `class InlineQueryResultCachedAudio : `[`FormattedInlineResult`](./index.md)<br>[InlineQueryResultCachedAudio](https://core.telegram.org/bots/api/#inlinequeryresultcachedaudio) |
| [TitledInlineResult](../-titled-inline-result/index.md) | `abstract class TitledInlineResult : `[`FormattedInlineResult`](./index.md) |
