package com.jtelegram.api.requests.game;

import com.jtelegram.api.chat.id.LongChatId;
import com.jtelegram.api.message.games.GameHighScore;
import com.jtelegram.api.requests.framework.QueryTelegramRequest;
import com.jtelegram.api.ex.TelegramException;
import lombok.Getter;
import lombok.ToString;

import java.util.function.Consumer;

@Getter
@ToString
public class GetGameHighScores extends QueryTelegramRequest<GameHighScore[]> {
    private Integer userId;
    private LongChatId chatId;
    private Integer messageId;
    private String inlineMessageId;

    public GetGameHighScores(Consumer<GameHighScore[]> callback, Consumer<TelegramException> errorHandler, Integer userId, LongChatId chatId, Integer messageId, String inlineMessageId) {
        super("getGameHighScores", GameHighScore[].class, callback, errorHandler);
        this.userId = userId;
        this.chatId = chatId;
        this.messageId = messageId;
        this.inlineMessageId = inlineMessageId;
    }

    @Override
    protected boolean isValid() {
        return userId != null && (inlineMessageId != null || (chatId != null && messageId != null));
    }
}
