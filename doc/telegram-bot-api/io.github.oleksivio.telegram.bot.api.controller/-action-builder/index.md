[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.controller](../index.md) / [ActionBuilder](./index.md)

# ActionBuilder

`interface ActionBuilder`

[ActionBuilder](./index.md) interface for prepare telegram api action

[ActionErrorListener](../-action-error-listener/index.md) used for print error description

Example usage in spring rest controller:

``` kotlin
@RestController
class Sender(private val actionBuilder: ActionBuilder) {

@RequestMapping("/send")
fun greeting(@RequestParam(value = "msg") msg: String,
@RequestParam(value = "chatId") chatId: Long): Message = actionBuilder
.action {
     SendMessage(chatId, msg)
}
.errorListener { e -> println(e.errorDescription) }
.send() ?: Message(0)
}

```

### Functions

| Name | Summary |
|---|---|
| [action](action.md) | `abstract fun <RES> action(initBlock: `[`ActionCreate`](../-action-create.md)`<`[`RES`](action.md#RES)`>): `[`ActionErrorListener`](../-action-error-listener/index.md)`<`[`RES`](action.md#RES)`>`<br>`abstract fun <RES> action(action: Action<`[`RES`](action.md#RES)`>): `[`ActionErrorListener`](../-action-error-listener/index.md)`<`[`RES`](action.md#RES)`>` |
