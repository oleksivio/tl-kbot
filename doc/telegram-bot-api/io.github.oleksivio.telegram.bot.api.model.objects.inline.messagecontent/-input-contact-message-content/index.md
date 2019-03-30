[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.messagecontent](../index.md) / [InputContactMessageContent](./index.md)

# InputContactMessageContent

`data class InputContactMessageContent : `[`InputMessageContent`](../-input-message-content.md)

[InputContactMessageContent](https://core.telegram.org/bots/api/#inputcontactmessagecontent)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InputContactMessageContent(phoneNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, firstName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, lastName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, vCard: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[InputContactMessageContent](https://core.telegram.org/bots/api/#inputcontactmessagecontent) |

### Properties

| Name | Summary |
|---|---|
| [firstName](first-name.md) | `var firstName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>first_name String Contact's first name |
| [lastName](last-name.md) | `var lastName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>last_name [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Contact's last name |
| [phoneNumber](phone-number.md) | `var phoneNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>phone_number String Contact's phone number |
| [vCard](v-card.md) | `var vCard: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>vcard [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes |
