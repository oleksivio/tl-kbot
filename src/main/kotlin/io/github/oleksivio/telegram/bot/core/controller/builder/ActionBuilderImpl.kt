package io.github.oleksivio.telegram.bot.core.controller.builder

import io.github.oleksivio.telegram.bot.api.controller.ActionBuilder
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
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import org.springframework.stereotype.Component

@Component
class ActionBuilderImpl(private val actionNetworker: ActionNetworker,
                        private val fileNetworker: FileNetworker) : ActionBuilder {

    override fun answerCallbackQuery(): AnswerCallbackQuery {
        return AnswerCallbackQuery(actionNetworker)
    }

    override fun sendChatAction(): SendChatAction {
        return SendChatAction(actionNetworker)
    }

    override fun sendContact(): SendContact {
        return SendContact(actionNetworker)
    }

    override fun sendAnimationFile(): SendAnimationFile {
        return SendAnimationFile(fileNetworker)
    }

    override fun sendAnimation(): SendAnimation {
        return SendAnimation(actionNetworker)
    }

    override fun sendAudioFile(): SendAudioFile {
        return SendAudioFile(fileNetworker)
    }

    override fun sendAudio(): SendAudio {
        return SendAudio(actionNetworker)
    }

    override fun sendDocumentFile(): SendDocumentFile {
        return SendDocumentFile(fileNetworker)
    }

    override fun sendDocument(): SendDocument {
        return SendDocument(actionNetworker)
    }

    override fun sendMediaGroup(): SendMediaGroup {
        return SendMediaGroup(actionNetworker)
    }

    override fun sendPhotoFile(): SendPhotoFile {
        return SendPhotoFile(fileNetworker)
    }

    override fun sendPhoto(): SendPhoto {
        return SendPhoto(actionNetworker)
    }

    override fun sendVideoFile(): SendVideoFile {
        return SendVideoFile(fileNetworker)
    }

    override fun sendVideo(): SendVideo {
        return SendVideo(actionNetworker)
    }

    override fun sendVideoNoteFile(): SendVideoNoteFile {
        return SendVideoNoteFile(fileNetworker)
    }

    override fun sendVideoNote(): SendVideoNote {
        return SendVideoNote(actionNetworker)
    }

    override fun sendVoiceFile(): SendVoiceFile {
        return SendVoiceFile(fileNetworker)
    }

    override fun sendVoice(): SendVoice {
        return SendVoice(actionNetworker)
    }

    override fun sendGame(): SendGame {
        return SendGame(actionNetworker)
    }

    override fun setOtherGameScore(): SetOtherGameScore {
        return SetOtherGameScore(actionNetworker)
    }

    override fun setOwnGameScore(): SetOwnGameScore {
        return SetOwnGameScore(actionNetworker)
    }

    override fun deleteChatPhoto(): DeleteChatPhoto {
        return DeleteChatPhoto(actionNetworker)
    }

    override fun deleteChatStickerSet(): DeleteChatStickerSet {
        return DeleteChatStickerSet(actionNetworker)
    }

    override fun exportChatInviteLink(): ExportChatInviteLink {
        return ExportChatInviteLink(actionNetworker)
    }

    override fun kickChatMember(): KickChatMember {
        return KickChatMember(actionNetworker)
    }

    override fun leaveChat(): LeaveChat {
        return LeaveChat(actionNetworker)
    }

    override fun pinChatMessage(): PinChatMessage {
        return PinChatMessage(actionNetworker)
    }

    override fun promoteChatMember(): PromoteChatMember {
        return PromoteChatMember(actionNetworker)
    }

    override fun restrictChatMember(): RestrictChatMember {
        return RestrictChatMember(actionNetworker)
    }

    override fun setChatDescription(): SetChatDescription {
        return SetChatDescription(actionNetworker)
    }

    override fun setChatPhoto(): SetChatPhoto {
        return SetChatPhoto(fileNetworker)
    }

    override fun setChatStickerSet(): SetChatStickerSet {
        return SetChatStickerSet(actionNetworker)
    }

    override fun setChatTitle(): SetChatTitle {
        return SetChatTitle(actionNetworker)
    }

    override fun unbanChatMember(): UnbanChatMember {
        return UnbanChatMember(actionNetworker)
    }

    override fun unpinChatMessage(): UnpinChatMessage {
        return UnpinChatMessage(actionNetworker)
    }

    override fun answerInlineQuery(): AnswerInlineQuery {
        return AnswerInlineQuery(actionNetworker)
    }

    override fun editOtherMessageLiveLocation(): EditOtherMessageLiveLocation {
        return EditOtherMessageLiveLocation(actionNetworker)
    }

    override fun editOwnMessageLiveLocation(): EditOwnMessageLiveLocation {
        return EditOwnMessageLiveLocation(actionNetworker)
    }

    override fun sendLocation(): SendLocation {
        return SendLocation(actionNetworker)
    }

    override fun sendVenue(): SendVenue {
        return SendVenue(actionNetworker)
    }

    override fun stopOtherMessageLiveLocation(): StopOtherMessageLiveLocation {
        return StopOtherMessageLiveLocation(actionNetworker)
    }

    override fun stopOwnMessageLiveLocation(): StopOwnMessageLiveLocation {
        return StopOwnMessageLiveLocation(actionNetworker)
    }

    override fun deleteMessage(): DeleteMessage {
        return DeleteMessage(actionNetworker)
    }

    override fun editOtherMessageCaption(): EditOtherMessageCaption {
        return EditOtherMessageCaption(actionNetworker)
    }

    override fun editOtherMessageMedia(): EditOtherMessageMedia {
        return EditOtherMessageMedia(actionNetworker)
    }

    override fun editOtherMessageReplyMarkup(): EditOtherMessageReplyMarkup {
        return EditOtherMessageReplyMarkup(actionNetworker)
    }

    override fun editOtherMessageText(): EditOtherMessageText {
        return EditOtherMessageText(actionNetworker)
    }

    override fun editOwnMessageCaption(): EditOwnMessageCaption {
        return EditOwnMessageCaption(actionNetworker)
    }

    override fun editOwnMessageMedia(): EditOwnMessageMedia {
        return EditOwnMessageMedia(actionNetworker)
    }

    override fun editOwnMessageReplyMarkup(): EditOwnMessageReplyMarkup {
        return EditOwnMessageReplyMarkup(actionNetworker)
    }

    override fun editOwnMessageText(): EditOwnMessageText {
        return EditOwnMessageText(actionNetworker)
    }

    override fun forwardMessage(): ForwardMessage {
        return ForwardMessage(actionNetworker)
    }

    override fun sendMessage(): SendMessage {
        return SendMessage(actionNetworker)
    }

    override fun setPassportDataErrors(): SetPassportDataErrors {
        return SetPassportDataErrors(actionNetworker)
    }

    override fun answerPreCheckoutQuery(): AnswerPreCheckoutQuery {
        return AnswerPreCheckoutQuery(actionNetworker)
    }

    override fun answerShippingQuery(): AnswerShippingQuery {
        return AnswerShippingQuery(actionNetworker)
    }

    override fun sendInvoice(): SendInvoice {
        return SendInvoice(actionNetworker)
    }

    override fun addStickerFileToSet(): AddStickerFileToSet {
        return AddStickerFileToSet(fileNetworker)
    }

    override fun addStickerToSet(): AddStickerToSet {
        return AddStickerToSet(actionNetworker)
    }

    override fun createNewStickerFileSet(): CreateNewStickerFileSet {
        return CreateNewStickerFileSet(fileNetworker)
    }

    override fun createNewStickerSet(): CreateNewStickerSet {
        return CreateNewStickerSet(actionNetworker)
    }

    override fun deleteStickerFromSet(): DeleteStickerFromSet {
        return DeleteStickerFromSet(actionNetworker)
    }

    override fun sendStickerFile(): SendStickerFile {
        return SendStickerFile(fileNetworker)
    }

    override fun sendSticker(): SendSticker {
        return SendSticker(actionNetworker)
    }

    override fun setStickerPositionInSet(): SetStickerPositionInSet {
        return SetStickerPositionInSet(actionNetworker)
    }

    override fun uploadStickerFile(): UploadStickerFile {
        return UploadStickerFile(fileNetworker)
    }

    override fun deleteWebhook(): DeleteWebhook {
        return DeleteWebhook(actionNetworker)
    }

    override fun setWebhook(): SetWebhook {
        return SetWebhook(fileNetworker)
    }

    override fun getMe(): GetMe {
        return GetMe(actionNetworker)
    }

    override fun getUserProfilePhotos(): GetUserProfilePhotos {
        return GetUserProfilePhotos(actionNetworker)
    }

    override fun getFile(): GetFile {
        return GetFile(actionNetworker)
    }

    override fun getGameHighScores(): GetGameHighScores {
        return GetGameHighScores(actionNetworker)
    }

    override fun getChatAdministrators(): GetChatAdministrators {
        return GetChatAdministrators(actionNetworker)
    }

    override fun getChat(): GetChat {
        return GetChat(actionNetworker)
    }

    override fun getChatMember(): GetChatMember {
        return GetChatMember(actionNetworker)
    }

    override fun getChatMembersCount(): GetChatMembersCount {
        return GetChatMembersCount(actionNetworker)
    }

    override fun getStickerSet(): GetStickerSet {
        return GetStickerSet(actionNetworker)
    }

    override fun getUpdates(): GetUpdates {
        return GetUpdates(actionNetworker)
    }

    override fun getWebhookInfo(): GetWebhookInfo {
        return GetWebhookInfo(actionNetworker)
    }

}
