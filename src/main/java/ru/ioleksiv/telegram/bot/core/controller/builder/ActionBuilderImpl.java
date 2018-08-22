package ru.ioleksiv.telegram.bot.core.controller.builder;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.controller.ActionBuilder;
import ru.ioleksiv.telegram.bot.api.model.method.file.GetFile;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendAnimation;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendAnimationFile;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendAudio;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendAudioFile;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendDocument;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendDocumentFile;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendMediaGroup;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendPhoto;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendPhotoFile;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendVideo;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendVideoFile;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendVideoNote;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendVideoNoteFile;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendVoice;
import ru.ioleksiv.telegram.bot.api.model.method.file.SendVoiceFile;
import ru.ioleksiv.telegram.bot.api.model.method.game.GetGameHighScores;
import ru.ioleksiv.telegram.bot.api.model.method.game.SendGame;
import ru.ioleksiv.telegram.bot.api.model.method.game.SetOtherGameScore;
import ru.ioleksiv.telegram.bot.api.model.method.game.SetOwnGameScore;
import ru.ioleksiv.telegram.bot.api.model.method.group.DeleteChatPhoto;
import ru.ioleksiv.telegram.bot.api.model.method.group.DeleteChatStickerSet;
import ru.ioleksiv.telegram.bot.api.model.method.group.ExportChatInviteLink;
import ru.ioleksiv.telegram.bot.api.model.method.group.GetChat;
import ru.ioleksiv.telegram.bot.api.model.method.group.GetChatAdministrators;
import ru.ioleksiv.telegram.bot.api.model.method.group.GetChatMember;
import ru.ioleksiv.telegram.bot.api.model.method.group.GetChatMembersCount;
import ru.ioleksiv.telegram.bot.api.model.method.group.KickChatMember;
import ru.ioleksiv.telegram.bot.api.model.method.group.LeaveChat;
import ru.ioleksiv.telegram.bot.api.model.method.group.PinChatMessage;
import ru.ioleksiv.telegram.bot.api.model.method.group.PromoteChatMember;
import ru.ioleksiv.telegram.bot.api.model.method.group.RestrictChatMember;
import ru.ioleksiv.telegram.bot.api.model.method.group.SetChatDescription;
import ru.ioleksiv.telegram.bot.api.model.method.group.SetChatPhoto;
import ru.ioleksiv.telegram.bot.api.model.method.group.SetChatStickerSet;
import ru.ioleksiv.telegram.bot.api.model.method.group.SetChatTitle;
import ru.ioleksiv.telegram.bot.api.model.method.group.UnbanChatMember;
import ru.ioleksiv.telegram.bot.api.model.method.group.UnpinChatMessage;
import ru.ioleksiv.telegram.bot.api.model.method.info.AnswerCallbackQuery;
import ru.ioleksiv.telegram.bot.api.model.method.info.GetMe;
import ru.ioleksiv.telegram.bot.api.model.method.info.GetUserProfilePhotos;
import ru.ioleksiv.telegram.bot.api.model.method.info.SendChatAction;
import ru.ioleksiv.telegram.bot.api.model.method.inline.AnswerInlineQuery;
import ru.ioleksiv.telegram.bot.api.model.method.location.EditOtherMessageLiveLocation;
import ru.ioleksiv.telegram.bot.api.model.method.location.EditOwnMessageLiveLocation;
import ru.ioleksiv.telegram.bot.api.model.method.location.SendLocation;
import ru.ioleksiv.telegram.bot.api.model.method.location.SendVenue;
import ru.ioleksiv.telegram.bot.api.model.method.location.StopOtherMessageLiveLocation;
import ru.ioleksiv.telegram.bot.api.model.method.location.StopOwnMessageLiveLocation;
import ru.ioleksiv.telegram.bot.api.model.method.message.DeleteMessage;
import ru.ioleksiv.telegram.bot.api.model.method.message.EditOtherMessageCaption;
import ru.ioleksiv.telegram.bot.api.model.method.message.EditOtherMessageMedia;
import ru.ioleksiv.telegram.bot.api.model.method.message.EditOtherMessageReplyMarkup;
import ru.ioleksiv.telegram.bot.api.model.method.message.EditOtherMessageText;
import ru.ioleksiv.telegram.bot.api.model.method.message.EditOwnMessageCaption;
import ru.ioleksiv.telegram.bot.api.model.method.message.EditOwnMessageMedia;
import ru.ioleksiv.telegram.bot.api.model.method.message.EditOwnMessageReplyMarkup;
import ru.ioleksiv.telegram.bot.api.model.method.message.EditOwnMessageText;
import ru.ioleksiv.telegram.bot.api.model.method.message.ForwardMessage;
import ru.ioleksiv.telegram.bot.api.model.method.message.SendContact;
import ru.ioleksiv.telegram.bot.api.model.method.message.SendMessage;
import ru.ioleksiv.telegram.bot.api.model.method.passport.SetPassportDataErrors;
import ru.ioleksiv.telegram.bot.api.model.method.payments.AnswerPreCheckoutQuery;
import ru.ioleksiv.telegram.bot.api.model.method.payments.AnswerShippingQuery;
import ru.ioleksiv.telegram.bot.api.model.method.payments.SendInvoice;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.AddStickerFileToSet;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.AddStickerToSet;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.CreateNewStickerFileSet;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.CreateNewStickerSet;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.DeleteStickerFromSet;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.GetStickerSet;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.SendSticker;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.SendStickerFile;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.SetStickerPositionInSet;
import ru.ioleksiv.telegram.bot.api.model.method.sticker.UploadStickerFile;
import ru.ioleksiv.telegram.bot.api.model.method.update.DeleteWebhook;
import ru.ioleksiv.telegram.bot.api.model.method.update.GetUpdates;
import ru.ioleksiv.telegram.bot.api.model.method.update.GetWebhookInfo;
import ru.ioleksiv.telegram.bot.api.model.method.update.SetWebhook;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.controller.network.FileNetworker;

