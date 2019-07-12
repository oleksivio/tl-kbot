package io.github.oleksivio.tl.kbot.core.controller

import io.github.oleksivio.tl.kbot.core.controller.annotations.AnnotationProcessor
import io.github.oleksivio.tl.kbot.core.controller.annotations.composer.HandlerCreator
import io.github.oleksivio.tl.kbot.core.controller.annotations.composer.SessionInitializer
import io.github.oleksivio.tl.kbot.core.controller.annotations.composer.StatelessInitializer
import io.github.oleksivio.tl.kbot.core.controller.annotations.holder.CustomValidatorHolder
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.primitive.BooleanFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.primitive.DoubleFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.primitive.FloatFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.primitive.IntegerFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.primitive.LongFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.primitive.StringFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.AnimationFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.AudioFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.CallbackQueryFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.ChatFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.ChosenInlineResultFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.ContactFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.DocumentFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.EncryptedCredentialsFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.EncryptedPassportElemArrayFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.EncryptedPassportElementFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.GameFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.IncludeMessageFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.InlineQueryFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.InvoiceFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.LocationFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.MaskPositionFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.MessageEntityArrayFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.MessageEntityFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.MessageFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.OrderInfoFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.PassportDataFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.PassportFileArrayFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.PassportFileFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.PhotoArrayFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.PhotoFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.PreCheckoutQueryFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.ShippingAddressFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.ShippingQueryFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.StickerFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.SuccessfulPaymentFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.UserArrayFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.UserFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.VenueFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.VideoFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.VideoNoteFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram.VoiceFilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.ValidatorFinder
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.producer.ArgCheckerProducer
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.producer.ArgUnpackerProducer
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.producer.InvokerProducer
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.CallbackQueryUnpackerParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.ChannelPostUnpackerParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.ChosenInlineResultUnpackerParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.EditedChannelPostUnpackerParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.EditedMessageUnpackerParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.InlineQueryUnpackerParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.MessageUnpackerParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.PreCheckoutQueryUnpackerParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.ShippingQueryUnpackerParser
import io.github.oleksivio.tl.kbot.core.controller.builder.ActionBuilderImpl
import io.github.oleksivio.tl.kbot.core.controller.network.ApiProvider
import io.github.oleksivio.tl.kbot.core.controller.network.Loader
import io.github.oleksivio.tl.kbot.core.controller.processor.InputDataProcessor
import io.github.oleksivio.tl.kbot.core.controller.processor.StatelessProcessor
import io.github.oleksivio.tl.kbot.core.controller.processor.session.SessionProcessor
import io.github.oleksivio.tl.kbot.core.controller.updater.Updater

class BotContextController(apiProvider: ApiProvider) {

    private val filterParsers = listOf(
        BooleanFilterParser(),
        DoubleFilterParser(),
        FloatFilterParser(),
        IntegerFilterParser(),
        LongFilterParser(),
        StringFilterParser(),

        AnimationFilterParser(),
        AudioFilterParser(),
        CallbackQueryFilterParser(),
        ChatFilterParser(),
        ChosenInlineResultFilterParser(),
        ContactFilterParser(),
        DocumentFilterParser(),
        EncryptedCredentialsFilterParser(),
        EncryptedPassportElemArrayFilterParser(),
        EncryptedPassportElementFilterParser(),
        GameFilterParser(),
        IncludeMessageFilterParser(),
        InlineQueryFilterParser(),
        InvoiceFilterParser(),
        LocationFilterParser(),
        MaskPositionFilterParser(),
        MessageEntityArrayFilterParser(),
        MessageEntityFilterParser(),
        MessageFilterParser(),
        OrderInfoFilterParser(),
        PassportDataFilterParser(),
        PassportFileArrayFilterParser(),
        PassportFileFilterParser(),
        PhotoArrayFilterParser(),
        PhotoFilterParser(),
        PreCheckoutQueryFilterParser(),
        ShippingAddressFilterParser(),
        ShippingQueryFilterParser(),
        StickerFilterParser(),
        SuccessfulPaymentFilterParser(),
        UserArrayFilterParser(),
        UserFilterParser(),
        VenueFilterParser(),
        VideoFilterParser(),
        VideoNoteFilterParser(),
        VoiceFilterParser()
    )

    internal val customValidatorHolder: CustomValidatorHolder = CustomValidatorHolder()

    private val finder = ValidatorFinder(filterParsers, customValidatorHolder)

    private val unpackerParsers = listOf(
        CallbackQueryUnpackerParser(),
        ChannelPostUnpackerParser(),
        ChosenInlineResultUnpackerParser(),
        EditedChannelPostUnpackerParser(),
        EditedMessageUnpackerParser(),
        InlineQueryUnpackerParser(),
        MessageUnpackerParser(),
        PreCheckoutQueryUnpackerParser(),
        ShippingQueryUnpackerParser()
    )

    private val argCheckerProducer = ArgCheckerProducer(filterParsers, finder)
    private val argUnpackerProducer = ArgUnpackerProducer(unpackerParsers)
    private val invokerProducer = InvokerProducer()

    private val handlerCreator = HandlerCreator(argCheckerProducer, argUnpackerProducer, invokerProducer)

    private val sessionProcessor = SessionProcessor()
    private val statelessProcessor = StatelessProcessor()

    private val sessionInitializer = SessionInitializer(handlerCreator, sessionProcessor)
    private val statelessInitializer = StatelessInitializer(handlerCreator, statelessProcessor)

    internal val annotationProcessor: AnnotationProcessor =
        AnnotationProcessor(statelessInitializer, sessionInitializer)

    private val inputDataProcessor = InputDataProcessor(sessionProcessor, statelessProcessor)

    private val actionBuilderImpl = ActionBuilderImpl(apiProvider)

    private val loader = Loader(actionBuilderImpl)

    private val updater = Updater(inputDataProcessor, loader)

    val telegramProcessor: TelegramProcessor get() = inputDataProcessor

    val telegramUpdater: TelegramUpdater get() = updater

    val actionBuilder: ActionBuilder get() = actionBuilderImpl
}
