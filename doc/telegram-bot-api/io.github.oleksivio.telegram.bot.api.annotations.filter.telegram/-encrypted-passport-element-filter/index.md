[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [EncryptedPassportElementFilter](./index.md)

# EncryptedPassportElementFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class EncryptedPassportElementFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `EncryptedPassportElementFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, type: `[`EncryptedPassportElement.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-encrypted-passport-element/-type/index.md)` = EncryptedPassportElement.Type.ALL, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], data: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), phoneNumber: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), email: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), fileArray: `[`PassportFileArrayFilter`](../-passport-file-array-filter/index.md)` = PassportFileArrayFilter(status = AnnotationState.OFF), frontSide: `[`PassportFileFilter`](../-passport-file-filter/index.md)` = PassportFileFilter(status = AnnotationState.OFF), reverseSide: `[`PassportFileFilter`](../-passport-file-filter/index.md)` = PassportFileFilter(status = AnnotationState.OFF), selfie: `[`PassportFileFilter`](../-passport-file-filter/index.md)` = PassportFileFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [data](data.md) | `val data: <ERROR CLASS>` |
| [email](email.md) | `val email: <ERROR CLASS>` |
| [fileArray](file-array.md) | `val fileArray: `[`PassportFileArrayFilter`](../-passport-file-array-filter/index.md) |
| [frontSide](front-side.md) | `val frontSide: `[`PassportFileFilter`](../-passport-file-filter/index.md) |
| [phoneNumber](phone-number.md) | `val phoneNumber: <ERROR CLASS>` |
| [reverseSide](reverse-side.md) | `val reverseSide: `[`PassportFileFilter`](../-passport-file-filter/index.md) |
| [selfie](selfie.md) | `val selfie: `[`PassportFileFilter`](../-passport-file-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [type](type.md) | `val type: `[`EncryptedPassportElement.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-encrypted-passport-element/-type/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
