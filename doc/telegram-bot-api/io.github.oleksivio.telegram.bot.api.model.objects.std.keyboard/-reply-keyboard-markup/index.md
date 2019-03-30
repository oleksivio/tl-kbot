[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard](../index.md) / [ReplyKeyboardMarkup](./index.md)

# ReplyKeyboardMarkup

`data class ReplyKeyboardMarkup : `[`IKeyboard`](../-i-keyboard.md)

[ReplyKeyboardMarkup](https://core.telegram.org/bots/api/#replykeyboardmarkup)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ReplyKeyboardMarkup(keyboard: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`ReplyButtonRow`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row/-reply-button-row/index.md)`> = mutableListOf(ReplyButtonRow()), resizeKeyboard: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, oneTimeKeyboard: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, selective: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)`<br>[ReplyKeyboardMarkup](https://core.telegram.org/bots/api/#replykeyboardmarkup) |

### Properties

| Name | Summary |
|---|---|
| [keyboard](keyboard.md) | `var keyboard: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`ReplyButtonRow`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row/-reply-button-row/index.md)`>`<br>keyboard Array of Array of KeyboardButton Array of button rows, each represented by an Array of KeyboardButton objects |
| [oneTimeKeyboard](one-time-keyboard.md) | `var oneTimeKeyboard: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>one_time_keyboard Boolean Optional. Requests clients to hide the keyboard as soon as it's been used. The keyboard will still be available, but clients will automatically display the usual letter-keyboard in the chat – the user can press a special button in the input field to see the custom keyboard again. Defaults to false. |
| [resizeKeyboard](resize-keyboard.md) | `var resizeKeyboard: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>resize_keyboard Boolean Optional. Requests clients to resize the keyboard vertically for optimal fit (e.g., make the keyboard smaller if there are just two rows of buttons). Defaults to false, in which case the custom keyboard is always of the same height as the app's standard keyboard. |
| [selective](selective.md) | `var selective: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>selective Boolean Optional. Use this parameter if you want to show the keyboard to specific users only. Targets: 1) users that are @mentioned in the text of the Message object; 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message. |

### Functions

| Name | Summary |
|---|---|
| [addRow](add-row.md) | `fun addRow(row: `[`ReplyButtonRow`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row/-reply-button-row/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
