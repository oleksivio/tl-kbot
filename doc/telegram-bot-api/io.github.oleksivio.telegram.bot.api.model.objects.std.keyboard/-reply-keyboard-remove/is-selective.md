[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard](../index.md) / [ReplyKeyboardRemove](index.md) / [isSelective](./is-selective.md)

# isSelective

`var isSelective: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

selective Boolean Optional. Use this parameter if you want to remove the keyboard for specific users only. Targets:

1. users that are @mentioned in the text of the Message object; 2) if the bot's message is a reply (has
reply_to_message_id), sender of the original message.
