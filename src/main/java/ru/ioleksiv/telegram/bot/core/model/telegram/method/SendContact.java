package ru.ioleksiv.telegram.bot.core.model.telegram.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.MessageAction;

/**
 * @see <a href ="https://core.telegram.org/bots/api#sendcontact">sendContact</a>
 */
public class SendContact extends MessageAction {
    private static final String METHOD = "sendContact";
    /**
     * phone_number	String	Yes	Contact's phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber = null;
    /**
     * first_name	String	Yes	Contact's first name
     */
    @JsonProperty("firstName")
    private String firstName;
    /**
     * last_name	String	Optional	Contact's last name
     */
    @JsonProperty("last_name")
    private String lastName;

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
}
