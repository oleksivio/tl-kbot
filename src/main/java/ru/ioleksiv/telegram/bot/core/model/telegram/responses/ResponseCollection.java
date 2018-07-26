package ru.ioleksiv.telegram.bot.core.model.telegram.responses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.Update;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.WebhookInfo;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.Chat;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.ChatMember;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.User;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.File;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.UserProfilePhotos;

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

}
