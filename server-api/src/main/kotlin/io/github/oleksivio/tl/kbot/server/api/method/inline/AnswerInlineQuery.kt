package io.github.oleksivio.tl.kbot.server.api.method.inline

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult.InlineQueryResult
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action

/**
 * @see [answerInlineQuery](https://core.telegram.org/bots/api/#answerinlinequery)
 */
class AnswerInlineQuery(
    /**
         * inline_query_id String Yes Unique identifier for the answered query
         */
        @JsonProperty(ApiDict.INLINE_QUERY_ID_KEY)
        val inlineQueryId: String,
    /**
         * results Array of InlineQueryResult Yes A JSON-serialized array of results for the inline query
         */
        @JsonProperty(ApiDict.RESULTS_KEY)
        val inlineQueryResults: List<InlineQueryResult>,
    /**
         * cache_time [Integer] OptionalThe maximum amount of time in seconds that the result of the inline query may be
         * cached on the server. Defaults to 300.
         */
        @JsonProperty(ApiDict.CACHE_TIME_KEY)
        val cacheTime: Int? = null,
    /**
         * is_personal [Boolean] OptionalPass True, if results may be cached on the server side only for the user that
         * sent the query. By default, results may be returned to any user who sends the same query
         */
        @JsonProperty(ApiDict.IS_PERSONAL_KEY)
        val isPersonal: Boolean? = null,
    /**
         * next_offset [String] Optional Pass the offset that a client should send in the next query with the same text
         * to receive more results. Pass an empty string if there are no more results or if you don‘t support pagination.
         * Offset length can’t exceed 64 bytes.
         */
        @JsonProperty(ApiDict.NEXT_OFFSET_KEY)
        val nextOffset: String? = null,
    /**
         * switch_pm_text [String] Optional If passed, clients will display a button with specified text that switches
         * the user to a private chat with the bot and sends the bot a start message with the parameter switch_pm_parameter
         */
        @JsonProperty(ApiDict.SWITCH_PM_TEXT_KEY)
        val switchPmText: String? = null,
    /**
         * switch_pm_parameter [String] Optional Deep-linking parameter for the /start message sent to the bot when user
         * presses the switch button. 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
         */
        @JsonProperty(ApiDict.SWITCH_PM_PARAMETER_KEY)
        val switchPmParameter: String? = null
) : Action<Boolean>() {
    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "answerInlineQuery"
}

