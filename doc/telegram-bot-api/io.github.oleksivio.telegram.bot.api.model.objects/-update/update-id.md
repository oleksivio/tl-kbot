[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects](../index.md) / [Update](index.md) / [updateId](./update-id.md)

# updateId

`var updateId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)

update_id

[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)

The update's unique identifier. Update identifiers start from a certain positive number and increase sequentially.
This ID becomes especially handy if you’re using Webhooks, since it allows you to ignore repeated updates or to
restore the correct update sequence, should they get out of order. If there are no new updates for at least a week,
then identifier of the next update will be chosen randomly instead of sequentially.

