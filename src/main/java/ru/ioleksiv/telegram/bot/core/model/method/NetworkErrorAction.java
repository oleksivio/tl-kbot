package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.internal.jline.internal.Nullable;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;

public abstract class NetworkErrorAction<RES> extends Action<RES> {

    @JsonIgnore
    private NetworkError networkError = null;

    protected void pSetNetworkErrorListener(NetworkError onNetworkError) {
        networkError = onNetworkError;
    }

    @Nullable
    @JsonIgnore
    NetworkError getNetworkErrorListener() {
        return networkError;
    }

    @JsonIgnore
    public abstract NetworkErrorAction<RES> setNetworkErrorListener(NetworkError onNetworkError);

}
