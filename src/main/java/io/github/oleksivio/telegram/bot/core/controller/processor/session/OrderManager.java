package io.github.oleksivio.telegram.bot.core.controller.processor.session;

import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OrderManager {
    private static final Integer INACTIVE_VALUE = -1;
    private final Map<Integer, List<Handler>> handlerMap = new HashMap<>();
    private final Map<Long, Integer> orderMap = new ConcurrentHashMap<>();
    private final List<Integer> keyList = new ArrayList<>();

    public OrderManager(Map<Integer, List<Handler>> handlerMap) {
        this.handlerMap.putAll(handlerMap);
        keyList.addAll(handlerMap.keySet());
        keyList.sort(Integer::compareTo);
    }

    public boolean isActive(long id) {
        return orderMap.containsKey(id);
    }

    void next(long id) {
        int order = orderMap.computeIfAbsent(id, aLong -> INACTIVE_VALUE);
        order++;
        if (order >= keyList.size()) {
            reset(id);
        }
        else {
            orderMap.put(id, order);
        }
    }

    void reset(long id) {
        orderMap.remove(id);
    }

    List<Handler> getCurrent(long id) {
        int order = orderMap.get(id);
        int key = keyList.get(order);
        return handlerMap.get(key);
    }

}
