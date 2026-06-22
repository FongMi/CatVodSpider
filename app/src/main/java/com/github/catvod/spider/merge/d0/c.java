package com.github.catvod.spider.merge.D0;

import java.util.ArrayList;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c extends ArrayList<Object> {
    public final e a(int i) {
        e eVar = new e();
        Object obj = get(i);
        return obj instanceof e ? (e) obj : eVar;
    }

    public final Stream<e> b() {
        Class<e> cls = e.class;
        int i = 0;
        return stream().filter(new b(cls, i)).map(new a(cls, i));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < size()) {
            return super.get(i);
        }
        return null;
    }
}
