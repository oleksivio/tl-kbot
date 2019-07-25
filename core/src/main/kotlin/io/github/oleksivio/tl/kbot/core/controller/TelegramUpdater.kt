package io.github.oleksivio.tl.kbot.core.controller

/**
 * [TelegramUpdater] interface allowed load new updates from server
 *
 * Realisation of long polling variant of [receiving updates](https://core.telegram.org/bots/api#getting-updates)
 *
 * Example:
 *
 *  ```kotlin
 *  @Service
 *  class UpdaterSchedule(private val updater: TelegramUpdater) {
 *
 *      @Scheduled(fixedDelay = 1_500L)
 *      fun upd() = updater.longPolling()
 *
 *  }
 *  ```
 *
 *  Also you could add [UpdateErrorListener] callback to handle errors when getting updates
 *
 *  Example:
 *
 *  ```kotlin
 *  @Component
 *  class ErrorListener : UpdateErrorListener {
 *
 *      override fun invoke(update: Update, onProcessException: Exception) = println(onProcessException.message)
 *
 *  }
 *  ```
 */
interface TelegramUpdater {

    /**
     * Function to run [long polling](https://core.telegram.org/bots/api#getupdates)
     */
    fun longPolling()

    /**
     * Function to set listener for update errors
     */
    fun setErrorListener(listener: UpdateErrorListener)
}
