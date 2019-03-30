[telegram-bot-api](../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](./index.md)

## Package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

### Types

| Name | Summary |
|---|---|
| [CaptionInlineResult](-caption-inline-result/index.md) | `abstract class CaptionInlineResult : `[`ContentInlineResult`](-content-inline-result/index.md) |
| [ContentInlineResult](-content-inline-result/index.md) | `abstract class ContentInlineResult : `[`InlineQueryResult`](-inline-query-result/index.md) |
| [FormattedInlineResult](-formatted-inline-result/index.md) | `abstract class FormattedInlineResult : `[`CaptionInlineResult`](-caption-inline-result/index.md) |
| [InlineQueryResult](-inline-query-result/index.md) | `abstract class InlineQueryResult : ITelegram` |
| [InlineQueryResultArticle](-inline-query-result-article/index.md) | `class InlineQueryResultArticle : `[`ContentInlineResult`](-content-inline-result/index.md)<br>[InlineQueryResultArticle](https://core.telegram.org/bots/api/#inlinequeryresultarticle) |
| [InlineQueryResultAudio](-inline-query-result-audio/index.md) | `data class InlineQueryResultAudio : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultAudio](https://core.telegram.org/bots/api/#inlinequeryresultaudio) |
| [InlineQueryResultCachedAudio](-inline-query-result-cached-audio/index.md) | `class InlineQueryResultCachedAudio : `[`FormattedInlineResult`](-formatted-inline-result/index.md)<br>[InlineQueryResultCachedAudio](https://core.telegram.org/bots/api/#inlinequeryresultcachedaudio) |
| [InlineQueryResultCachedDocument](-inline-query-result-cached-document/index.md) | `class InlineQueryResultCachedDocument : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultCachedDocument](https://core.telegram.org/bots/api/#inlinequeryresultcacheddocument) |
| [InlineQueryResultCachedGif](-inline-query-result-cached-gif/index.md) | `class InlineQueryResultCachedGif : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultCachedGif](https://core.telegram.org/bots/api/#inlinequeryresultcachedgif) |
| [InlineQueryResultCachedMpeg4Gif](-inline-query-result-cached-mpeg4-gif/index.md) | `class InlineQueryResultCachedMpeg4Gif : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultCachedMpeg4Gif](https://core.telegram.org/bots/api/#inlinequeryresultcachedmpeg4gif) |
| [InlineQueryResultCachedPhoto](-inline-query-result-cached-photo/index.md) | `class InlineQueryResultCachedPhoto : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultCachedPhoto](https://core.telegram.org/bots/api/#inlinequeryresultcachedphoto) |
| [InlineQueryResultCachedSticker](-inline-query-result-cached-sticker/index.md) | `class InlineQueryResultCachedSticker : `[`ContentInlineResult`](-content-inline-result/index.md)<br>[InlineQueryResultCachedSticker](https://core.telegram.org/bots/api/#inlinequeryresultcachedsticker) |
| [InlineQueryResultCachedVideo](-inline-query-result-cached-video/index.md) | `data class InlineQueryResultCachedVideo : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultCachedVideo](https://core.telegram.org/bots/api/#inlinequeryresultcachedvideo) |
| [InlineQueryResultCachedVoice](-inline-query-result-cached-voice/index.md) | `class InlineQueryResultCachedVoice : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultCachedVoice](https://core.telegram.org/bots/api/#inlinequeryresultcachedvoice) |
| [InlineQueryResultContact](-inline-query-result-contact/index.md) | `data class InlineQueryResultContact : `[`ContentInlineResult`](-content-inline-result/index.md)<br>[InlineQueryResultContact](https://core.telegram.org/bots/api/#inlinequeryresultcontact) |
| [InlineQueryResultDocument](-inline-query-result-document/index.md) | `data class InlineQueryResultDocument : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultDocument](https://core.telegram.org/bots/api/#inlinequeryresultdocument) |
| [InlineQueryResultGame](-inline-query-result-game/index.md) | `class InlineQueryResultGame : `[`InlineQueryResult`](-inline-query-result/index.md)<br>[InlineQueryResultGame](https://core.telegram.org/bots/api/#inlinequeryresultgame) |
| [InlineQueryResultGif](-inline-query-result-gif/index.md) | `data class InlineQueryResultGif : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultGif](https://core.telegram.org/bots/api/#inlinequeryresultgif) |
| [InlineQueryResultLocation](-inline-query-result-location/index.md) | `data class InlineQueryResultLocation : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultLocation](https://core.telegram.org/bots/api/#inlinequeryresultlocation) |
| [InlineQueryResultMpeg4Gif](-inline-query-result-mpeg4-gif/index.md) | `data class InlineQueryResultMpeg4Gif : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultMpeg4Gif](https://core.telegram.org/bots/api/#inlinequeryresultmpeg4gif) |
| [InlineQueryResultPhoto](-inline-query-result-photo/index.md) | `class InlineQueryResultPhoto : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultPhoto](https://core.telegram.org/bots/api/#inlinequeryresultphoto) |
| [InlineQueryResultVenue](-inline-query-result-venue/index.md) | `class InlineQueryResultVenue : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultVenue](https://core.telegram.org/bots/api/#inlinequeryresultvenue) |
| [InlineQueryResultVideo](-inline-query-result-video/index.md) | `data class InlineQueryResultVideo : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultVideo](https://core.telegram.org/bots/api/#inlinequeryresultvideo) |
| [InlineQueryResultVoice](-inline-query-result-voice/index.md) | `data class InlineQueryResultVoice : `[`TitledInlineResult`](-titled-inline-result/index.md)<br>[InlineQueryResultVoice](https://core.telegram.org/bots/api/#inlinequeryresultvoice) |
| [TitledInlineResult](-titled-inline-result/index.md) | `abstract class TitledInlineResult : `[`FormattedInlineResult`](-formatted-inline-result/index.md) |
