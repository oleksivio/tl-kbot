package io.github.oleksivio.telegram.bot.api.controller;

import io.github.oleksivio.telegram.bot.api.model.method.payments.SendInvoice;
import io.github.oleksivio.telegram.bot.api.model.method.file.GetFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendAnimation;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendAnimationFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendAudio;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendAudioFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendDocument;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendDocumentFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendMediaGroup;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendPhoto;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendPhotoFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVideo;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVideoFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVideoNote;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVideoNoteFile;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVoice;
import io.github.oleksivio.telegram.bot.api.model.method.file.SendVoiceFile;
import io.github.oleksivio.telegram.bot.api.model.method.game.GetGameHighScores;
import io.github.oleksivio.telegram.bot.api.model.method.game.SendGame;
import io.github.oleksivio.telegram.bot.api.model.method.game.SetOtherGameScore;
import io.github.oleksivio.telegram.bot.api.model.method.game.SetOwnGameScore;
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
import io.github.oleksivio.telegram.bot.api.model.method.group.SetChatStickerSet;
import io.github.oleksivio.telegram.bot.api.model.method.group.SetChatTitle;
import io.github.oleksivio.telegram.bot.api.model.method.group.UnbanChatMember;
import io.github.oleksivio.telegram.bot.api.model.method.group.UnpinChatMessage;
import io.github.oleksivio.telegram.bot.api.model.method.info.AnswerCallbackQuery;
import io.github.oleksivio.telegram.bot.api.model.method.info.GetMe;
import io.github.oleksivio.telegram.bot.api.model.method.info.GetUserProfilePhotos;
import io.github.oleksivio.telegram.bot.api.model.method.info.SendChatAction;
import io.github.oleksivio.telegram.bot.api.model.method.inline.AnswerInlineQuery;
import io.github.oleksivio.telegram.bot.api.model.method.location.EditOtherMessageLiveLocation;
import io.github.oleksivio.telegram.bot.api.model.method.location.EditOwnMessageLiveLocation;
import io.github.oleksivio.telegram.bot.api.model.method.location.SendLocation;
import io.github.oleksivio.telegram.bot.api.model.method.location.SendVenue;
import io.github.oleksivio.telegram.bot.api.model.method.location.StopOtherMessageLiveLocation;
import io.github.oleksivio.telegram.bot.api.model.method.location.StopOwnMessageLiveLocation;
import io.github.oleksivio.telegram.bot.api.model.method.message.DeleteMessage;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOtherMessageCaption;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOtherMessageMedia;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOtherMessageReplyMarkup;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOtherMessageText;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOwnMessageCaption;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOwnMessageMedia;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOwnMessageReplyMarkup;
import io.github.oleksivio.telegram.bot.api.model.method.message.EditOwnMessageText;
import io.github.oleksivio.telegram.bot.api.model.method.message.ForwardMessage;
import io.github.oleksivio.telegram.bot.api.model.method.message.SendContact;
import io.github.oleksivio.telegram.bot.api.model.method.message.SendMessage;
import io.github.oleksivio.telegram.bot.api.model.method.passport.SetPassportDataErrors;
import io.github.oleksivio.telegram.bot.api.model.method.payments.AnswerPreCheckoutQuery;
import io.github.oleksivio.telegram.bot.api.model.method.payments.AnswerShippingQuery;
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
