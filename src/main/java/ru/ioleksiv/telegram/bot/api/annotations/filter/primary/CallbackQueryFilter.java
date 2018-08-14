package ru.ioleksiv.telegram.bot.api.annotations.filter.primary;

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
public @interface CallbackQueryFilter {

    MessageFilter message() default @MessageFilter(AnnotationState.OFF);

    StringFilter inlineMessageId() default @StringFilter(AnnotationState.OFF);

    StringFilter chatInstance() default @StringFilter(AnnotationState.OFF);

    StringFilter data() default @StringFilter(AnnotationState.OFF);

    StringFilter gameShortName() default @StringFilter(AnnotationState.OFF);

}
