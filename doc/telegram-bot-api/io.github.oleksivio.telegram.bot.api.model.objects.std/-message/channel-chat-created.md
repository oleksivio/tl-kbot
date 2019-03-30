[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std](../index.md) / [Message](index.md) / [channelChatCreated](./channel-chat-created.md)

# channelChatCreated

`var channelChatCreated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`

To setup filter(only for reply message):

BooleanFilter channelChatCreated channel_chat_created True Optional. Service message: the channel has been
created. This field can‘t be received in a message coming through updates, because bot can’t be a member of a
channel when it is created. It can only be found in reply_to_message if someone replies to a very first message in
a channel.

