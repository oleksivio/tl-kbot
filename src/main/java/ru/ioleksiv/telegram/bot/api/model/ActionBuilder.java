package ru.ioleksiv.telegram.bot.api.model;

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

public interface ActionBuilder {
    AnswerCallbackQuery answerCallbackQuery();

    SendChatAction sendChatAction();

    SendContact sendContact();

    SendAnimationFile sendAnimationFile();

    SendAnimation sendAnimation();

    SendAudioFile sendAudioFile();

    SendAudio sendAudio();

    SendDocumentFile sendDocumentFile();

    SendDocument sendDocument();

    SendMediaGroup sendMediaGroup();

    SendPhotoFile sendPhotoFile();

    SendPhoto sendPhoto();

    SendVideoFile sendVideoFile();

    SendVideo sendVideo();

    SendVideoNoteFile sendVideoNoteFile();

    SendVideoNote sendVideoNote();

    SendVoiceFile sendVoiceFile();

    SendVoice sendVoice();

    SendGame sendGame();

    SetOtherGameScore setOtherGameScore();

    SetOwnGameScore setOwnGameScore();

    DeleteChatPhoto deleteChatPhoto();

    DeleteChatStickerSet deleteChatStickerSet();

    ExportChatInviteLink exportChatInviteLink();

    KickChatMember kickChatMember();

    LeaveChat leaveChat();

    PinChatMessage pinChatMessage();

    PromoteChatMember promoteChatMember();

    RestrictChatMember restrictChatMember();

    SetChatDescription setChatDescription();

    SetChatPhoto setChatPhoto();

    SetChatStickerSet setChatStickerSet();

    SetChatTitle setChatTitle();

    UnbanChatMember unbanChatMember();

    UnpinChatMessage unpinChatMessage();

    AnswerInlineQuery answerInlineQuery();

    EditOtherMessageLiveLocation editOtherMessageLiveLocation();

    EditOwnMessageLiveLocation editOwnMessageLiveLocation();

    SendLocation sendLocation();

    SendVenue sendVenue();

    StopOtherMessageLiveLocation stopOtherMessageLiveLocation();

    StopOwnMessageLiveLocation stopOwnMessageLiveLocation();

    DeleteMessage deleteMessage();

    EditOtherMessageCaption editOtherMessageCaption();

    EditOtherMessageMedia editOtherMessageMedia();

    EditOtherMessageReplyMarkup editOtherMessageReplyMarkup();

    EditOtherMessageText editOtherMessageText();

    EditOwnMessageCaption editOwnMessageCaption();

    EditOwnMessageMedia editOwnMessageMedia();

    EditOwnMessageReplyMarkup editOwnMessageReplyMarkup();

    EditOwnMessageText editOwnMessageText();

    ForwardMessage forwardMessage();

    SendMessage sendMessage();

    SetPassportDataErrors setPassportDataErrors();

    AnswerPreCheckoutQuery answerPreCheckoutQuery();

    AnswerShippingQuery answerShippingQuery();

    SendInvoice sendInvoice();

    AddStickerFileToSet addStickerFileToSet();

    AddStickerToSet addStickerToSet();

    CreateNewStickerFileSet createNewStickerFileSet();

    CreateNewStickerSet createNewStickerSet();

    DeleteStickerFromSet deleteStickerFromSet();

    SendStickerFile sendStickerFile();

    SendSticker sendSticker();

    SetStickerPositionInSet setStickerPositionInSet();

    UploadStickerFile uploadStickerFile();

    DeleteWebhook deleteWebhook();

    SetWebhook setWebhook();

    GetMe getMe();

    GetUserProfilePhotos getUserProfilePhotos();

    GetFile getFile();

    GetGameHighScores getGameHighScores();

    GetChatAdministrators getChatAdministrators();

    GetChat getChat();

    GetChatMember getChatMember();

    GetChatMembersCount getChatMembersCount();

    GetStickerSet getStickerSet();

    GetUpdates getUpdates();

    GetWebhookInfo getWebhookInfo();

}
