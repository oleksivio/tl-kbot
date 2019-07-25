package io.github.oleksivio.tl.kbot.samples.micronaut

import io.github.oleksivio.tl.kbot.core.controller.TelegramUpdater
import io.micronaut.scheduling.annotation.Scheduled
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UpdaterSchedule(
    @Inject private val telegramUpdater: TelegramUpdater
) {

    @Scheduled(fixedDelay = "2s")
    fun upd() {
        telegramUpdater.longPolling()
    }
}

