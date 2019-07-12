package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.PhotoFilter
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.PhotoSize

class PhotoFilterParser :
    FilterParser<PhotoFilter, PhotoSize> {

    override val parserAnnotationClass = PhotoFilter::class

    override fun createChecker(annotation: PhotoFilter, finder: Finder): Validator<PhotoSize> {
        val unionExtractValidator =
            UnionExtractValidator<PhotoSize>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, PhotoSize::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val width = annotation.width
        if (width.status.isActive) {
            unionExtractValidator.add({ it.width }, finder.find(width))
        }
        val height = annotation.height
        if (height.status.isActive) {
            unionExtractValidator.add({ it.height }, finder.find(height))
        }
        val fileSize = annotation.fileSize
        if (fileSize.status.isActive) {
            unionExtractValidator.add({ it.fileSize }, finder.find(fileSize))
        }

        return unionExtractValidator
    }
}

