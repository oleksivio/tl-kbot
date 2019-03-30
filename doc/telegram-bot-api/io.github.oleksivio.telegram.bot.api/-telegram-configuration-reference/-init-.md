[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api](../index.md) / [TelegramConfigurationReference](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TelegramConfigurationReference()`

Must be added into Spring `@SpringBootApplication` class

Example:

``` kotlin
@SpringBootApplication
@EnableScheduling
@Import(TelegramConfigurationReference::class)
class Application
fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
```

