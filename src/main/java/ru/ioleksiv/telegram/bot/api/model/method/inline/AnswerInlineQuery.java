package ru.ioleksiv.telegram.bot.api.model.method.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.queryresult.InlineQueryResult;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#answerinlinequery>answerInlineQuery</a>
 */
public class AnswerInlineQuery extends RunnableAction<Boolean> {
    private static final String METHOD = "answerInlineQuery";
    /**
     * inline_query_id	String	Yes	Unique identifier for the answered query
     */
    @JsonProperty("inline_query_id")
    private String inlineQueryId = null;
    /**
     * results	Array of InlineQueryResult	Yes	A JSON-serialized array of results for the inline query
     */
    @JsonProperty("results")
    private List<InlineQueryResult> inlineQueryResults = new ArrayList<>();
    /**
     * cache_time	Integer	Optional	The maximum amount of time in seconds that the result of the inline query may be
     * cached on the server. Defaults to 300.
     */
    @JsonProperty("cache_time")
    private Integer cacheTime = null;
    /**
     * is_personal	Boolean	Optional	Pass True, if results may be cached on the server side only for the user that
     * sent the query. By default, results may be returned to any user who sends the same query
     */
    @JsonProperty("is_personal")
    private Boolean isPersonal = null;
    /**
     * next_offset	String	Optional	Pass the offset that a client should send in the next query with the same text
     * to receive more results. Pass an empty string if there are no more results or if you don‘t support pagination.
     * Offset length can’t exceed 64 bytes.
     */
    @JsonProperty("next_offset")
    private String nextOffset = null;
    /**
     * switch_pm_text	String	Optional	If passed, clients will display a button with specified text that switches
     * the user to a private chat with the bot and sends the bot a start message with the parameter switch_pm_parameter
     */
    @JsonProperty("switch_pm_text")
    private String switchPmText = null;
    /**
     * switch_pm_parameter	String	Optional	Deep-linking parameter for the /start message sent to the bot when user
     * presses the switch button. 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
     */
    @JsonProperty("switch_pm_parameter")
    private String switchPmParameter = null;

    public AnswerInlineQuery(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public AnswerInlineQuery addInlineQueryResult(InlineQueryResult inlineQueryResult) {
        inlineQueryResults.add(inlineQueryResult);
        return this;
    }

    public AnswerInlineQuery replaceInlineQueryResults(List<InlineQueryResult> inlineQueryResults) {
        this.inlineQueryResults = inlineQueryResults;
        return this;
    }

    public String getInlineQueryId() {
        return inlineQueryId;
    }

    public AnswerInlineQuery setInlineQueryId(String inlineQueryId) {
        this.inlineQueryId = inlineQueryId;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public List<InlineQueryResult> getInlineQueryResults() {
        return inlineQueryResults;
    }

    public Integer getCacheTime() {
        return cacheTime;
    }

    public AnswerInlineQuery setCacheTime(Integer cacheTime) {
        this.cacheTime = cacheTime;
        return this;
    }

    public Boolean getPersonal() {
        return isPersonal;
    }

    public AnswerInlineQuery setPersonal(Boolean personal) {
        isPersonal = personal;
        return this;
    }

    public String getNextOffset() {
        return nextOffset;
    }

    public AnswerInlineQuery setNextOffset(String nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }

    public String getSwitchPmText() {
        return switchPmText;
    }

    public AnswerInlineQuery setSwitchPmText(String switchPmText) {
        this.switchPmText = switchPmText;
        return this;
    }

    public String getSwitchPmParameter() {
        return switchPmParameter;
    }

    public AnswerInlineQuery setSwitchPmParameter(String switchPmParameter) {
        this.switchPmParameter = switchPmParameter;
        return this;
    }

    @Override
    public AnswerInlineQuery setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }

}
