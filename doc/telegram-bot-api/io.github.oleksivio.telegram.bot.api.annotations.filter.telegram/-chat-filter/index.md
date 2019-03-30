[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [ChatFilter](./index.md)

# ChatFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class ChatFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ChatFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, type: `[`Chat.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-chat/-type/index.md)` = Chat.Type.ALL, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], title: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), username: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), firstName: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), lastName: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), allMembersAreAdministrators: <ERROR CLASS> = BooleanFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [allMembersAreAdministrators](all-members-are-administrators.md) | `val allMembersAreAdministrators: <ERROR CLASS>` |
| [firstName](first-name.md) | `val firstName: <ERROR CLASS>` |
| [lastName](last-name.md) | `val lastName: <ERROR CLASS>` |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [title](title.md) | `val title: <ERROR CLASS>` |
| [type](type.md) | `val type: `[`Chat.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-chat/-type/index.md) |
| [username](username.md) | `val username: <ERROR CLASS>` |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
