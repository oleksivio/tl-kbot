package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
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
public @interface StickerFilter {

    AnnotationState value() default AnnotationState.ON;

    MaskPositionFilter maskPosition() default @MaskPositionFilter(AnnotationState.OFF);

    IntegerFilter width() default @IntegerFilter(AnnotationState.OFF);

    IntegerFilter height() default @IntegerFilter(AnnotationState.OFF);

    PhotoFilter thumb() default @PhotoFilter(AnnotationState.OFF);

    StringFilter emoji() default @StringFilter(AnnotationState.OFF);

    StringFilter setName() default @StringFilter(AnnotationState.OFF);

    IntegerFilter fileSize() default @IntegerFilter(AnnotationState.OFF);

}

