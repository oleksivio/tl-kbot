[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [VenueFilter](./index.md)

# VenueFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class VenueFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `VenueFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], location: `[`LocationFilter`](../-location-filter/index.md)` = LocationFilter(status = AnnotationState.OFF), title: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), address: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), foursquareId: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md)` = NotNullFilter(status = AnnotationState.OFF), foursquareType: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [address](address.md) | `val address: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [foursquareId](foursquare-id.md) | `val foursquareId: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md) |
| [foursquareType](foursquare-type.md) | `val foursquareType: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [location](location.md) | `val location: `[`LocationFilter`](../-location-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [title](title.md) | `val title: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
