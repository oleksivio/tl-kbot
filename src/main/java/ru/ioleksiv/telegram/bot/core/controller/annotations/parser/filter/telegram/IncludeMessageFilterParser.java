package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.LongFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.AnimationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.AudioFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ChatFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ContactFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.DocumentFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.GameFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.IncludeMessageFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.InvoiceFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MessageEntityArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PassportDataFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.StickerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.SuccessfulPaymentFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.UserArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.UserFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.VenueFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.VideoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.VideoNoteFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.VoiceFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class IncludeMessageFilterParser implements FilterParser<IncludeMessageFilter, Message> {

    @Override
    public Validator<Message> createChecker(IncludeMessageFilter annotation, Finder finder) {
        UnionExtractValidator<Message> unionExtractValidator = new UnionExtractValidator<>();

        UserFilter from = annotation.from();
        if (from.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getAnimation()), finder.find(from));
        }

        LongFilter date = annotation.date();
        if (date.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getDate()), finder.find(date));
        }
        ChatFilter chat = annotation.chat();
        if (chat.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getChat()), finder.find(chat));
        }

        UserFilter forwardFrom = annotation.forwardFrom();
        if (forwardFrom.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardFrom()), finder.find(forwardFrom));
        }
        ChatFilter forwardChat = annotation.forwardChat();
        if (forwardChat.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardFromChat()), finder.find(forwardChat));
        }
        NotNullFilter forwardFromMessageId = annotation.forwardFromMessageId();
        if (forwardFromMessageId.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardFromMessageId()),
                                      finder.find(forwardFromMessageId));
        }
        StringFilter forwardSignature = annotation.forwardSignature();
        if (forwardSignature.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardSignature()),
                                      finder.find(forwardSignature));
        }
        NotNullFilter forwardDate = annotation.forwardDate();
        if (forwardDate.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardDate()), finder.find(forwardDate));
        }

        NotNullFilter editDate = annotation.editDate();
        if (editDate.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getEditDate()), finder.find(editDate));
        }
        NotNullFilter mediaGroupId = annotation.mediaGroupId();
        if (mediaGroupId.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getMediaGroupId()), finder.find(mediaGroupId));
        }
        StringFilter authorSignature = annotation.authorSignature();
        if (authorSignature.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getAuthorSignature()), finder.find(authorSignature));
        }
        StringFilter text = annotation.text();
        if (text.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getText()), finder.find(text));
        }
        AudioFilter audio = annotation.audio();
        if (audio.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getAudio()), finder.find(audio));
        }
        PhotoArrayFilter photoArray = annotation.photoArray();
        if (photoArray.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getPhoto()), finder.find(photoArray));
        }
        StringFilter caption = annotation.caption();
        if (caption.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getCaption()), finder.find(caption));
        }
        ContactFilter contact = annotation.contact();
        if (contact.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getContact()), finder.find(contact));
        }
        LocationFilter location = annotation.location();
        if (location.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getLocation()), finder.find(location));
        }
        UserArrayFilter newChatMembers = annotation.newChatMembers();
        if (newChatMembers.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getNewChatMembers()), finder.find(newChatMembers));
        }
        UserFilter leftChatMember = annotation.leftChatMember();
        if (leftChatMember.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getLeftChatMember()), finder.find(leftChatMember));
        }
        DocumentFilter document = annotation.document();
        if (document.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getDocument()), finder.find(document));
        }
        AnimationFilter animation = annotation.animation();
        if (animation.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getAnimation()), finder.find(animation));
        }
        GameFilter game = annotation.game();
        if (game.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getGame()), finder.find(game));
        }
        StringFilter newChatTitle = annotation.newChatTitle();
        if (newChatTitle.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getNewChatTitle()), finder.find(newChatTitle));
        }
        StickerFilter sticker = annotation.sticker();
        if (sticker.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getSticker()), finder.find(sticker));
        }
        VideoFilter video = annotation.video();
        if (video.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getVideo()), finder.find(video));
        }
        VoiceFilter voice = annotation.voice();
        if (voice.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getVoice()), finder.find(voice));
        }
        MessageEntityArrayFilter entityArray = annotation.entityArray();
        if (entityArray.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getEntities()), finder.find(entityArray));
        }
        MessageEntityArrayFilter captionEntityArray = annotation.captionEntityArray();
        if (captionEntityArray.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getCaptionEntities()),
                                      finder.find(captionEntityArray));
        }
        VideoNoteFilter videoNoteFilter = annotation.videoNote();
        if (videoNoteFilter.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getVideoNote()), finder.find(videoNoteFilter));
        }
        PhotoFilter newChatPhoto = annotation.newChatPhoto();
        if (newChatPhoto.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getNewChatPhoto()), finder.find(newChatPhoto));
        }
        BooleanFilter deleteChatPhoto = annotation.deleteChatPhoto();
        if (deleteChatPhoto.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getDeleteChatPhoto()), finder.find(deleteChatPhoto));
        }
        BooleanFilter groupChatCreated = annotation.groupChatCreated();
        if (groupChatCreated.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getGroupChatCreated()),
                                      finder.find(groupChatCreated));
        }
        VenueFilter venue = annotation.venue();
        if (venue.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getVenue()), finder.find(venue));
        }
        BooleanFilter supergroupChatCreated = annotation.supergroupChatCreated();
        if (supergroupChatCreated.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getSupergroupChatCreated()),
                                      finder.find(supergroupChatCreated));
        }
        BooleanFilter channelChatCreated = annotation.channelChatCreated();
        if (channelChatCreated.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getChannelChatCreated()),
                                      finder.find(channelChatCreated));
        }
        NotNullFilter migrateToChatId = annotation.migrateToChatId();
        if (migrateToChatId.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getMigrateToChatId()), finder.find(migrateToChatId));
        }
        NotNullFilter migrateFromChatId = annotation.migrateFromChatId();
        if (migrateFromChatId.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getMigrateFromChatId()),
                                      finder.find(migrateFromChatId));
        }

        InvoiceFilter invoice = annotation.invoice();
        if (invoice.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getInvoice()), finder.find(invoice));
        }
        SuccessfulPaymentFilter successfulPayment = annotation.successfulPayment();
        if (successfulPayment.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getSuccessfulPayment()),
                                      finder.find(successfulPayment));
        }
        StringFilter connectedWebsite = annotation.connectedWebsite();
        if (connectedWebsite.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getConnectedWebsite()),
                                      finder.find(connectedWebsite));
        }
        PassportDataFilter passportData = annotation.passportData();
        if (passportData.value().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getPassportData()), finder.find(passportData));
        }
        return unionExtractValidator;
    }

    @Override
    public Class<IncludeMessageFilter> getAnnotationClass() {
        return IncludeMessageFilter.class;
    }

}
