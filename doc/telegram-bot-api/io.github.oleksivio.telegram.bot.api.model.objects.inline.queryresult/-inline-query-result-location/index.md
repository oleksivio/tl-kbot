[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResultLocation](./index.md)

# InlineQueryResultLocation

`data class InlineQueryResultLocation : `[`TitledInlineResult`](../-titled-inline-result/index.md)

[InlineQueryResultLocation](https://core.telegram.org/bots/api/#inlinequeryresultlocation)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResultLocation(latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, livePeriod: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, thumbWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, thumbHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "location")`<br>[InlineQueryResultLocation](https://core.telegram.org/bots/api/#inlinequeryresultlocation) |

### Properties

| Name | Summary |
|---|---|
| [latitude](latitude.md) | `val latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>latitude Float number Latitude of the location |
| [livePeriod](live-period.md) | `val livePeriod: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>live_period [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) OptionalPeriod in seconds for which the location will be updated (see Live Locations, should be between 60 and 86400 |
| [longitude](longitude.md) | `val longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>longitude Float number Longitude of the location |
| [thumbHeight](thumb-height.md) | `val thumbHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>thumb_height Integer Optional. Thumbnail height |
| [thumbUrl](thumb-url.md) | `val thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>thumb_url [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. URL of the thumbnail (jpeg only) for the file |
| [thumbWidth](thumb-width.md) | `val thumbWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>thumb_width Integer Optional. Thumbnail width |
| [type](type.md) | `val type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>type String Type of the result |

### Inherited Properties

| Name | Summary |
|---|---|
| [title](../-titled-inline-result/title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>title String Title for the result |
