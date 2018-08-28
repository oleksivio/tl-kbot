package io.github.oleksivio.telegram.bot.api.model.annotation.validator;

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

public interface CustomValidator<T extends ITelegram> extends Validator<T> {
}
