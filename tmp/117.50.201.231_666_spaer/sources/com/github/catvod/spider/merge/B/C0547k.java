package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.c.C0554e;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class C0547k {
    public static StringBuilder a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void b(String str, String str2, String str3, String str4, ArrayList arrayList) {
        arrayList.add(new C0554e(str, str2, str3, str4));
    }

    public static int c(String str, String str2, String str3, String str4, ArrayList arrayList, int i, int i2) {
        arrayList.add(new C0554e(str, str2, str3, str4));
        return i + i2;
    }

    public static void c(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }
}
