package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

/**
 * [StringFilter] annotation is used to filter incoming [String] value
 *
 * @param regExp - pass only math strings
 *
 * @param equalWith - pass string which equal with one of input string
 *
 * @param startWith - pass string which start with one of input string
 *
 * @param endWith - pass string which end with one of input string
 *
 * @param contain - pass string which contain one of input string
 *
 * @param notContain - pass string which not contain any of input string
 *
 * @param notStartWith - pass string which not start with any of input string
 *
 * @param notEndWith - pass string which not end with any of input string
 */
@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class StringFilter(
        val status: AnnotationState = AnnotationState.ON,
        val regExp: String = "",
        val equalWith: Array<String> = [],
        val startWith: Array<String> = [],
        val endWith: Array<String> = [],
        val contain: Array<String> = [],
        val notContain: Array<String> = [],
        val notStartWith: Array<String> = [],
        val notEndWith: Array<String> = []
)
