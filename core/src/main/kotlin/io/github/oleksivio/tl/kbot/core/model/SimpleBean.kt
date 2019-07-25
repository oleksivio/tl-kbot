package io.github.oleksivio.tl.kbot.core.model

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator

data class SimpleBean constructor(val name: String, val instance: Any) {
    // use java because if we try to get superclasses from java lambda class kotlin reflect throw exception
    val isFilterValidator: Boolean = instance::class.java.superclass == FilterValidator::class.java
}
