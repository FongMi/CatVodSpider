package com.github.catvod.spider.merge.AB.m;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e {
    private final int a;
    private final String b;
    private final Map<String, List<String>> c;

    public e() {
        this.a = 500;
        this.b = "";
        this.c = new HashMap();
    }

    public e(int i, String str, Map<String, List<String>> map) {
        this.a = i;
        this.b = str;
        this.c = map;
    }

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final int b() {
        return this.a;
    }

    public final Map<String, List<String>> c() {
        return this.c;
    }
}
