[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.controller](../index.md) / [ActionBuilder](./index.md)

# ActionBuilder

`interface ActionBuilder`

All bot interactions with telegram server named actions.
Actions is object which used by [ActionBuilder](./index.md) for call telegram bot api method.

For example:

[io.github.oleksivio.telegram.bot.api.model.method.message.SendMessage](../../io.github.oleksivio.telegram.bot.api.model.method.message/-send-message/index.md) object action
are used for call [SendMessage](https://core.telegram.org/bots/api/#sendmessage) method.

All actions are located in next packages:

* [io.github.oleksivio.telegram.bot.api.model.method.notify](../../io.github.oleksivio.telegram.bot.api.model.method.notify/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.file](../../io.github.oleksivio.telegram.bot.api.model.method.file/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.game](../../io.github.oleksivio.telegram.bot.api.model.method.game/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.group](../../io.github.oleksivio.telegram.bot.api.model.method.group/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.info](../../io.github.oleksivio.telegram.bot.api.model.method.info/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.inline](../../io.github.oleksivio.telegram.bot.api.model.method.inline/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.location](../../io.github.oleksivio.telegram.bot.api.model.method.location/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.message](../../io.github.oleksivio.telegram.bot.api.model.method.message/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.passport](../../io.github.oleksivio.telegram.bot.api.model.method.passport/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.payments](../../io.github.oleksivio.telegram.bot.api.model.method.payments/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.sticker](../../io.github.oleksivio.telegram.bot.api.model.method.sticker/index.md)
* [io.github.oleksivio.telegram.bot.api.model.method.update](../../io.github.oleksivio.telegram.bot.api.model.method.update/index.md)

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
