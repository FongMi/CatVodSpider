package com.github.catvod.spider.merge.bY;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0926u {
    public static String a(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2));
        sb.append(str);
        return sb.toString();
    }

    public static Matcher b(byte[] bArr, byte[] bArr2, String str) {
        return Pattern.compile(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2)).matcher(str);
    }

    public static /* synthetic */ boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
