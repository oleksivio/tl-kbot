package io.github.oleksivio.telegram.bot.api.model.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [ForceReply](https://core.telegram.org/bots/api/#forcereply)
 */
data class ForceReply(

        /**
         * selective Boolean Optional. Use this parameter if you want to force reply from specific users only. Targets: 1)
         * users that are @mentioned in the text of the Message object; 2) if the bot's message is a reply (has
         * reply_to_message_id), sender of the original message.
         */
        @JsonProperty("selective")
        var selective: Boolean? = null,

        /**
         * force_reply True Shows reply interface to the user, as if they manually selected the bot‘s message and tapped
         * ’Reply'
         *
         * @return true always
         */
        @JsonProperty("force_reply")
        val isForceReply: Boolean = true

) : ITelegram
