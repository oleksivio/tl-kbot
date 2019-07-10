package io.github.oleksivio.tl.kbot.server.api.objects

import com.fasterxml.jackson.databind.annotation.JsonSerialize

@JsonSerialize(using = InputFileJacksonSerializer::class)
sealed class ChatId

class ChatIdStringImpl(val name: String) : ChatId()

class ChatIdLongImpl(val id: Long) : ChatId()