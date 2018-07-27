package ru.ioleksiv.telegram.bot.core.model.telegram.objects.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.Audio;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.Document;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.MessageEntity;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.PhotoSize;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.Video;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.VideoNote;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.Voice;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.game.Game;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.sticker.Sticker;

import java.util.ArrayList;
import java.util.List;

public class Message {
    /**
     * message_id	Integer	Unique message identifier inside this chat
     */
    @JsonProperty("message_id")
    private Long messageId = null;
    /**
     * from	User	Optional. Sender, empty for messages sent to channels
     */
    @JsonProperty("from")
    private User from = null;
    /**
     * date	Integer	Date the message was sent in Unix time
     */
    @JsonProperty("date")
    private long date = 0;
    /**
     * chat	Chat	Conversation the message belongs to
     */
    private Chat chat = null;
    /**
     * forward_from	User	Optional. For forwarded messages, sender of the original message
     */
    @JsonProperty("forward_from")
    private User forwardFrom = null;
    /**
     * forward_from_chat	Chat	Optional. For messages forwarded from channels, information
     * about the original channel
     */
    @JsonProperty("forward_from_chat")
    private Chat forwardFromChat = null;
    /**
     * forward_from_message_id	Integer	Optional. For messages forwarded from channels, identifier
     * of the original message in the channel
     */
    @JsonProperty("forward_from_message_id")
    private Long forwardFromMessageId = null;
    /**
     * forward_signature	String	Optional. For messages forwarded from channels, signature of
     * the post author if present
     */
    @JsonProperty("forward_signature")
    private String forwardSignature = null;
    /**
     * forward_date	Integer	Optional. For forwarded messages, date the original message was sent
     * in Unix time
     */
    @JsonProperty("forward_date")
    private Long forwardDate = null;
    /**
     * reply_to_message	Message	Optional. For replies, the original message. Note that the Message
     * object in this field will not contain further reply_to_message fields even if it itself is a
     * reply.
     */

    @JsonProperty("reply_to_message")
    private Message replyToMessage = null;
    /**
     * edit_date	Integer	Optional. Date the message was last edited in Unix time
     */
    @JsonProperty("edit_date")
    private Long editDate = null;
    /**
     * media_group_id	String	Optional. The unique identifier of a media message group this
     * message belongs to
     */
    @JsonProperty("media_group_id")
    private String mediaGroupId = null;
    /**
     * author_signature	String	Optional. Signature of the post author for messages in channels
     */
    @JsonProperty("author_signature")
    private String authorSignature = null;
    /**
     * text	String	Optional. For text messages, the actual UTF-8 text of the message, 0-4096
     * characters.
     */
    @JsonProperty("text")
    private String text = null;
    /**
     * audio	Audio	Optional. Message is an audio files, information about the files
     */
    @JsonProperty("audio")
    private Audio audio = null;
    /**
     * photo	Array of PhotoSize	Optional. Message is a photo, available sizes of the photo
     */
    @JsonProperty("photo")
    private List<PhotoSize> photo = new ArrayList<>();
    /**
     * caption	String	Optional. Caption for the audio, document, photo, video or voice, 0-200
     * characters
     */
    @JsonProperty("caption")
    private String caption = null;
    /**
     * contact Optional. Message is a shared contact, information about the contact
     */
    @JsonProperty("contact")
    private Contact contact = null;
    /**
     * location	Optional. Message is a shared location, information about the location
     */
    @JsonProperty("location")
    private Location location = null;
    /**
     * new_chat_members	Array of User	Optional. New members that were added to the group or
     * supergroup and information about them (the bot itself may be one of these members)
     */
    @JsonProperty("new_chat_members")
    private List<User> newChatMembers = null;
    /**
     * left_chat_member	User	Optional. A member was removed from the group, information about
     * them (this member may be the bot itself)
     */
    @JsonProperty("left_chat_member")
    private User leftChatMember = null;
    /**
     * document	Document	Optional. Message is a general files, information about the files
     */
    @JsonProperty("document")
    private Document document = null;
    /**
     * new_chat_title	String	Optional. A chat title was changed to this value
     */
    @JsonProperty("new_chat_title")
    private String newChatTitle = null;
    /**
     * sticker	Sticker	Optional. Message is a sticker, information about the sticker
     */
    @JsonProperty("sticker")
    private Sticker sticker = null;
    /**
     * video	Video	Optional. Message is a video, information about the video
     */
    @JsonProperty("video")
    private Video video = null;
    /**
     * voice	Voice	Optional. Message is a voice message, information about the files
     */
    @JsonProperty("voice")
    private Voice voice = null;
    /**
     * entities	Array of MessageEntity	Optional. For text messages, special entities like usernames,
     * URLs, bot commands, etc. that appear in the text
     */
    @JsonProperty("entities")
    private List<MessageEntity> entities = new ArrayList<>();
    /**
     * video_note	VideoNote	Optional. Message is a video note, information about the video message
     */
    @JsonProperty("video_note")
    private VideoNote videoNote = null;
    /**
     * new_chat_photo	Array of PhotoSize	Optional. A chat photo was change to this value
     */
    @JsonProperty("new_chat_photo")
    private PhotoSize newChatPhoto = null;
    /**
     * delete_chat_photo	True	Optional. Service message: the chat photo was deleted
     */
    @JsonProperty("delete_chat_photo")
    private Boolean deleteChatPhoto = null;
    /**
     * group_chat_created	True	Optional. Service message: the group has been created
     */
    @JsonProperty("group_chat_created")
    private Boolean groupChatCreated = null;
    /**
     * venue	Venue	Optional. Message is a venue, information about the venue
     */
    @JsonProperty("venue")
    private Venue venue = null;
    /**
     * supergroup_chat_created	True	Optional. Service message: the supergroup has been created.
     * This field can‘t be received in a message coming through updates, because bot can’t be a
     * member of a supergroup when it is created. It can only be found in reply_to_message if
     * someone replies to a very first message in a directly created supergroup.
     */
    @JsonProperty("supergroup_chat_created")
    private Boolean supergroupChatCreated = null;
    /**
     * channel_chat_created	True	Optional. Service message: the channel has been created.
     * This field can‘t be received in a message coming through updates, because bot can’t be a
     * member of a channel when it is created. It can only be found in reply_to_message if someone
     * replies to a very first message in a channel.
     */
    @JsonProperty("channel_chat_created")
    private Boolean channelChatCreated = null;
    /**
     * migrate_to_chat_id	Integer	Optional. The group has been migrated to a supergroup with the
     * specified identifier. This number may be greater than 32 bits and some programming languages
     * may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a
     * signed 64 bit integer or double-precision float type are safe for storing this identifier.
     */
    @JsonProperty("migrate_to_chat_id")
    private Long migrateToChatId = null;
    /**
     * migrate_from_chat_id	Integer	Optional. The supergroup has been migrated from a group with
     * the specified identifier. This number may be greater than 32 bits and some programming
     * languages may have difficulty/silent defects in interpreting it. But it is smaller than 52
     * bits, so a signed 64 bit integer or double-precision float type are safe for storing this
     * identifier.
     */
    @JsonProperty("migrate_from_chat_id")
    private Long migrateFromChatId = null;
    /**
     * pinned_message	Message	Optional. Specified message was pinned. Note that the Message
     * object in this field will not contain further reply_to_message fields even if it is itself
     * a reply.
     */
    @JsonProperty("pinned_message")
    private Message pinnedMessage = null;
    /**
     * game	Game	Optional. Message is a game, information about the game.
     */
    @JsonProperty("game")
    private Game game;
    /**
     * connected_website	String	Optional. The domain name of the website on which the user has
     * logged in.
     * More about Telegram Login »
     */
    @JsonProperty("connected_website")
    private String connectedWebsite = null;
    /**
     * caption_entities	Array of MessageEntity	Optional. For messages with a caption, special
     * entities like usernames, URLs, bot commands, etc. that appear in the caption
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities = new ArrayList<>();

    public Game getGame() {
        return game;
    }

    /**
     * invoice	Invoice	Optional. Message is an invoice for a payment, information about the invoice.
     * todo
     */

