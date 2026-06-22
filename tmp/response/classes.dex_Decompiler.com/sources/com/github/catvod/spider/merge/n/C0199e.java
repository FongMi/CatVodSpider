package com.github.catvod.spider.merge.n;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0199e {
    private final int a;
    private final String b;
    private final Map<String, List<String>> c;

    public C0199e() {
        this.a = 500;
        this.b = "";
        this.c = new HashMap();
    }

    public C0199e(int i, String str, Map<String, List<String>> map) {
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
