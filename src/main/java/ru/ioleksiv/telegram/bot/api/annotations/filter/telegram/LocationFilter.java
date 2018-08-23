package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.DoubleFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubLocationValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Location;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface LocationFilter {

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    DoubleFilter longitude() default @DoubleFilter(status = AnnotationState.OFF);

    DoubleFilter latitude() default @DoubleFilter(status = AnnotationState.OFF);

}
