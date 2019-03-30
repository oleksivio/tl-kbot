[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std](../index.md) / [Chat](./index.md)

# Chat

`data class Chat : ITelegram`

To setup filter:

ChatFilter chat

[Chat](https://core.telegram.org/bots/api/#chat)

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | `enum class Type : TelegramType` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Chat(id: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 0, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, username: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, firstName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, lastName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, allMembersAreAdmin: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, chatPhoto: `[`ChatPhoto`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-chat-photo/index.md)`? = null, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, inviteLink: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, pinnedMessage: `[`Message`](../-message/index.md)`? = null, sticerSetName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, canSetStickerSet: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)`<br>To setup filter: |

### Properties

| Name | Summary |
|---|---|
| [allMembersAreAdmin](all-members-are-admin.md) | `var allMembersAreAdmin: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>To setup filter: |
| [canSetStickerSet](can-set-sticker-set.md) | `var canSetStickerSet: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>can_set_sticker_set Boolean Optional. True, if the bot can change the group sticker set. Returned only in getChat. |
| [chatPhoto](chat-photo.md) | `var chatPhoto: `[`ChatPhoto`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-chat-photo/index.md)`?`<br>photo ChatPhoto Optional. Chat photo. Returned only in getChat. |
| [description](description.md) | `var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>description [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Description, for supergroups and channel chats. Returned only in getChat. |
| [firstName](first-name.md) | `var firstName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [id](id.md) | `var id: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>id Integer Unique identifier for this chat. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier. |
| [inviteLink](invite-link.md) | `var inviteLink: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>invite_link [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Chat invite link, for supergroups and channel chats. Returned only in getChat. |
| [lastName](last-name.md) | `var lastName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [pinnedMessage](pinned-message.md) | `var pinnedMessage: `[`Message`](../-message/index.md)`?`<br>pinned_message Message Optional. Pinned message, for supergroups and channel chats. Returned only in getChat. |
| [sticerSetName](sticer-set-name.md) | `var sticerSetName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>sticker_set_name [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. For supergroups, name of group sticker set. Returned only in getChat. |
| [title](title.md) | `var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [type](type.md) | `var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [username](username.md) | `var username: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
