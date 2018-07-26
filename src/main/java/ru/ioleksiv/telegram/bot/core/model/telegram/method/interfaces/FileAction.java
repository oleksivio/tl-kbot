package ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public abstract class FileAction extends FormattedMessageAction {

    /**
     * caption	String	Optional	File caption (may also be used when resending file by file_id),
     * 0-200 characters
     */
    @JsonProperty("caption")
    private String caption = null;

    protected FileAction(String method, Networker networker) {
        super(method, networker);
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
