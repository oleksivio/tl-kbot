package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.AnimationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.GameFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MessageEntityFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoArrayFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.game.Game;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class GameFilterParser implements FilterParser<GameFilter, Game> {

    @Override
    public Validator<Game> createChecker(GameFilter annotation, Finder finder) {
        UnionExtractValidator<Game> unionExtractValidator = new UnionExtractValidator<>();

        StringFilter title = annotation.title();
        if (title.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter description = annotation.description();
        if (description.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getDescription()), finder.find(description));
        }
        PhotoArrayFilter photoList = annotation.photoArray();
        if (photoList.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPhoto()), finder.find(photoList));
        }
        StringFilter text = annotation.text();
        if (text.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getText()), finder.find(text));
        }
        MessageEntityFilter textEntities = annotation.textEntities();
        if (textEntities.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTextEntities()), finder.find(textEntities));
        }
        AnimationFilter animation = annotation.animation();
        if (animation.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getAnimation()), finder.find(animation));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<GameFilter> getAnnotationClass() {
        return GameFilter.class;
    }

}

