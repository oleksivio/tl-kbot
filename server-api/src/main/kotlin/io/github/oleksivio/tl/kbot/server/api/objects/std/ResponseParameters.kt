package io.github.oleksivio.tl.kbot.server.api.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [ResponseParameters](https://core.telegram.org/bots/api/#responseparameters)
 */
data class ResponseParameters(
    /**
     * migrate_to_chat_id Integer Optional. The group has been migrated to a supergroup with the specified identifier.
     * This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in
     * interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe
     * for storing this identifier.
     */
    @JsonProperty("migrate_to_chat_id")
    var migrateToChatId: Long? = null,
    /**
     * retry_after Integer Optional. In case of exceeding flood control, the number of seconds left to wait before the
     * request can be repeated
     */
    @JsonProperty("reply_after")
    var replyAfter: Int? = null
) : ITelegram
