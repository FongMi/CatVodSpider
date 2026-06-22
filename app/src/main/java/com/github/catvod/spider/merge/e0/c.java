package com.github.catvod.spider.merge.E0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class c implements d {
    private final ThreadLocal<String> a = new ThreadLocal<>();
    private final List<a> b = new ArrayList();

    c() {
    }

    @Override // com.github.catvod.spider.merge.E0.d
    public final void a(Object obj) {
        String string = obj == null ? "null" : !obj.getClass().isArray() ? obj.toString() : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof Object[] ? Arrays.deepToString((Object[]) obj) : "Couldn't find a correct type for the object";
        synchronized (this) {
            string.getClass();
            String str = this.a.get();
            if (str != null) {
                this.a.remove();
            } else {
                str = null;
            }
            b(str, string);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.E0.a>] */
    public final synchronized void b(String str, String str2) {
        if (str2 != null) {
            try {
                if (str2.length() == 0) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (a aVar : this.b) {
            if (aVar.b()) {
                aVar.a();
            }
        }
    }

    public final d c(String str) {
        this.a.set(str);
        return this;
    }
}
