package ru.ioleksiv.telegram.bot.api.telegram.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ru.ioleksiv.telegram.api.bot.core.telegram.model.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageResponse extends CommonResponse<Message> {

}
