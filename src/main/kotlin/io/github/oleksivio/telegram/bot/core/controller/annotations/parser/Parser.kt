package io.github.oleksivio.telegram.bot.core.controller.annotations.parser

import kotlin.reflect.KClass

interface Parser<A : Annotation> {
    val parserAnnotationClass: KClass<A>
}
