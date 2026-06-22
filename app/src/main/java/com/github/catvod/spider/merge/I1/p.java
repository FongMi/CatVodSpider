package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.F1.C0628d;
import com.github.catvod.spider.merge.m1.EnumC1316h;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p {
    private String a;
    private String b;
    private boolean c;
    private int d = 1;
    private EnumC1316h e;
    private String f;
    private Boolean g;
    private String h;
    private C0628d i;

    public final q a() {
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("The identifier of the video stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
        }
        String str2 = this.b;
        if (str2 == null) {
            throw new IllegalStateException("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
        }
        int i = this.d;
        if (i == 0) {
            throw new IllegalStateException("The delivery method of the video stream has been set as null, which is not allowed. Pass a valid one instead with setDeliveryMethod.");
        }
        Boolean bool = this.g;
        if (bool == null) {
            throw new IllegalStateException("The video stream has been not set as a video-only stream or as a video stream with embedded audio. Please specify this information with setIsVideoOnly.");
        }
        String str3 = this.h;
        if (str3 != null) {
            return new q(str, str2, this.c, this.e, i, str3, bool.booleanValue(), this.f, this.i);
        }
        throw new IllegalStateException("The resolution of the video stream has been not set. Please specify it with setResolution (use an empty string if you are not able to get it).");
    }

    public final p b(String str, boolean z) {
        this.b = str;
        this.c = z;
        return this;
    }

    public final p c(int i) {
        this.d = i;
        return this;
    }

    public final p d(String str) {
        this.a = str;
        return this;
    }

    public final p e(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public final p f(C0628d c0628d) {
        this.i = c0628d;
        return this;
    }

    public final p g(String str) {
        this.f = str;
        return this;
    }

    public final p h(EnumC1316h enumC1316h) {
        this.e = enumC1316h;
        return this;
    }

    public final p i(String str) {
        this.h = str;
        return this;
    }
}
