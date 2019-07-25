package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.MessageFilter
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message

class MessageFilterParser :
    FilterParser<MessageFilter, Message> {

    override val parserAnnotationClass = MessageFilter::class

    override fun createChecker(annotation: MessageFilter, finder: Finder): Validator<Message> {
        val unionExtractValidator =
            UnionExtractValidator<Message>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, Message::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val from = annotation.from
        if (from.status.isActive) {
            unionExtractValidator.add({ it.from }, finder.find(from))
        }

        val date = annotation.date
        if (date.status.isActive) {
            unionExtractValidator.add({ it.date }, finder.find(date))
        }

        val chat = annotation.chat
        if (chat.status.isActive) {
            unionExtractValidator.add({ it.chat }, finder.find(chat))
        }

        val forwardFrom = annotation.forwardFrom
        if (forwardFrom.status.isActive) {
            unionExtractValidator.add({ it.forwardFrom }, finder.find(forwardFrom))
        }
        val forwardChat = annotation.forwardChat
        if (forwardChat.status.isActive) {
            unionExtractValidator.add({ it.forwardFromChat }, finder.find(forwardChat))
        }
        val forwardFromMessageId = annotation.forwardFromMessageId
        if (forwardFromMessageId.status.isActive) {
            unionExtractValidator.add(
                { it.forwardFromMessageId },
                finder.find(forwardFromMessageId)
            )
        }
        val forwardSignature = annotation.forwardSignature
        if (forwardSignature.status.isActive) {
            unionExtractValidator.add(
                { it.forwardSignature },
                finder.find(forwardSignature)
            )
        }
        val forwardDate = annotation.forwardDate
        if (forwardDate.status.isActive) {
            unionExtractValidator.add({ it.forwardDate }, finder.find(forwardDate))
        }
        val replyToMessage = annotation.replyToMessage
        if (replyToMessage.status.isActive) {
            unionExtractValidator.add({ it.replyToMessage }, finder.find(replyToMessage))
        }
        val editDate = annotation.editDate
        if (editDate.status.isActive) {
            unionExtractValidator.add({ it.editDate }, finder.find(editDate))
        }
        val mediaGroupId = annotation.mediaGroupId
        if (mediaGroupId.status.isActive) {
            unionExtractValidator.add({ it.mediaGroupId }, finder.find(mediaGroupId))
        }
        val authorSignature = annotation.authorSignature
        if (authorSignature.status.isActive) {
            unionExtractValidator.add({ it.authorSignature }, finder.find(authorSignature))
        }
        val text = annotation.text
        if (text.status.isActive) {
            unionExtractValidator.add({ it.text }, finder.find(text))
        }
        val audio = annotation.audio
        if (audio.status.isActive) {
            unionExtractValidator.add({ it.audio }, finder.find(audio))
        }
        val photo = annotation.photoArray
        if (photo.status.isActive) {
            unionExtractValidator.add({ it.photo }, finder.find(photo))
        }
        val caption = annotation.caption
        if (caption.status.isActive) {
            unionExtractValidator.add({ it.caption }, finder.find(caption))
        }
        val contact = annotation.contact
        if (contact.status.isActive) {
            unionExtractValidator.add({ it.contact }, finder.find(contact))
        }
        val location = annotation.location
        if (location.status.isActive) {
            unionExtractValidator.add({ it.location }, finder.find(location))
        }
        val newChatMembers = annotation.newChatMembers
        if (newChatMembers.status.isActive) {
            unionExtractValidator.add({ it.newChatMembers }, finder.find(newChatMembers))
        }
        val leftChatMember = annotation.leftChatMember
        if (leftChatMember.status.isActive) {
            unionExtractValidator.add({ it.leftChatMember }, finder.find(leftChatMember))
        }
        val document = annotation.document
        if (document.status.isActive) {
            unionExtractValidator.add({ it.document }, finder.find(document))
        }
        val animation = annotation.animation
        if (animation.status.isActive) {
            unionExtractValidator.add({ it.animation }, finder.find(animation))
        }
        val game = annotation.game
        if (game.status.isActive) {
            unionExtractValidator.add({ it.game }, finder.find(game))
        }
        val newChatTitle = annotation.newChatTitle
        if (newChatTitle.status.isActive) {
            unionExtractValidator.add({ it.newChatTitle }, finder.find(newChatTitle))
        }
        val sticker = annotation.sticker
        if (sticker.status.isActive) {
            unionExtractValidator.add({ it.sticker }, finder.find(sticker))
        }
        val video = annotation.video
        if (video.status.isActive) {
            unionExtractValidator.add({ it.video }, finder.find(video))
        }
        val voice = annotation.voice
        if (voice.status.isActive) {
            unionExtractValidator.add({ it.voice }, finder.find(voice))
        }
        val entities = annotation.entityArray
        if (entities.status.isActive) {
            unionExtractValidator.add({ it.entities }, finder.find(entities))
        }
        val captionEntites = annotation.captionEntityArray
        if (captionEntites.status.isActive) {
            unionExtractValidator.add({ it.captionEntities }, finder.find(captionEntites))
        }
        val videoNoteFilter = annotation.videoNote
        if (videoNoteFilter.status.isActive) {
            unionExtractValidator.add({ it.videoNote }, finder.find(videoNoteFilter))
        }
        val newChatPhoto = annotation.newChatPhoto
        if (newChatPhoto.status.isActive) {
            unionExtractValidator.add({ it.newChatPhoto }, finder.find(newChatPhoto))
        }
        val deleteChatPhoto = annotation.deleteChatPhoto
        if (deleteChatPhoto.status.isActive) {
            unionExtractValidator.add({ it.deleteChatPhoto }, finder.find(deleteChatPhoto))
        }
        val groupChatCreated = annotation.groupChatCreated
        if (groupChatCreated.status.isActive) {
            unionExtractValidator.add(
                { it.groupChatCreated },
                finder.find(groupChatCreated)
            )
        }
        val venue = annotation.venue
        if (venue.status.isActive) {
            unionExtractValidator.add({ it.venue }, finder.find(venue))
        }
        val supergroupChatCreated = annotation.supergroupChatCreated
        if (supergroupChatCreated.status.isActive) {
            unionExtractValidator.add(
                { it.supergroupChatCreated },
                finder.find(supergroupChatCreated)
            )
        }
        val channelChatCreated = annotation.channelChatCreated
        if (channelChatCreated.status.isActive) {
            unionExtractValidator.add(
                { it.channelChatCreated },
                finder.find(channelChatCreated)
            )
        }
        val migrateToChatId = annotation.migrateToChatId
        if (migrateToChatId.status.isActive) {
            unionExtractValidator.add({ it.migrateToChatId }, finder.find(migrateToChatId))
        }
        val migrateFromChatId = annotation.migrateFromChatId
        if (migrateFromChatId.status.isActive) {
            unionExtractValidator.add(
                { it.migrateFromChatId },
                finder.find(migrateFromChatId)
            )
        }
        val pinnedMessage = annotation.pinnedMessage
        if (pinnedMessage.status.isActive) {
            unionExtractValidator.add({ it.pinnedMessage }, finder.find(pinnedMessage))
        }
        val invoice = annotation.invoice
        if (invoice.status.isActive) {
            unionExtractValidator.add({ it.invoice }, finder.find(invoice))
        }
        val successfulPayment = annotation.successfulPayment
        if (successfulPayment.status.isActive) {
            unionExtractValidator.add(
                { it.successfulPayment },
                finder.find(successfulPayment)
            )
        }
        val connectedWebsite = annotation.connectedWebsite
        if (connectedWebsite.status.isActive) {
            unionExtractValidator.add(
                { it.connectedWebsite },
                finder.find(connectedWebsite)
            )
        }
        val passportData = annotation.passportData
        if (passportData.status.isActive) {
            unionExtractValidator.add({ it.passportData }, finder.find(passportData))
        }

        return unionExtractValidator
    }
}