@Component
public class ActionBuilderImpl implements ActionBuilder {

    private final ActionNetworker actionNetworker;
    private final FileNetworker fileNetworker;

    public ActionBuilderImpl(ActionNetworker actionNetworker,
                             FileNetworker fileNetworker) {
        this.actionNetworker = actionNetworker;
        this.fileNetworker = fileNetworker;
    }

    @Override
    public AnswerCallbackQuery answerCallbackQuery() {
        return new AnswerCallbackQuery((actionNetworker));
    }

    @Override
    public SendChatAction sendChatAction() {
        return new SendChatAction(actionNetworker);
    }

    @Override
    public SendContact sendContact() {
        return new SendContact(actionNetworker);
    }

    @Override
    public SendAnimationFile sendAnimationFile() {
        return new SendAnimationFile(fileNetworker);
    }

    @Override
    public SendAnimation sendAnimation() {
        return new SendAnimation(actionNetworker);
    }

    @Override
    public SendAudioFile sendAudioFile() {
        return new SendAudioFile(fileNetworker);
    }

    @Override
    public SendAudio sendAudio() {
        return new SendAudio(actionNetworker);
    }

    @Override
    public SendDocumentFile sendDocumentFile() {
        return new SendDocumentFile(fileNetworker);
    }

    @Override
    public SendDocument sendDocument() {
        return new SendDocument(actionNetworker);
    }

    @Override
    public SendMediaGroup sendMediaGroup() {
        return new SendMediaGroup(actionNetworker);
    }

    @Override
    public SendPhotoFile sendPhotoFile() {
        return new SendPhotoFile(fileNetworker);
    }

    @Override
    public SendPhoto sendPhoto() {
        return new SendPhoto(actionNetworker);
    }

    @Override
    public SendVideoFile sendVideoFile() {
        return new SendVideoFile(fileNetworker);
    }

    @Override
    public SendVideo sendVideo() {
        return new SendVideo(actionNetworker);
    }

    @Override
    public SendVideoNoteFile sendVideoNoteFile() {
        return new SendVideoNoteFile(fileNetworker);
    }

