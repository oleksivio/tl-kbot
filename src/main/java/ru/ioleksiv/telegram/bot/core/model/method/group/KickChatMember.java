package ru.ioleksiv.telegram.bot.core.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#kickchatmember">kickChatMember</a>
 */
public class KickChatMember extends ChatAction<Boolean> {
    private static final String METHOD = "kickChatMember";

    /**
     * user_id	Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId = null;
    /**
     * until_date	Integer	Optional	Date when the user will be unbanned, unix time. If user is
     * banned for more than 366 days or less than 30 seconds from the current time they are
     * considered to be banned forever
     */
    @JsonProperty("until_date")
    private Long untilDate = null;

    public KickChatMember(Networker networker) {
        super(METHOD, networker);
    }

    public Long getUserId() {
        return userId;
    }

    public KickChatMember setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getUntilDate() {
        return untilDate;
    }

    public KickChatMember setUntilDate(Long untilDate) {
        this.untilDate = untilDate;
        return this;
    }

    @Override
   protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public KickChatMember setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
