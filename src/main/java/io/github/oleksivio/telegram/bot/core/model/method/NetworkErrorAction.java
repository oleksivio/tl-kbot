package io.github.oleksivio.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;

import java.util.Optional;

public abstract class NetworkErrorAction<RES> extends Action<RES> {

    @JsonIgnore
    private NetworkError networkError = null;

    protected void pSetNetworkErrorListener(NetworkError onNetworkError) {
        networkError = onNetworkError;
    }

    @JsonIgnore
    Optional<NetworkError> getNetworkErrorListener() {
        return Optional.ofNullable(networkError);
    }

    @JsonIgnore
    public abstract NetworkErrorAction<RES> setNetworkErrorListener(NetworkError onNetworkError);

}
