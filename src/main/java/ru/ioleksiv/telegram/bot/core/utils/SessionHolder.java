package ru.ioleksiv.telegram.bot.core.utils;

import ru.ioleksiv.telegram.bot.core.model.exceptions.HolderException;

import java.util.HashMap;
import java.util.Map;

public class SessionHolder<T> {
    public final Map<Long, T> sessionMap = new HashMap<>();

    public void add(long telegramId, T newObject) {
        sessionMap.put(telegramId, newObject);
    }

    public T get(long telegramId) {
        T obj = sessionMap.get(telegramId);

        if (obj == null) {
            throw new HolderException("Get null holder value. Store object with " +
                                              "telegram id " + telegramId + " before first get.");
        }

        return obj;
    }
}
