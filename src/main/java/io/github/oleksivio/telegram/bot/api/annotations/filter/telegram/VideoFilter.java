package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
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
public @interface VideoFilter {
    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    IntegerFilter duration() default @IntegerFilter(status = AnnotationState.OFF);

    IntegerFilter width() default @IntegerFilter(status = AnnotationState.OFF);

    IntegerFilter height() default @IntegerFilter(status = AnnotationState.OFF);

    PhotoFilter thumb() default @PhotoFilter(status = AnnotationState.OFF);

    StringFilter mimeType() default @StringFilter(status = AnnotationState.OFF);

    IntegerFilter fileSize() default @IntegerFilter(status = AnnotationState.OFF);
}
