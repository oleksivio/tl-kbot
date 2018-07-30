package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.MessageAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.IKeyboard;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendcontact">sendContact</a>
 */
public class SendContact extends MessageAction {
    private static final String METHOD = "sendContact";
    /**
     * phone_number	String Contact's phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber = null;
    /**
     * first_name	String Contact's first name
     */
    @JsonProperty("firstName")
    private String firstName = null;
    /**
     * last_name	String	Optional	Contact's last name
     */
    @JsonProperty("last_name")
    private String lastName = null;
    /**
     * vcard	String	Optional	Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    @JsonProperty("vcard")
    private String vcard = null;

    public SendContact(Networker networker) {
        super(METHOD, networker);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public SendContact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getVcard() {
        return vcard;
    }

    public void setVcard(String vcard) {
        this.vcard = vcard;
    }

    public String getFirstName() {
        return firstName;
    }

    public SendContact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public SendContact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public SendContact setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    protected SendContact setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendContact setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendContact setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}