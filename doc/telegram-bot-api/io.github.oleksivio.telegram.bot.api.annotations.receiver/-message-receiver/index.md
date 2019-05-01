[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.receiver](../index.md) / [MessageReceiver](./index.md)

# MessageReceiver

`@Target([AnnotationTarget.FUNCTION]) annotation class MessageReceiver`

Annotation to mark function as receiver of
[Message](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md) type

All functions annotated by [MessageReceiver](./index.md) must have one input parameter
[Message](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md) type

Example (receive all messages without filter):

``` kotlin
@MessageReceiver
fun init(message: Message) {
   println(message.text)
}

```

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MessageReceiver()`<br>Annotation to mark function as receiver of [Message](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md) type |
