[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [EncryptedPassportElementArrayFilter](./index.md)

# EncryptedPassportElementArrayFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class EncryptedPassportElementArrayFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `EncryptedPassportElementArrayFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, type: `[`EncryptedPassportElement.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-encrypted-passport-element/-type/index.md)` = EncryptedPassportElement.Type.ALL, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], data: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md)` = NotNullFilter(status = AnnotationState.OFF), phoneNumber: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), email: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), fileArray: `[`PassportFileArrayFilter`](../-passport-file-array-filter/index.md)` = PassportFileArrayFilter(status = AnnotationState.OFF), frontSide: `[`PassportFileFilter`](../-passport-file-filter/index.md)` = PassportFileFilter(status = AnnotationState.OFF), reverseSide: `[`PassportFileFilter`](../-passport-file-filter/index.md)` = PassportFileFilter(status = AnnotationState.OFF), selfie: `[`PassportFileFilter`](../-passport-file-filter/index.md)` = PassportFileFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [data](data.md) | `val data: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md) |
| [email](email.md) | `val email: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [fileArray](file-array.md) | `val fileArray: `[`PassportFileArrayFilter`](../-passport-file-array-filter/index.md) |
| [frontSide](front-side.md) | `val frontSide: `[`PassportFileFilter`](../-passport-file-filter/index.md) |
| [phoneNumber](phone-number.md) | `val phoneNumber: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [reverseSide](reverse-side.md) | `val reverseSide: `[`PassportFileFilter`](../-passport-file-filter/index.md) |
| [selfie](selfie.md) | `val selfie: `[`PassportFileFilter`](../-passport-file-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [type](type.md) | `val type: `[`EncryptedPassportElement.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-encrypted-passport-element/-type/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
