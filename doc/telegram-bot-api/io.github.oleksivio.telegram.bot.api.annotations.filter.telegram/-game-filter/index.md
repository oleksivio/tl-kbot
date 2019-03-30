[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [GameFilter](./index.md)

# GameFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class GameFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `GameFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], title: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), description: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), photoArray: `[`PhotoArrayFilter`](../-photo-array-filter/index.md)` = PhotoArrayFilter(status = AnnotationState.OFF), text: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), textEntities: `[`MessageEntityFilter`](../-message-entity-filter/index.md)` = MessageEntityFilter(status = AnnotationState.OFF), animation: `[`AnimationFilter`](../-animation-filter/index.md)` = AnimationFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [animation](animation.md) | `val animation: `[`AnimationFilter`](../-animation-filter/index.md) |
| [description](description.md) | `val description: <ERROR CLASS>` |
| [photoArray](photo-array.md) | `val photoArray: `[`PhotoArrayFilter`](../-photo-array-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [text](text.md) | `val text: <ERROR CLASS>` |
| [textEntities](text-entities.md) | `val textEntities: `[`MessageEntityFilter`](../-message-entity-filter/index.md) |
| [title](title.md) | `val title: <ERROR CLASS>` |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
