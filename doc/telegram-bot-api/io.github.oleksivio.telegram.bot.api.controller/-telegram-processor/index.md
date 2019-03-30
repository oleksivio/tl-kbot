[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.controller](../index.md) / [TelegramProcessor](./index.md)

# TelegramProcessor

`interface TelegramProcessor`

[TelegramProcessor](./index.md) interface allowed setup webhook receiver

Realisation of webhook variant of [receiving updates](https://core.telegram.org/bots/api#getting-updates)

Example:

``` kotlin
@RestController
class TelegramWebhookReceiver(private val processor: TelegramProcessor) {

@RequestMapping(path = ["/receive"])
fun receiver(update: Update): String {
    processor.receive(update)
    return "OK"
}

}
```

### Functions

| Name | Summary |
|---|---|
| [receive](receive.md) | `abstract fun receive(update: `[`Update`](../../io.github.oleksivio.telegram.bot.api.model.objects/-update/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Function to receive telegram update |
