[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.group](../index.md) / [UnbanChatMember](./index.md)

# UnbanChatMember

`data class UnbanChatMember : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

**See Also**

[unbanChatMember](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UnbanChatMember(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<BooleanResponse>` |
| [userId](user-id.md) | `val userId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>user_id Integer Unique identifier of the target user |
