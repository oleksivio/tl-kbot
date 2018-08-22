package ru.ioleksiv.telegram.bot.core.controller.processor;

import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionOrderManager {
    private static final int INACTIVE_VALUE = -1;
    private final Map<Integer, Handler> orderMap = new HashMap<>();
    private final List<Integer> keyList = new ArrayList<>();

    private int order = INACTIVE_VALUE;

    public SessionOrderManager(Map<Integer, Handler> orderMap) {
        this.orderMap.putAll(orderMap);
        keyList.addAll(orderMap.keySet());
        keyList.sort(Integer::compareTo);
    }

    void next() {
        order++;
        if (order >= keyList.size()) {
            reset();
        }
    }

    void reset() {
        order = INACTIVE_VALUE;
    }

    public boolean isActive() {
        return order != INACTIVE_VALUE;
    }

    Handler getCurrent() {
        int key = keyList.get(order);
        return orderMap.get(key);
    }

}
