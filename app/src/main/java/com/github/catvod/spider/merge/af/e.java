package com.github.catvod.spider.merge.af;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e {
    private final String a;

    public e() {
        this.a = "";
        new HashMap();
    }

    public e(String str) {
        this.a = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }
}
