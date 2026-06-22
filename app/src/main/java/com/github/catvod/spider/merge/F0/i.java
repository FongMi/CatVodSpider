package com.github.catvod.spider.merge.f0;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i {
    private final int a;
    private final String b;

    public i() {
        this.a = 500;
        this.b = "";
        new HashMap();
    }

    public i(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final int b() {
        return this.a;
    }
}