    @Override
    public SendVideoNote sendVideoNote() {
        return new SendVideoNote(actionNetworker);
    }

    @Override
    public SendVoiceFile sendVoiceFile() {
        return new SendVoiceFile(fileNetworker);
    }

    @Override
    public SendVoice sendVoice() {
        return new SendVoice(actionNetworker);
    }

    @Override
    public SendGame sendGame() {
        return new SendGame(actionNetworker);
    }

    @Override
    public SetOtherGameScore setOtherGameScore() {
        return new SetOtherGameScore(actionNetworker);
    }

    @Override
    public SetOwnGameScore setOwnGameScore() {
        return new SetOwnGameScore(actionNetworker);
    }

    @Override
    public DeleteChatPhoto deleteChatPhoto() {
        return new DeleteChatPhoto(actionNetworker);
    }

    @Override
    public DeleteChatStickerSet deleteChatStickerSet() {
        return new DeleteChatStickerSet(actionNetworker);
    }

    @Override
    public ExportChatInviteLink exportChatInviteLink() {
        return new ExportChatInviteLink(actionNetworker);
    }

    @Override
    public KickChatMember kickChatMember() {
        return new KickChatMember(actionNetworker);
    }

    @Override
    public LeaveChat leaveChat() {
        return new LeaveChat(actionNetworker);
    }

    @Override
    public PinChatMessage pinChatMessage() {
        return new PinChatMessage(actionNetworker);
    }

    @Override
    public PromoteChatMember promoteChatMember() {
        return new PromoteChatMember(actionNetworker);
    }

    @Override
    public RestrictChatMember restrictChatMember() {
        return new RestrictChatMember(actionNetworker);
    }

    @Override
    public SetChatDescription setChatDescription() {
        return new SetChatDescription(actionNetworker);
    }

    @Override
    public SetChatPhoto setChatPhoto() {
        return new SetChatPhoto(fileNetworker);
    }

    @Override
    public SetChatStickerSet setChatStickerSet() {
        return new SetChatStickerSet(actionNetworker);
    }

    @Override
    public SetChatTitle setChatTitle() {
        return new SetChatTitle(actionNetworker);
    }

    @Override
    public UnbanChatMember unbanChatMember() {
        return new UnbanChatMember(actionNetworker);
    }

    @Override
    public UnpinChatMessage unpinChatMessage() {
        return new UnpinChatMessage(actionNetworker);
    }

    @Override
    public AnswerInlineQuery answerInlineQuery() {
        return new AnswerInlineQuery(actionNetworker);
    }

    @Override
    public EditOtherMessageLiveLocation editOtherMessageLiveLocation() {
        return new EditOtherMessageLiveLocation(actionNetworker);
    }

    @Override
    public EditOwnMessageLiveLocation editOwnMessageLiveLocation() {
        return new EditOwnMessageLiveLocation(actionNetworker);
    }

    @Override
    public SendLocation sendLocation() {
        return new SendLocation(actionNetworker);
    }

    @Override
    public SendVenue sendVenue() {
        return new SendVenue(actionNetworker);
    }

    @Override
    public StopOtherMessageLiveLocation stopOtherMessageLiveLocation() {
        return new StopOtherMessageLiveLocation(actionNetworker);
    }

    @Override
    public StopOwnMessageLiveLocation stopOwnMessageLiveLocation() {
        return new StopOwnMessageLiveLocation(actionNetworker);
    }

    @Override
    public DeleteMessage deleteMessage() {
        return new DeleteMessage(actionNetworker);
    }

    @Override
    public EditOtherMessageCaption editOtherMessageCaption() {
        return new EditOtherMessageCaption(actionNetworker);
    }

    @Override
    public EditOtherMessageMedia editOtherMessageMedia() {
        return new EditOtherMessageMedia(actionNetworker);
    }

    @Override
    public EditOtherMessageReplyMarkup editOtherMessageReplyMarkup() {
        return new EditOtherMessageReplyMarkup(actionNetworker);
    }

    @Override
    public EditOtherMessageText editOtherMessageText() {
        return new EditOtherMessageText(actionNetworker);
    }

