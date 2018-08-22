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

    AnnotationState value() default AnnotationState.ON;

    Chat.Type type() default Chat.Type.ALL;

    Class<? extends CustomValidator<Chat>>[] validator() default StubChatValidator.class;

    StringFilter title() default @StringFilter(AnnotationState.OFF);

    StringFilter username() default @StringFilter(AnnotationState.OFF);

    StringFilter firstName() default @StringFilter(AnnotationState.OFF);

    StringFilter lastName() default @StringFilter(AnnotationState.OFF);

    BooleanFilter allMembersAreAdministrators() default @BooleanFilter(AnnotationState.OFF);

}
