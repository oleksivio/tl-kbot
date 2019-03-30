[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.files](../index.md) / [UserProfilePhotos](./index.md)

# UserProfilePhotos

`data class UserProfilePhotos : ITelegram`

[UserProfilePhotos](https://core.telegram.org/bots/api/#userprofilephotos)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UserProfilePhotos(photos: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`PhotoSize`](../-photo-size/index.md)`>>? = null, totalCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)`<br>[UserProfilePhotos](https://core.telegram.org/bots/api/#userprofilephotos) |

### Properties

| Name | Summary |
|---|---|
| [photos](photos.md) | `val photos: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`PhotoSize`](../-photo-size/index.md)`>>?`<br>photos Array of Array of PhotoSize Requested profile pictures (in up to 4 sizes each) |
| [totalCount](total-count.md) | `var totalCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>total_count Integer Total number of profile pictures the target user has |
