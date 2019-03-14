package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.VideoFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Video
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class VideoFilterParser : FilterParser<VideoFilter, Video> {

    override val parserAnnotationClass = VideoFilter::class

    override fun createChecker(annotation: VideoFilter, finder: Finder): Validator<Video> {
        val unionExtractValidator = UnionExtractValidator<Video>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, Video::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val duration = annotation.duration
        if (duration.status.isActive) {
            unionExtractValidator.add({ it.duration }, finder.find(duration))
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
        val mimeType = annotation.mimeType
        if (mimeType.status.isActive) {
            unionExtractValidator.add({ it.mimeType }, finder.find(mimeType))
        }
        val fileSize = annotation.fileSize
        if (fileSize.status.isActive) {
            unionExtractValidator.add({ it.fileSize }, finder.find(fileSize))
        }

        return unionExtractValidator
    }

}

