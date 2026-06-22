package com.github.catvod.spider.merge.C;

import com.google.gson.Gson;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class u {
    public static Object a(String str, Class cls) {
        return new Gson().fromJson(str, cls);
    }

    public static String b(String str, int i) {
        return str + i;
    }

    public static String c(String str, long j) {
        return str + j;
    }
}
