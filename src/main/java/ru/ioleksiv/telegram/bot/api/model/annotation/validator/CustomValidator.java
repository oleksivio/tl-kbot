package ru.ioleksiv.telegram.bot.api.model.annotation.validator;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

public interface CustomValidator<T extends ITelegram> extends Validator<T> {
}
