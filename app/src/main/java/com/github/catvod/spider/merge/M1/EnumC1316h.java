package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.G1.C0685d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public enum EnumC1316h {
    MPEG_4(0, "mp4", "video/mp4"),
    v3GPP(16, "3gp", "video/3gpp"),
    WEBM(32, "webm", "video/webm"),
    M4A(256, "m4a", "audio/mp4"),
    WEBMA(512, "webm", "audio/webm"),
    MP3(768, "mp3", "audio/mpeg"),
    /* JADX INFO: Fake field, exist only in values array */
    MP2(784, "mp2", "audio/mpeg"),
    OPUS(1024, "opus", "audio/opus"),
    OGG(1280, "ogg", "audio/ogg"),
    WEBMA_OPUS(512, "webm", "audio/webm"),
    /* JADX INFO: Fake field, exist only in values array */
    AIFF(1536, "aiff", "audio/aiff"),
    /* JADX INFO: Fake field, exist only in values array */
    AIF(1536, "aif", "audio/aiff"),
    /* JADX INFO: Fake field, exist only in values array */
    WAV(1792, "wav", "audio/wav"),
    /* JADX INFO: Fake field, exist only in values array */
    FLAC(2048, "flac", "audio/flac"),
    /* JADX INFO: Fake field, exist only in values array */
    ALAC(2304, "alac", "audio/alac"),
    /* JADX INFO: Fake field, exist only in values array */
    VTT(4096, "vtt", "text/vtt"),
    TTML(8192, "ttml", "application/ttml+xml"),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSCRIPT1(12288, "srv1", "text/xml"),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSCRIPT2(16384, "srv2", "text/xml"),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSCRIPT3(20480, "srv3", "text/xml"),
    /* JADX INFO: Fake field, exist only in values array */
    SRT(24576, "srt", "text/srt");

    public final int b;
    public final String c;
    public final String d;

    EnumC1316h(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public static EnumC1316h a(String str) {
        return (EnumC1316h) Arrays.stream(values()).filter(new C0685d(str, 3)).findFirst().orElse(null);
    }
}
