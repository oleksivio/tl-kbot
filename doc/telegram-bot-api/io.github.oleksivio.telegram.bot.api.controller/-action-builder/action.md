[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.controller](../index.md) / [ActionBuilder](index.md) / [action](./action.md)

# action

`abstract fun <RES> action(initBlock: `[`ActionCreate`](../-action-create.md)`<`[`RES`](action.md#RES)`>): `[`ActionErrorListener`](../-action-error-listener/index.md)`<`[`RES`](action.md#RES)`>`

### Parameters

`initBlock` -
* Action initializer which create [ActionCreate](../-action-create.md)

**Return**
[ActionErrorListener](../-action-error-listener/index.md)

`abstract fun <RES> action(action: Action<`[`RES`](action.md#RES)`>): `[`ActionErrorListener`](../-action-error-listener/index.md)`<`[`RES`](action.md#RES)`>`

### Parameters

`action` -
* action object

**Return**
[ActionErrorListener](../-action-error-listener/index.md)

