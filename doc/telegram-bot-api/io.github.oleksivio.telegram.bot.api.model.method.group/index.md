[telegram-bot-api](../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.group](./index.md)

## Package io.github.oleksivio.telegram.bot.api.model.method.group

### Types

| Name | Summary |
|---|---|
| [DeleteChatPhoto](-delete-chat-photo/index.md) | `data class DeleteChatPhoto : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [DeleteChatStickerSet](-delete-chat-sticker-set/index.md) | `data class DeleteChatStickerSet : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [ExportChatInviteLink](-export-chat-invite-link/index.md) | `class ExportChatInviteLink : ChatAction<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [GetChat](-get-chat/index.md) | `data class GetChat : ChatAction<`[`Chat`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-chat/index.md)`>` |
| [GetChatAdministrators](-get-chat-administrators/index.md) | `data class GetChatAdministrators : ChatAction<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ChatMember`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-chat-member/index.md)`>>` |
| [GetChatMember](-get-chat-member/index.md) | `data class GetChatMember : ChatAction<`[`ChatMember`](../io.github.oleksivio.telegram.bot.api.model.objects.std/-chat-member/index.md)`>` |
| [GetChatMembersCount](-get-chat-members-count/index.md) | `data class GetChatMembersCount : ChatAction<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [KickChatMember](-kick-chat-member/index.md) | `data class KickChatMember : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [LeaveChat](-leave-chat/index.md) | `data class LeaveChat : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [PinChatMessage](-pin-chat-message/index.md) | `data class PinChatMessage : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [PromoteChatMember](-promote-chat-member/index.md) | `data class PromoteChatMember : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [RestrictChatMember](-restrict-chat-member/index.md) | `data class RestrictChatMember : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [SetChatDescription](-set-chat-description/index.md) | `data class SetChatDescription : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [SetChatPhoto](-set-chat-photo/index.md) | `data class SetChatPhoto : UploadFile<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [SetChatStickerSet](-set-chat-sticker-set/index.md) | `data class SetChatStickerSet : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [SetChatTitle](-set-chat-title/index.md) | `data class SetChatTitle : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [UnbanChatMember](-unban-chat-member/index.md) | `data class UnbanChatMember : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [UnpinChatMessage](-unpin-chat-message/index.md) | `data class UnpinChatMessage : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
