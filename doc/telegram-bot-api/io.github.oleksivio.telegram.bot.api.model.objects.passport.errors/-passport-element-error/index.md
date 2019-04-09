[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.passport.errors](../index.md) / [PassportElementError](./index.md)

# PassportElementError

`abstract class PassportElementError : ITelegram`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PassportElementError()` |

### Properties

| Name | Summary |
|---|---|
| [message](message.md) | `var message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>message String Error message |
| [type](type.md) | `var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>type String The section of the user's Telegram Passport which has the error |

### Inheritors

| Name | Summary |
|---|---|
| [PassportElementErrorDataField](../-passport-element-error-data-field/index.md) | `data class PassportElementErrorDataField : `[`PassportElementError`](./index.md)<br>[PassportElementErrorDataField](https://core.telegram.org/bots/api/#passportelementerrordatafield) |
| [PassportElementErrorFile](../-passport-element-error-file/index.md) | `data class PassportElementErrorFile : `[`PassportElementError`](./index.md)<br>[PassportElementErrorFile](https://core.telegram.org/bots/api/#passportelementerrorfile) |
| [PassportElementErrorFiles](../-passport-element-error-files/index.md) | `class PassportElementErrorFiles : `[`PassportElementError`](./index.md)<br>[PassportElementErrorFiles](https://core.telegram.org/bots/api/#passportelementerrorfiles) |
| [PassportElementErrorFrontSide](../-passport-element-error-front-side/index.md) | `data class PassportElementErrorFrontSide : `[`PassportElementError`](./index.md)<br>[PassportElementErrorFrontSide](https://core.telegram.org/bots/api/#passportelementerrorfrontside) |
| [PassportElementErrorReverseSide](../-passport-element-error-reverse-side/index.md) | `class PassportElementErrorReverseSide : `[`PassportElementError`](./index.md)<br>[PassportElementErrorReverseSide](https://core.telegram.org/bots/api/#passportelementerrorreverseside) |
| [PassportElementErrorSelfie](../-passport-element-error-selfie/index.md) | `data class PassportElementErrorSelfie : `[`PassportElementError`](./index.md)<br>[PassportElementErrorSelfie](https://core.telegram.org/bots/api/#passportelementerrorselfie) |
