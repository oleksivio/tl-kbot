package io.github.oleksivio.tl.kbot.server.api.objects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import java.io.IOException

/**
 * Serialize telegram server input file as string
 */
class InputFileJacksonSerializer : JsonSerializer<InputFile>() {

    @Throws(IOException::class)
    override fun serialize(value: InputFile, gen: JsonGenerator, serializers: SerializerProvider) {
        when (value) {
            is InputFileIdImpl -> gen.writeString(value.id)
            is InputFileUrlImpl -> gen.writeString(value.url)
            is InputFileMultipartFormImpl -> gen.writeString(value.attachName)
        }
    }
}
