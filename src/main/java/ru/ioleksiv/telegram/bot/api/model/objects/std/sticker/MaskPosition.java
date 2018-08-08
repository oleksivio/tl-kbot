package ru.ioleksiv.telegram.bot.api.model.objects.std.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#maskposition>MaskPosition</a>
 */
public class MaskPosition implements ITelegram {
    /**
     * point	String	The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”,
     * “mouth”, or “chin”.
     */
    @JsonProperty("point")
    private String point = null;
    /**
     * x_shift	Float number	Shift by X-axis measured in widths of the mask scaled to the face size, from left to right.
     * For example, choosing -1.0 will place mask just to the left of the default mask position.
     */
    @JsonProperty("x_shift")
    private Float xShift = null;
    /**
     * y_shift	Float number	Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom.
     * For example, 1.0 will place the mask just below the default mask position.
     */
    @JsonProperty("y_shift")
    private Float yShift = null;
    /**
     * scale	Float number	Mask scaling coefficient. For example, 2.0 means double size.
     */
    @JsonProperty("scale")
    private Float scale = null;

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public Float getXShift() {
        return xShift;
    }

    public void setXShift(Float xShift) {
        this.xShift = xShift;
    }

    public Float getYShift() {
        return yShift;
    }

    public void setYShift(Float yShift) {
        this.yShift = yShift;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }
}
