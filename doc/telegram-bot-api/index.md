[telegram-bot-api](./index.md)

Spring Kotlin library for easy and fast creating telegram bot's

## Easy start

* [Receivers](io.github.oleksivio.telegram.bot.api.annotations.receiver/index.md) are used for mark method as
receiver of special update type
* Filters are used for filter input update from telegram. There are two types:
  * [Primitive](io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/index.md)
  * [Composite](io.github.oleksivio.telegram.bot.api.annotations.filter.composite/index.md)
* [ActionBuilder](io.github.oleksivio.telegram.bot.api.controller/-action-builder/index.md) - used for send any action to telegram 
server. (SendMessage, GetMe, etc)
* [TelegramProcessor](io.github.oleksivio.telegram.bot.api.controller/-telegram-processor/index.md) - used for receive update from 
 telegram when you use webhook
* [TelegramUpdater](io.github.oleksivio.telegram.bot.api.controller/-telegram-updater/index.md) - used for receive update from 
telegram when you use long polling
* [Session](io.github.oleksivio.telegram.bot.api.annotations.behavior/-session/index.md) - used for create simple session 
controller, which can receive any count of user messages in described order

### Packages

| Name | Summary |
|---|---|
| [io.github.oleksivio.telegram.bot.api](io.github.oleksivio.telegram.bot.api/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.annotations.behavior](io.github.oleksivio.telegram.bot.api.annotations.behavior/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](io.github.oleksivio.telegram.bot.api.annotations.filter.composite/index.md) | Package contains composite telegram types filters |
| [io.github.oleksivio.telegram.bot.api.annotations.filter.primitive](io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/index.md) | Annotations that used for filtering incoming update object.  |
| [io.github.oleksivio.telegram.bot.api.annotations.receiver](io.github.oleksivio.telegram.bot.api.annotations.receiver/index.md) | Package contains all available receivers. Receiver annotation used for  mark function to receive incoming telegram object. |
| [io.github.oleksivio.telegram.bot.api.controller](io.github.oleksivio.telegram.bot.api.controller/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model](io.github.oleksivio.telegram.bot.api.model/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.annotation](io.github.oleksivio.telegram.bot.api.model.annotation/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.annotation.validator](io.github.oleksivio.telegram.bot.api.model.annotation.validator/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl](io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.file](io.github.oleksivio.telegram.bot.api.model.method.file/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.game](io.github.oleksivio.telegram.bot.api.model.method.game/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.group](io.github.oleksivio.telegram.bot.api.model.method.group/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.info](io.github.oleksivio.telegram.bot.api.model.method.info/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.inline](io.github.oleksivio.telegram.bot.api.model.method.inline/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.location](io.github.oleksivio.telegram.bot.api.model.method.location/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.message](io.github.oleksivio.telegram.bot.api.model.method.message/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.passport](io.github.oleksivio.telegram.bot.api.model.method.passport/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.payments](io.github.oleksivio.telegram.bot.api.model.method.payments/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.sticker](io.github.oleksivio.telegram.bot.api.model.method.sticker/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.method.update](io.github.oleksivio.telegram.bot.api.model.method.update/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects](io.github.oleksivio.telegram.bot.api.model.objects/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.inline](io.github.oleksivio.telegram.bot.api.model.objects.inline/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.inline.messagecontent](io.github.oleksivio.telegram.bot.api.model.objects.inline.messagecontent/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult](io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.passport](io.github.oleksivio.telegram.bot.api.model.objects.passport/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.passport.errors](io.github.oleksivio.telegram.bot.api.model.objects.passport.errors/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.payments](io.github.oleksivio.telegram.bot.api.model.objects.payments/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.std](io.github.oleksivio.telegram.bot.api.model.objects.std/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.std.files](io.github.oleksivio.telegram.bot.api.model.objects.std.files/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia](io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.std.game](io.github.oleksivio.telegram.bot.api.model.objects.std.game/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard](io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button](io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row](io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.objects.std.sticker](io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/index.md) |  |
| [io.github.oleksivio.telegram.bot.api.model.result](io.github.oleksivio.telegram.bot.api.model.result/index.md) |  |

### Index

[All Types](alltypes/index.md)