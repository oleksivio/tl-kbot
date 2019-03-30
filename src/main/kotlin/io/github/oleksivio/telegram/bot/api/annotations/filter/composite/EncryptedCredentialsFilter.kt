package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class EncryptedCredentialsFilter(val status: AnnotationState = AnnotationState.ON, val validator: Array<String> = [], val data: NotNullFilter = NotNullFilter(status = AnnotationState.OFF), val hash: NotNullFilter = NotNullFilter(status = AnnotationState.OFF), val secret: NotNullFilter = NotNullFilter(status = AnnotationState.OFF))
