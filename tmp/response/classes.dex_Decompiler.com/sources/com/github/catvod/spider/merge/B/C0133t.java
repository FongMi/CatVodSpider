package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.a.C0098a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class C0133t {
    public static String a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String b(byte[] bArr, byte[] bArr2, StringBuilder sb) {
        sb.append(C0098a.a(bArr, bArr2));
        return sb.toString();
    }

    public static StringBuilder c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static Iterator d(byte[] bArr, byte[] bArr2, com.github.catvod.spider.merge.L.h hVar) {
        return hVar.o0(C0098a.a(bArr, bArr2)).iterator();
    }
}
