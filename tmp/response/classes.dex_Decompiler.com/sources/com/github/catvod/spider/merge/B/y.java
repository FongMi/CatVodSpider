package com.github.catvod.spider.merge.b;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class y {
    public static String a(String str, String str2) {
        return str + str2;
    }

    public static String b(byte[] bArr, byte[] bArr2, com.github.catvod.spider.merge.L.m mVar) {
        return mVar.o0(C0098a.a(bArr, bArr2)).h();
    }

    public static void c(byte[] bArr, byte[] bArr2, StringBuilder sb, Exception exc) {
        sb.append(C0098a.a(bArr, bArr2));
        sb.append(exc);
        SpiderDebug.log(sb.toString());
    }
}
