package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.AnimationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.GameFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.MessageEntityFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoArrayFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.game.Game;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class GameFilterParser extends FilterParser<GameFilter, Game> {

    @Override
    public Checker<Game> createChecker(GameFilter annotation, Finder finder) {
        UnionExtractChecker<Game> unionExtractChecker = new UnionExtractChecker<>();

        StringFilter title = annotation.title();
        if (title.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter description = annotation.description();
        if (description.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getDescription()), finder.find(description));
        }
        PhotoArrayFilter photoList = annotation.photoArray();
        if (photoList.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getPhoto()), finder.find(photoList));
        }
        StringFilter text = annotation.text();
        if (text.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getText()), finder.find(text));
        }
        MessageEntityFilter textEntities = annotation.textEntities();
        if (textEntities.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTextEntities()), finder.find(textEntities));
        }
        AnimationFilter animation = annotation.animation();
        if (animation.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getAnimation()), finder.find(animation));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<GameFilter> getAnnotationClass() {
        return GameFilter.class;
    }

}

