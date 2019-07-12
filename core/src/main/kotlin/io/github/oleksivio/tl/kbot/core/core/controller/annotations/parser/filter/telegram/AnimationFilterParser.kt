package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.AnimationFilter
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.game.Animation

class AnimationFilterParser :
    FilterParser<AnimationFilter, Animation> {

    override val parserAnnotationClass = AnimationFilter::class

    override fun createChecker(annotation: AnimationFilter, finder: Finder): Validator<Animation> {
        val unionExtractValidator =
            UnionExtractValidator<Animation>()

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

