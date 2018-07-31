package ru.ioleksiv.telegram.bot.core.model.method.file;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.UploadMessageFile;

public abstract class UploadMediaFile extends UploadMessageFile {
    /**
     * caption	String	Optional	File caption (may also be used when resending file by file_id),
     * 0-200 characters
     */
    protected static final String CAPTION_KEY = "caption";
    /**
     * parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in your bot's message.
     */
    protected static final String PARSE_MODE_KEY = "parse_mode";

    protected UploadMediaFile(String method, Networker networker) {
        super(method, networker);
    }
}
