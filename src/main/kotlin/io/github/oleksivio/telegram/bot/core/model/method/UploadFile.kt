package io.github.oleksivio.telegram.bot.core.model.method

import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import org.springframework.core.io.FileSystemResource
import org.springframework.util.LinkedMultiValueMap

abstract class UploadFile<RES> protected constructor(method: String, private val fileNetworker: FileNetworker) : NetworkErrorAction<RES>() {
    private val requestMap: LinkedMultiValueMap<String, Any> = LinkedMultiValueMap()

    init {
        requestMap.add(METHOD_KEY, method)
    }

    override fun send(): RES? {
        return fileNetworker.run(requestMap,
                resultWrapperClass.java,
                networkErrorListener)?.get()

    }

    protected fun putFile(key: String, file: FileSystemResource) {
        putObject(key, file)
    }

    protected fun putObject(key: String, obj: Any?) {
        if (obj != null) {
            requestMap.add(key, obj)
        }
    }

    protected fun putInt(key: String, integerValue: Int?) {
        putObject(key, integerValue)
    }

    protected fun putLong(key: String, longValue: Long?) {
        putObject(key, longValue)
    }

    protected fun putString(key: String, stringValue: String) {
        requestMap.add(key, stringValue)
    }

    protected fun putBool(key: String, booleanValue: Boolean?) {
        putObject(key, booleanValue)
    }

    companion object {
        private const val METHOD_KEY = "method"
    }

}
