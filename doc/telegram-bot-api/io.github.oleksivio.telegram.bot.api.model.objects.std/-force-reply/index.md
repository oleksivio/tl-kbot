[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std](../index.md) / [ForceReply](./index.md)

# ForceReply

`data class ForceReply : ITelegram`

[ForceReply](https://core.telegram.org/bots/api/#forcereply)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ForceReply(selective: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, isForceReply: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true)`<br>[ForceReply](https://core.telegram.org/bots/api/#forcereply) |

### Properties

| Name | Summary |
|---|---|
| [isForceReply](is-force-reply.md) | `val isForceReply: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>force_reply True Shows reply interface to the user, as if they manually selected the bot‘s message and tapped ’Reply' |
| [selective](selective.md) | `var selective: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>selective Boolean Optional. Use this parameter if you want to force reply from specific users only. Targets: 1) users that are @mentioned in the text of the Message object; 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message. |
