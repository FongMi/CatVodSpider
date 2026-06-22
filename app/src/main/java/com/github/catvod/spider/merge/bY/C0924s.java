package com.github.catvod.spider.merge.bY;

import com.google.gson.Gson;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0924s {
    public static Object a(String str, Class cls) {
        return new Gson().fromJson(str, cls);
    }

    public static void b(String str, String str2, String str3, String str4, ArrayList arrayList) {
        arrayList.add(new com.github.catvod.spider.merge.KI.k(str, str2, str3, str4));
    }
}
