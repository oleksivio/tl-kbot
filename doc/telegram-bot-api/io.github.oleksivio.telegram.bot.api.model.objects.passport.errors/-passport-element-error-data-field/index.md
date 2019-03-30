[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.passport.errors](../index.md) / [PassportElementErrorDataField](./index.md)

# PassportElementErrorDataField

`data class PassportElementErrorDataField : `[`PassportElementError`](../-passport-element-error/index.md)

[PassportElementErrorDataField](https://core.telegram.org/bots/api/#passportelementerrordatafield)

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | `enum class Type : NamedType` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PassportElementErrorDataField(source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "data", fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, dataHash: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[PassportElementErrorDataField](https://core.telegram.org/bots/api/#passportelementerrordatafield) |

### Properties

| Name | Summary |
|---|---|
| [dataHash](data-hash.md) | `var dataHash: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>data_hash String Base64-encoded data hash |
| [fieldName](field-name.md) | `var fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>field_name String Name of the data field which has the error |
| [source](source.md) | `val source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inherited Properties

| Name | Summary |
|---|---|
| [message](../-passport-element-error/message.md) | `var message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>message String Error message |
| [type](../-passport-element-error/type.md) | `var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>type String The section of the user's Telegram Passport which has the error |

### Functions

| Name | Summary |
|---|---|
| [setType](set-type.md) | `fun setType(type: `[`PassportElementErrorDataField.Type`](-type/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
