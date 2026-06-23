package com.github.catvod.spider.merge.AC;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class h {
    private final int a;
    private final String b;

    public h() {
        this.a = 500;
        this.b = "";
        new HashMap();
    }

    public h(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String a() {
        String str = this.b;
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public final int b() {
        return this.a;
    }
}
