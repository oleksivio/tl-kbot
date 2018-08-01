package ru.ioleksiv.telegram.bot.core.model.method;

import org.jetbrains.annotations.Nullable;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.LinkedMultiValueMap;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public abstract class UploadFile<RES> extends NetworkErrorAction<RES> {
    private static final String METHOD_KEY = "method";

    private final Networker networker;
    private final LinkedMultiValueMap<String, Object> requestMap;

    protected UploadFile(String method, Networker networker) {
        this.networker = networker;
        requestMap = new LinkedMultiValueMap<>();
        requestMap.add(METHOD_KEY, method);
    }

    @Override
    @Nullable
    public RES send() {

        CommonResponse<RES> uploadResponse = networker.upload(requestMap,
                                                              getResultWrapperClass(),
                                                              getNetworkErrorListener());
        if (uploadResponse == null) {
            return null;
        }

        return uploadResponse.get();
    }

    protected void putFile(String key, FileSystemResource file) {
        putObject(key, file);
    }

    protected void putObject(String key, Object object) {
        if (object != null) {
            requestMap.add(key, object);
        }
    }

    protected void putInt(String key, Integer integerValue) {
        putObject(key, integerValue);
    }

    protected void putLong(String key, Long longValue) {
        putObject(key, longValue);
    }

    protected void putString(String key, String stringValue) {
        requestMap.add(key, stringValue);
    }

    protected void putBool(String key, Boolean booleanValue) {
        putObject(key, booleanValue);
    }

}
