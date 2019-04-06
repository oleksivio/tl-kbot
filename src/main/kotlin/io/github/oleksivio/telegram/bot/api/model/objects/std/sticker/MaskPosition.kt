package io.github.oleksivio.telegram.bot.api.model.objects.std.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import io.github.oleksivio.telegram.bot.core.model.type.TelegramType

/**
 *  [MaskPosition](https://core.telegram.org/bots/api/#maskposition)
 */
data class MaskPosition(
        /**
         * To setup filter:
         *
         *  Type point point String The part of the face relative to which the mask should be placed. One of “forehead”,
         * “eyes”, “mouth”, or “chin”.
         */
        @JsonProperty("point")
        var point: String? = null,
        /**
         * To setup filter:
         *
         *  FloatFilter xShift x_shift Float number Shift by X-axis measured in widths of the mask scaled to the face
         * size, from left to right. For example, choosing -1.0 will place mask just to the left of the default mask
         * position.
         */
        @JsonProperty("x_shift")
        var xShift: Float? = null,
        /**
         * To setup filter:
         *
         *  FloatFilter yShift y_shift Float number Shift by Y-axis measured in heights of the mask scaled to the face
         * size, from top to bottom. For example, 1.0 will place the mask just below the default mask position.
         */
        @JsonProperty("y_shift")
        var yShift: Float? = null,
        /**
         * To setup filter:
         *
         *  FloatFilter scale scale Float number Mask scaling coefficient. For example, 2.0 means double size.
         */
        @JsonProperty("scale")
        var scale: Float? = null
) : ITelegram {

    object Const {
        const val FOREHEAD = "forehead"
        const val EYES = "eyes"
        const val MOUTH = "mouth"
        const val CHIN = "chin"
    }

    enum class Type(override val typeName: String) : TelegramType {
        FOREHEAD(Const.FOREHEAD),
        EYES(Const.EYES),
        MOUTH(Const.MOUTH),
        CHIN(Const.CHIN),
        UNKNOWN("");

        override val isChosen: Boolean
            get() = this != UNKNOWN

        companion object {

            fun parse(input: String?): Type {
                return values().firstOrNull { it.typeName == input } ?: UNKNOWN
            }
        }
    }
}
