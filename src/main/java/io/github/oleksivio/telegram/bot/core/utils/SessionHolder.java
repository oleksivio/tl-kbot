package io.github.oleksivio.telegram.bot.core.utils;

import java.util.HashMap;
import java.util.Map;

public class SessionHolder<T> {
    private final Map<Long, T> sessionMap = new HashMap<>();

    public void add(long telegramId, T newObject) {
        sessionMap.put(telegramId, newObject);
    }

    public T get(long telegramId) throws UnsupportedOperationException {
        T obj = sessionMap.get(telegramId);

        if (obj == null) {
            throw new UnsupportedOperationException("Get null holder value. Store object with " +
                                                            "telegram id " + telegramId + " before first get.");
        }

        return obj;
    }
}
