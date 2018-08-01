package ru.ioleksiv.telegram.bot.core.model.responses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.model.objects.WebhookInfo;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Chat;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.ChatMember;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.files.File;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.files.UserProfilePhotos;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.game.GameHighScore;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.sticker.StickerSet;

import java.util.List;

public final class ResponseCollection {
    private static final Logger LOG = LoggerFactory.getLogger(ResponseCollection.class);

    public static class MessageResponse extends CommonResponse<Message> {
    }

    public static class UserResponse extends CommonResponse<User> {
    }

    public static class UpdatesArrayResponse extends CommonResponse<List<Update>> {
    }

    public static class BooleanResponse extends CommonResponse<Boolean> {
    }

    public static class StringResponse extends CommonResponse<String> {
    }

    public static class IntegerResponse extends CommonResponse<Integer> {
    }

    public static class UserProfilePhotosResponse extends CommonResponse<UserProfilePhotos> {
    }

    public static class FileResponse extends CommonResponse<File> {
    }

    public static class ChatResponse extends CommonResponse<Chat> {
    }

    public static class ChatMembersResponse extends CommonResponse<List<ChatMember>> {
    }

    public static class ChatMemberResponse extends CommonResponse<ChatMember> {
    }

    public static class WebhookInfoResponse extends CommonResponse<WebhookInfo> {
    }

    public class StickerSetResponse extends CommonResponse<StickerSet> {
    }

    public class GameHightScoresResponse extends CommonResponse<List<GameHighScore>> {
    }
}
