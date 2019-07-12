package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.PhotoArrayFilter
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.PhotoSize
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidatorList
 

  
class PhotoArrayFilterParser :
    FilterParser<PhotoArrayFilter, List<PhotoSize>> {

    override val parserAnnotationClass = PhotoArrayFilter::class

    override fun createChecker(annotation: PhotoArrayFilter, finder: Finder): Validator<List<PhotoSize>> {
        val unionExtractValidatorList =
            UnionExtractValidatorList<PhotoSize>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, PhotoSize::class) }
                .forEach { validator -> unionExtractValidatorList.add({ it }, validator) }

        val width = annotation.width
        if (width.status.isActive) {
            unionExtractValidatorList.add({ it.width }, finder.find(width))
        }
        val height = annotation.height
        if (height.status.isActive) {
            unionExtractValidatorList.add({ it.height }, finder.find(height))
        }
        val fileSize = annotation.fileSize
        if (fileSize.status.isActive) {
            unionExtractValidatorList.add({ it.fileSize }, finder.find(fileSize))
        }

        return unionExtractValidatorList
    }
}
