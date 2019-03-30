[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.passport](../index.md) / [EncryptedPassportElement](index.md) / [files](./files.md)

# files

`var files: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`PassportFile`](../-passport-file/index.md)`>?`

To setup filter:

PassportFileArrayFilter fileArray files Array of PassportFile Optional. Array of encrypted files with
documents provided by the user, available for “utility_bill”, “bank_statement”, “rental_agreement”,
“passport_registration” and “temporary_registration” types. Files can be decrypted and verified using the
accompanying EncryptedCredentials.

