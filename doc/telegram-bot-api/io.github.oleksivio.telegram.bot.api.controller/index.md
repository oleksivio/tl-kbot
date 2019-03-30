[telegram-bot-api](../index.md) / [io.github.oleksivio.telegram.bot.api.controller](./index.md)

## Package io.github.oleksivio.telegram.bot.api.controller

### Types

| Name | Summary |
|---|---|
| [ActionBuilder](-action-builder/index.md) | `interface ActionBuilder`<br>[ActionBuilder](-action-builder/index.md) interface for prepare telegram api action |
| [ActionErrorListener](-action-error-listener/index.md) | `interface ActionErrorListener<RES>`<br>[ActionBuilder](-action-builder/index.md) interface for set [ServerErrorListener](../io.github.oleksivio.telegram.bot.api.model/-server-error-listener.md) or send telegram api action |
| [ActionSend](-action-send/index.md) | `interface ActionSend<RES>`<br>[ActionSend](-action-send/index.md) interface for send telegram api action |
| [TelegramProcessor](-telegram-processor/index.md) | `interface TelegramProcessor`<br>[TelegramProcessor](-telegram-processor/index.md) interface allowed setup webhook receiver |
| [TelegramUpdater](-telegram-updater/index.md) | `interface TelegramUpdater`<br>[TelegramUpdater](-telegram-updater/index.md) interface allowed load new updates from server |

### Type Aliases

| Name | Summary |
|---|---|
| [ActionCreate](-action-create.md) | `typealias ActionCreate<RES> = () -> Action<`[`RES`](-action-create.md#RES)`>`<br>Callback to initialize action |
| [UpdateErrorListener](-update-error-listener.md) | `typealias UpdateErrorListener = (update: `[`Update`](../io.github.oleksivio.telegram.bot.api.model.objects/-update/index.md)`, onProcessException: `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
