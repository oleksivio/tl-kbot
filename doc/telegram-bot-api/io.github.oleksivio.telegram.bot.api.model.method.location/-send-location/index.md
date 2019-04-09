[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.location](../index.md) / [SendLocation](./index.md)

# SendLocation

`data class SendLocation : MessageAction`

**See Also**

[sendLocation](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SendLocation(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, livePeriod: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Unique identifier for the target chat or username of the target channel |
| [disableNotification](disable-notification.md) | `val disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_notification [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalSends the message silently. Users will receive a notification with no sound. |
| [latitude](latitude.md) | `val latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>latitude Float number Yes Latitude of new location |
| [livePeriod](live-period.md) | `val livePeriod: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>live_period [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalPeriod in seconds for which the location will be updated (see Live Locations, should be between 60 and 86400 |
| [longitude](longitude.md) | `val longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>longitude Float number Yes Longitude of new location |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [replyMarkup](reply-markup.md) | `val replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`?`<br>reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user. |
| [replyToMessageId](reply-to-message-id.md) | `val replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>reply_to_message_id [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalIf the message is a reply, ID of the original message |
