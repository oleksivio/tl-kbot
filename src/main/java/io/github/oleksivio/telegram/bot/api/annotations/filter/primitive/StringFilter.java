package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive;

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface StringFilter {

    AnnotationState status() default AnnotationState.ON;

    String regExp() default "";

    String[] equalWith() default {};

    String[] startWith() default {};

    String[] endWith() default {};

    String[] contain() default {};

    String[] notContain() default {};

    String[] notStartWith() default {};

    String[] notEndWith() default {};

}
