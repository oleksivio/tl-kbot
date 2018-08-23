package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.FloatFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubMaskPositionValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.MaskPosition;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MaskPositionFilter {

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    MaskPosition.Type point() default MaskPosition.Type.ALL;

    FloatFilter xShift() default @FloatFilter(status = AnnotationState.OFF);

    FloatFilter yShift() default @FloatFilter(status = AnnotationState.OFF);

    FloatFilter scale() default @FloatFilter(status = AnnotationState.OFF);

}
