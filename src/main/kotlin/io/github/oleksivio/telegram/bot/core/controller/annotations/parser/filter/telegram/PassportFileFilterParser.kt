package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.PassportFileFilter
import io.github.oleksivio.tl.kbot.server.api.objects.passport.PassportFile
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class PassportFileFilterParser : FilterParser<PassportFileFilter, PassportFile> {

    override val parserAnnotationClass = PassportFileFilter::class

    override fun createChecker(annotation: PassportFileFilter, finder: Finder): Validator<PassportFile> {
        val unionExtractValidator = UnionExtractValidator<PassportFile>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, PassportFile::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val fileSize = annotation.fileSize
        if (fileSize.status.isActive) {
            unionExtractValidator.add({ it.fileSize }, finder.find(fileSize))
        }
        val fileDate = annotation.fileDate
        if (fileDate.status.isActive) {
            unionExtractValidator.add({ it.fileDate }, finder.find(fileDate))
        }

        return unionExtractValidator
    }

}