    /**
     * successful_payment	SuccessfulPayment	Optional. Message is a service message about a
     * successful payment, information about the payment.
     * todo
     */

    public void setGame(Game game) {
        this.game = game;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public List<MessageEntity> getCaptionEntities() {
        return captionEntities;
    }

    public void setCaptionEntities(List<MessageEntity> captionEntities) {
        this.captionEntities = captionEntities;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Document getDocument() {

        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public void setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public void setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public void setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
    }

    public Long getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public void setForwardFromMessageId(Long forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;
    }

    public String getForwardSignature() {
        return forwardSignature;
    }

    public void setForwardSignature(String forwardSignature) {
        this.forwardSignature = forwardSignature;
    }

    public Long getForwardDate() {
        return forwardDate;
    }

    public void setForwardDate(Long forwardDate) {
        this.forwardDate = forwardDate;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public void setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
    }

    public Long getEditDate() {
        return editDate;
    }

    public void setEditDate(Long editDate) {
        this.editDate = editDate;
    }

    public String getMediaGroupId() {
        return mediaGroupId;
    }

    public void setMediaGroupId(String mediaGroupId) {
        this.mediaGroupId = mediaGroupId;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public void setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<User> getNewChatMembers() {
        return newChatMembers;
    }

    public void setNewChatMembers(List<User> newChatMembers) {
        this.newChatMembers = newChatMembers;
    }

    public User getLeftChatMember() {
        return leftChatMember;
    }

    public void setLeftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public void setNewChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;
    }

    public Boolean getDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;
    }

    public Boolean getGroupChatCreated() {
        return groupChatCreated;
    }

    public void setGroupChatCreated(Boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;
    }

    public Boolean getSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;
    }

    public Boolean getChannelChatCreated() {
        return channelChatCreated;
    }

    public void setChannelChatCreated(Boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;
    }

    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    public void setMigrateToChatId(Long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    public Long getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public void setMigrateFromChatId(Long migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public void setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
    }

    public String getConnectedWebsite() {
        return connectedWebsite;
    }

    public void setConnectedWebsite(String connectedWebsite) {
        this.connectedWebsite = connectedWebsite;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public PhotoSize getNewChatPhoto() {
        return newChatPhoto;
    }

    public void setNewChatPhoto(PhotoSize newChatPhoto) {
        this.newChatPhoto = newChatPhoto;
    }
}
