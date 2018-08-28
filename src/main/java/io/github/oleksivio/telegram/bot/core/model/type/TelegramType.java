package io.github.oleksivio.telegram.bot.core.model.type;

import java.util.Objects;

public interface TelegramType extends NamedType {

    default boolean equalsWith(String typeString) {
        return Objects.equals(stringName(), typeString);
    }

    boolean isChosen();
}
