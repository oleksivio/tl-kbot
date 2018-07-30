package ru.ioleksiv.telegram.bot.core.model.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.files.File;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getfile">getFile</a>
 */
public class GetFile extends RunnableAction<File> {
    private static final String METHOD = "getFile";
    /**
     * file_id	String		File identifier to get info about
     */
    @JsonProperty("file_id")
    private String fileId = null;

    public GetFile(Networker networker) {
        super(METHOD, networker);
    }

    public String getFileId() {
        return fileId;
    }

    public GetFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<File>> getResultWrapperClass() {
        return ResponseCollection.FileResponse.class;
    }
}
