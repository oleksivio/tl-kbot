package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.PassportFileArrayFilter
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportFile
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList
import org.springframework.stereotype.Component

@Component
class PassportFileArrayFilterParser : FilterParser<PassportFileArrayFilter, List<PassportFile>> {

    override val parserAnnotationClass = PassportFileArrayFilter::class

    override fun createChecker(annotation: PassportFileArrayFilter, finder: Finder): Validator<List<PassportFile>> {
        val unionExtractValidatorList = UnionExtractValidatorList<PassportFile>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, PassportFile::class) }
                .forEach { validator -> unionExtractValidatorList.add({ it }, validator) }

        val fileSize = annotation.fileSize
        if (fileSize.status.isActive) {
            unionExtractValidatorList.add({ it.fileSize }, finder.find(fileSize))
        }
        val fileDate = annotation.fileDate
        if (fileDate.status.isActive) {
            unionExtractValidatorList.add({ it.fileDate }, finder.find(fileDate))
        }

        return unionExtractValidatorList
    }

}

