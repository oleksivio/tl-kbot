[telegram-bot-api](../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.info](./index.md)

## Package io.github.oleksivio.telegram.bot.api.model.method.info

Package contain all telegram server actions which could be used for 
send or receive special information(chat id, bot info, user profile photos, etc) to telegram server

### Types

| Name | Summary |
|---|---|
| [GetChatById](-get-chat-by-id/index.md) | `data class GetChatById : ChatAction<`[`Chat`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-chat/index.md)`>` |
| [GetChatByUsername](-get-chat-by-username/index.md) | `data class GetChatByUsername : Action<`[`Chat`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-chat/index.md)`>` |
| [GetMe](-get-me/index.md) | `class GetMe : Action<`[`User`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`>` |
| [GetUserProfilePhotos](-get-user-profile-photos/index.md) | `data class GetUserProfilePhotos : Action<`[`UserProfilePhotos`](../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-user-profile-photos/index.md)`>` |
