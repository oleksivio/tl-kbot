[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [VenueFilter](./index.md)

# VenueFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class VenueFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `VenueFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], location: `[`LocationFilter`](../-location-filter/index.md)` = LocationFilter(status = AnnotationState.OFF), title: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), address: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), foursquareId: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), foursquareType: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [address](address.md) | `val address: <ERROR CLASS>` |
| [foursquareId](foursquare-id.md) | `val foursquareId: <ERROR CLASS>` |
| [foursquareType](foursquare-type.md) | `val foursquareType: <ERROR CLASS>` |
| [location](location.md) | `val location: `[`LocationFilter`](../-location-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [title](title.md) | `val title: <ERROR CLASS>` |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
