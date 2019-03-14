package io.github.oleksivio.telegram.bot.api.model.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.BooleanFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.LongFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.*
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportData
import io.github.oleksivio.telegram.bot.api.model.objects.payments.Invoice
import io.github.oleksivio.telegram.bot.api.model.objects.payments.SuccessfulPayment
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.*
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.Animation
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.Game
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.Sticker
import io.github.oleksivio.telegram.bot.core.model.objects.IChat
import io.github.oleksivio.telegram.bot.core.model.objects.IUserFrom

/**
 * @see [Message](https://core.telegram.org/bots/api.message)
 */
data class Message(
        /**
         * message_id Integer Unique message identifier inside this chat
         */
        @JsonProperty("message_id")
        var messageId: Long? = null,
        /**
         * To setup filter:
         *
         * @see UserFilter from from User Optional. Sender, empty for messages sent to channels
         */
        @JsonProperty("from")
        override var from: User = User(),
        /**
         * To setup filter:
         *
         * @see LongFilter date date Integer Date the message was sent in Unix time
         */
        @JsonProperty("date")
        var date: Long? = null,
        /**
         * To setup filter:
         *
         * @see ChatFilter chat chat Chat Conversation the message belongs to
         */
        @JsonProperty("chat")
        override var chat: Chat = Chat(),
        /**
         * To setup filter:
         *
         * @see UserFilter forwardFrom forward_from User Optional. For forwarded messages, sender of the original message
         */
        @JsonProperty("forward_from")
        var forwardFrom: User? = null,
        /**
         * To setup filter:
         *
         * @see ChatFilter forwardChat
         *
         *
         * forward_from_chat Chat Optional. For messages forwarded from channels, information about the original channel
         */
        @JsonProperty("forward_from_chat")
        var forwardFromChat: Chat? = null,
        /**
         * To setup filter:
         *
         * @see NotNullFilter forwardFromMessageId forward_from_message_id Integer Optional. For messages forwarded from
         * channels, identifier of the original message in the channel
         */
        @JsonProperty("forward_from_message_id")
        var forwardFromMessageId: Long? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter forwardSignature forward_signature String Optional. For messages forwarded from channels,
         * signature of the post author if present
         */
        @JsonProperty("forward_signature")
        var forwardSignature: String? = null,
        /**
         * To setup filter:
         *
         * @see NotNullFilter forwardDate forward_date Integer Optional. For forwarded messages, date the original message was
         * sent in Unix time
         */
        @JsonProperty("forward_date")
        var forwardDate: Long? = null,
        /**
         * To setup filter:
         *
         * @see IncludeMessageFilter replyToMessage reply_to_message Message Optional. For replies, the original message. Note
         * that the Message object in this field will not contain further reply_to_message fields even if it itself is a
         * reply.
         */
        @JsonProperty("reply_to_message")
        var replyToMessage: Message? = null,
        /**
         * To setup filter:
         *
         * @see NotNullFilter editDate edit_date Integer Optional. Date the message was last edited in Unix time
         */
        @JsonProperty("edit_date")
        var editDate: Long? = null,
        /**
         * To setup filter:
         *
         * @see NotNullFilter mediaGroupId media_group_id String Optional. The unique identifier of a media message group this
         * message belongs to
         */
        @JsonProperty("media_group_id")
        var mediaGroupId: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter authorSignature author_signature String Optional. Signature of the post author for messages in
         * channels
         */
        @JsonProperty("author_signature")
        var authorSignature: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter text text String Optional. For text messages, the actual UTF-8 text of the message, 0-4096
         * characters.
         */
        @JsonProperty("text")
        var text: String? = null,
        /**
         * To setup filter:
         *
         * @see AudioFilter audio audio Audio Optional. Message is an audio files, information about the files
         */
        @JsonProperty("audio")
        var audio: Audio? = null,
        /**
         * To setup filter:
         *
         * @see PhotoArrayFilter photoArray photo Array of PhotoSize Optional. Message is a photo, available sizes of the
         * photo
         */
        @JsonProperty("photo")
        var photo: List<PhotoSize>? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter caption caption String Optional. Caption for the audio, document, photo, video or voice, 0-200
         * characters
         */
        @JsonProperty("caption")
        var caption: String? = null,
        /**
         * To setup filter:
         *
         * @see ContactFilter contact contact Optional. Message is a shared contact, information about the contact
         */
        @JsonProperty("contact")
        var contact: Contact? = null,
        /**
         * To setup filter:
         *
         * @see LocationFilter location location Optional. Message is a shared location, information about the location
         */
        @JsonProperty("location")
        var location: Location? = null,
        /**
         * To setup filter:
         *
         * @see UserArrayFilter  newChatMembers new_chat_members Array of User Optional. New members that were added to the
         * group or supergroup and information about them
         */
        @JsonProperty("new_chat_members")
        var newChatMembers: List<User>? = null,
        /**
         * To setup filter:
         *
         * @see UserFilter leftChatMember left_chat_member User Optional. A member was removed from the group, information
         * about them
         */
        @JsonProperty("left_chat_member")
        var leftChatMember: User? = null,
        /**
         * To setup filter:
         *
         * @see DocumentFilter document document Document Optional. Message is a general files, information about the files
         */
        @JsonProperty("document")
        var document: Document? = null,
        /**
         * To setup filter:
         *
         * @see AnimationFilter animation animation Animation Optional. Message is an animation, information about the
         * animation. For backward compatibility, when this field is set, the document field will also be set
         */
        @JsonProperty("animation")
        var animation: Animation? = null,
        /**
         * To setup filter:
         *
         * @see GameFilter game game Game Optional. Message is a game, information about the game.
         */
        @JsonProperty("game")
        var game: Game? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter newChatTitle new_chat_title String Optional. A chat title was changed to this value
         */
        @JsonProperty("new_chat_title")
        var newChatTitle: String? = null,
        /**
         * To setup filter:
         *
         * @see StickerFilter sticker sticker Sticker Optional. Message is a sticker, information about the sticker
         */
        @JsonProperty("sticker")
        var sticker: Sticker? = null,
        /**
         * To setup filter:
         *
         * @see VideoFilter video video Video Optional. Message is a video, information about the video
         */
        @JsonProperty("video")
        var video: Video? = null,
        /**
         * To setup filter:
         *
         * @see VoiceFilter voice voice Voice Optional. Message is a voice message, information about the files
         */
        @JsonProperty("voice")
        var voice: Voice? = null,
        /**
         * To setup filter:
         *
         * @see MessageEntityArrayFilter entityArray entities Array of MessageEntity Optional. For text messages, special
         * entities like usernames, URLs, bot commands, etc. that appear in the text
         */
        @JsonProperty("entities")
        var entities: List<MessageEntity>? = null,
        /**
         * To setup filter:
         *
         * @see MessageEntityArrayFilter captionEntityArray caption_entities Array of MessageEntity Optional. For messages
         * with a caption, special entities like usernames, URLs, bot commands, etc. that appear in the caption
         */
        @JsonProperty("caption_entities")
        var captionEntities: List<MessageEntity>? = null,
        /**
         * To setup filter:
         *
         * @see VideoNoteFilter videoNote video_note VideoNote Optional. Message is a video note, information about the video
         * message
         */
        @JsonProperty("video_note")
        var videoNote: VideoNote? = null,
        /**
         * To setup filter:
         *
         * @see PhotoArrayFilter newChatPhotoArray new_chat_photo Array of PhotoSize Optional. A chat photo was change to this
         * value
         */
        @JsonProperty("new_chat_photo")
        var newChatPhoto: List<PhotoSize>? = null,
        /**
         * To setup filter:
         *
         * @see BooleanFilter deleteChatPhoto delete_chat_photo True Optional. Service message: the chat photo was deleted
         */
        @JsonProperty("delete_chat_photo")
        var deleteChatPhoto: Boolean? = null,
        /**
         * To setup filter:
         *
         * @see BooleanFilter groupChatCreated group_chat_created True Optional. Service message: the group has been created
         */
        @JsonProperty("group_chat_created")
        var groupChatCreated: Boolean? = null,
        /**
         * To setup filter:
         *
         * @see VenueFilter venue venue Venue Optional. Message is a venue, information about the venue
         */
        @JsonProperty("venue")
        var venue: Venue? = null,
        /**
         * To setup filter(only for reply message):
         *
         * @see BooleanFilter supergroupChatCreated supergroup_chat_created True Optional. Service message: the supergroup has
         * been created. This field can‘t be received in a message coming through updates, because bot can’t be a member of a
         * supergroup when it is created. It can only be found in reply_to_message if someone replies to a very first message
         * in a directly created supergroup.
         */
        @JsonProperty("supergroup_chat_created")
        var supergroupChatCreated: Boolean? = null,
        /**
         * To setup filter(only for reply message):
         *
         * @see BooleanFilter channelChatCreated channel_chat_created True Optional. Service message: the channel has been
         * created. This field can‘t be received in a message coming through updates, because bot can’t be a member of a
         * channel when it is created. It can only be found in reply_to_message if someone replies to a very first message in
         * a channel.
         */
        @JsonProperty("channel_chat_created")
        var channelChatCreated: Boolean? = null,
        /**
         * To setup filter:
         *
         * @see NotNullFilter migrateToChatId migrate_to_chat_id Integer Optional. The group has been migrated to a supergroup
         * with the specified identifier. This number may be greater than 32 bits and some programming languages may have
         * difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or
         * double-precision float type are safe for storing this identifier.
         */
        @JsonProperty("migrate_to_chat_id")
        var migrateToChatId: Long? = null,
        /**
         * To setup filter:
         *
         * @see NotNullFilter migrateFromChatId migrate_from_chat_id Integer Optional. The supergroup has been migrated from a
         * group with the specified identifier. This number may be greater than 32 bits and some programming languages may
         * have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or
         * double-precision float type are safe for storing this identifier.
         */
        @JsonProperty("migrate_from_chat_id")
        var migrateFromChatId: Long? = null,
        /**
         * To setup filter:
         *
         * @see IncludeMessageFilter pinnedMessage pinned_message Message Optional. Specified message was pinned. Note that
         * the Message object in this field will not contain further reply_to_message fields even if it is itself a reply.
         */
        @JsonProperty("pinned_message")
        var pinnedMessage: Message? = null,
        /**
         * To setup filter:
         *
         * @see InvoiceFilter invoice invoice Invoice Optional. Message is an invoice for a payment, information about the
         * invoice.
         */
        @JsonProperty("invoice")
        var invoice: Invoice? = null,
        /**
         * To setup filter:
         *
         * @see SuccessfulPaymentFilter  successfulPayment successful_payment SuccessfulPayment Optional. Message is a service
         * message about a successful payment, information about the payment.
         */
        @JsonProperty("successful_payment")
        var successfulPayment: SuccessfulPayment? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter connectedWebsite connected_website String Optional. The domain name of the website on which the
         * user has logged in.
         */
        @JsonProperty("connected_website")
        var connectedWebsite: String? = null,
        /**
         * To setup filter:
         *
         * @see PassportDataFilter passportData passport_data PassportData Optional. Telegram Passport data
         */
        @JsonProperty("passport_data")
        var passportData: PassportData? = null

) : IUserFrom, IChat
