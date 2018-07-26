package ru.ioleksiv.telegram.bot.core.model.telegram.method.location;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.EditAction;

/**
 * https://core.telegram.org/bots/api#stopmessagelivelocation
 */
public abstract class StopMessageLiveLocation<RES > extends EditAction<RES > {
    private static final String METHOD = "stopMessageLiveLocation";

    StopMessageLiveLocation(Networker networker) {
        super(METHOD, networker);
    }

}
