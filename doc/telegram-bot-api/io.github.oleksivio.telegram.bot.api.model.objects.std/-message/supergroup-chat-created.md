[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std](../index.md) / [Message](index.md) / [supergroupChatCreated](./supergroup-chat-created.md)

# supergroupChatCreated

`var supergroupChatCreated: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`

To setup filter(only for reply message):

BooleanFilter supergroupChatCreated supergroup_chat_created True Optional. Service message: the supergroup has
been created. This field can‘t be received in a message coming through updates, because bot can’t be a member of a
supergroup when it is created. It can only be found in reply_to_message if someone replies to a very first message
in a directly created supergroup.

