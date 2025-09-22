package com.github.catvod.spider.merge;

import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.qf */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public final class C0139qf {
    /* renamed from: QU */
    public static String m698QU(String str, boolean z) {
        return z ? m699q(str) : m700xC(str);
    }

    /* renamed from: q */
    public static String m699q(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* renamed from: xC */
    public static String m700xC(String str) {
        return m699q(str).trim();
    }
}
