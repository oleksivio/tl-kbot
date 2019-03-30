[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.update](../index.md) / [SetWebhook](index.md) / [maxConnections](./max-connections.md)

# maxConnections

`val maxConnections: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`

max_connections [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) Optional Maximum allowed number of simultaneous HTTPS connections
to the webhook for update delivery, 1-100. Defaults to 40. Use lower values to limit the load
on your bot‘s server, and higher values to increase your bot’s throughput.

