[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.annotation.validator](../index.md) / [FilterValidator](./index.md)

# FilterValidator

`abstract class FilterValidator<T : ITelegram>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FilterValidator(filterTarget: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`T`](index.md#T)`>, validator: Validator<`[`T`](index.md#T)`>)` |

### Properties

| Name | Summary |
|---|---|
| [filterTarget](filter-target.md) | `val filterTarget: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`T`](index.md#T)`>` |
| [validator](validator.md) | `val validator: Validator<`[`T`](index.md#T)`>` |

### Inheritors

| Name | Summary |
|---|---|
| [AnimationFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-animation-filter-validator/index.md) | `class AnimationFilterValidator : `[`FilterValidator`](./index.md)`<`[`Animation`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.game/-animation/index.md)`>` |
| [AudioFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-audio-filter-validator/index.md) | `class AudioFilterValidator : `[`FilterValidator`](./index.md)`<`[`Audio`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-audio/index.md)`>` |
| [CallbackQueryFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-callback-query-filter-validator/index.md) | `class CallbackQueryFilterValidator : `[`FilterValidator`](./index.md)`<`[`CallbackQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-callback-query/index.md)`>` |
| [ChatFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-chat-filter-validator/index.md) | `class ChatFilterValidator : `[`FilterValidator`](./index.md)`<`[`Chat`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-chat/index.md)`>` |
| [ChosenInlineResultFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-chosen-inline-result-filter-validator/index.md) | `class ChosenInlineResultFilterValidator : `[`FilterValidator`](./index.md)`<`[`ChosenInlineResult`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline/-chosen-inline-result/index.md)`>` |
| [ContactFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-contact-filter-validator/index.md) | `class ContactFilterValidator : `[`FilterValidator`](./index.md)`<`[`Contact`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-contact/index.md)`>` |
| [DocumentFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-document-filter-validator/index.md) | `class DocumentFilterValidator : `[`FilterValidator`](./index.md)`<`[`Document`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-document/index.md)`>` |
| [EncryptedCredentialsFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-encrypted-credentials-filter-validator/index.md) | `class EncryptedCredentialsFilterValidator : `[`FilterValidator`](./index.md)`<`[`EncryptedCredentials`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-encrypted-credentials/index.md)`>` |
| [EncryptedPassportElementFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-encrypted-passport-element-filter-validator/index.md) | `class EncryptedPassportElementFilterValidator : `[`FilterValidator`](./index.md)`<`[`EncryptedPassportElement`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-encrypted-passport-element/index.md)`>` |
| [GameFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-game-filter-validator/index.md) | `class GameFilterValidator : `[`FilterValidator`](./index.md)`<`[`Game`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.game/-game/index.md)`>` |
| [InlineQueryFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-inline-query-filter-validator/index.md) | `class InlineQueryFilterValidator : `[`FilterValidator`](./index.md)`<`[`InlineQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline/-inline-query/index.md)`>` |
| [InvoiceFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-invoice-filter-validator/index.md) | `class InvoiceFilterValidator : `[`FilterValidator`](./index.md)`<`[`Invoice`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-invoice/index.md)`>` |
| [LocationFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-location-filter-validator/index.md) | `class LocationFilterValidator : `[`FilterValidator`](./index.md)`<`[`Location`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-location/index.md)`>` |
| [MaskPositionFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-mask-position-filter-validator/index.md) | `class MaskPositionFilterValidator : `[`FilterValidator`](./index.md)`<`[`MaskPosition`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-mask-position/index.md)`>` |
| [MessageEntityFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-message-entity-filter-validator/index.md) | `class MessageEntityFilterValidator : `[`FilterValidator`](./index.md)`<`[`MessageEntity`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message-entity/index.md)`>` |
| [MessageFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-message-filter-validator/index.md) | `class MessageFilterValidator : `[`FilterValidator`](./index.md)`<`[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>` |
| [OrderInfoFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-order-info-filter-validator/index.md) | `class OrderInfoFilterValidator : `[`FilterValidator`](./index.md)`<`[`OrderInfo`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-order-info/index.md)`>` |
| [PasportDataFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-pasport-data-filter-validator/index.md) | `class PasportDataFilterValidator : `[`FilterValidator`](./index.md)`<`[`PassportData`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-passport-data/index.md)`>` |
| [PasportFileFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-pasport-file-filter-validator/index.md) | `class PasportFileFilterValidator : `[`FilterValidator`](./index.md)`<`[`PassportFile`](../../io.github.oleksivio.telegram.bot.api.model.objects.passport/-passport-file/index.md)`>` |
| [PhotoFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-photo-filter-validator/index.md) | `class PhotoFilterValidator : `[`FilterValidator`](./index.md)`<`[`PhotoSize`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-photo-size/index.md)`>` |
| [PreCheckoutQueryFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-pre-checkout-query-filter-validator/index.md) | `class PreCheckoutQueryFilterValidator : `[`FilterValidator`](./index.md)`<`[`PreCheckoutQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-pre-checkout-query/index.md)`>` |
| [ShippiingAddressFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-shippiing-address-filter-validator/index.md) | `class ShippiingAddressFilterValidator : `[`FilterValidator`](./index.md)`<`[`ShippingAddress`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-shipping-address/index.md)`>` |
| [ShippingQueryFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-shipping-query-filter-validator/index.md) | `class ShippingQueryFilterValidator : `[`FilterValidator`](./index.md)`<`[`ShippingQuery`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-shipping-query/index.md)`>` |
| [StickerFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-sticker-filter-validator/index.md) | `class StickerFilterValidator : `[`FilterValidator`](./index.md)`<`[`Sticker`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-sticker/index.md)`>` |
| [SuccessfulPaymentFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-successful-payment-filter-validator/index.md) | `class SuccessfulPaymentFilterValidator : `[`FilterValidator`](./index.md)`<`[`SuccessfulPayment`](../../io.github.oleksivio.telegram.bot.api.model.objects.payments/-successful-payment/index.md)`>` |
| [UserFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-user-filter-validator/index.md) | `class UserFilterValidator : `[`FilterValidator`](./index.md)`<`[`User`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`>` |
| [VenueFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-venue-filter-validator/index.md) | `class VenueFilterValidator : `[`FilterValidator`](./index.md)`<`[`Venue`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-venue/index.md)`>` |
| [VideoFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-video-filter-validator/index.md) | `class VideoFilterValidator : `[`FilterValidator`](./index.md)`<`[`Video`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-video/index.md)`>` |
| [VideoNoteFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-video-note-filter-validator/index.md) | `class VideoNoteFilterValidator : `[`FilterValidator`](./index.md)`<`[`VideoNote`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-video-note/index.md)`>` |
| [VoiceFilterValidator](../../io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl/-voice-filter-validator/index.md) | `class VoiceFilterValidator : `[`FilterValidator`](./index.md)`<`[`Voice`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files/-voice/index.md)`>` |