    @Override
    public EditOwnMessageCaption editOwnMessageCaption() {
        return new EditOwnMessageCaption(actionNetworker);
    }

    @Override
    public EditOwnMessageMedia editOwnMessageMedia() {
        return new EditOwnMessageMedia(actionNetworker);
    }

    @Override
    public EditOwnMessageReplyMarkup editOwnMessageReplyMarkup() {
        return new EditOwnMessageReplyMarkup(actionNetworker);
    }

    @Override
    public EditOwnMessageText editOwnMessageText() {
        return new EditOwnMessageText(actionNetworker);
    }

    @Override
    public ForwardMessage forwardMessage() {
        return new ForwardMessage(actionNetworker);
    }

    @Override
    public SendMessage sendMessage() {
        return new SendMessage(actionNetworker);
    }

    @Override
    public SetPassportDataErrors setPassportDataErrors() {
        return new SetPassportDataErrors(actionNetworker);
    }

    @Override
    public AnswerPreCheckoutQuery answerPreCheckoutQuery() {
        return new AnswerPreCheckoutQuery(actionNetworker);
    }

    @Override
    public AnswerShippingQuery answerShippingQuery() {
        return new AnswerShippingQuery(actionNetworker);
    }

    @Override
    public SendInvoice sendInvoice() {
        return new SendInvoice(actionNetworker);
    }

    @Override
    public AddStickerFileToSet addStickerFileToSet() {
        return new AddStickerFileToSet(fileNetworker);
    }

    @Override
    public AddStickerToSet addStickerToSet() {
        return new AddStickerToSet(actionNetworker);
    }

    @Override
    public CreateNewStickerFileSet createNewStickerFileSet() {
        return new CreateNewStickerFileSet(fileNetworker);
    }

    @Override
    public CreateNewStickerSet createNewStickerSet() {
        return new CreateNewStickerSet(actionNetworker);
    }

    @Override
    public DeleteStickerFromSet deleteStickerFromSet() {
        return new DeleteStickerFromSet(actionNetworker);
    }

    @Override
    public SendStickerFile sendStickerFile() {
        return new SendStickerFile(fileNetworker);
    }

    @Override
    public SendSticker sendSticker() {
        return new SendSticker(actionNetworker);
    }

    @Override
    public SetStickerPositionInSet setStickerPositionInSet() {
        return new SetStickerPositionInSet(actionNetworker);
    }

    @Override
    public UploadStickerFile uploadStickerFile() {
        return new UploadStickerFile(fileNetworker);
    }

    @Override
    public DeleteWebhook deleteWebhook() {
        return new DeleteWebhook(actionNetworker);
    }

    @Override
    public SetWebhook setWebhook() {
        return new SetWebhook(fileNetworker);
    }

    @Override
    public GetMe getMe() {
        return new GetMe(actionNetworker);
    }

    @Override
    public GetUserProfilePhotos getUserProfilePhotos() {
        return new GetUserProfilePhotos(actionNetworker);
    }

    @Override
    public GetFile getFile() {
        return new GetFile(actionNetworker);
    }

    @Override
    public GetGameHighScores getGameHighScores() {
        return new GetGameHighScores(actionNetworker);
    }

    @Override
    public GetChatAdministrators getChatAdministrators() {
        return new GetChatAdministrators(actionNetworker);
    }

    @Override
    public GetChat getChat() {
        return new GetChat(actionNetworker);
    }

    @Override
    public GetChatMember getChatMember() {
        return new GetChatMember(actionNetworker);
    }

    @Override
    public GetChatMembersCount getChatMembersCount() {
        return new GetChatMembersCount(actionNetworker);
    }

    @Override
    public GetStickerSet getStickerSet() {
        return new GetStickerSet(actionNetworker);
    }

    @Override
    public GetUpdates getUpdates() {
        return new GetUpdates(actionNetworker);
    }

    @Override
    public GetWebhookInfo getWebhookInfo() {
        return new GetWebhookInfo(actionNetworker);
    }

}
