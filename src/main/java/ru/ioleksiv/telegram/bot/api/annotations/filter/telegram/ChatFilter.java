package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubChatValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Chat;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface ChatFilter {

    AnnotationState status() default AnnotationState.ON;

    Chat.Type type() default Chat.Type.ALL;

    String[] validator() default {};

    StringFilter title() default @StringFilter(status = AnnotationState.OFF);

    StringFilter username() default @StringFilter(status = AnnotationState.OFF);

    StringFilter firstName() default @StringFilter(status = AnnotationState.OFF);

    StringFilter lastName() default @StringFilter(status = AnnotationState.OFF);

    BooleanFilter allMembersAreAdministrators() default @BooleanFilter(status = AnnotationState.OFF);

}
