package ru.ioleksiv.telegram.bot.core.api.builder;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.AnswerCallbackQuery;
import ru.ioleksiv.telegram.bot.core.model.method.GetMe;
import ru.ioleksiv.telegram.bot.core.model.method.GetUserProfilePhotos;
import ru.ioleksiv.telegram.bot.core.model.method.SendChatAction;
import ru.ioleksiv.telegram.bot.core.model.method.SendContact;
import ru.ioleksiv.telegram.bot.core.model.method.file.GetFile;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendAnimation;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendAnimationFile;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendAudio;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendAudioFile;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendDocument;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendDocumentFile;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendMediaGroup;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendPhoto;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendPhotoFile;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendVideo;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendVideoFile;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendVideoNote;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendVideoNoteFile;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendVoice;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendVoiceFile;
import ru.ioleksiv.telegram.bot.core.model.method.game.GetGameHighScores;
import ru.ioleksiv.telegram.bot.core.model.method.game.SendGame;
import ru.ioleksiv.telegram.bot.core.model.method.game.SetOtherGameScore;
import ru.ioleksiv.telegram.bot.core.model.method.game.SetOwnGameScore;
import ru.ioleksiv.telegram.bot.core.model.method.group.DeleteChatPhoto;
import ru.ioleksiv.telegram.bot.core.model.method.group.DeleteChatStickerSet;
import ru.ioleksiv.telegram.bot.core.model.method.group.ExportChatInviteLink;
import ru.ioleksiv.telegram.bot.core.model.method.group.GetChat;
import ru.ioleksiv.telegram.bot.core.model.method.group.GetChatAdministrators;
import ru.ioleksiv.telegram.bot.core.model.method.group.GetChatMember;
import ru.ioleksiv.telegram.bot.core.model.method.group.GetChatMembersCount;
import ru.ioleksiv.telegram.bot.core.model.method.group.KickChatMember;
import ru.ioleksiv.telegram.bot.core.model.method.group.LeaveChat;
import ru.ioleksiv.telegram.bot.core.model.method.group.PinChatMessage;
import ru.ioleksiv.telegram.bot.core.model.method.group.PromoteChatMember;
import ru.ioleksiv.telegram.bot.core.model.method.group.RestrictChatMember;
import ru.ioleksiv.telegram.bot.core.model.method.group.SetChatDescription;
import ru.ioleksiv.telegram.bot.core.model.method.group.SetChatPhoto;
import ru.ioleksiv.telegram.bot.core.model.method.group.SetChatStickerSet;
import ru.ioleksiv.telegram.bot.core.model.method.group.SetChatTitle;
import ru.ioleksiv.telegram.bot.core.model.method.group.UnbanChatMember;
import ru.ioleksiv.telegram.bot.core.model.method.group.UnpinChatMessage;
import ru.ioleksiv.telegram.bot.core.model.method.inline.AnswerInlineQuery;
import ru.ioleksiv.telegram.bot.core.model.method.location.EditOtherMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.method.location.EditOwnMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.method.location.SendLocation;
import ru.ioleksiv.telegram.bot.core.model.method.location.SendVenue;
import ru.ioleksiv.telegram.bot.core.model.method.location.StopOtherMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.method.location.StopOwnMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.method.message.DeleteMessage;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditOtherMessageCaption;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditOtherMessageMedia;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditOtherMessageReplyMarkup;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditOtherMessageText;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditOwnMessageCaption;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditOwnMessageMedia;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditOwnMessageReplyMarkup;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditOwnMessageText;
import ru.ioleksiv.telegram.bot.core.model.method.message.ForwardMessage;
import ru.ioleksiv.telegram.bot.core.model.method.message.SendMessage;
import ru.ioleksiv.telegram.bot.core.model.method.passport.SetPassportDataErrors;
import ru.ioleksiv.telegram.bot.core.model.method.payments.AnswerPreCheckoutQuery;
import ru.ioleksiv.telegram.bot.core.model.method.payments.AnswerShippingQuery;
import ru.ioleksiv.telegram.bot.core.model.method.payments.SendInvoice;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.AddStickerFileToSet;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.AddStickerToSet;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.CreateNewStickerFileSet;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.CreateNewStickerSet;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.DeleteStickerFromSet;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.GetStickerSet;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.SendSticker;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.SendStickerFile;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.SetStickerPositionInSet;
import ru.ioleksiv.telegram.bot.core.model.method.sticker.UploadStickerFile;
import ru.ioleksiv.telegram.bot.core.model.method.update.DeleteWebhook;
import ru.ioleksiv.telegram.bot.core.model.method.update.GetUpdatesApi;
import ru.ioleksiv.telegram.bot.core.model.method.update.GetWebhookInfo;
import ru.ioleksiv.telegram.bot.core.model.method.update.SetWebhook;

