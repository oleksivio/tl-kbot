# Package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

Annotations that used for filtering incoming update object. 

# Package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

Package contains composite telegram types filters

# Package io.github.oleksivio.telegram.bot.api.annotations.receiver

Package contains all available receivers. Receiver annotation used for 
mark function to receive incoming telegram object.

For example [@MessageReceiver][io.github.oleksivio.telegram.bot.api.annotations.receiver.MessageReceiver]
is used for receive [Message][io.github.oleksivio.telegram.bot.api.model.objects.std.Message] by annotated function

Function annotated with receiver must return [HandleResult][io.github.oleksivio.telegram.bot.api.model.result.HandlerResult] or [Unit]

# Package io.github.oleksivio.telegram.bot.api.model.method.notify

Package contain all telegram server notify actions

# Package io.github.oleksivio.telegram.bot.api.model.method.file

Package contain all telegram server interactions with files

# Package io.github.oleksivio.telegram.bot.api.model.method.game

Package contain all telegram server game actions

# Package io.github.oleksivio.telegram.bot.api.model.method.group

Package contain all telegram server group chat actions

# Package io.github.oleksivio.telegram.bot.api.model.method.info

Package contain all telegram server actions which could be used for 
send or receive special information(chat id, bot info, user profile photos, etc) to telegram server

# Package io.github.oleksivio.telegram.bot.api.model.method.inline

Package contain all telegram server inline actions

# Package io.github.oleksivio.telegram.bot.api.model.method.location

Package contain all telegram server location actions

# Package io.github.oleksivio.telegram.bot.api.model.method.message

Package contain all telegram server message actions(send, edit, delete)

# Package io.github.oleksivio.telegram.bot.api.model.method.passport

Package contain all telegram server passport actions

# Package io.github.oleksivio.telegram.bot.api.model.method.payments

Package contain all telegram server payments actions

# Package io.github.oleksivio.telegram.bot.api.model.method.sticker

Package contain all telegram server sticker actions

# Package io.github.oleksivio.telegram.bot.api.model.method.update

Package contain all telegram server update actions (setWebhook, getUpdates, etc)
