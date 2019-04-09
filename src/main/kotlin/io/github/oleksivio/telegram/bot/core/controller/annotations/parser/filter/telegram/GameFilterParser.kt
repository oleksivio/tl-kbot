package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.GameFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.Game
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class GameFilterParser : FilterParser<GameFilter, Game> {

    override val parserAnnotationClass = GameFilter::class

    override fun createChecker(annotation: GameFilter, finder: Finder): Validator<Game> {
        val unionExtractValidator = UnionExtractValidator<Game>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, Game::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val title = annotation.title
        if (title.status.isActive) {
            unionExtractValidator.add({ it.title }, finder.find(title))
        }
        val description = annotation.description
        if (description.status.isActive) {
            unionExtractValidator.add({ it.description }, finder.find(description))
        }
        val photoList = annotation.photoArray
        if (photoList.status.isActive) {
            unionExtractValidator.add({ it.photo }, finder.find(photoList))
        }
        val text = annotation.text
        if (text.status.isActive) {
            unionExtractValidator.add({ it.text }, finder.find(text))
        }
        val textEntities = annotation.textEntities
        if (textEntities.status.isActive) {
            unionExtractValidator.add({ it.textEntities }, finder.find(textEntities))
        }
        val animation = annotation.animation
        if (animation.status.isActive) {
            unionExtractValidator.add({ it.animation }, finder.find(animation))
        }

        return unionExtractValidator
    }

}