public class ActionBuilder {
    private final Networker networker;

    public ActionBuilder(Networker networker) {
        this.networker = networker;
    }

    public AnswerCallbackQuery answerCallbackQuery() {
        return new AnswerCallbackQuery(networker);
    }

    public SendChatAction sendChatAction() {
        return new SendChatAction(networker);
    }

    public SendContact sendContact() {
        return new SendContact(networker);
    }

    public SendAnimationFile sendAnimationFile() {
        return new SendAnimationFile(networker);
    }

    public SendAnimation sendAnimation() {
        return new SendAnimation(networker);
    }

    public SendAudioFile sendAudioFile() {
        return new SendAudioFile(networker);
    }

    public SendAudio sendAudio() {
        return new SendAudio(networker);
    }

    public SendDocumentFile sendDocumentFile() {
        return new SendDocumentFile(networker);
    }

    public SendDocument sendDocument() {
        return new SendDocument(networker);
    }

    public SendMediaGroup sendMediaGroup() {
        return new SendMediaGroup(networker);
    }

    public SendPhotoFile sendPhotoFile() {
        return new SendPhotoFile(networker);
    }

    public SendPhoto sendPhoto() {
        return new SendPhoto(networker);
    }

    public SendVideoFile sendVideoFile() {
        return new SendVideoFile(networker);
    }

    public SendVideo sendVideo() {
        return new SendVideo(networker);
    }

    public SendVideoNoteFile sendVideoNoteFile() {
        return new SendVideoNoteFile(networker);
    }

    public SendVideoNote sendVideoNote() {
        return new SendVideoNote(networker);
    }

    public SendVoiceFile sendVoiceFile() {
        return new SendVoiceFile(networker);
    }

    public SendVoice sendVoice() {
        return new SendVoice(networker);
    }

    public SendGame sendGame() {
        return new SendGame(networker);
    }

    public SetOtherGameScore setOtherGameScore() {
        return new SetOtherGameScore(networker);
    }

    public SetOwnGameScore setOwnGameScore() {
        return new SetOwnGameScore(networker);
    }

    public DeleteChatPhoto deleteChatPhoto() {
        return new DeleteChatPhoto(networker);
    }

    public DeleteChatStickerSet deleteChatStickerSet() {
        return new DeleteChatStickerSet(networker);
    }

    public ExportChatInviteLink exportChatInviteLink() {
        return new ExportChatInviteLink(networker);
    }

    public KickChatMember kickChatMember() {
        return new KickChatMember(networker);
    }

    public LeaveChat leaveChat() {
        return new LeaveChat(networker);
    }

    public PinChatMessage pinChatMessage() {
        return new PinChatMessage(networker);
    }

    public PromoteChatMember promoteChatMember() {
        return new PromoteChatMember(networker);
    }

    public RestrictChatMember restrictChatMember() {
        return new RestrictChatMember(networker);
    }

    public SetChatDescription setChatDescription() {
        return new SetChatDescription(networker);
    }

    public SetChatPhoto setChatPhoto() {
        return new SetChatPhoto(networker);
    }

    public SetChatStickerSet setChatStickerSet() {
        return new SetChatStickerSet(networker);
    }

    public SetChatTitle setChatTitle() {
        return new SetChatTitle(networker);
    }

    public UnbanChatMember unbanChatMember() {
        return new UnbanChatMember(networker);
    }

    public UnpinChatMessage unpinChatMessage() {
        return new UnpinChatMessage(networker);
    }

    public AnswerInlineQuery answerInlineQuery() {
        return new AnswerInlineQuery(networker);
    }

    public EditOtherMessageLiveLocation editOtherMessageLiveLocation() {
        return new EditOtherMessageLiveLocation(networker);
    }

    public EditOwnMessageLiveLocation editOwnMessageLiveLocation() {
        return new EditOwnMessageLiveLocation(networker);
    }

