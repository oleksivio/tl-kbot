package ru.ioleksiv.telegram.bot.core.model.type;

public interface TelegramType extends NamedType {

    boolean notAll();

    boolean equal(String typeString);
}
