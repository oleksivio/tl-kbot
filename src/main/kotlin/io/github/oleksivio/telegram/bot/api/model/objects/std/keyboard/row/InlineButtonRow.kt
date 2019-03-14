package io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button.InlineKeyboardButton
import java.util.*

/**
 * Created by Ilia on 28.03.2018 at 21:09 Project: telegrambotcore
 */
class InlineButtonRow : ArrayList<InlineKeyboardButton>() {

    fun addToRight(button: InlineKeyboardButton): InlineButtonRow {
        add(button)
        return this
    }

    fun addToLeft(button: InlineKeyboardButton): InlineButtonRow {
        add(0, button)
        return this
    }

}
