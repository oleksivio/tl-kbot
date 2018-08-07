package ru.ioleksiv.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @see <a href="https://core.telegram.org/bots/api#responseparameters">ResponseParameters</a>
 */
public class ResponseParameters {
    private static final Logger LOG = LoggerFactory.getLogger(ResponseParameters.class);
    /**
     * migrate_to_chat_id	Integer	Optional. The group has been migrated to a supergroup with the
     * specified identifier. This number may be greater than 32 bits and some programming languages
     * may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a
     * signed 64 bit integer or double-precision float type are safe for storing this identifier.
     */
    @JsonProperty("migrate_to_chat_id")
    private Long migrateToChatId = null;
    /**
     * retry_after	Integer	Optional. In case of exceeding flood control, the number of seconds
     * left to wait before the request can be repeated
     */
    @JsonProperty("reply_after")
    private Integer replyAfter = null;

    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    public void setMigrateToChatId(Long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    public Integer getReplyAfter() {
        return replyAfter;
    }

    public void setReplyAfter(Integer replyAfter) {
        this.replyAfter = replyAfter;
    }
}
