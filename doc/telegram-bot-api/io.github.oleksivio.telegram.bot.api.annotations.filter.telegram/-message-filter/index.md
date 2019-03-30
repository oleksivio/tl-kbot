[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [MessageFilter](./index.md)

# MessageFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class MessageFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MessageFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], from: `[`UserFilter`](../-user-filter/index.md)` = UserFilter(status = AnnotationState.OFF), date: <ERROR CLASS> = LongFilter(status = AnnotationState.OFF), chat: `[`ChatFilter`](../-chat-filter/index.md)` = ChatFilter(status = AnnotationState.OFF), forwardFrom: `[`UserFilter`](../-user-filter/index.md)` = UserFilter(status = AnnotationState.OFF), forwardChat: `[`ChatFilter`](../-chat-filter/index.md)` = ChatFilter(status = AnnotationState.OFF), forwardFromMessageId: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), forwardSignature: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), forwardDate: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), replyToMessage: `[`IncludeMessageFilter`](../-include-message-filter/index.md)` = IncludeMessageFilter(status = AnnotationState.OFF), editDate: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), mediaGroupId: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), authorSignature: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), text: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), audio: `[`AudioFilter`](../-audio-filter/index.md)` = AudioFilter(status = AnnotationState.OFF), photoArray: `[`PhotoArrayFilter`](../-photo-array-filter/index.md)` = PhotoArrayFilter(status = AnnotationState.OFF), caption: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), contact: `[`ContactFilter`](../-contact-filter/index.md)` = ContactFilter(status = AnnotationState.OFF), location: `[`LocationFilter`](../-location-filter/index.md)` = LocationFilter(status = AnnotationState.OFF), newChatMembers: `[`UserArrayFilter`](../-user-array-filter/index.md)` = UserArrayFilter(status = AnnotationState.OFF), leftChatMember: `[`UserFilter`](../-user-filter/index.md)` = UserFilter(status = AnnotationState.OFF), document: `[`DocumentFilter`](../-document-filter/index.md)` = DocumentFilter(status = AnnotationState.OFF), animation: `[`AnimationFilter`](../-animation-filter/index.md)` = AnimationFilter(status = AnnotationState.OFF), game: `[`GameFilter`](../-game-filter/index.md)` = GameFilter(status = AnnotationState.OFF), newChatTitle: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), sticker: `[`StickerFilter`](../-sticker-filter/index.md)` = StickerFilter(status = AnnotationState.OFF), video: `[`VideoFilter`](../-video-filter/index.md)` = VideoFilter(status = AnnotationState.OFF), voice: `[`VoiceFilter`](../-voice-filter/index.md)` = VoiceFilter(status = AnnotationState.OFF), entityArray: `[`MessageEntityArrayFilter`](../-message-entity-array-filter/index.md)` = MessageEntityArrayFilter(status = AnnotationState.OFF), captionEntityArray: `[`MessageEntityArrayFilter`](../-message-entity-array-filter/index.md)` = MessageEntityArrayFilter(status = AnnotationState.OFF), videoNote: `[`VideoNoteFilter`](../-video-note-filter/index.md)` = VideoNoteFilter(status = AnnotationState.OFF), newChatPhoto: `[`PhotoFilter`](../-photo-filter/index.md)` = PhotoFilter(status = AnnotationState.OFF), deleteChatPhoto: <ERROR CLASS> = BooleanFilter(status = AnnotationState.OFF), groupChatCreated: <ERROR CLASS> = BooleanFilter(status = AnnotationState.OFF), venue: `[`VenueFilter`](../-venue-filter/index.md)` = VenueFilter(status = AnnotationState.OFF), supergroupChatCreated: <ERROR CLASS> = BooleanFilter(status = AnnotationState.OFF), channelChatCreated: <ERROR CLASS> = BooleanFilter(status = AnnotationState.OFF), migrateToChatId: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), migrateFromChatId: <ERROR CLASS> = NotNullFilter(status = AnnotationState.OFF), pinnedMessage: `[`IncludeMessageFilter`](../-include-message-filter/index.md)` = IncludeMessageFilter(status = AnnotationState.OFF), invoice: `[`InvoiceFilter`](../-invoice-filter/index.md)` = InvoiceFilter(status = AnnotationState.OFF), successfulPayment: `[`SuccessfulPaymentFilter`](../-successful-payment-filter/index.md)` = SuccessfulPaymentFilter(status = AnnotationState.OFF), connectedWebsite: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), passportData: `[`PassportDataFilter`](../-passport-data-filter/index.md)` = PassportDataFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [animation](animation.md) | `val animation: `[`AnimationFilter`](../-animation-filter/index.md) |
| [audio](audio.md) | `val audio: `[`AudioFilter`](../-audio-filter/index.md) |
| [authorSignature](author-signature.md) | `val authorSignature: <ERROR CLASS>` |
| [caption](caption.md) | `val caption: <ERROR CLASS>` |
| [captionEntityArray](caption-entity-array.md) | `val captionEntityArray: `[`MessageEntityArrayFilter`](../-message-entity-array-filter/index.md) |
| [channelChatCreated](channel-chat-created.md) | `val channelChatCreated: <ERROR CLASS>` |
| [chat](chat.md) | `val chat: `[`ChatFilter`](../-chat-filter/index.md) |
| [connectedWebsite](connected-website.md) | `val connectedWebsite: <ERROR CLASS>` |
| [contact](contact.md) | `val contact: `[`ContactFilter`](../-contact-filter/index.md) |
| [date](date.md) | `val date: <ERROR CLASS>` |
| [deleteChatPhoto](delete-chat-photo.md) | `val deleteChatPhoto: <ERROR CLASS>` |
| [document](document.md) | `val document: `[`DocumentFilter`](../-document-filter/index.md) |
| [editDate](edit-date.md) | `val editDate: <ERROR CLASS>` |
| [entityArray](entity-array.md) | `val entityArray: `[`MessageEntityArrayFilter`](../-message-entity-array-filter/index.md) |
| [forwardChat](forward-chat.md) | `val forwardChat: `[`ChatFilter`](../-chat-filter/index.md) |
| [forwardDate](forward-date.md) | `val forwardDate: <ERROR CLASS>` |
| [forwardFrom](forward-from.md) | `val forwardFrom: `[`UserFilter`](../-user-filter/index.md) |
| [forwardFromMessageId](forward-from-message-id.md) | `val forwardFromMessageId: <ERROR CLASS>` |
| [forwardSignature](forward-signature.md) | `val forwardSignature: <ERROR CLASS>` |
| [from](from.md) | `val from: `[`UserFilter`](../-user-filter/index.md) |
| [game](game.md) | `val game: `[`GameFilter`](../-game-filter/index.md) |
| [groupChatCreated](group-chat-created.md) | `val groupChatCreated: <ERROR CLASS>` |
| [invoice](invoice.md) | `val invoice: `[`InvoiceFilter`](../-invoice-filter/index.md) |
| [leftChatMember](left-chat-member.md) | `val leftChatMember: `[`UserFilter`](../-user-filter/index.md) |
| [location](location.md) | `val location: `[`LocationFilter`](../-location-filter/index.md) |
| [mediaGroupId](media-group-id.md) | `val mediaGroupId: <ERROR CLASS>` |
| [migrateFromChatId](migrate-from-chat-id.md) | `val migrateFromChatId: <ERROR CLASS>` |
| [migrateToChatId](migrate-to-chat-id.md) | `val migrateToChatId: <ERROR CLASS>` |
| [newChatMembers](new-chat-members.md) | `val newChatMembers: `[`UserArrayFilter`](../-user-array-filter/index.md) |
| [newChatPhoto](new-chat-photo.md) | `val newChatPhoto: `[`PhotoFilter`](../-photo-filter/index.md) |
| [newChatTitle](new-chat-title.md) | `val newChatTitle: <ERROR CLASS>` |
| [passportData](passport-data.md) | `val passportData: `[`PassportDataFilter`](../-passport-data-filter/index.md) |
| [photoArray](photo-array.md) | `val photoArray: `[`PhotoArrayFilter`](../-photo-array-filter/index.md) |
| [pinnedMessage](pinned-message.md) | `val pinnedMessage: `[`IncludeMessageFilter`](../-include-message-filter/index.md) |
| [replyToMessage](reply-to-message.md) | `val replyToMessage: `[`IncludeMessageFilter`](../-include-message-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [sticker](sticker.md) | `val sticker: `[`StickerFilter`](../-sticker-filter/index.md) |
| [successfulPayment](successful-payment.md) | `val successfulPayment: `[`SuccessfulPaymentFilter`](../-successful-payment-filter/index.md) |
| [supergroupChatCreated](supergroup-chat-created.md) | `val supergroupChatCreated: <ERROR CLASS>` |
| [text](text.md) | `val text: <ERROR CLASS>` |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [venue](venue.md) | `val venue: `[`VenueFilter`](../-venue-filter/index.md) |
| [video](video.md) | `val video: `[`VideoFilter`](../-video-filter/index.md) |
| [videoNote](video-note.md) | `val videoNote: `[`VideoNoteFilter`](../-video-note-filter/index.md) |
| [voice](voice.md) | `val voice: `[`VoiceFilter`](../-voice-filter/index.md) |
