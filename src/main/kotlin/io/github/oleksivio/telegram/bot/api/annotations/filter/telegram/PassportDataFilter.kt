package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class PassportDataFilter(val status: AnnotationState = AnnotationState.ON, val validator: Array<String> = [], val encryptedPassportElements: EncryptedPassportElementArrayFilter = EncryptedPassportElementArrayFilter(status = AnnotationState.OFF), val encryptedCredentials: EncryptedCredentialsFilter = EncryptedCredentialsFilter(status = AnnotationState.OFF))