package ru.ioleksiv.telegram.bot.api.model.method.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

import java.util.List;

public class GetUpdatesApi extends RunnableAction<List<Update>> {
    private static final String METHOD = "getUpdates";
    @JsonProperty("offset")
    private int offset = 0;

    public GetUpdatesApi(Networker networker) {
        super(METHOD, networker);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String getMethod() {
        return METHOD;
    }

    @Override
    protected Class<? extends CommonResponse<List<Update>>> getResultWrapperClass() {
        return ResponseCollection.UpdatesArrayResponse.class;
    }

    @Override
    public GetUpdatesApi setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }

}
