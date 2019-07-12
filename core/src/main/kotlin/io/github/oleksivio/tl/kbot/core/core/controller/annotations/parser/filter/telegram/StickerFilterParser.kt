package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.StickerFilter
import io.github.oleksivio.tl.kbot.server.api.objects.std.sticker.Sticker
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidator
 

  
class StickerFilterParser :
    FilterParser<StickerFilter, Sticker> {

    override val parserAnnotationClass = StickerFilter::class

    override fun createChecker(annotation: StickerFilter, finder: Finder): Validator<Sticker> {
        val unionExtractValidator =
            UnionExtractValidator<Sticker>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, Sticker::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val maskPosition = annotation.maskPosition
        if (maskPosition.status.isActive) {
            unionExtractValidator.add({ it.maskPosition }, finder.find(maskPosition))
        }
        val width = annotation.width
        if (width.status.isActive) {
            unionExtractValidator.add({ it.width }, finder.find(width))
        }
        val height = annotation.height
        if (height.status.isActive) {
            unionExtractValidator.add({ it.height }, finder.find(height))
        }
        val thumb = annotation.thumb
        if (thumb.status.isActive) {
            unionExtractValidator.add({ it.thumb }, finder.find(thumb))
        }
        val emoji = annotation.emoji
        if (emoji.status.isActive) {
            unionExtractValidator.add({ it.emoji }, finder.find(emoji))
        }
        val setName = annotation.setName
        if (setName.status.isActive) {
            unionExtractValidator.add({ it.setName }, finder.find(setName))
        }
        val fileSize = annotation.fileSize
        if (fileSize.status.isActive) {
            unionExtractValidator.add({ it.fileSize }, finder.find(fileSize))
        }

        return unionExtractValidator
    }

}

