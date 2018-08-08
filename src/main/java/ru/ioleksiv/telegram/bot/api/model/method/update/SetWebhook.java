package ru.ioleksiv.telegram.bot.api.model.method.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#setwebhook">setWebhook</a>
 */
public class SetWebhook extends RunnableAction<Boolean> {
    private static final String METHOD = "setWebhook";

    public static final String ALLOW_MESSAGE = "message";
    public static final String ALLOW_EDITED_MESSAGE = "edited_message";
    public static final String ALLOW_CHANNEL_POST = "channel_post";
    public static final String ALLOW_EDITED_CHANNEL_POST = "edited_channel_post";
    public static final String ALLOW_INLINE_QUERY = "inline_query";
    public static final String ALLOW_CHOSEN_INLINE_RESULT = "chosen_inline_result";
    public static final String ALLOW_CALLBACK_QUERY = "callback_query";
    public static final String ALLOW_SHIPPING_QUERY = "shipping_query";
    public static final String ALLOW_PRE_CHECKOUT_QUERY = "pre_checkout_query";
    /**
     * url	String HTTPS url to send updates to. Use an empty string to remove webhook
     * integration
     */
    @JsonProperty("url")
    private String url = null;
    /**
     * certificate	InputFile	Optional	Upload your public key certificate so that the root
     * certificate in use can be checked. See our self-signed guide for details.
     */
    @JsonProperty("certificate")
    private File certificate = null;
    /**
     * max_connections	Integer	Optional	Maximum allowed number of simultaneous HTTPS connections
     * to the webhook for update delivery, 1-100. Defaults to 40. Use lower values to limit the load
     * on your bot‘s server, and higher values to increase your bot’s throughput.
     */
    @JsonProperty("max_connections")
    private Integer maxConnections = null;
    /**
     * allowed_updates	Array of String	Optional	List the types of updates you want your bot to
     * receive. For example, specify [“message”, “edited_channel_post”, “callback_query”] to only
     * receive updates of these types. See Update for a complete list of available update types.
     * Specify an empty list to receive all updates regardless of type (default). If not specified,
     * the previous setting will be used.
     * <p>
     * Please note that this parameter doesn't affect updates created before the call to the
     * setWebhook, so unwanted updates may be received for a short period of time.
     */
    @JsonProperty("allowed_updates")
    private List<String> allowedUpdates = new ArrayList<>();

    public SetWebhook(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public String getUrl() {
        return url;
    }

    public SetWebhook setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public File getCertificate() {
        return certificate;
    }

    public SetWebhook setCertificate(File certificate) {
        this.certificate = certificate;
        return this;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }

    public SetWebhook setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    public List<String> getAllowedUpdates() {
        return allowedUpdates;
    }

    public SetWebhook setAllowedUpdates(List<String> allowedUpdates) {
        this.allowedUpdates = allowedUpdates;
        return this;
    }

    @Override
    public SetWebhook setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
