package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.LongFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.AnimationFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.AudioFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ChatFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ContactFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.DocumentFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.GameFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.IncludeMessageFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.InvoiceFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.MessageEntityArrayFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PassportDataFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoArrayFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.StickerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.SuccessfulPaymentFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserArrayFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.VenueFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.VideoFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.VideoNoteFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.VoiceFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class IncludeMessageFilterParser implements FilterParser<IncludeMessageFilter, Message> {

    @Override
    public Validator<Message> createChecker(IncludeMessageFilter annotation, Finder finder) {
        UnionExtractValidator<Message> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, Message.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        UserFilter from = annotation.from();
        if (from.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getFrom()), finder.find(from));
        }
        LongFilter date = annotation.date();
        if (date.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getDate()), finder.find(date));
        }
        ChatFilter chat = annotation.chat();
        if (chat.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getChat()), finder.find(chat));
        }

        UserFilter forwardFrom = annotation.forwardFrom();
        if (forwardFrom.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardFrom()), finder.find(forwardFrom));
        }
        ChatFilter forwardChat = annotation.forwardChat();
        if (forwardChat.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardFromChat()), finder.find(forwardChat));
        }
        NotNullFilter forwardFromMessageId = annotation.forwardFromMessageId();
        if (forwardFromMessageId.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardFromMessageId()),
                                      finder.find(forwardFromMessageId));
        }
        StringFilter forwardSignature = annotation.forwardSignature();
        if (forwardSignature.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardSignature()),
                                      finder.find(forwardSignature));
        }
        NotNullFilter forwardDate = annotation.forwardDate();
        if (forwardDate.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getForwardDate()), finder.find(forwardDate));
        }

        NotNullFilter editDate = annotation.editDate();
        if (editDate.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getEditDate()), finder.find(editDate));
        }
        NotNullFilter mediaGroupId = annotation.mediaGroupId();
        if (mediaGroupId.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getMediaGroupId()), finder.find(mediaGroupId));
        }
        StringFilter authorSignature = annotation.authorSignature();
        if (authorSignature.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getAuthorSignature()), finder.find(authorSignature));
        }
        StringFilter text = annotation.text();
        if (text.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getText()), finder.find(text));
        }
        AudioFilter audio = annotation.audio();
        if (audio.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getAudio()), finder.find(audio));
        }
        PhotoArrayFilter photoArray = annotation.photoArray();
        if (photoArray.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getPhoto()), finder.find(photoArray));
        }
        StringFilter caption = annotation.caption();
        if (caption.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getCaption()), finder.find(caption));
        }
        ContactFilter contact = annotation.contact();
        if (contact.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getContact()), finder.find(contact));
        }
        LocationFilter location = annotation.location();
        if (location.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getLocation()), finder.find(location));
        }
        UserArrayFilter newChatMembers = annotation.newChatMembers();
        if (newChatMembers.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getNewChatMembers()), finder.find(newChatMembers));
        }
        UserFilter leftChatMember = annotation.leftChatMember();
        if (leftChatMember.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getLeftChatMember()), finder.find(leftChatMember));
        }
        DocumentFilter document = annotation.document();
        if (document.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getDocument()), finder.find(document));
        }
        AnimationFilter animation = annotation.animation();
        if (animation.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getAnimation()), finder.find(animation));
        }
        GameFilter game = annotation.game();
        if (game.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getGame()), finder.find(game));
        }
        StringFilter newChatTitle = annotation.newChatTitle();
        if (newChatTitle.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getNewChatTitle()), finder.find(newChatTitle));
        }
        StickerFilter sticker = annotation.sticker();
        if (sticker.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getSticker()), finder.find(sticker));
        }
        VideoFilter video = annotation.video();
        if (video.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getVideo()), finder.find(video));
        }
        VoiceFilter voice = annotation.voice();
        if (voice.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getVoice()), finder.find(voice));
        }
        MessageEntityArrayFilter entityArray = annotation.entityArray();
        if (entityArray.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getEntities()), finder.find(entityArray));
        }
        MessageEntityArrayFilter captionEntityArray = annotation.captionEntityArray();
        if (captionEntityArray.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getCaptionEntities()),
                                      finder.find(captionEntityArray));
        }
        VideoNoteFilter videoNoteFilter = annotation.videoNote();
        if (videoNoteFilter.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getVideoNote()), finder.find(videoNoteFilter));
        }
        PhotoFilter newChatPhoto = annotation.newChatPhoto();
        if (newChatPhoto.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getNewChatPhoto()), finder.find(newChatPhoto));
        }
        BooleanFilter deleteChatPhoto = annotation.deleteChatPhoto();
        if (deleteChatPhoto.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getDeleteChatPhoto()), finder.find(deleteChatPhoto));
        }
        BooleanFilter groupChatCreated = annotation.groupChatCreated();
        if (groupChatCreated.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getGroupChatCreated()),
                                      finder.find(groupChatCreated));
        }
        VenueFilter venue = annotation.venue();
        if (venue.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getVenue()), finder.find(venue));
        }
        BooleanFilter supergroupChatCreated = annotation.supergroupChatCreated();
        if (supergroupChatCreated.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getSupergroupChatCreated()),
                                      finder.find(supergroupChatCreated));
        }
        BooleanFilter channelChatCreated = annotation.channelChatCreated();
        if (channelChatCreated.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getChannelChatCreated()),
                                      finder.find(channelChatCreated));
        }
        NotNullFilter migrateToChatId = annotation.migrateToChatId();
        if (migrateToChatId.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getMigrateToChatId()), finder.find(migrateToChatId));
        }
        NotNullFilter migrateFromChatId = annotation.migrateFromChatId();
        if (migrateFromChatId.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getMigrateFromChatId()),
                                      finder.find(migrateFromChatId));
        }

        InvoiceFilter invoice = annotation.invoice();
        if (invoice.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getInvoice()), finder.find(invoice));
        }
        SuccessfulPaymentFilter successfulPayment = annotation.successfulPayment();
        if (successfulPayment.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getSuccessfulPayment()),
                                      finder.find(successfulPayment));
        }
        StringFilter connectedWebsite = annotation.connectedWebsite();
        if (connectedWebsite.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getConnectedWebsite()),
                                      finder.find(connectedWebsite));
        }
        PassportDataFilter passportData = annotation.passportData();
        if (passportData.status().isActive()) {
            unionExtractValidator.add(msg -> Optional.ofNullable(msg.getPassportData()), finder.find(passportData));
        }
        return unionExtractValidator;
    }

    @Override
    public Class<IncludeMessageFilter> getAnnotationClass() {
        return IncludeMessageFilter.class;
    }

}