package ru.ioleksiv.telegram.bot.core.model.method.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

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
    public Class<? extends CommonResponse<List<Update>>> getResultWrapperClass() {
        return ResponseCollection.UpdatesArrayResponse.class;
    }

}
