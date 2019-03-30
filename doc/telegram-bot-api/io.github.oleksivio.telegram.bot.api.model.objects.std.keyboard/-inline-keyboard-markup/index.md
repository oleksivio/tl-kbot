[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard](../index.md) / [InlineKeyboardMarkup](./index.md)

# InlineKeyboardMarkup

`data class InlineKeyboardMarkup : `[`IKeyboard`](../-i-keyboard.md)

[InlineKeyboardMarkup](https://core.telegram.org/bots/api/#inlinekeyboardmarkup)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineKeyboardMarkup(inlineKeyboard: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`InlineButtonRow`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row/-inline-button-row/index.md)`> = mutableListOf(InlineButtonRow()))`<br>[InlineKeyboardMarkup](https://core.telegram.org/bots/api/#inlinekeyboardmarkup) |

### Properties

| Name | Summary |
|---|---|
| [inlineKeyboard](inline-keyboard.md) | `var inlineKeyboard: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`InlineButtonRow`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row/-inline-button-row/index.md)`>`<br>inline_keyboard Array of Array of InlineKeyboardButton Array of button rows, each represented by an Array of InlineKeyboardButton objects |

### Functions

| Name | Summary |
|---|---|
| [add](add.md) | `fun add(row: `[`InlineButtonRow`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row/-inline-button-row/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
