[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.update](../index.md) / [GetUpdates](index.md) / [allowedUpdates](./allowed-updates.md)

# allowedUpdates

`val allowedUpdates: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?`

allowed_updates Array of [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional List the types of updates you want your bot to receive.
For example, specify [“message”,“edited_channel_post”,“callback_query”](#) to only receive updates of these types.
See Update for a complete list of available update types.
Specify an empty list to receive all updates regardless of type (default).
If not specified (null), the previous setting will be used.

Please note that this parameter doesn't affect updates created before the call to the getUpdates, so unwanted
updates may be received for a short period of time.

