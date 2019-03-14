package io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button.ReplyKeyboardButton
import java.util.*

/**
 * Created by Ilia on 28.03.2018 at 21:09 Project: telegrambotcore
 */
class ReplyButtonRow : ArrayList<ReplyKeyboardButton>() {

    fun addToRight(button: ReplyKeyboardButton): ReplyButtonRow {
        add(button)
        return this
    }

    fun addToLeft(button: ReplyKeyboardButton): ReplyButtonRow {
        add(0, button)
        return this
    }

}
