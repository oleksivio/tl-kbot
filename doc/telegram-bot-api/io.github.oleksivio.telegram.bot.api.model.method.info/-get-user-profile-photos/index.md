[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.info](../index.md) / [GetUserProfilePhotos](./index.md)

# GetUserProfilePhotos

`data class GetUserProfilePhotos : Action<`[`UserProfilePhotos`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-user-profile-photos/index.md)`>`

**See Also**

[getUserProfilePhotos](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `GetUserProfilePhotos(userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [limit](limit.md) | `val limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>limit [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalLimits the number of photos to be retrieved. Values between 1—100 are accepted. Defaults to 100. |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [offset](offset.md) | `val offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>offset [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalSequential number of the first photo to be returned. By default, all photos are returned. |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<UserProfilePhotosResponse>` |
| [userId](user-id.md) | `val userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>user_id Integer Unique identifier of the target user |
