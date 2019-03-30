[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.location](../index.md) / [SendVenue](./index.md)

# SendVenue

`data class SendVenue : MessageAction`

**See Also**

[sendVenue](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SendVenue(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, foursquareId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, foursquareType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [address](address.md) | `val address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>address String Address of the venue |
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>chat_id Integer or [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Required if inline_message_id is not specified. Unique identifier for the target chat |
| [disableNotification](disable-notification.md) | `val disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_notification [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalSends the message silently. Users will receive a notification with no sound. |
| [foursquareId](foursquare-id.md) | `val foursquareId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>foursquare_id [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Foursquare identifier of the venue |
| [foursquareType](foursquare-type.md) | `val foursquareType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>foursquare_type [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.) |
| [latitude](latitude.md) | `val latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>latitude Float number Yes Latitude of new location |
| [longitude](longitude.md) | `val longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>longitude Float number Yes Longitude of new location |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [replyMarkup](reply-markup.md) | `val replyMarkup: `[`IKeyboard`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-i-keyboard.md)`?`<br>reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user. |
| [replyToMessageId](reply-to-message-id.md) | `val replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>reply_to_message_id [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalIf the message is a reply, ID of the original message |
| [title](title.md) | `val title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>title String Name of the venue |
