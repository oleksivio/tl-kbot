package ru.ioleksiv.telegram.bot.core.utils;

public final class IterableUtils {

    public static boolean checkAll(Iterable<String> items, ICondition condition) {
        for (String item : items) {
            if (condition.check(item)) {
                return true;
            }
        }

        return false;
    }


    public interface ICondition {
        boolean check(String item);
    }
}
