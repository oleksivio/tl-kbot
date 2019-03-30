[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.inline](../index.md) / [AnswerInlineQuery](./index.md)

# AnswerInlineQuery

`class AnswerInlineQuery : Action<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

**See Also**

[answerInlineQuery](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AnswerInlineQuery(inlineQueryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, inlineQueryResults: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`InlineQueryResult`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult/-inline-query-result/index.md)`>, cacheTime: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, isPersonal: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, nextOffset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, switchPmText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, switchPmParameter: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [cacheTime](cache-time.md) | `val cacheTime: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>cache_time [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalThe maximum amount of time in seconds that the result of the inline query may be cached on the server. Defaults to 300. |
| [inlineQueryId](inline-query-id.md) | `val inlineQueryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>inline_query_id String Yes Unique identifier for the answered query |
| [inlineQueryResults](inline-query-results.md) | `val inlineQueryResults: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`InlineQueryResult`](../../io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult/-inline-query-result/index.md)`>`<br>results Array of InlineQueryResult Yes A JSON-serialized array of results for the inline query |
| [isPersonal](is-personal.md) | `val isPersonal: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>is_personal [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalPass True, if results may be cached on the server side only for the user that sent the query. By default, results may be returned to any user who sends the same query |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [nextOffset](next-offset.md) | `val nextOffset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>next_offset [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Pass the offset that a client should send in the next query with the same text to receive more results. Pass an empty string if there are no more results or if you don‘t support pagination. Offset length can’t exceed 64 bytes. |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<BooleanResponse>` |
| [switchPmParameter](switch-pm-parameter.md) | `val switchPmParameter: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>switch_pm_parameter [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Deep-linking parameter for the /start message sent to the bot when user presses the switch button. 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed. |
| [switchPmText](switch-pm-text.md) | `val switchPmText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>switch_pm_text [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional If passed, clients will display a button with specified text that switches the user to a private chat with the bot and sends the bot a start message with the parameter switch_pm_parameter |
