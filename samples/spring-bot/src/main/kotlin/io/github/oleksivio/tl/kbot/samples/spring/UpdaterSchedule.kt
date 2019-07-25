package io.github.oleksivio.tl.kbot.samples.spring

import io.github.oleksivio.tl.kbot.core.controller.TelegramUpdater
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class UpdaterSchedule(private val telegramUpdater: TelegramUpdater) {

    @Scheduled(fixedDelay = 1_500L)
    fun upd() = telegramUpdater.longPolling()
}
