package com.github.catvod.spider.merge.FM.L;

import com.github.catvod.spider.merge.FM.a.C0298a;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class P {
    public static String a(byte[] bArr, byte[] bArr2, StringBuilder sb) {
        sb.append(C0298a.b(bArr, bArr2));
        return sb.toString();
    }

    public static StringBuilder b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ String c(int i) {
        return i == 1 ? "Doctype" : i == 2 ? "StartTag" : i == 3 ? "EndTag" : i == 4 ? "Comment" : i == 5 ? "Character" : i == 6 ? "EOF" : "null";
    }
}
