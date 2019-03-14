package io.github.oleksivio.telegram.bot.api.controller

import io.github.oleksivio.telegram.bot.api.model.method.file.*
import io.github.oleksivio.telegram.bot.api.model.method.game.GetGameHighScores
import io.github.oleksivio.telegram.bot.api.model.method.game.SendGame
import io.github.oleksivio.telegram.bot.api.model.method.game.SetOtherGameScore
import io.github.oleksivio.telegram.bot.api.model.method.game.SetOwnGameScore
import io.github.oleksivio.telegram.bot.api.model.method.group.*
import io.github.oleksivio.telegram.bot.api.model.method.info.AnswerCallbackQuery
import io.github.oleksivio.telegram.bot.api.model.method.info.GetMe
import io.github.oleksivio.telegram.bot.api.model.method.info.GetUserProfilePhotos
import io.github.oleksivio.telegram.bot.api.model.method.info.SendChatAction
import io.github.oleksivio.telegram.bot.api.model.method.inline.AnswerInlineQuery
import io.github.oleksivio.telegram.bot.api.model.method.location.*
import io.github.oleksivio.telegram.bot.api.model.method.message.*
import io.github.oleksivio.telegram.bot.api.model.method.passport.SetPassportDataErrors
import io.github.oleksivio.telegram.bot.api.model.method.payments.AnswerPreCheckoutQuery
import io.github.oleksivio.telegram.bot.api.model.method.payments.AnswerShippingQuery
import io.github.oleksivio.telegram.bot.api.model.method.payments.SendInvoice
import io.github.oleksivio.telegram.bot.api.model.method.sticker.*
import io.github.oleksivio.telegram.bot.api.model.method.update.DeleteWebhook
import io.github.oleksivio.telegram.bot.api.model.method.update.GetUpdates
import io.github.oleksivio.telegram.bot.api.model.method.update.GetWebhookInfo
import io.github.oleksivio.telegram.bot.api.model.method.update.SetWebhook

interface ActionBuilder {
    fun answerCallbackQuery(): AnswerCallbackQuery

    fun sendChatAction(): SendChatAction

    fun sendContact(): SendContact

    fun sendAnimationFile(): SendAnimationFile

    fun sendAnimation(): SendAnimation

    fun sendAudioFile(): SendAudioFile

    fun sendAudio(): SendAudio

    fun sendDocumentFile(): SendDocumentFile

    fun sendDocument(): SendDocument

    fun sendMediaGroup(): SendMediaGroup

    fun sendPhotoFile(): SendPhotoFile

    fun sendPhoto(): SendPhoto

    fun sendVideoFile(): SendVideoFile

    fun sendVideo(): SendVideo

    fun sendVideoNoteFile(): SendVideoNoteFile

    fun sendVideoNote(): SendVideoNote

    fun sendVoiceFile(): SendVoiceFile

    fun sendVoice(): SendVoice

    fun sendGame(): SendGame

    fun setOtherGameScore(): SetOtherGameScore

    fun setOwnGameScore(): SetOwnGameScore

    fun deleteChatPhoto(): DeleteChatPhoto

    fun deleteChatStickerSet(): DeleteChatStickerSet

    fun exportChatInviteLink(): ExportChatInviteLink

    fun kickChatMember(): KickChatMember

    fun leaveChat(): LeaveChat

    fun pinChatMessage(): PinChatMessage

    fun promoteChatMember(): PromoteChatMember

    fun restrictChatMember(): RestrictChatMember

    fun setChatDescription(): SetChatDescription

    fun setChatPhoto(): SetChatPhoto

    fun setChatStickerSet(): SetChatStickerSet

    fun setChatTitle(): SetChatTitle

    fun unbanChatMember(): UnbanChatMember

    fun unpinChatMessage(): UnpinChatMessage

    fun answerInlineQuery(): AnswerInlineQuery

    fun editOtherMessageLiveLocation(): EditOtherMessageLiveLocation

    fun editOwnMessageLiveLocation(): EditOwnMessageLiveLocation

    fun sendLocation(): SendLocation

    fun sendVenue(): SendVenue

    fun stopOtherMessageLiveLocation(): StopOtherMessageLiveLocation

    fun stopOwnMessageLiveLocation(): StopOwnMessageLiveLocation

    fun deleteMessage(): DeleteMessage

    fun editOtherMessageCaption(): EditOtherMessageCaption

    fun editOtherMessageMedia(): EditOtherMessageMedia

    fun editOtherMessageReplyMarkup(): EditOtherMessageReplyMarkup

    fun editOtherMessageText(): EditOtherMessageText

    fun editOwnMessageCaption(): EditOwnMessageCaption

    fun editOwnMessageMedia(): EditOwnMessageMedia

    fun editOwnMessageReplyMarkup(): EditOwnMessageReplyMarkup

    fun editOwnMessageText(): EditOwnMessageText

    fun forwardMessage(): ForwardMessage

    fun sendMessage(): SendMessage

    fun setPassportDataErrors(): SetPassportDataErrors

    fun answerPreCheckoutQuery(): AnswerPreCheckoutQuery

    fun answerShippingQuery(): AnswerShippingQuery

    fun sendInvoice(): SendInvoice

    fun addStickerFileToSet(): AddStickerFileToSet

    fun addStickerToSet(): AddStickerToSet

    fun createNewStickerFileSet(): CreateNewStickerFileSet

    fun createNewStickerSet(): CreateNewStickerSet

    fun deleteStickerFromSet(): DeleteStickerFromSet

    fun sendStickerFile(): SendStickerFile

    fun sendSticker(): SendSticker

    fun setStickerPositionInSet(): SetStickerPositionInSet

    fun uploadStickerFile(): UploadStickerFile

    fun deleteWebhook(): DeleteWebhook

    fun setWebhook(): SetWebhook

    fun getMe(): GetMe

    fun getUserProfilePhotos(): GetUserProfilePhotos

    fun getFile(): GetFile

    fun getGameHighScores(): GetGameHighScores

    fun getChatAdministrators(): GetChatAdministrators

    fun getChat(): GetChat

    fun getChatMember(): GetChatMember

    fun getChatMembersCount(): GetChatMembersCount

    fun getStickerSet(): GetStickerSet

    fun getUpdates(): GetUpdates

    fun getWebhookInfo(): GetWebhookInfo

}
