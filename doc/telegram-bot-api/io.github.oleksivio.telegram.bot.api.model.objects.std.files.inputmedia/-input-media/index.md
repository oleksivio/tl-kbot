[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia](../index.md) / [InputMedia](./index.md)

# InputMedia

`interface InputMedia : ITelegram`

### Properties

| Name | Summary |
|---|---|
| [caption](caption.md) | `abstract var caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [media](media.md) | `abstract var media: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [parseMode](parse-mode.md) | `abstract var parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [type](type.md) | `abstract var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Inheritors

| Name | Summary |
|---|---|
| [InputMediaAnimation](../-input-media-animation/index.md) | `data class InputMediaAnimation : `[`InputMedia`](./index.md)<br>[InputMediaAnimation](https://core.telegram.org/bots/api/#inputmediaanimation) |
| [InputMediaAudio](../-input-media-audio/index.md) | `data class InputMediaAudio : `[`InputMedia`](./index.md)<br>[InputMediaAudio](https://core.telegram.org/bots/api/#inputmediaaudio) |
| [InputMediaDocument](../-input-media-document/index.md) | `data class InputMediaDocument : `[`InputMedia`](./index.md)<br>[InputMediaDocument](https://core.telegram.org/bots/api/#inputmediadocument) |
| [InputMediaPhoto](../-input-media-photo/index.md) | `data class InputMediaPhoto : `[`InputMedia`](./index.md)<br>[InputMediaPhoto](https://core.telegram.org/bots/api/#inputmediaphoto) |
| [InputMediaVideo](../-input-media-video/index.md) | `data class InputMediaVideo : `[`InputMedia`](./index.md)<br>[InputMediaVideo](https://core.telegram.org/bots/api/#inputmediavideo) |
