[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.passport.errors](../index.md) / [PassportElementErrorFile](./index.md)

# PassportElementErrorFile

`data class PassportElementErrorFile : `[`PassportElementError`](../-passport-element-error/index.md)

[PassportElementErrorFile](https://core.telegram.org/bots/api/#passportelementerrorfile)

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | `enum class Type : NamedType` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PassportElementErrorFile(source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "file", fileHash: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[PassportElementErrorFile](https://core.telegram.org/bots/api/#passportelementerrorfile) |

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
| [setType](set-type.md) | `fun setType(type: `[`PassportElementErrorFile.Type`](-type/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
