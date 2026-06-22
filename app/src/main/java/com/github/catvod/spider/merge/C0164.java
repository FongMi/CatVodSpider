package com.github.catvod.spider.merge;

import java.util.Objects;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˮ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0164 {
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static <T> T m578(T t, final String str, final Object... objArr) {
        Objects.requireNonNull(t, (Supplier<String>) new Supplier() { // from class: com.github.catvod.spider.merge.ʹ
            @Override // java.util.function.Supplier
            public final Object get() {
                return String.format(str, objArr);
            }
        });
        return t;
    }
}
