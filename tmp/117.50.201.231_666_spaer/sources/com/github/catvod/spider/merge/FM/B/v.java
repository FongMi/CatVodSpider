package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.FM.a.C0298a;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class v {
    public static String a(String str, Object[] objArr, StringBuilder sb) {
        sb.append(String.format(str, objArr));
        return sb.toString();
    }

    public static String b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void c(byte[] bArr, byte[] bArr2, StringBuilder sb, Exception exc) {
        sb.append(C0298a.b(bArr, bArr2));
        sb.append(exc);
        SpiderDebug.log(sb.toString());
    }
}
