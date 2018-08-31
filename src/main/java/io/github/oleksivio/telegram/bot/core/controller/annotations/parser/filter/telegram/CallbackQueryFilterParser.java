package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.CallbackQueryFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.MessageFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.CallbackQuery;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class CallbackQueryFilterParser implements FilterParser<CallbackQueryFilter, CallbackQuery> {

    @Override
    public Validator<CallbackQuery> createChecker(CallbackQueryFilter annotation,
                                                  Finder finder) {

        UnionExtractValidator<CallbackQuery> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, CallbackQuery.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        StringFilter data = annotation.data();
        if (data.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getData()), finder.find(data));
        }
        StringFilter chatInstance = annotation.chatInstance();
        if (chatInstance.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getChatInstance()), finder.find(chatInstance));
        }
        StringFilter gameShortName = annotation.gameShortName();
        if (gameShortName.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getGameShortName()), finder.find(gameShortName));
        }
        StringFilter inlineMessageId = annotation.inlineMessageId();
        if (inlineMessageId.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getInlineMessageId()), finder.find(inlineMessageId));
        }
        MessageFilter message = annotation.message();
        if (message.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getMessage()), finder.find(message));
        }
        return unionExtractValidator;
    }

    @Override
    public Class<CallbackQueryFilter> getAnnotationClass() {
        return CallbackQueryFilter.class;
    }

}



