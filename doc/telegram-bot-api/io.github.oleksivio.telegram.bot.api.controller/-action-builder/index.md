[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.controller](../index.md) / [ActionBuilder](./index.md)

# ActionBuilder

`interface ActionBuilder`

All bot interactions with telegram server should send using [ActionBuilder](./index.md). We name it actions.
Action in this library is the object that represent telegram server method.
For example [io.github.oleksivio.telegram.bot.api.model.method.message.SendMessage](../../io.github.oleksivio.telegram.bot.api.model.method.message/-send-message/index.md) object action
are used for call [SendMessage](https://core.telegram.org/bots/api/#sendmessage) method.

All actions are located in  [io.github.oleksivio.telegram.bot.api.model.method](#) package

[ActionBuilder](./index.md) interface for create telegram api action.

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
