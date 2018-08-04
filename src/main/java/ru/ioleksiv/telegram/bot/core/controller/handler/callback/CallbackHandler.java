package ru.ioleksiv.telegram.bot.core.controller.handler.callback;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.Invoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.UnionFilter;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

public class CallbackHandler extends Handler<CallbackQuery> {
    public CallbackHandler(@NotNull Invoker invoker, @NotNull Unpacker<CallbackQuery> unpacker, @NotNull UnionFilter<CallbackQuery> unionFilter) {
        super(invoker, unpacker, unionFilter);
    }
//    private static final Logger LOGGER = LoggerFactory.getLogger(CallbackHandler.class);
//    private final Collection<String> startWith;
//    private final Collection<String> equalsWith;
//    private final Collection<String> endWith;
//    private final String regExp;

//    public CallbackHandler(@NotNull ActionBuilder actionBuilder,
//                           @NotNull Object classInstance,
//                           @NotNull Method method,
//                           @NotNull Collection<String> startWith,
//                           @NotNull Collection<String> equalWith,
//                           @NotNull Collection<String> endWith,
//                           String regExp) {
//        super(actionBuilder, classInstance, method, unpacker, checker);
//        this.startWith = startWith;
//        equalsWith = equalWith;
//        this.endWith = endWith;
//        this.regExp = regExp;
//    }
//
//    @Override
//    public CallbackQuery unpacker(@NotNull Update update) {
//        return update.getCallbackQuery();
//    }
//
//    @Override
//    protected boolean checker(@NotNull CallbackQuery argument) {
//        String data = argument.getData();
//
//        if (data == null) {
//            return false;
//        }
//
//        if (!startWith.isEmpty() && !IterableUtils.checkAll(startWith, data::startsWith)) {
//            return false;
//        }
//
//        if (!endWith.isEmpty() && !IterableUtils.checkAll(endWith, data::endsWith)) {
//            return false;
//        }
//
//        if (!equalsWith.isEmpty() && !IterableUtils.checkAll(equalsWith, data::equals)) {
//            return false;
//        }
//
//        if (!regExp.isEmpty() && !Pattern.matches(regExp, data)) {
//            return false;
//        }
//
//        return true;
//    }

}
