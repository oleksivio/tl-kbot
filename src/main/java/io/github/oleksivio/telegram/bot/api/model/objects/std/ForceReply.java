package io.github.oleksivio.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#forcereply">ForceReply</a>
 */
public class ForceReply implements ITelegram {

    /**
     * selective Boolean Optional. Use this parameter if you want to force reply from specific users
     * only. Targets:
     * 1) users that are @mentioned in the text of the Message object;
     * 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     */
    @JsonProperty("selective")
    private Boolean selective = null;

    /**
     * force_reply True Shows reply interface to the user, as if they manually selected the bot‘s
     * message and tapped ’Reply'
     */

    @JsonProperty("force_reply")
    public boolean isForceReply() {
        return true;
    }

    public Boolean getSelective() {
        return selective;
    }

    public void setSelective(Boolean selective) {
        this.selective = selective;
    }
}
