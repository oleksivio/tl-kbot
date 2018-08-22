package ru.ioleksiv.telegram.bot.api.model.method.update;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.FileNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.UploadFile;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @see <a href="https://core.telegram.org/bots/api#setwebhook">setWebhook</a>
 */
public class SetWebhook extends UploadFile<Boolean> {
    private static final String METHOD = "setWebhook";
    /**
     * url String HTTPS url to send updates to. Use an empty string to remove webhook
     * integration
     */
    private static final String URL_KEY = "url";
    /**
     * certificate InputFile Optional Upload your public key certificate so that the root
     * certificate in use can be checked. See our self-signed guide for details.
     */
    private static final String CERTIFICATE_KEY = "certificate";
    /**
     * max_connections Integer Optional Maximum allowed number of simultaneous HTTPS connections
     * to the webhook for update delivery, 1-100. Defaults to 40. Use lower values to limit the load
     * on your bot‘s server, and higher values to increase your bot’s throughput.
     */
    private static final String MAX_CONNECTIONS_KEY = "max_connections";
    /**
     * allowed_updates Array of String Optional List the types of updates you want your bot to
     * receive. For example, specify [“message”, “edited_channel_post”, “callback_query”] to only
     * receive updates of these types. See Update for a complete list of available update types.
     * Specify an empty list to receive all updates regardless of type (default). If not specified,
     * the previous setting will be used.
     * <p>
     * Please note that this parameter doesn't affect updates created before the call to the
     * setWebhook, so unwanted updates may be received for a short period of time.
     */
    private static final String ALLOWED_UPDATES_KEY = "allowed_updates";

    public SetWebhook(FileNetworker fileNetworker) {
        super(METHOD, fileNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

    public SetWebhook setMaxConnections(Integer maxConnections) {
        putInt(MAX_CONNECTIONS_KEY, maxConnections);
        return this;
    }

    public SetWebhook setAllowedUpdates(Type... allowedUpdates) {
        Collection<String> allowedStringUpdates = new ArrayList<>();

        for (Type type : allowedUpdates) {
            allowedStringUpdates.add(type.stringName());
        }

        putObject(ALLOWED_UPDATES_KEY, allowedStringUpdates);
        return this;
    }

    public SetWebhook setUrl(String url) {
        putString(URL_KEY, url);
        return this;
    }

    public SetWebhook setCertificate(FileSystemResource certificate) {
        putFile(CERTIFICATE_KEY, certificate);
        return this;
    }

    @Override
    public SetWebhook setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }

    public enum Type {
        ALLOW_MESSAGE("message"),
        ALLOW_EDITED_MESSAGE("edited_message"),
        ALLOW_CHANNEL_POST("channel_post"),
        ALLOW_EDITED_CHANNEL_POST("edited_channel_post"),
        ALLOW_INLINE_QUERY("inline_query"),
        ALLOW_CHOSEN_INLINE_RESULT("chosen_inline_result"),
        ALLOW_CALLBACK_QUERY("callback_query"),
        ALLOW_SHIPPING_QUERY("shipping_query"),
        ALLOW_PRE_CHECKOUT_QUERY("pre_checkout_query");

        private final String type;

        Type(String type) {
            this.type = type;
        }

        public String stringName() {
            return type;
        }
    }
}
