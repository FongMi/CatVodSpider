package com.github.catvod.spider.merge.y;

import java.util.Collection;
import java.util.UUID;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class K implements G {
    public static final K a = new K();

    K() {
    }

    @Override // com.github.catvod.spider.merge.y.G
    public final Object a(N n, Object obj, Object obj2) {
        return obj2 == null ? "null" : obj2 instanceof Collection ? "array" : obj2 instanceof Number ? "number" : obj2 instanceof Boolean ? "boolean" : ((obj2 instanceof String) || (obj2 instanceof UUID) || (obj2 instanceof Enum)) ? "string" : "object";
    }
}
