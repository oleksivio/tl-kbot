package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser

import kotlin.reflect.KClass

interface Parser<A : Annotation> {
    val parserAnnotationClass: KClass<A>
}