    public SendLocation sendLocation() {
        return new SendLocation(networker);
    }

    public SendVenue sendVenue() {
        return new SendVenue(networker);
    }

    public StopOtherMessageLiveLocation stopOtherMessageLiveLocation() {
        return new StopOtherMessageLiveLocation(networker);
    }

    public StopOwnMessageLiveLocation stopOwnMessageLiveLocation() {
        return new StopOwnMessageLiveLocation(networker);
    }

    public DeleteMessage deleteMessage() {
        return new DeleteMessage(networker);
    }

    public EditOtherMessageCaption editOtherMessageCaption() {
        return new EditOtherMessageCaption(networker);
    }

    public EditOtherMessageMedia editOtherMessageMedia() {
        return new EditOtherMessageMedia(networker);
    }

    public EditOtherMessageReplyMarkup editOtherMessageReplyMarkup() {
        return new EditOtherMessageReplyMarkup(networker);
    }

    public EditOtherMessageText editOtherMessageText() {
        return new EditOtherMessageText(networker);
    }

    public EditOwnMessageCaption editOwnMessageCaption() {
        return new EditOwnMessageCaption(networker);
    }

    public EditOwnMessageMedia editOwnMessageMedia() {
        return new EditOwnMessageMedia(networker);
    }

    public EditOwnMessageReplyMarkup editOwnMessageReplyMarkup() {
        return new EditOwnMessageReplyMarkup(networker);
    }

    public EditOwnMessageText editOwnMessageText() {
        return new EditOwnMessageText(networker);
    }

    public ForwardMessage forwardMessage() {
        return new ForwardMessage(networker);
    }

    public SendMessage sendMessage() {
        return new SendMessage(networker);
    }

    public SetPassportDataErrors setPassportDataErrors() {
        return new SetPassportDataErrors(networker);
    }

    public AnswerPreCheckoutQuery answerPreCheckoutQuery() {
        return new AnswerPreCheckoutQuery(networker);
    }

    public AnswerShippingQuery answerShippingQuery() {
        return new AnswerShippingQuery(networker);
    }

    public SendInvoice sendInvoice() {
        return new SendInvoice(networker);
    }

    public AddStickerFileToSet addStickerFileToSet() {
        return new AddStickerFileToSet(networker);
    }

    public AddStickerToSet addStickerToSet() {
        return new AddStickerToSet(networker);
    }

    public CreateNewStickerFileSet createNewStickerFileSet() {
        return new CreateNewStickerFileSet(networker);
    }

    public CreateNewStickerSet createNewStickerSet() {
        return new CreateNewStickerSet(networker);
    }

    public DeleteStickerFromSet deleteStickerFromSet() {
        return new DeleteStickerFromSet(networker);
    }

    public SendStickerFile sendStickerFile() {
        return new SendStickerFile(networker);
    }

    public SendSticker sendSticker() {
        return new SendSticker(networker);
    }

    public SetStickerPositionInSet setStickerPositionInSet() {
        return new SetStickerPositionInSet(networker);
    }

    public UploadStickerFile uploadStickerFile() {
        return new UploadStickerFile(networker);
    }

    public DeleteWebhook deleteWebhook() {
        return new DeleteWebhook(networker);
    }

    public SetWebhook setWebhook() {
        return new SetWebhook(networker);
    }

    public GetMe getMe() {
        return new GetMe(networker);
    }

    public GetUserProfilePhotos getUserProfilePhotos() {
        return new GetUserProfilePhotos(networker);
    }

    public GetFile getFile() {
        return new GetFile(networker);
    }

    public GetGameHighScores getGameHighScores() {
        return new GetGameHighScores(networker);
    }

    public GetChatAdministrators getChatAdministrators() {
        return new GetChatAdministrators(networker);
    }

    public GetChat getChat() {
        return new GetChat(networker);
    }

    public GetChatMember getChatMember() {
        return new GetChatMember(networker);
    }

    public GetChatMembersCount getChatMembersCount() {
        return new GetChatMembersCount(networker);
    }

    public GetStickerSet getStickerSet() {
        return new GetStickerSet(networker);
    }

    public GetUpdatesApi getUpdatesApi() {
        return new GetUpdatesApi(networker);
    }

    public GetWebhookInfo getWebhookInfo() {
        return new GetWebhookInfo(networker);
    }

}
