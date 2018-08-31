package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.AnimationFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.GameFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.MessageEntityFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoArrayFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.Game;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class GameFilterParser implements FilterParser<GameFilter, Game> {

    @Override
    public Validator<Game> createChecker(GameFilter annotation, Finder finder) {
        UnionExtractValidator<Game> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, Game.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        StringFilter title = annotation.title();
        if (title.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter description = annotation.description();
        if (description.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getDescription()), finder.find(description));
        }
        PhotoArrayFilter photoList = annotation.photoArray();
        if (photoList.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPhoto()), finder.find(photoList));
        }
        StringFilter text = annotation.text();
        if (text.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getText()), finder.find(text));
        }
        MessageEntityFilter textEntities = annotation.textEntities();
        if (textEntities.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTextEntities()), finder.find(textEntities));
        }
        AnimationFilter animation = annotation.animation();
        if (animation.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getAnimation()), finder.find(animation));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<GameFilter> getAnnotationClass() {
        return GameFilter.class;
    }

}

