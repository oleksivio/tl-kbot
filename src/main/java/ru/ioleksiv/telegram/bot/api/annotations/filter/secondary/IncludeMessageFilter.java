package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
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
public @interface IncludeMessageFilter {

    AnnotationState value() default AnnotationState.ON;

    UserFilter from() default @UserFilter(AnnotationState.OFF);

    IntegerFilter date() default @IntegerFilter(AnnotationState.OFF);

    ChatFilter chat() default @ChatFilter(AnnotationState.OFF);

    UserFilter forwardFrom() default @UserFilter(AnnotationState.OFF);

    ChatFilter forwardChat() default @ChatFilter(AnnotationState.OFF);

    NotNullFilter forwardFromMessageId() default @NotNullFilter(AnnotationState.OFF);

    StringFilter forwardSignature() default @StringFilter(AnnotationState.OFF);

    NotNullFilter forwardDate() default @NotNullFilter(AnnotationState.OFF);

    NotNullFilter editDate() default @NotNullFilter(AnnotationState.OFF);

    NotNullFilter mediaGroupId() default @NotNullFilter(AnnotationState.OFF);

    StringFilter authorSignature() default @StringFilter(AnnotationState.OFF);

    StringFilter text() default @StringFilter(AnnotationState.OFF);

    AudioFilter audio() default @AudioFilter(AnnotationState.OFF);

    PhotoArrayFilter photoArray() default @PhotoArrayFilter(AnnotationState.OFF);

    StringFilter caption() default @StringFilter(AnnotationState.OFF);

    ContactFilter contact() default @ContactFilter(AnnotationState.OFF);

    LocationFilter location() default @LocationFilter(AnnotationState.OFF);

    UserArrayFilter newChatMembers() default @UserArrayFilter(AnnotationState.OFF);

    UserFilter leftChatMember() default @UserFilter(AnnotationState.OFF);

    DocumentFilter document() default @DocumentFilter(AnnotationState.OFF);

    AnimationFilter animation() default @AnimationFilter(AnnotationState.OFF);

    GameFilter game() default @GameFilter(AnnotationState.OFF);

    StringFilter newChatTitle() default @StringFilter(AnnotationState.OFF);

    StickerFilter sticker() default @StickerFilter(AnnotationState.OFF);

    VideoFilter video() default @VideoFilter(AnnotationState.OFF);

    VoiceFilter voice() default @VoiceFilter(AnnotationState.OFF);

    MessageEntityArrayFilter entityArray() default @MessageEntityArrayFilter(AnnotationState.OFF);

    MessageEntityArrayFilter captionEntityArray() default @MessageEntityArrayFilter(AnnotationState.OFF);

    VideoNoteFilter videoNote() default @VideoNoteFilter(AnnotationState.OFF);

    PhotoFilter newChatPhoto() default @PhotoFilter(AnnotationState.OFF);

    BooleanFilter deleteChatPhoto() default @BooleanFilter(AnnotationState.OFF);

    BooleanFilter groupChatCreated() default @BooleanFilter(AnnotationState.OFF);

    VenueFilter venue() default @VenueFilter(AnnotationState.OFF);

    BooleanFilter supergroupChatCreated() default @BooleanFilter(AnnotationState.OFF);

    BooleanFilter channelChatCreated() default @BooleanFilter(AnnotationState.OFF);

    NotNullFilter migrateToChatId() default @NotNullFilter(AnnotationState.OFF);

    NotNullFilter migrateFromChatId() default @NotNullFilter(AnnotationState.OFF);

    InvoiceFilter invoice() default @InvoiceFilter(AnnotationState.OFF);

    SuccessfulPaymentFilter successfulPayment() default @SuccessfulPaymentFilter(AnnotationState.OFF);

    StringFilter connectedWebsite() default @StringFilter(AnnotationState.OFF);

    PassportDataFilter passportData() default @PassportDataFilter(AnnotationState.OFF);

}
