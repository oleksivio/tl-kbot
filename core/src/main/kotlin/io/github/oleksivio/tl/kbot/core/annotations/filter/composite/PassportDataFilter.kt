package io.github.oleksivio.tl.kbot.core.annotations.filter.composite

import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class PassportDataFilter(
    val status: AnnotationState = AnnotationState.ON,
    val validator: Array<String> = [],
    val encryptedPassportElements: EncryptedPassportElementArrayFilter = EncryptedPassportElementArrayFilter(
        status = AnnotationState.OFF
    ),
    val encryptedCredentials: EncryptedCredentialsFilter = EncryptedCredentialsFilter(
        status = AnnotationState.OFF
    )
)
