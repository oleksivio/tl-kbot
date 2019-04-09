[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.passport.errors](../index.md) / [PassportElementErrorSelfie](./index.md)

# PassportElementErrorSelfie

`data class PassportElementErrorSelfie : `[`PassportElementError`](../-passport-element-error/index.md)

[PassportElementErrorSelfie](https://core.telegram.org/bots/api/#passportelementerrorselfie)

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | `enum class Type : NamedType` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PassportElementErrorSelfie(source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "selfie", fileHash: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[PassportElementErrorSelfie](https://core.telegram.org/bots/api/#passportelementerrorselfie) |

### Properties

| Name | Summary |
|---|---|
| [fileHash](file-hash.md) | `var fileHash: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>file_hash String Base64-encoded hash of the file with the front side of the document |
| [source](source.md) | `val source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inherited Properties

| Name | Summary |
|---|---|
| [message](../-passport-element-error/message.md) | `var message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>message String Error message |
| [type](../-passport-element-error/type.md) | `var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>type String The section of the user's Telegram Passport which has the error |

### Functions

| Name | Summary |
|---|---|
| [setType](set-type.md) | `fun setType(type: `[`PassportElementErrorSelfie.Type`](-type/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
