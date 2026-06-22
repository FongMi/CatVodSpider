package com.github.catvod.spider.merge.f1;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o2 implements Comparator<Object>, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (!(obj instanceof Integer)) {
            return obj2 instanceof Integer ? 1 : 0;
        }
        if (obj2 instanceof Integer) {
            return ((Integer) obj).compareTo((Integer) obj2);
        }
        return -1;
    }
}
