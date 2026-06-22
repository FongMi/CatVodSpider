package com.github.catvod.spider.merge.C;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0595a {
    public static com.github.catvod.spider.merge.A.g a(com.github.catvod.spider.merge.A.i iVar, int i, int i2) {
        iVar.m(i, i2);
        return new com.github.catvod.spider.merge.A.g();
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "VIDEO_STREAM";
        }
        if (i == 3) {
            return "AUDIO_STREAM";
        }
        if (i == 4) {
            return "LIVE_STREAM";
        }
        if (i == 5) {
            return "AUDIO_LIVE_STREAM";
        }
        if (i == 6) {
            return "POST_LIVE_STREAM";
        }
        if (i == 7) {
            return "POST_LIVE_AUDIO_STREAM";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        return i == 1 ? "NONE" : i == 2 ? "VIDEO_STREAM" : i == 3 ? "AUDIO_STREAM" : i == 4 ? "LIVE_STREAM" : i == 5 ? "AUDIO_LIVE_STREAM" : i == 6 ? "POST_LIVE_STREAM" : i == 7 ? "POST_LIVE_AUDIO_STREAM" : "null";
    }

    public static /* synthetic */ String d(int i) {
        return i == 1 ? "STREAM" : i == 2 ? "PLAYLIST" : i == 3 ? "CHANNEL" : i == 4 ? "COMMENT" : "null";
    }
}
