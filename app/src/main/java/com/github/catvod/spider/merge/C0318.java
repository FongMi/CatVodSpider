package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0319;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޠ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0318 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static AbstractC0323 m1228(String str) {
        return m1229(str, SOY.d("46273F1D1A180D3C6F"));
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static AbstractC0323 m1229(String str, String str2) {
        C0319.C0321 c0321M1230 = C0319.m1230(str.length());
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        c0321M1230.m1246(charBufferAllocate);
        return AbstractC0323.m1250(c0321M1230.m1247(), str2);
    }
}
