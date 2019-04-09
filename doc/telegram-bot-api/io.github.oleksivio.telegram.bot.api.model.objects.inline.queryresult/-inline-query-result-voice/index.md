[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResultVoice](./index.md)

# InlineQueryResultVoice

`data class InlineQueryResultVoice : `[`TitledInlineResult`](../-titled-inline-result/index.md)

[InlineQueryResultVoice](https://core.telegram.org/bots/api/#inlinequeryresultvoice)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResultVoice(voiceUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, voiceDuration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "voice")`<br>[InlineQueryResultVoice](https://core.telegram.org/bots/api/#inlinequeryresultvoice) |

### Properties

| Name | Summary |
|---|---|
| [type](type.md) | `val type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>type String Type of the result |
| [voiceDuration](voice-duration.md) | `var voiceDuration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>voice_duration Integer Optional. Recording duration in seconds |
| [voiceUrl](voice-url.md) | `var voiceUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>voice_url String A valid URL for the voice recording |

### Inherited Properties

| Name | Summary |
|---|---|
| [title](../-titled-inline-result/title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>title String Title for the result |
