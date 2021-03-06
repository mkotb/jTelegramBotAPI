package com.jtelegram.api.message.input.media;

import com.jtelegram.api.message.input.file.InputFile;

public class VideoInputMedia extends InputMedia {
    private int width;
    private int height;
    private int duration;

    public VideoInputMedia(InputFile media, String caption, int width, int height, int duration) {
        super(InputMediaType.VIDEO, media, caption);
        this.width = width;
        this.height = height;
        this.duration = duration;
    }
}
