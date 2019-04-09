[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button](../index.md) / [ReplyKeyboardButton](./index.md)

# ReplyKeyboardButton

`data class ReplyKeyboardButton : ITelegram`

[KeyboardButton](https://core.telegram.org/bots/api/#keyboardbutton)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ReplyKeyboardButton(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, requestContact: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, requestLocation: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)`<br>[KeyboardButton](https://core.telegram.org/bots/api/#keyboardbutton) |

### Properties

| Name | Summary |
|---|---|
| [requestContact](request-contact.md) | `var requestContact: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>request_contact Boolean Optional. If True, the user's phone number will be sent as a contact when the button is pressed. Available in private chats only |
| [requestLocation](request-location.md) | `var requestLocation: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>request_location Boolean Optional. If True, the user's current location will be sent when the button is pressed. Available in private chats only |
| [text](text.md) | `var text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>text String Text of the button. If none of the optional fields are used, it will be sent as a message when the button is pressed |
