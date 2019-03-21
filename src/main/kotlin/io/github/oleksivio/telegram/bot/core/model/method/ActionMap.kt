package io.github.oleksivio.telegram.bot.core.model.method

import org.springframework.core.io.FileSystemResource
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap

class ActionMap {
    private val requestMap: LinkedMultiValueMap<String, Any> = LinkedMultiValueMap()

    fun putFile(key: String, file: FileSystemResource) {
        putObject(key, file)
    }

    fun putObject(key: String, obj: Any) {
        requestMap.add(key, obj)
    }

    fun putInt(key: String, integerValue: Int) {
        putObject(key, integerValue)
    }

    fun putLong(key: String, longValue: Long) {
        putObject(key, longValue)
    }

    fun putString(key: String, stringValue: String) {
        requestMap.add(key, stringValue)
    }

    fun putBool(key: String, booleanValue: Boolean) {
        putObject(key, booleanValue)
    }

    fun toLinkedMultiValueMap(): MultiValueMap<String, Any> {
        return requestMap
    }
}