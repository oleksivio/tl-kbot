[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](../index.md) / [InlineQueryResultContact](./index.md)

# InlineQueryResultContact

`data class InlineQueryResultContact : `[`ContentInlineResult`](../-content-inline-result/index.md)

[InlineQueryResultContact](https://core.telegram.org/bots/api/#inlinequeryresultcontact)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQueryResultContact(phoneNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, firstName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, lastName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, vcard: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, thumbWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, thumbHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "contact")`<br>[InlineQueryResultContact](https://core.telegram.org/bots/api/#inlinequeryresultcontact) |

### Properties

| Name | Summary |
|---|---|
| [firstName](first-name.md) | `var firstName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>first_name String Contact's first name |
| [lastName](last-name.md) | `var lastName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>last_name [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Contact's last name |
| [phoneNumber](phone-number.md) | `var phoneNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>phone_number String Contact's phone number |
| [thumbHeight](thumb-height.md) | `var thumbHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>thumb_height Integer Optional. Thumbnail height |
| [thumbUrl](thumb-url.md) | `var thumbUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>thumb_url [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. URL of the thumbnail (jpeg only) for the file |
| [thumbWidth](thumb-width.md) | `var thumbWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>thumb_width Integer Optional. Thumbnail width |
| [type](type.md) | `val type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>type String Type of the result |
| [vcard](vcard.md) | `var vcard: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>vcard [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Additional data about the contact in the form of a vCard, 0-2048 bytes |

### Inherited Properties

| Name | Summary |
|---|---|
| [inputMessageContent](../-content-inline-result/input-message-content.md) | `var inputMessageContent: `[`InputMessageContent`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline.messagecontent/-input-message-content.md)`?`<br>input_message_content InputMessageContent Optional. Content of the message to be sent |
