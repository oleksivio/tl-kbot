package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class StringFilter(val status: AnnotationState = AnnotationState.ON, val regExp: String = "", val equalWith: Array<String> = [], val startWith: Array<String> = [], val endWith: Array<String> = [], val contain: Array<String> = [], val notContain: Array<String> = [], val notStartWith: Array<String> = [], val notEndWith: Array<String> = [])
