package ru.ioleksiv.telegram.bot.core.model.telegram.method.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

import java.io.File;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#setwebhook>setWebhook</a>
 */
public class SetWebhook extends RunnableAction<Boolean> {
    private static final String METHOD = "setWebhook";
    /**
     * url	String	Yes	HTTPS url to send updates to. Use an empty string to remove webhook
     * integration
     */
    @JsonProperty("url")
    private String url;
    /**
     * certificate	InputFile	Optional	Upload your public key certificate so that the root
     * certificate in use can be checked. See our self-signed guide for details.
     */
    @JsonProperty("certificate")
    private File certificate;
    /**
     * max_connections	Integer	Optional	Maximum allowed number of simultaneous HTTPS connections
     * to the webhook for update delivery, 1-100. Defaults to 40. Use lower values to limit the load
     * on your bot‘s server, and higher values to increase your bot’s throughput.
     */
    @JsonProperty("max_connections")
    private Integer maxConnections;
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
    private List<String> allowedUpdates;

    protected SetWebhook(Networker networker) {
        super(METHOD, networker);
    }

    public String getUrl() {
        return url;
    }

    public SetWebhook setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
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
}
