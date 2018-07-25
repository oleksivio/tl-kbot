package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.files.inputmedia;

public interface InputMedia {

    String getType();

    void setType(String type);

    String getMedia();

    void setMedia(String media);

    String getCaption();

    void setCaption(String caption);

    String getParseMode();

    void setParseMode(String parseMode);

}
