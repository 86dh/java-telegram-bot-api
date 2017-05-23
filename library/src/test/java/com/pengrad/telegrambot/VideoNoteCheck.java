package com.pengrad.telegrambot;

import com.pengrad.telegrambot.model.VideoNote;

import static org.junit.Assert.assertNotNull;

/**
 * Stas Parshin
 * 24 May 2017
 */
public class VideoNoteCheck {

    public static void check(VideoNote videoNote) {
        assertNotNull(videoNote.fileId());
        assertNotNull(videoNote.length());
        assertNotNull(videoNote.duration());
        assertNotNull(videoNote.fileSize());
        PhotoSizeTest.checkPhotos(videoNote.thumb());
    }

}
