package io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.row

import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.button.InlineKeyboardButton
import java.util.ArrayList

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
