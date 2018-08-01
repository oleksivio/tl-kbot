package ru.ioleksiv.telegram.bot.core.controller.builder;

import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.GetFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendAnimation;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendAnimationFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendAudio;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendAudioFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendDocument;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendDocumentFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendMediaGroup;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendPhoto;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendPhotoFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendVideo;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendVideoFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendVideoNote;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendVideoNoteFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendVoice;
import ru.ioleksiv.telegram.bot.core.api.model.method.file.SendVoiceFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.game.GetGameHighScores;
import ru.ioleksiv.telegram.bot.core.api.model.method.game.SendGame;
import ru.ioleksiv.telegram.bot.core.api.model.method.game.SetOtherGameScore;
import ru.ioleksiv.telegram.bot.core.api.model.method.game.SetOwnGameScore;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.DeleteChatPhoto;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.DeleteChatStickerSet;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.ExportChatInviteLink;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.GetChat;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.GetChatAdministrators;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.GetChatMember;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.GetChatMembersCount;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.KickChatMember;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.LeaveChat;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.PinChatMessage;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.PromoteChatMember;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.RestrictChatMember;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.SetChatDescription;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.SetChatPhoto;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.SetChatStickerSet;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.SetChatTitle;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.UnbanChatMember;
import ru.ioleksiv.telegram.bot.core.api.model.method.group.UnpinChatMessage;
import ru.ioleksiv.telegram.bot.core.api.model.method.info.AnswerCallbackQuery;
import ru.ioleksiv.telegram.bot.core.api.model.method.info.GetMe;
import ru.ioleksiv.telegram.bot.core.api.model.method.info.GetUserProfilePhotos;
import ru.ioleksiv.telegram.bot.core.api.model.method.info.SendChatAction;
import ru.ioleksiv.telegram.bot.core.api.model.method.inline.AnswerInlineQuery;
import ru.ioleksiv.telegram.bot.core.api.model.method.location.EditOtherMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.api.model.method.location.EditOwnMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.api.model.method.location.SendLocation;
import ru.ioleksiv.telegram.bot.core.api.model.method.location.SendVenue;
import ru.ioleksiv.telegram.bot.core.api.model.method.location.StopOtherMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.api.model.method.location.StopOwnMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.DeleteMessage;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.EditOtherMessageCaption;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.EditOtherMessageMedia;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.EditOtherMessageReplyMarkup;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.EditOtherMessageText;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.EditOwnMessageCaption;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.EditOwnMessageMedia;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.EditOwnMessageReplyMarkup;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.EditOwnMessageText;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.ForwardMessage;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.SendContact;
import ru.ioleksiv.telegram.bot.core.api.model.method.message.SendMessage;
import ru.ioleksiv.telegram.bot.core.api.model.method.passport.SetPassportDataErrors;
import ru.ioleksiv.telegram.bot.core.api.model.method.payments.AnswerPreCheckoutQuery;
import ru.ioleksiv.telegram.bot.core.api.model.method.payments.AnswerShippingQuery;
import ru.ioleksiv.telegram.bot.core.api.model.method.payments.SendInvoice;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.AddStickerFileToSet;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.AddStickerToSet;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.CreateNewStickerFileSet;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.CreateNewStickerSet;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.DeleteStickerFromSet;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.GetStickerSet;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.SendSticker;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.SendStickerFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.SetStickerPositionInSet;
import ru.ioleksiv.telegram.bot.core.api.model.method.sticker.UploadStickerFile;
import ru.ioleksiv.telegram.bot.core.api.model.method.update.DeleteWebhook;
import ru.ioleksiv.telegram.bot.core.api.model.method.update.GetUpdatesApi;
import ru.ioleksiv.telegram.bot.core.api.model.method.update.GetWebhookInfo;
import ru.ioleksiv.telegram.bot.core.api.model.method.update.SetWebhook;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public class ActionBuilderImpl implements ActionBuilder {
    private final Networker networker;

    public ActionBuilderImpl(Networker networker) {
        this.networker = networker;
    }

    @Override
    public AnswerCallbackQuery answerCallbackQuery() {
        return new AnswerCallbackQuery(networker);
    }

    @Override
    public SendChatAction sendChatAction() {
        return new SendChatAction(networker);
    }

    @Override
    public SendContact sendContact() {
        return new SendContact(networker);
    }

    @Override
    public SendAnimationFile sendAnimationFile() {
        return new SendAnimationFile(networker);
    }

    @Override
    public SendAnimation sendAnimation() {
        return new SendAnimation(networker);
    }

    @Override
    public SendAudioFile sendAudioFile() {
        return new SendAudioFile(networker);
    }

    @Override
    public SendAudio sendAudio() {
        return new SendAudio(networker);
    }

    @Override
    public SendDocumentFile sendDocumentFile() {
        return new SendDocumentFile(networker);
    }

    @Override
    public SendDocument sendDocument() {
        return new SendDocument(networker);
    }

    @Override
    public SendMediaGroup sendMediaGroup() {
        return new SendMediaGroup(networker);
    }

    @Override
    public SendPhotoFile sendPhotoFile() {
        return new SendPhotoFile(networker);
    }

    @Override
    public SendPhoto sendPhoto() {
        return new SendPhoto(networker);
    }

    @Override
    public SendVideoFile sendVideoFile() {
        return new SendVideoFile(networker);
    }

    @Override
    public SendVideo sendVideo() {
        return new SendVideo(networker);
    }

    @Override
    public SendVideoNoteFile sendVideoNoteFile() {
        return new SendVideoNoteFile(networker);
    }

    @Override
    public SendVideoNote sendVideoNote() {
        return new SendVideoNote(networker);
    }

    @Override
    public SendVoiceFile sendVoiceFile() {
        return new SendVoiceFile(networker);
    }

    @Override
    public SendVoice sendVoice() {
        return new SendVoice(networker);
    }

    @Override
    public SendGame sendGame() {
        return new SendGame(networker);
    }

    @Override
    public SetOtherGameScore setOtherGameScore() {
        return new SetOtherGameScore(networker);
    }

    @Override
    public SetOwnGameScore setOwnGameScore() {
        return new SetOwnGameScore(networker);
    }

    @Override
    public DeleteChatPhoto deleteChatPhoto() {
        return new DeleteChatPhoto(networker);
    }

    @Override
    public DeleteChatStickerSet deleteChatStickerSet() {
        return new DeleteChatStickerSet(networker);
    }

    @Override
    public ExportChatInviteLink exportChatInviteLink() {
        return new ExportChatInviteLink(networker);
    }

    @Override
    public KickChatMember kickChatMember() {
        return new KickChatMember(networker);
    }

    @Override
    public LeaveChat leaveChat() {
        return new LeaveChat(networker);
    }

    @Override
    public PinChatMessage pinChatMessage() {
        return new PinChatMessage(networker);
    }

    @Override
    public PromoteChatMember promoteChatMember() {
        return new PromoteChatMember(networker);
    }

    @Override
    public RestrictChatMember restrictChatMember() {
        return new RestrictChatMember(networker);
    }

    @Override
    public SetChatDescription setChatDescription() {
        return new SetChatDescription(networker);
    }

    @Override
    public SetChatPhoto setChatPhoto() {
        return new SetChatPhoto(networker);
    }

    @Override
    public SetChatStickerSet setChatStickerSet() {
        return new SetChatStickerSet(networker);
    }

    @Override
    public SetChatTitle setChatTitle() {
        return new SetChatTitle(networker);
    }

    @Override
    public UnbanChatMember unbanChatMember() {
        return new UnbanChatMember(networker);
    }

    @Override
    public UnpinChatMessage unpinChatMessage() {
        return new UnpinChatMessage(networker);
    }

    @Override
    public AnswerInlineQuery answerInlineQuery() {
        return new AnswerInlineQuery(networker);
    }

    @Override
    public EditOtherMessageLiveLocation editOtherMessageLiveLocation() {
        return new EditOtherMessageLiveLocation(networker);
    }

    @Override
    public EditOwnMessageLiveLocation editOwnMessageLiveLocation() {
        return new EditOwnMessageLiveLocation(networker);
    }

    @Override
    public SendLocation sendLocation() {
        return new SendLocation(networker);
    }

    @Override
    public SendVenue sendVenue() {
        return new SendVenue(networker);
    }

    @Override
    public StopOtherMessageLiveLocation stopOtherMessageLiveLocation() {
        return new StopOtherMessageLiveLocation(networker);
    }

    @Override
    public StopOwnMessageLiveLocation stopOwnMessageLiveLocation() {
        return new StopOwnMessageLiveLocation(networker);
    }

    @Override
    public DeleteMessage deleteMessage() {
        return new DeleteMessage(networker);
    }

    @Override
    public EditOtherMessageCaption editOtherMessageCaption() {
        return new EditOtherMessageCaption(networker);
    }

    @Override
    public EditOtherMessageMedia editOtherMessageMedia() {
        return new EditOtherMessageMedia(networker);
    }

    @Override
    public EditOtherMessageReplyMarkup editOtherMessageReplyMarkup() {
        return new EditOtherMessageReplyMarkup(networker);
    }

    @Override
    public EditOtherMessageText editOtherMessageText() {
        return new EditOtherMessageText(networker);
    }

    @Override
    public EditOwnMessageCaption editOwnMessageCaption() {
        return new EditOwnMessageCaption(networker);
    }

    @Override
    public EditOwnMessageMedia editOwnMessageMedia() {
        return new EditOwnMessageMedia(networker);
    }

    @Override
    public EditOwnMessageReplyMarkup editOwnMessageReplyMarkup() {
        return new EditOwnMessageReplyMarkup(networker);
    }

    @Override
    public EditOwnMessageText editOwnMessageText() {
        return new EditOwnMessageText(networker);
    }

    @Override
    public ForwardMessage forwardMessage() {
        return new ForwardMessage(networker);
    }

    @Override
    public SendMessage sendMessage() {
        return new SendMessage(networker);
    }

    @Override
    public SetPassportDataErrors setPassportDataErrors() {
        return new SetPassportDataErrors(networker);
    }

    @Override
    public AnswerPreCheckoutQuery answerPreCheckoutQuery() {
        return new AnswerPreCheckoutQuery(networker);
    }

    @Override
    public AnswerShippingQuery answerShippingQuery() {
        return new AnswerShippingQuery(networker);
    }

    @Override
    public SendInvoice sendInvoice() {
        return new SendInvoice(networker);
    }

    @Override
    public AddStickerFileToSet addStickerFileToSet() {
        return new AddStickerFileToSet(networker);
    }

    @Override
    public AddStickerToSet addStickerToSet() {
        return new AddStickerToSet(networker);
    }

    @Override
    public CreateNewStickerFileSet createNewStickerFileSet() {
        return new CreateNewStickerFileSet(networker);
    }

    @Override
    public CreateNewStickerSet createNewStickerSet() {
        return new CreateNewStickerSet(networker);
    }

    @Override
    public DeleteStickerFromSet deleteStickerFromSet() {
        return new DeleteStickerFromSet(networker);
    }

    @Override
    public SendStickerFile sendStickerFile() {
        return new SendStickerFile(networker);
    }

    @Override
    public SendSticker sendSticker() {
        return new SendSticker(networker);
    }

    @Override
    public SetStickerPositionInSet setStickerPositionInSet() {
        return new SetStickerPositionInSet(networker);
    }

    @Override
    public UploadStickerFile uploadStickerFile() {
        return new UploadStickerFile(networker);
    }

    @Override
    public DeleteWebhook deleteWebhook() {
        return new DeleteWebhook(networker);
    }

    @Override
    public SetWebhook setWebhook() {
        return new SetWebhook(networker);
    }

    @Override
    public GetMe getMe() {
        return new GetMe(networker);
    }

    @Override
    public GetUserProfilePhotos getUserProfilePhotos() {
        return new GetUserProfilePhotos(networker);
    }

    @Override
    public GetFile getFile() {
        return new GetFile(networker);
    }

    @Override
    public GetGameHighScores getGameHighScores() {
        return new GetGameHighScores(networker);
    }

    @Override
    public GetChatAdministrators getChatAdministrators() {
        return new GetChatAdministrators(networker);
    }

    @Override
    public GetChat getChat() {
        return new GetChat(networker);
    }

    @Override
    public GetChatMember getChatMember() {
        return new GetChatMember(networker);
    }

    @Override
    public GetChatMembersCount getChatMembersCount() {
        return new GetChatMembersCount(networker);
    }

    @Override
    public GetStickerSet getStickerSet() {
        return new GetStickerSet(networker);
    }

    @Override
    public GetUpdatesApi getUpdatesApi() {
        return new GetUpdatesApi(networker);
    }

    @Override
    public GetWebhookInfo getWebhookInfo() {
        return new GetWebhookInfo(networker);
    }

}
