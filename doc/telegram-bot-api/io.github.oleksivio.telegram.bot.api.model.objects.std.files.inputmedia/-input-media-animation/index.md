[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia](../index.md) / [InputMediaAnimation](./index.md)

# InputMediaAnimation

`data class InputMediaAnimation : `[`InputMedia`](../-input-media/index.md)

[InputMediaAnimation](https://core.telegram.org/bots/api/#inputmediaanimation)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InputMediaAnimation(type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, media: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, thumb: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, width: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, height: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)`<br>[InputMediaAnimation](https://core.telegram.org/bots/api/#inputmediaanimation) |

### Properties

| Name | Summary |
|---|---|
| [caption](caption.md) | `var caption: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>caption [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Caption of the animation to be sent, 0-200 characters |
| [duration](duration.md) | `var duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>duration Integer Optional. Animation duration |
| [height](height.md) | `var height: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>height Integer Optional. Animation height |
| [media](media.md) | `var media: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>media String File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet, or pass "attach://&lt;file_attach_name&gt;" to upload a new one using multipart/form-data under &lt;file_attach_name&gt; name. &lt;/file_attach_name&gt;&lt;/file_attach_name&gt; |
| [parseMode](parse-mode.md) | `var parseMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>parse_mode [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption. |
| [thumb](thumb.md) | `var thumb: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>thumb InputFile or [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Thumbnail of the file sent. The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a new file, so you can pass “attach://&lt;file_attach_name&gt;” if the thumbnail was uploaded using multipart/form-data under &lt;file_attach_name&gt;. &lt;/file_attach_name&gt;&lt;/file_attach_name&gt; |
| [type](type.md) | `var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>type String Type of the result, must be animation |
| [width](width.md) | `var width: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>width Integer Optional. Animation width |
