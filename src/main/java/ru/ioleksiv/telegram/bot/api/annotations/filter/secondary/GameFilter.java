package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

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
public @interface GameFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter title() default @StringFilter(AnnotationState.OFF);

    StringFilter description() default @StringFilter(AnnotationState.OFF);

    PhotoArrayFilter photoArray() default @PhotoArrayFilter(AnnotationState.OFF);

    StringFilter text() default @StringFilter(AnnotationState.OFF);

    MessageEntityFilter textEntities() default @MessageEntityFilter(AnnotationState.OFF);

    AnimationFilter animation() default @AnimationFilter(AnnotationState.OFF);
}
