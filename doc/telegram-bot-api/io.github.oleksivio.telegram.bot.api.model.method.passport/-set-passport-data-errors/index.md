[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.passport](../index.md) / [SetPassportDataErrors](./index.md)

# SetPassportDataErrors

`data class SetPassportDataErrors : Action<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

**See Also**

[setPassportDataErrors](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SetPassportDataErrors(userId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, errors: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`PassportElementError`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport.errors/-passport-element-error/index.md)`>)` |

### Properties

| Name | Summary |
|---|---|
| [errors](errors.md) | `val errors: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`PassportElementError`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport.errors/-passport-element-error/index.md)`>`<br>errors Array of PassportElementError Yes A JSON-serialized array describing the errors |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<BooleanResponse>` |
| [userId](user-id.md) | `val userId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>user_id Integer Yes User identifier |
