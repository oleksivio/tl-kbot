package io.github.oleksivio.telegram.bot.api.model.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#webhookinfo">WebhookInfo</a>
 */
public class WebhookInfo implements ITelegram {
    /**
     * url String Webhook URL, may be empty if webhook is not set up
     * has_custom_certificate Boolean True, if a custom certificate was provided for webhook
     * certificate checks
     */
    @JsonProperty("url")
    private String url = null;
    /**
     * pending_update_count Integer Number of updates awaiting delivery
     */
    @JsonProperty("pending_update_count")
    private Integer pendingUpdateCount = null;
    /**
     * last_error_date Integer Optional. Unix time for the most recent error that happened when
     * trying to deliver an update via webhook
     */
    @JsonProperty("last_error_date")
    private Long lastErrorDate = null;
    /**
     * last_error_message String Optional. Error message in human-readable format for the most
     * recent error that happened when trying to deliver an update via webhook
     */
    @JsonProperty("last_error_message")
    private String lastErrorMessage = null;
    /**
     * max_connections Integer Optional. Maximum allowed number of simultaneous HTTPS connections
     * to the webhook for update delivery
     */
    @JsonProperty("max_connections")
    private Integer maxConnections = null;
    /**
     * allowed_updates Array of String
     */
    @JsonProperty("allowed_updates")
    private List<String> allowedUpdates = new ArrayList<>();

    public String getUrl() {
        return url;
    }

    public WebhookInfo setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getPendingUpdateCount() {
        return pendingUpdateCount;
    }

    public WebhookInfo setPendingUpdateCount(Integer pendingUpdateCount) {
        this.pendingUpdateCount = pendingUpdateCount;
        return this;
    }

    public Long getLastErrorDate() {
        return lastErrorDate;
    }

    public WebhookInfo setLastErrorDate(Long lastErrorDate) {
        this.lastErrorDate = lastErrorDate;
        return this;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public WebhookInfo setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
        return this;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }

    public WebhookInfo setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    public List<String> getAllowedUpdates() {
        return allowedUpdates;
    }

    public WebhookInfo setAllowedUpdates(List<String> allowedUpdates) {
        this.allowedUpdates = allowedUpdates;
        return this;
    }
}
