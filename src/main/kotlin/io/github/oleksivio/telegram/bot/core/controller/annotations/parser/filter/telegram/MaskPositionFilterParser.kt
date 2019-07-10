package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.MaskPositionFilter
import io.github.oleksivio.tl.kbot.server.api.objects.std.sticker.MaskPosition
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.TypeNameValidator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class MaskPositionFilterParser : FilterParser<MaskPositionFilter, MaskPosition> {

    override val parserAnnotationClass = MaskPositionFilter::class

    override fun createChecker(annotation: MaskPositionFilter, finder: Finder): Validator<MaskPosition> {
        val unionExtractValidator = UnionExtractValidator<MaskPosition>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, MaskPosition::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val type = annotation.point
        if (type.isChosen) {
            unionExtractValidator.add({ it.point }, TypeNameValidator(type))
        }

        val xShift = annotation.xShift
        if (xShift.status.isActive) {
            unionExtractValidator.add({ it.xShift }, finder.find(xShift))
        }
        val yShift = annotation.yShift
        if (yShift.status.isActive) {
            unionExtractValidator.add({ it.yShift }, finder.find(yShift))
        }
        val scale = annotation.scale
        if (scale.status.isActive) {
            unionExtractValidator.add({ it.scale }, finder.find(scale))
        }

        return unionExtractValidator
    }

}

