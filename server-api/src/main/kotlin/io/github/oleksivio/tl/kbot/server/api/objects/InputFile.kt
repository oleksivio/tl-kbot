package io.github.oleksivio.tl.kbot.server.api.objects

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import java.io.File
import java.io.InputStream

@JsonSerialize(using = InputFileJacksonSerializer::class, `as` = String::class)
sealed class InputFile

class InputFileIdImpl(val id: String) : InputFile()

class InputFileUrlImpl(val url: String) : InputFile()

class InputFileMultipartFormImpl() : InputFile() {

    var attachName: String? = null
        private set

    @JsonIgnore
    var mediaName: String? = null
        private set ///< Name of the media to upload
    @JsonIgnore
    var newMediaFile: File? = null
        private set ///< New media file
    @JsonIgnore
    var newMediaStream: InputStream? = null
        private set ///< New media stream
    @JsonIgnore
    var isNew: Boolean = false
        private set ///< True if the file is new, false if it is a file_id

    constructor(attachName: String) : this() {
        setMedia(attachName)
    }

    /**
     * Constructor to set a new file
     *
     * @param mediaFile File to send
     * @param fileName Name of the file
     */
    constructor(mediaFile: File, fileName: String) : this() {
        setMedia(mediaFile, fileName)
    }

    /**
     * Constructor to set a new file as stream
     *
     * @param mediaStream File to send
     * @param fileName Name of the file
     */
    constructor(mediaStream: InputStream, fileName: String) : this() {
        setMedia(mediaStream, fileName)
    }

    /**
     * Use this setter to send new file.
     * @param mediaFile File to send
     * @param fileName Name of the file
     * @return This object
     */
    fun setMedia(mediaFile: File, fileName: String): InputFile {
        this.newMediaFile = mediaFile
        this.mediaName = fileName
        this.attachName = "attach://$fileName"
        this.isNew = true
        return this
    }

    /**
     * Use this setter to send new file as stream.
     * @param mediaStream File to send
     * @param fileName Name of the file
     * @return This object
     */
    fun setMedia(mediaStream: InputStream, fileName: String): InputFile {
        this.newMediaStream = mediaStream
        this.mediaName = fileName
        this.attachName = "attach://$fileName"
        this.isNew = true
        return this
    }

    fun setMedia(attachName: String): InputFile {
        this.attachName = attachName
        this.isNew = false
        return this
    }
}