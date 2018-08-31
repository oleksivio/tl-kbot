package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface InlineQueryFilter {

    UserFilter from() default @UserFilter(status = AnnotationState.OFF);

    String[] validator() default {};

    LocationFilter location() default @LocationFilter(status = AnnotationState.OFF);

    StringFilter query() default @StringFilter(status = AnnotationState.OFF);

    StringFilter offset() default @StringFilter(status = AnnotationState.OFF);

}
