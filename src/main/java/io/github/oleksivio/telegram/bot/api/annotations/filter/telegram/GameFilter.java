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
public @interface GameFilter {

    AnnotationState status() default AnnotationState.ON;

    StringFilter title() default @StringFilter(status = AnnotationState.OFF);

    StringFilter description() default @StringFilter(status = AnnotationState.OFF);

    PhotoArrayFilter photoArray() default @PhotoArrayFilter(status = AnnotationState.OFF);

    StringFilter text() default @StringFilter(status = AnnotationState.OFF);

    MessageEntityFilter textEntities() default @MessageEntityFilter(status = AnnotationState.OFF);

    AnimationFilter animation() default @AnimationFilter(status = AnnotationState.OFF);
}
