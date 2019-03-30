[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std](../index.md) / [Message](./index.md)

# Message

`data class Message : IUserFrom, IChat`

[Message](https://core.telegram.org/bots/api/#message)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Message(messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, from: `[`User`](../-user/index.md)`? = null, date: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, chat: `[`Chat`](../-chat/index.md)` = Chat(), forwardFrom: `[`User`](../-user/index.md)`? = null, forwardFromChat: `[`Chat`](../-chat/index.md)`? = null, forwardFromMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, forwardSignature: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, forwardDate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, replyToMessage: `[`Message`](./index.md)`? = null, editDate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, mediaGroupId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, authorSignature: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, audio: `[`Audio`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-audio/index.md)`? = null, photo: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`PhotoSize`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-photo-size/index.md)`>? = null, caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, contact: `[`Contact`](../-contact/index.md)`? = null, location: `[`Location`](../-location/index.md)`? = null, newChatMembers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`User`](../-user/index.md)`>? = null, leftChatMember: `[`User`](../-user/index.md)`? = null, document: `[`Document`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-document/index.md)`? = null, animation: `[`Animation`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.game/-animation/index.md)`? = null, game: `[`Game`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.game/-game/index.md)`? = null, newChatTitle: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, sticker: `[`Sticker`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-sticker/index.md)`? = null, video: `[`Video`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-video/index.md)`? = null, voice: `[`Voice`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-voice/index.md)`? = null, entities: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MessageEntity`](../-message-entity/index.md)`>? = null, captionEntities: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MessageEntity`](../-message-entity/index.md)`>? = null, videoNote: `[`VideoNote`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-video-note/index.md)`? = null, newChatPhoto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`PhotoSize`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-photo-size/index.md)`>? = null, deleteChatPhoto: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, groupChatCreated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, venue: `[`Venue`](../-venue/index.md)`? = null, supergroupChatCreated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, channelChatCreated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, migrateToChatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, migrateFromChatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, pinnedMessage: `[`Message`](./index.md)`? = null, invoice: `[`Invoice`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-invoice/index.md)`? = null, successfulPayment: `[`SuccessfulPayment`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-successful-payment/index.md)`? = null, connectedWebsite: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, passportData: `[`PassportData`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-passport-data/index.md)`? = null)`<br>[Message](https://core.telegram.org/bots/api/#message) |

### Properties

| Name | Summary |
|---|---|
| [animation](animation.md) | `var animation: `[`Animation`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.game/-animation/index.md)`?`<br>To setup filter: |
| [audio](audio.md) | `var audio: `[`Audio`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-audio/index.md)`?`<br>To setup filter: |
| [authorSignature](author-signature.md) | `var authorSignature: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [caption](caption.md) | `var caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [captionEntities](caption-entities.md) | `var captionEntities: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MessageEntity`](../-message-entity/index.md)`>?`<br>To setup filter: |
| [channelChatCreated](channel-chat-created.md) | `var channelChatCreated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>To setup filter(only for reply message): |
| [chat](chat.md) | `var chat: `[`Chat`](../-chat/index.md)<br>To setup filter: |
| [connectedWebsite](connected-website.md) | `var connectedWebsite: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [contact](contact.md) | `var contact: `[`Contact`](../-contact/index.md)`?`<br>To setup filter: |
| [date](date.md) | `var date: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>To setup filter: |
| [deleteChatPhoto](delete-chat-photo.md) | `var deleteChatPhoto: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>To setup filter: |
| [document](document.md) | `var document: `[`Document`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-document/index.md)`?`<br>To setup filter: |
| [editDate](edit-date.md) | `var editDate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>To setup filter: |
| [entities](entities.md) | `var entities: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MessageEntity`](../-message-entity/index.md)`>?`<br>To setup filter: |
| [forwardDate](forward-date.md) | `var forwardDate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>To setup filter: |
| [forwardFrom](forward-from.md) | `var forwardFrom: `[`User`](../-user/index.md)`?`<br>To setup filter: |
| [forwardFromChat](forward-from-chat.md) | `var forwardFromChat: `[`Chat`](../-chat/index.md)`?`<br>To setup filter: |
| [forwardFromMessageId](forward-from-message-id.md) | `var forwardFromMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>To setup filter: |
| [forwardSignature](forward-signature.md) | `var forwardSignature: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [from](from.md) | `var from: `[`User`](../-user/index.md)`?`<br>To setup filter: |
| [game](game.md) | `var game: `[`Game`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.game/-game/index.md)`?`<br>To setup filter: |
| [groupChatCreated](group-chat-created.md) | `var groupChatCreated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>To setup filter: |
| [invoice](invoice.md) | `var invoice: `[`Invoice`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-invoice/index.md)`?`<br>To setup filter: |
| [leftChatMember](left-chat-member.md) | `var leftChatMember: `[`User`](../-user/index.md)`?`<br>To setup filter: |
| [location](location.md) | `var location: `[`Location`](../-location/index.md)`?`<br>To setup filter: |
| [mediaGroupId](media-group-id.md) | `var mediaGroupId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [messageId](message-id.md) | `var messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>message_id Integer Unique message identifier inside this chat |
| [migrateFromChatId](migrate-from-chat-id.md) | `var migrateFromChatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>To setup filter: |
| [migrateToChatId](migrate-to-chat-id.md) | `var migrateToChatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>To setup filter: |
| [newChatMembers](new-chat-members.md) | `var newChatMembers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`User`](../-user/index.md)`>?`<br>To setup filter: |
| [newChatPhoto](new-chat-photo.md) | `var newChatPhoto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`PhotoSize`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-photo-size/index.md)`>?`<br>To setup filter: |
| [newChatTitle](new-chat-title.md) | `var newChatTitle: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [passportData](passport-data.md) | `var passportData: `[`PassportData`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-passport-data/index.md)`?`<br>To setup filter: |
| [photo](photo.md) | `var photo: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`PhotoSize`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-photo-size/index.md)`>?`<br>To setup filter: |
| [pinnedMessage](pinned-message.md) | `var pinnedMessage: `[`Message`](./index.md)`?`<br>To setup filter: |
| [replyToMessage](reply-to-message.md) | `var replyToMessage: `[`Message`](./index.md)`?`<br>To setup filter: |
| [sticker](sticker.md) | `var sticker: `[`Sticker`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-sticker/index.md)`?`<br>To setup filter: |
| [successfulPayment](successful-payment.md) | `var successfulPayment: `[`SuccessfulPayment`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-successful-payment/index.md)`?`<br>To setup filter: |
| [supergroupChatCreated](supergroup-chat-created.md) | `var supergroupChatCreated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>To setup filter(only for reply message): |
| [text](text.md) | `var text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [venue](venue.md) | `var venue: `[`Venue`](../-venue/index.md)`?`<br>To setup filter: |
| [video](video.md) | `var video: `[`Video`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-video/index.md)`?`<br>To setup filter: |
| [videoNote](video-note.md) | `var videoNote: `[`VideoNote`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-video-note/index.md)`?`<br>To setup filter: |
| [voice](voice.md) | `var voice: `[`Voice`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-voice/index.md)`?`<br>To setup filter: |
