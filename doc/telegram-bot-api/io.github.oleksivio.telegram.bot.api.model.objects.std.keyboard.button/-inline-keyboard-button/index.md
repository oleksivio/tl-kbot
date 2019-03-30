[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button](../index.md) / [InlineKeyboardButton](./index.md)

# InlineKeyboardButton

`class InlineKeyboardButton : ITelegram`

[InlineKeyboardButton](https://core.telegram.org/bots/api/#inlinekeyboardbutton)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineKeyboardButton()`<br>[InlineKeyboardButton](https://core.telegram.org/bots/api/#inlinekeyboardbutton) |

### Properties

| Name | Summary |
|---|---|
| [callbackData](callback-data.md) | `var callbackData: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>callback_data [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Data to be sent in a callback query to the bot when button is pressed, 1-64 bytes |
| [callbackGame](callback-game.md) | `var callbackGame: `[`CallbackGame`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.game/-callback-game/index.md)`?`<br>callback_game CallbackGame Optional. Description of the game that will be launched when the user presses the button. |
| [pay](pay.md) | `var pay: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>pay Boolean Optional. Specify True, to send a Pay button. |
| [switchInlineQuery](switch-inline-query.md) | `var switchInlineQuery: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>switch_inline_query [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. If set, pressing the button will prompt the user to select one of their chats, open that chat and insert the bot‘s username and the specified inline query in the input field. Can be empty, in which case just the bot’s username will be inserted. |
| [switchInlineQueryCurrentChat](switch-inline-query-current-chat.md) | `var switchInlineQueryCurrentChat: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>switch_inline_query_current_chat [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. If set, pressing the button will insert the bot‘s username and the specified inline query in the current chat's input field. Can be empty, in which case only the bot’s username will be inserted. |
| [text](text.md) | `var text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>text String Label text on the button |
| [url](url.md) | `var url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>url [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. HTTP url to be opened when button is pressed |
