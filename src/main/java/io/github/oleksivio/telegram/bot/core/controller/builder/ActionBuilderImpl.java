package io.github.oleksivio.telegram.bot.core.controller.builder;

import io.github.oleksivio.telegram.bot.api.controller.ActionBuilder;
import io.github.oleksivio.telegram.bot.api.model.method.file.GetFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendAnimation;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendAnimationFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendAudio;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendAudioFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendDocument;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendDocumentFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendPhoto;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendPhotoFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVideo;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVideoFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVideoNote;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVideoNoteFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVoice;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVoiceFile;
import io.github.oleksivio.telegram.bot.api.model.method.group.DeleteChatPhoto;
import io.github.oleksivio.telegram.bot.api.model.method.group.DeleteChatStickerSet;
import io.github.oleksivio.telegram.bot.api.model.method.group.ExportChatInviteLink;
import io.github.oleksivio.telegram.bot.api.model.method.group.GetChat;
import io.github.oleksivio.telegram.bot.api.model.method.group.GetChatAdministrators;
import io.github.oleksivio.telegram.bot.api.model.method.group.GetChatMember;
import io.github.oleksivio.telegram.bot.api.model.method.group.GetChatMembersCount;
import io.github.oleksivio.telegram.bot.api.model.method.group.KickChatMember;
import io.github.oleksivio.telegram.bot.api.model.method.group.LeaveChat;
import io.github.oleksivio.telegram.bot.api.model.method.group.PinChatMessage;
import io.github.oleksivio.telegram.bot.api.model.method.group.PromoteChatMember;
import io.github.oleksivio.telegram.bot.api.model.method.group.RestrictChatMember;
import io.github.oleksivio.telegram.bot.api.model.method.group.SetChatDescription;
import io.github.oleksivio.telegram.bot.api.model.method.group.SetChatPhoto;
import io.github.oleksivio.telegram.bot.api.model.method.group.SetChatTitle;
import io.github.oleksivio.telegram.bot.api.model.method.group.UnbanChatMember;
import io.github.oleksivio.telegram.bot.api.model.method.group.UnpinChatMessage;
import io.github.oleksivio.telegram.bot.api.model.method.info.AnswerCallbackQuery;
import io.github.oleksivio.telegram.bot.api.model.method.info.GetMe;
import io.github.oleksivio.telegram.bot.api.model.method.info.GetUserProfilePhotos;
import io.github.oleksivio.telegram.bot.api.model.method.info.SendChatAction;
import io.github.oleksivio.telegram.bot.api.model.method.inline.AnswerInlineQuery;
import io.github.oleksivio.telegram.bot.api.model.method.location.SendVenue;
import io.github.oleksivio.telegram.bot.api.model.method.location.StopOtherMessageLiveLocation;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOtherMessageCaption;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOtherMessageMedia;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOwnMessageMedia;
import io.github.oleksivio.telegram.bot.api.model.method.message.SendContact;
import io.github.oleksivio.telegram.bot.api.model.method.payments.AnswerPreCheckoutQuery;
import io.github.oleksivio.telegram.bot.api.model.method.payments.AnswerShippingQuery;
import io.github.oleksivio.telegram.bot.api.model.method.payments.SendInvoice;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendMediaGroup;
import io.github.oleksivio.telegram.bot.api.model.method.game.GetGameHighScores;
import io.github.oleksivio.telegram.bot.api.model.method.game.SendGame;
import io.github.oleksivio.telegram.bot.api.model.method.game.SetOtherGameScore;
import io.github.oleksivio.telegram.bot.api.model.method.game.SetOwnGameScore;
import io.github.oleksivio.telegram.bot.api.model.method.group.SetChatStickerSet;
import io.github.oleksivio.telegram.bot.api.model.method.location.EditOtherMessageLiveLocation;
import io.github.oleksivio.telegram.bot.api.model.method.location.EditOwnMessageLiveLocation;
import io.github.oleksivio.telegram.bot.api.model.method.location.SendLocation;
import io.github.oleksivio.telegram.bot.api.model.method.location.StopOwnMessageLiveLocation;
import io.github.oleksivio.telegram.bot.api.model.method.message.DeleteMessage;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOtherMessageReplyMarkup;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOtherMessageText;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOwnMessageCaption;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOwnMessageReplyMarkup;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOwnMessageText;
import io.github.oleksivio.telegram.bot.api.model.method.message.ForwardMessage;
import io.github.oleksivio.telegram.bot.api.model.method.message.SendMessage;
import io.github.oleksivio.telegram.bot.api.model.method.passport.SetPassportDataErrors;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.AddStickerFileToSet;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.AddStickerToSet;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.CreateNewStickerFileSet;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.CreateNewStickerSet;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.DeleteStickerFromSet;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.GetStickerSet;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.SendSticker;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.SendStickerFile;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.SetStickerPositionInSet;
import io.github.oleksivio.telegram.bot.api.model.method.sticker.UploadStickerFile;
import io.github.oleksivio.telegram.bot.api.model.method.update.DeleteWebhook;
import io.github.oleksivio.telegram.bot.api.model.method.update.GetUpdates;
import io.github.oleksivio.telegram.bot.api.model.method.update.GetWebhookInfo;
import io.github.oleksivio.telegram.bot.api.model.method.update.SetWebhook;

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
