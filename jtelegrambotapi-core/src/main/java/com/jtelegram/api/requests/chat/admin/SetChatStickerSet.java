package com.jtelegram.api.requests.chat.admin;

import com.google.gson.annotations.SerializedName;
import com.jtelegram.api.chat.id.ChatId;
import com.jtelegram.api.ex.TelegramException;
import com.jtelegram.api.requests.framework.UpdateTelegramRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.function.Consumer;

@Getter
@ToString
public class SetChatStickerSet extends UpdateTelegramRequest {
    private ChatId chatId;
    @SerializedName("sticker_set_name")
    private String stickerSet;

    @Builder
    protected SetChatStickerSet(Consumer<TelegramException> errorHandler, Runnable callback, ChatId chatId, String stickerSet) {
        super("setChatStickerSet", errorHandler, callback);
        this.chatId = chatId;
        this.stickerSet = stickerSet;
    }

    @Override
    protected boolean isValid() {
        return chatId != null && stickerSet != null;
    }
}
