package com.github.catvod.spider.merge.B;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class m implements com.github.catvod.spider.merge.H.f<Class<?>, Boolean> {
    m() {
    }

    @Override // com.github.catvod.spider.merge.H.f
    public final Boolean apply(Class<?> cls) {
        Class<?> cls2 = cls;
        return Boolean.valueOf(cls2 == Date.class || cls2 == Time.class || cls2 == Timestamp.class);
    }
}
