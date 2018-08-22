package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.CallbackQueryFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MessageFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class CallbackQueryFilterParser implements FilterParser<CallbackQueryFilter, CallbackQuery> {

    @Override
    public Validator<CallbackQuery> createChecker(CallbackQueryFilter annotation,
                                                  Finder finder) {

        UnionExtractValidator<CallbackQuery> unionExtractValidator = new UnionExtractValidator<>();

        StringFilter data = annotation.data();
        if (data.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getData()), finder.find(data));
        }
        StringFilter chatInstance = annotation.chatInstance();
        if (chatInstance.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getChatInstance()), finder.find(chatInstance));
        }
        StringFilter gameShortName = annotation.gameShortName();
        if (gameShortName.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getGameShortName()), finder.find(gameShortName));
        }
        StringFilter inlineMessageId = annotation.inlineMessageId();
        if (inlineMessageId.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getInlineMessageId()), finder.find(inlineMessageId));
        }
        MessageFilter message = annotation.message();
        if (message.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getMessage()), finder.find(message));
        }
        return unionExtractValidator;
    }

    @Override
    public Class<CallbackQueryFilter> getAnnotationClass() {
        return CallbackQueryFilter.class;
    }

}



