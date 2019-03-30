[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.controller](../index.md) / [TelegramUpdater](./index.md)

# TelegramUpdater

`interface TelegramUpdater`

[TelegramUpdater](./index.md) interface allowed load new updates from server

Realisation of long polling variant of [receiving updates](https://core.telegram.org/bots/api#getting-updates)

Example:

``` kotlin
@Service
class UpdaterSchedule(private val updater: TelegramUpdater) {

    @Scheduled(fixedDelay = 1_500L)
    fun upd() = updater.longPolling()

}
```

Also you could add [UpdateErrorListener](../-update-error-listener.md) callback to handle errors when getting updates

Example:

``` kotlin
@Component
class ErrorListener : UpdateErrorListener {

    override fun invoke(update: Update, onProcessException: Exception) = println(onProcessException.message)

}
```

### Functions

| Name | Summary |
|---|---|
| [longPolling](long-polling.md) | `abstract fun longPolling(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Function to run [long polling](https://core.telegram.org/bots/api#getupdates) |
