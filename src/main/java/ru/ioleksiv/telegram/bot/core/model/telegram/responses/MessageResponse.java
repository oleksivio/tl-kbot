package ru.ioleksiv.telegram.bot.core.model.telegram.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageResponse extends CommonResponse<Message> {

}
