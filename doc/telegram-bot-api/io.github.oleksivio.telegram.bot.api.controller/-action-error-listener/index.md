[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.controller](../index.md) / [ActionErrorListener](./index.md)

# ActionErrorListener

`interface ActionErrorListener<RES>`

[ActionBuilder](../-action-builder/index.md) interface for set [ServerErrorListener](../../io.github.oleksivio.telegram.bot.api.model/-server-error-listener.md)
or send telegram api action

### Functions

| Name | Summary |
|---|---|
| [errorListener](error-listener.md) | `abstract fun errorListener(serverErrorListener: `[`ServerErrorListener`](../../io.github.oleksivio.telegram.bot.api.model/-server-error-listener.md)`): `[`ActionSend`](../-action-send/index.md)`<`[`RES`](index.md#RES)`>` |
| [send](send.md) | `abstract fun send(): `[`RES`](index.md#RES)`?`<br>Send action |
