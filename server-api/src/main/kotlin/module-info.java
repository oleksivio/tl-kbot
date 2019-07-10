module tl.kbot.server.api.main {
    requires jackson.annotations;
    requires kotlin.stdlib;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    exports io.github.oleksivio.tl.kbot.server.api.method.file;
    exports io.github.oleksivio.tl.kbot.server.api.method.game;
    exports io.github.oleksivio.tl.kbot.server.api.method.group;
    exports io.github.oleksivio.tl.kbot.server.api.method.info;
    exports io.github.oleksivio.tl.kbot.server.api.method.inline;
    exports io.github.oleksivio.tl.kbot.server.api.method.location;
    exports io.github.oleksivio.tl.kbot.server.api.method.message;
    exports io.github.oleksivio.tl.kbot.server.api.method.notify;
    exports io.github.oleksivio.tl.kbot.server.api.method.passport;
    exports io.github.oleksivio.tl.kbot.server.api.method.payments;
    exports io.github.oleksivio.tl.kbot.server.api.method.sticker;
    exports io.github.oleksivio.tl.kbot.server.api.method.update;

    exports io.github.oleksivio.tl.kbot.server.api.objects;
    exports io.github.oleksivio.tl.kbot.server.api.objects.std;
    exports io.github.oleksivio.tl.kbot.server.api.objects.std.game;
    exports io.github.oleksivio.tl.kbot.server.api.objects.std.files;
    exports io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard;
    exports io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.button;
    exports io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.row;
    exports io.github.oleksivio.tl.kbot.server.api.objects.std.sticker;
    exports io.github.oleksivio.tl.kbot.server.api.objects.inline;
    exports io.github.oleksivio.tl.kbot.server.api.objects.inline.messagecontent;
    exports io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult;
    exports io.github.oleksivio.tl.kbot.server.api.objects.payments;
    exports io.github.oleksivio.tl.kbot.server.api.objects.passport;
    exports io.github.oleksivio.tl.kbot.server.api.model.method;
    exports io.github.oleksivio.tl.kbot.server.api.model;
    exports io.github.oleksivio.tl.kbot.server.api.model.type;
    exports io.github.oleksivio.tl.kbot.server.api.model.objects;
}
