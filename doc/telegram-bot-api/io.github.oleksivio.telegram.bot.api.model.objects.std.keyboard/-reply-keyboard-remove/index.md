[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard](../index.md) / [ReplyKeyboardRemove](./index.md)

# ReplyKeyboardRemove

`data class ReplyKeyboardRemove : `[`IKeyboard`](../-i-keyboard.md)

[ReplyKeyboardRemove](https://core.telegram.org/bots/api/#replykeyboardremove)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ReplyKeyboardRemove(removeKeyboard: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, isSelective: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false)`<br>[ReplyKeyboardRemove](https://core.telegram.org/bots/api/#replykeyboardremove) |

### Properties

| Name | Summary |
|---|---|
| [isSelective](is-selective.md) | `var isSelective: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>selective Boolean Optional. Use this parameter if you want to remove the keyboard for specific users only. Targets: |
| [removeKeyboard](remove-keyboard.md) | `var removeKeyboard: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>remove_keyboard True Requests clients to remove the custom keyboard (user will not be able to summon this keyboard; if you want to hide the keyboard from sight but keep it accessible, use one_time_keyboard in ReplyKeyboardMarkup) |
