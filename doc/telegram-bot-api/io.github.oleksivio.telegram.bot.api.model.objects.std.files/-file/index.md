[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.files](../index.md) / [File](./index.md)

# File

`data class File : ITelegram`

[File](https://core.telegram.org/bots/api/#files)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `File(fileId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, fileSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, filePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[File](https://core.telegram.org/bots/api/#files) |

### Properties

| Name | Summary |
|---|---|
| [fileId](file-id.md) | `var fileId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>file_id String Unique identifier for this file |
| [filePath](file-path.md) | `var filePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>file_path [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. File path. Use https://api.telegram.org/file/bot/&lt;file_path&gt; to get the file. |
| [fileSize](file-size.md) | `var fileSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>file_size Integer Optional. File size, if known |
