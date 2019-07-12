package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.VideoNoteFilter
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.VideoNote

class VideoNoteFilterParser :
    FilterParser<VideoNoteFilter, VideoNote> {

    override val parserAnnotationClass = VideoNoteFilter::class

    override fun createChecker(annotation: VideoNoteFilter, finder: Finder): Validator<VideoNote> {
        val unionExtractValidator =
            UnionExtractValidator<VideoNote>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, VideoNote::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val length = annotation.length
        if (length.status.isActive) {
            unionExtractValidator.add({ it.length }, finder.find(length))
        }
        val duration = annotation.duration
        if (duration.status.isActive) {
            unionExtractValidator.add({ it.duration }, finder.find(duration))
        }
        val thumb = annotation.thumb
        if (thumb.status.isActive) {
            unionExtractValidator.add({ it.thumb }, finder.find(thumb))
        }
        val fileSize = annotation.fileSize
        if (fileSize.status.isActive) {
            unionExtractValidator.add({ it.fileSize }, finder.find(fileSize))
        }

        return unionExtractValidator
    }
}

