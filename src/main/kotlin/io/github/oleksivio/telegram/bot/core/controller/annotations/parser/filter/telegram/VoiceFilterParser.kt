package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.VoiceFilter
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.Voice
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class VoiceFilterParser : FilterParser<VoiceFilter, Voice> {

    override val parserAnnotationClass = VoiceFilter::class

    override fun createChecker(annotation: VoiceFilter, finder: Finder): Validator<Voice> {
        val unionExtractValidator = UnionExtractValidator<Voice>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, Voice::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val duration = annotation.duration
        if (duration.status.isActive) {
            unionExtractValidator.add({ it.duration }, finder.find(duration))
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

