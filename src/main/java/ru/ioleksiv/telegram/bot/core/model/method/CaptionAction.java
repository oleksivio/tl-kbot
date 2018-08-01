package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public abstract class CaptionAction extends FormattedMessageAction {

    /**
     * caption	String	Optional	File caption (may also be used when resending file by file_id),
     * 0-200 characters
     */
    @JsonProperty("caption")
    private String caption = null;

    protected CaptionAction(String method, Networker networker) {
        super(method, networker);
    }

    protected void pSetCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public abstract CaptionAction setCaption(String caption);
}
