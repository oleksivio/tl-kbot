package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.AnimationFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.Animation
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class AnimationFilterParser : FilterParser<AnimationFilter, Animation> {

    override val parserAnnotationClass = AnimationFilter::class

    override fun createChecker(annotation: AnimationFilter, finder: Finder): Validator<Animation> {
        val unionExtractValidator = UnionExtractValidator<Animation>()

        annotation.validator
                .map { finder.find(it, Animation::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val thumb = annotation.thumb
        if (thumb.status.isActive) {
            unionExtractValidator.add({ it.thumb }, finder.find(thumb))
        }

        val fileName = annotation.fileName
        if (fileName.status.isActive) {
            unionExtractValidator.add({ it.fileName }, finder.find(fileName))
        }
        val mimeType = annotation.mimeType
        if (mimeType.status.isActive) {
            unionExtractValidator.add({ it.mimeType }, finder.find(mimeType))
        }
        val fileSize = annotation.fileSize
        if (fileSize.status.isActive) {
            unionExtractValidator.add({ it.fileSize }, finder.find(fileSize))
        }
        val width = annotation.width
        if (width.status.isActive) {
            unionExtractValidator.add({ it.width }, finder.find(width))
        }
        val height = annotation.height
        if (height.status.isActive) {
            unionExtractValidator.add({ it.height }, finder.find(height))
        }
        val duration = annotation.duration
        if (duration.status.isActive) {
            unionExtractValidator.add({ it.duration }, finder.find(duration))
        }

        return unionExtractValidator
    }

}

