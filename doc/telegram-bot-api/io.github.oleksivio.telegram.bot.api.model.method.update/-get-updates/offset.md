[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.update](../index.md) / [GetUpdates](index.md) / [offset](./offset.md)

# offset

`val offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`

offset [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalIdentifier of the first update to be returned. Must be greater by one than the highest among the identifiers of previously received updates. By default, updates starting with the earliest unconfirmed update are returned. An update is considered confirmed as soon as getUpdates is called with an offset higher than its update_id. The negative offset can be specified to longPolling updates starting from -offset update from the end of the updates queue. All previous updates will forgotten.

