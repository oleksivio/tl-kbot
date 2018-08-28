package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultcontact">InlineQueryResultContact</a>
 */
public class InlineQueryResultContact extends ContentInlineResult {

    private static final String TYPE = "contact";
    /**
     * phone_number String Contact's phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber = null;
    /**
     * first_name String Contact's first name
     */
    @JsonProperty("firstName")
    private String firstName = null;
    /**
     * last_name String Optional Contact's last name
     */
    @JsonProperty("last_name")
    private String lastName = null;
    /**
     * vcard String Optional Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    @JsonProperty("vcard")
    private String vcard = null;
    /**
     * thumb_url String Optional. URL of the thumbnail (jpeg only) for the file
     */
    @JsonProperty("thumb_url")
    private String thumbUrl = null;
    /**
     * thumb_width Integer Optional. Thumbnail width
     */
    @JsonProperty("thumb_width")
    private Integer thumbWidth = null;
    /**
     * thumb_height Integer Optional. Thumbnail height
     */
    @JsonProperty("thumb_height")
    private Integer thumbHeight = null;

    InlineQueryResultContact() {
        super(TYPE);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVcard() {
        return vcard;
    }

    public void setVcard(String vcard) {
        this.vcard = vcard;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public Integer getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

}
