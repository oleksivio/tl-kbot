package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

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
    AnnotationState value() default AnnotationState.ON;

    LocationFilter location() default @LocationFilter(AnnotationState.OFF);

    StringFilter title() default @StringFilter(AnnotationState.OFF);

    StringFilter address() default @StringFilter(AnnotationState.OFF);

    NotNullFilter foursquareId() default @NotNullFilter(AnnotationState.OFF);

    StringFilter foursquareType() default @StringFilter(AnnotationState.OFF);

}
