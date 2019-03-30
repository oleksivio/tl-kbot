[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std](../index.md) / [Message](index.md) / [migrateFromChatId](./migrate-from-chat-id.md)

# migrateFromChatId

`var migrateFromChatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`

To setup filter:

NotNullFilter migrateFromChatId migrate_from_chat_id Integer Optional. The supergroup has been migrated from a
group with the specified identifier. This number may be greater than 32 bits and some programming languages may
have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or
double-precision float type are safe for storing this identifier.

