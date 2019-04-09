package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.AudioFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Audio
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class AudioFilterParser : FilterParser<AudioFilter, Audio> {

    override val parserAnnotationClass = AudioFilter::class

    override fun createChecker(annotation: AudioFilter, finder: Finder): Validator<Audio> {
        val unionExtractValidator = UnionExtractValidator<Audio>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, Audio::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val duration = annotation.duration
        if (duration.status.isActive) {
            unionExtractValidator.add({ it.duration }, finder.find(duration))
        }
        val performer = annotation.performer
        if (performer.status.isActive) {
            unionExtractValidator.add({ it.performer }, finder.find(performer))
        }
        val title = annotation.title
        if (title.status.isActive) {
            unionExtractValidator.add({ it.title }, finder.find(title))
        }
        val mimeType = annotation.mimeType
        if (mimeType.status.isActive) {
            unionExtractValidator.add({ it.mimeType }, finder.find(mimeType))
        }
        val fileSize = annotation.fileSize
        if (fileSize.status.isActive) {
            unionExtractValidator.add({ it.fileSize }, finder.find(fileSize))
        }
        val thumb = annotation.thumb
        if (thumb.status.isActive) {
            unionExtractValidator.add({ it.thumb }, finder.find(thumb))
        }

        return unionExtractValidator
    }

}

