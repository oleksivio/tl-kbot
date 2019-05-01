# Module telegram-bot-api

Spring Kotlin library for easy and fast creating telegram bot's

## Easy start
- [Receivers][io.github.oleksivio.telegram.bot.api.annotations.receiver] are used for mark method as
receiver of special update type
- Filters are used for filter input update from telegram. There are two types:
  * [Primitive][io.github.oleksivio.telegram.bot.api.annotations.filter.primitive] 
  * [Composite][io.github.oleksivio.telegram.bot.api.annotations.filter.composite]
  

If there is two filter with same conditions, both of it will receive same update.

- [ActionBuilder][io.github.oleksivio.telegram.bot.api.controller.ActionBuilder] are used for send any action to telegram 
server. (SendMessage, GetMe, etc)
- [TelegramProcessor][io.github.oleksivio.telegram.bot.api.controller.TelegramProcessor] are used for receive update from 
 telegram when you use webhook
- [TelegramUpdater][io.github.oleksivio.telegram.bot.api.controller.TelegramUpdater] are used for receive update from 
telegram when you use long polling
- [Session][io.github.oleksivio.telegram.bot.api.annotations.behavior.Session] are used for create simple session 
controller, which can receive any count of user messages in described order


