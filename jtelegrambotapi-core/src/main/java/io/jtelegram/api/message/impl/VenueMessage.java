package io.jtelegram.api.message.impl;

import io.jtelegram.api.message.Message;
import io.jtelegram.api.message.media.Venue;
import lombok.Getter;

@Getter
public class VenueMessage extends Message<Venue> {
    private Venue venue;

    @Override
    public Venue getContent() {
        return venue;
    }
}