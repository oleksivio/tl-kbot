# Telegram Bot API

Spring library for easy creating telegram bot's 

[master: ![CircleCI](https://circleci.com/gh/oleksivio/telegram-bot-api/tree/master.svg?style=svg)](https://circleci.com/gh/oleksivio/telegram-bot-api/tree/master)

[dev: ![CircleCI](https://circleci.com/gh/oleksivio/telegram-bot-api/tree/dev.svg?style=svg)](https://circleci.com/gh/oleksivio/telegram-bot-api/tree/dev)

## Getting Started

Add to you dependencies: 

Gradle:
```
implementation("io.github.oleksivio:telegram-bot-api:1.0.4")
```
Maven: 
```
<dependency>
  <groupId>io.github.oleksivio</groupId>
  <artifactId>telegram-bot-api</artifactId>
  <version>1.0.4</version>
</dependency>
```

Add to spring `application.properties`
```
telegram.bot.token=<TELEGRAM_BOT_TOKEN>
```

Added to Spring `@SpringBootApplication` class:

```kotlin
@Import(TelegramConfigurationReference::class)
```

[Documentation](doc/telegram-bot-api/index.md)

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/oleksivio/telegram-bot-api/tags). 

## Authors

* **Ilia Oleksiv** - *Initial work* - [oleksivio](https://github.com/oleksivio)

See also the list of [contributors](https://github.com/oleksivio/telegram-bot-api/contributors) who participated in this project.

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details

