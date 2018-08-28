package io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia;

import io.github.oleksivio.telegram.bot.core.model.ITelegram;

public interface InputMedia extends ITelegram {

    String getType();

    void setType(String type);

    String getMedia();

    void setMedia(String media);

    String getCaption();

    void setCaption(String caption);

    String getParseMode();

    void setParseMode(String parseMode);

}
