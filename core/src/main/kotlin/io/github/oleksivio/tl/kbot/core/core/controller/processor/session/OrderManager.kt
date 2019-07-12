package io.github.oleksivio.tl.kbot.core.core.controller.processor.session

import io.github.oleksivio.tl.kbot.core.core.controller.handler.Handler
import java.util.*
import java.util.concurrent.ConcurrentHashMap

class OrderManager(handlerMap: Map<Int, List<Handler<*>>>, errorMap: Map<Int, Handler<*>>) {

    private val handlerMap = HashMap<Int, List<Handler<*>>>()
    private val errorMap = HashMap<Int, Handler<*>>()

    private val orderMap = ConcurrentHashMap<Long, Int>()

    private val keyList = mutableListOf<Int>()

    init {
        this.handlerMap.putAll(handlerMap)
        this.errorMap.putAll(errorMap)
        keyList.addAll(handlerMap.keys)
        keyList.sorted()
    }

    fun isActive(id: Long): Boolean {
        return orderMap.containsKey(id)
    }

    internal fun next(id: Long) {
        var order = orderMap.computeIfAbsent(id) { INACTIVE_VALUE }
        order++
        if (order >= keyList.size) {
            reset(id)
        } else {
            orderMap[id] = order
        }
    }

    internal fun reset(id: Long) {
        orderMap.remove(id)
    }

    internal fun getOrderHandlerList(id: Long): List<Handler<*>> {
        val order = orderMap[id] ?: throw IllegalStateException("Order can't be null")
        val key = keyList[order]
        return handlerMap[key] ?: listOf()
    }

    internal fun getErrorHandler(id: Long): Handler<*>? {
        val order = orderMap[id] ?: throw IllegalStateException("Order can't be null")
        val key = keyList[order]
        return errorMap[key]
    }

    companion object {
        private const val INACTIVE_VALUE = -1
    }

}
