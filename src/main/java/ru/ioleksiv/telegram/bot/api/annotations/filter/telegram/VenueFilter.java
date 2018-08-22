package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface VenueFilter {
    AnnotationState status() default AnnotationState.ON;

    LocationFilter location() default @LocationFilter(status = AnnotationState.OFF);

    StringFilter title() default @StringFilter(status = AnnotationState.OFF);

    StringFilter address() default @StringFilter(status = AnnotationState.OFF);

    NotNullFilter foursquareId() default @NotNullFilter(status = AnnotationState.OFF);

    StringFilter foursquareType() default @StringFilter(status = AnnotationState.OFF);

}
