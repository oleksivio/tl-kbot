[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.files](../index.md) / [Document](./index.md)

# Document

`data class Document : ITelegram`

[Document](https://core.telegram.org/bots/api/#document)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Document(fileId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, thumb: `[`PhotoSize`](../-photo-size/index.md)`? = null, fileName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, mimeType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, fileSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)`<br>[Document](https://core.telegram.org/bots/api/#document) |

### Properties

| Name | Summary |
|---|---|
| [fileId](file-id.md) | `var fileId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>file_id String Unique identifier for this files |
| [fileName](file-name.md) | `var fileName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [fileSize](file-size.md) | `var fileSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>To setup filter: |
| [mimeType](mime-type.md) | `var mimeType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [thumb](thumb.md) | `var thumb: `[`PhotoSize`](../-photo-size/index.md)`?`<br>To setup filter: |
