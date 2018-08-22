package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.LongFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubMessageValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface IncludeMessageFilter {

    AnnotationState status() default AnnotationState.ON;

    Class<? extends CustomValidator<Message>>[] validator() default StubMessageValidator.class;

    UserFilter from() default @UserFilter(status = AnnotationState.OFF);

    LongFilter date() default @LongFilter(status = AnnotationState.OFF);

    ChatFilter chat() default @ChatFilter(status = AnnotationState.OFF);

    UserFilter forwardFrom() default @UserFilter(status = AnnotationState.OFF);

    ChatFilter forwardChat() default @ChatFilter(status = AnnotationState.OFF);

    NotNullFilter forwardFromMessageId() default @NotNullFilter(status = AnnotationState.OFF);

    StringFilter forwardSignature() default @StringFilter(status = AnnotationState.OFF);

    NotNullFilter forwardDate() default @NotNullFilter(status = AnnotationState.OFF);

    NotNullFilter editDate() default @NotNullFilter(status = AnnotationState.OFF);

    NotNullFilter mediaGroupId() default @NotNullFilter(status = AnnotationState.OFF);

    StringFilter authorSignature() default @StringFilter(status = AnnotationState.OFF);

    StringFilter text() default @StringFilter(status = AnnotationState.OFF);

    AudioFilter audio() default @AudioFilter(status = AnnotationState.OFF);

    PhotoArrayFilter photoArray() default @PhotoArrayFilter(status = AnnotationState.OFF);

    StringFilter caption() default @StringFilter(status = AnnotationState.OFF);

    ContactFilter contact() default @ContactFilter(status = AnnotationState.OFF);

    LocationFilter location() default @LocationFilter(status = AnnotationState.OFF);

    UserArrayFilter newChatMembers() default @UserArrayFilter(status = AnnotationState.OFF);

    UserFilter leftChatMember() default @UserFilter(status = AnnotationState.OFF);

    DocumentFilter document() default @DocumentFilter(status = AnnotationState.OFF);

    AnimationFilter animation() default @AnimationFilter(status = AnnotationState.OFF);

    GameFilter game() default @GameFilter(status = AnnotationState.OFF);

    StringFilter newChatTitle() default @StringFilter(status = AnnotationState.OFF);

    StickerFilter sticker() default @StickerFilter(status = AnnotationState.OFF);

    VideoFilter video() default @VideoFilter(status = AnnotationState.OFF);

    VoiceFilter voice() default @VoiceFilter(status = AnnotationState.OFF);

    MessageEntityArrayFilter entityArray() default @MessageEntityArrayFilter(status = AnnotationState.OFF);

    MessageEntityArrayFilter captionEntityArray() default @MessageEntityArrayFilter(status = AnnotationState.OFF);

    VideoNoteFilter videoNote() default @VideoNoteFilter(status = AnnotationState.OFF);

    PhotoFilter newChatPhoto() default @PhotoFilter(status = AnnotationState.OFF);

    BooleanFilter deleteChatPhoto() default @BooleanFilter(status = AnnotationState.OFF);

    BooleanFilter groupChatCreated() default @BooleanFilter(status = AnnotationState.OFF);

    VenueFilter venue() default @VenueFilter(status = AnnotationState.OFF);

    BooleanFilter supergroupChatCreated() default @BooleanFilter(status = AnnotationState.OFF);

    BooleanFilter channelChatCreated() default @BooleanFilter(status = AnnotationState.OFF);

    NotNullFilter migrateToChatId() default @NotNullFilter(status = AnnotationState.OFF);

    NotNullFilter migrateFromChatId() default @NotNullFilter(status = AnnotationState.OFF);

    InvoiceFilter invoice() default @InvoiceFilter(status = AnnotationState.OFF);

    SuccessfulPaymentFilter successfulPayment() default @SuccessfulPaymentFilter(status = AnnotationState.OFF);

    StringFilter connectedWebsite() default @StringFilter(status = AnnotationState.OFF);

    PassportDataFilter passportData() default @PassportDataFilter(status = AnnotationState.OFF);

}
