package com.github.catvod.spider.merge.n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0609d implements InterfaceC0611f {
    private final ThreadLocal<String> a = new ThreadLocal<>();
    private final List<InterfaceC0607b> b = new ArrayList();

    C0609d() {
    }

    @Override // com.github.catvod.spider.merge.n.InterfaceC0611f
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.n.b>] */
    public final void b(InterfaceC0607b interfaceC0607b) {
        this.b.add(interfaceC0607b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.n.b>] */
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
        for (InterfaceC0607b interfaceC0607b : this.b) {
            interfaceC0607b.a();
            interfaceC0607b.b(str, str2);
        }
    }

    public final InterfaceC0611f d(String str) {
        this.a.set(str);
        return this;
    }
}
