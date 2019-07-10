package io.github.oleksivio.tl.kbot.server.api.objects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import java.io.IOException

/**
 * Serialize telegram server input file as string
 */
class ChatIdJacksonSerializer : JsonSerializer<ChatId>() {

    @Throws(IOException::class)
    override fun serialize(value: ChatId, gen: JsonGenerator, serializers: SerializerProvider) {
        when (value){
            is ChatIdLongImpl -> gen.writeNumber(value.id)
            is ChatIdStringImpl -> gen.writeString(value.name)
        }
    }
}