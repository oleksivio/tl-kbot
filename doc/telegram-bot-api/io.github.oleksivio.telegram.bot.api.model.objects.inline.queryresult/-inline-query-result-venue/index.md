[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResultVenue](./index.md)

# InlineQueryResultVenue

`class InlineQueryResultVenue : `[`TitledInlineResult`](../-titled-inline-result/index.md)

[InlineQueryResultVenue](https://core.telegram.org/bots/api/#inlinequeryresultvenue)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResultVenue(latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, foursquareId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, foursquareType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, thumbWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, thumbHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "venue")`<br>[InlineQueryResultVenue](https://core.telegram.org/bots/api/#inlinequeryresultvenue) |

### Properties

| Name | Summary |
|---|---|
| [address](address.md) | `var address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>address String Address of the venue |
| [foursquareId](foursquare-id.md) | `var foursquareId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>foursquare_id [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Foursquare identifier of the venue |
| [foursquareType](foursquare-type.md) | `var foursquareType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>foursquare_type [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.) |
| [latitude](latitude.md) | `var latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>latitude Float number Latitude of the venue |
| [longitude](longitude.md) | `var longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>longitude Float number Longitude of the venue |
| [thumbHeight](thumb-height.md) | `var thumbHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>thumb_height Integer Optional. Thumbnail height |
| [thumbUrl](thumb-url.md) | `var thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>thumb_url [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. URL of the thumbnail (jpeg only) for the file |
| [thumbWidth](thumb-width.md) | `var thumbWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>thumb_width Integer Optional. Thumbnail width |
| [type](type.md) | `val type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>type String Type of the result |

### Inherited Properties

| Name | Summary |
|---|---|
| [title](../-titled-inline-result/title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>title String Title for the result |
