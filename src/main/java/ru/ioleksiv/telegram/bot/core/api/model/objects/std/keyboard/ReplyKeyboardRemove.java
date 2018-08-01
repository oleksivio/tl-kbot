package ru.ioleksiv.telegram.bot.core.api.model.objects.std.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardremove">ReplyKeyboardRemove</a>
 */
public class ReplyKeyboardRemove implements IKeyboard {
    /**
     * remove_keyboard	True	Requests clients to remove the custom keyboard (user will not be able
     * to summon this keyboard; if you want to hide the keyboard from sight but keep it accessible,
     * use one_time_keyboard in ReplyKeyboardMarkup)
     */
    @JsonProperty("remove_keyboard")
    private Boolean mRemoveKeyboard = null;
    /**
     * selective	Boolean	Optional. Use this parameter if you want to remove the keyboard for
     * specific users only.
     * Targets:
     * 1) users that are @mentioned in the text of the Message object;
     * 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     */
    @JsonProperty("selective")
    private boolean mSelective = false;

    public boolean isRemoveKeyboard() {
        return mRemoveKeyboard;
    }

    public void setRemoveKeyboard(boolean resizeKeyboard) {
        mRemoveKeyboard = resizeKeyboard;
    }

    public boolean isSelective() {
        return mSelective;
    }

    public void setSelective(Boolean selective) {
        mSelective = selective;
    }

}
