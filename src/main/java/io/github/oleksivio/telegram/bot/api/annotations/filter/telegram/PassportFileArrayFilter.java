package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface PassportFileArrayFilter {

    AnnotationState status() default AnnotationState.ON;

    IntegerFilter fileSize() default @IntegerFilter(status = AnnotationState.OFF);

    IntegerFilter fileDate() default @IntegerFilter(status = AnnotationState.OFF);

}
