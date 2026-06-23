package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.c.C0552c;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class C0544h {
    public static String a(String str, C0552c c0552c, int i, int i2, int i3, ArrayList arrayList) {
        c0552c.i(Integer.valueOf(str).intValue(), i, i2, i3);
        c0552c.w(arrayList);
        return c0552c.toString();
    }

    public static String a(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static HashMap c(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put(str, str2);
        map.put(str3, str4);
        return map;
    }
}
