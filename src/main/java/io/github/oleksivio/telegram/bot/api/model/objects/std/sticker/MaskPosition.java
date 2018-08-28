package io.github.oleksivio.telegram.bot.api.model.objects.std.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.FloatFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;
import io.github.oleksivio.telegram.bot.core.model.type.TelegramType;

/**
 * @see <a href="https://core.telegram.org/bots/api#maskposition">MaskPosition</a>
 */
public class MaskPosition implements ITelegram {
    /**
     * To setup filter:
     *
     * @see Type point
     * point String The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”,
     * “mouth”, or “chin”.
     */
    @JsonProperty("point")
    private String point = null;
    /**
     * To setup filter:
     *
     * @see FloatFilter xShift
     * x_shift Float number Shift by X-axis measured in widths of the mask scaled to the face size, from left to right.
     * For example, choosing -1.0 will place mask just to the left of the default mask position.
     */
    @JsonProperty("x_shift")
    private Float xShift = null;
    /**
     * To setup filter:
     *
     * @see FloatFilter yShift
     * y_shift Float number Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom.
     * For example, 1.0 will place the mask just below the default mask position.
     */
    @JsonProperty("y_shift")
    private Float yShift = null;
    /**
     * To setup filter:
     *
     * @see FloatFilter scale
     * scale Float number Mask scaling coefficient. For example, 2.0 means double size.
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

    public enum Type implements TelegramType {
        FOREHEAD("forehead"),
        EYES("eyes"),
        MOUTH("mouth"),
        CHIN("chin"),
        ALL("");

        private final String name;

        Type(String name) {
            this.name = name;
        }

        @Override
        public String stringName() {
            return name;
        }

        @Override
        public boolean isChosen() {
            return this != ALL;
        }

    }
}
