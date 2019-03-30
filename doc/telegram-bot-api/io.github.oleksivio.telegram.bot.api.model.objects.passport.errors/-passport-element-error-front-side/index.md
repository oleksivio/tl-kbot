[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.passport.errors](../index.md) / [PassportElementErrorFrontSide](./index.md)

# PassportElementErrorFrontSide

`data class PassportElementErrorFrontSide : `[`PassportElementError`](../-passport-element-error/index.md)

[PassportElementErrorFrontSide](https://core.telegram.org/bots/api/#passportelementerrorfrontside)

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | `enum class Type : NamedType` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PassportElementErrorFrontSide(source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "front_side", fileHash: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[PassportElementErrorFrontSide](https://core.telegram.org/bots/api/#passportelementerrorfrontside) |

### Properties

| Name | Summary |
|---|---|
| [fileHash](file-hash.md) | `var fileHash: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>type String The section of the user's Telegram Passport which has the issue, one of “passport”, “driver_license”, “identity_card”, “internal_passport” |
| [source](source.md) | `val source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inherited Properties

| Name | Summary |
|---|---|
| [message](../-passport-element-error/message.md) | `var message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>message String Error message |
| [type](../-passport-element-error/type.md) | `var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>type String The section of the user's Telegram Passport which has the error |

### Functions

| Name | Summary |
|---|---|
| [setType](set-type.md) | `fun setType(type: `[`PassportElementErrorFrontSide.Type`](-type/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
