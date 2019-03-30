[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api](../index.md) / [TelegramConfigurationReference](./index.md)

# TelegramConfigurationReference

`@Configuration @ComponentScan(["io.github.oleksivio.telegram.bot.core.controller", "io.github.oleksivio.telegram.bot.core.configuration"]) class TelegramConfigurationReference`

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

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TelegramConfigurationReference()`<br>Must be added into Spring `@SpringBootApplication` class |
