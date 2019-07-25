package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.DocumentFilter
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.Document

class DocumentFilterParser :
    FilterParser<DocumentFilter, Document> {

    override val parserAnnotationClass = DocumentFilter::class

    override fun createChecker(annotation: DocumentFilter, finder: Finder): Validator<Document> {
        val unionExtractValidator =
            UnionExtractValidator<Document>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, Document::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val thumb = annotation.thumb
        if (thumb.status.isActive) {
            unionExtractValidator.add({ it.thumb }, finder.find(thumb))
        }
        val fileName = annotation.fileName
        if (fileName.status.isActive) {
            unionExtractValidator.add({ it.fileName }, finder.find(fileName))
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

