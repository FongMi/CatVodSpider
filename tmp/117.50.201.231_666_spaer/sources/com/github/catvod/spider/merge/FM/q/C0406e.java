package com.github.catvod.spider.merge.FM.q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.q.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0406e implements InterfaceC0409h {
    private final ThreadLocal<String> a = new ThreadLocal<>();
    private final List<InterfaceC0403b> b = new ArrayList();

    C0406e() {
    }

    @Override // com.github.catvod.spider.merge.FM.q.InterfaceC0409h
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
            c(str, string);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.q.b>] */
    public final void b(InterfaceC0403b interfaceC0403b) {
        this.b.add(interfaceC0403b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.q.b>] */
    public final synchronized void c(String str, String str2) {
        boolean z;
        if (str2 != null) {
            try {
                z = str2.length() == 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            str2 = "Empty/NULL log message";
        }
        for (InterfaceC0403b interfaceC0403b : this.b) {
            interfaceC0403b.a();
            interfaceC0403b.b(str, str2);
        }
    }

    public final InterfaceC0409h d(String str) {
        this.a.set(str);
        return this;
    }
}
