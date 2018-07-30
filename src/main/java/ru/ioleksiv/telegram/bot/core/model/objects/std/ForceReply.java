package ru.ioleksiv.telegram.bot.core.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#forcereply">ForceReply</a>
 */
public class ForceReply {
    /**
     * force_reply	True	Shows reply interface to the user, as if they manually selected the bot‘s
     * message and tapped ’Reply'
     */
    @JsonProperty("force_reply")
    private final boolean forceReply = true;
    /**
     * selective	Boolean	Optional. Use this parameter if you want to force reply from specific users
     * only. Targets:
     * 1) users that are @mentioned in the text of the Message object;
     * 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     */
    @JsonProperty("selective")
    private Boolean selective = null;

    public boolean isForceReply() {
        return forceReply;
    }

    public Boolean getSelective() {
        return selective;
    }

    public void setSelective(Boolean selective) {
        this.selective = selective;
    }
}
