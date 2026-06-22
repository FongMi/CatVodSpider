package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.q0.AbstractC1379a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.q0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1379a<T extends AbstractC1379a<T, S>, S> {
    protected Map<String, String> a;

    public final Map<String, String> a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final T b(String str, String str2) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, str2);
        return this;
    }
}
