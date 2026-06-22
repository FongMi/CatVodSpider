package com.github.catvod.spider.merge.r;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.r.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0229e implements InterfaceC0232h {
    private final ThreadLocal<String> a = new ThreadLocal<>();
    private final List<InterfaceC0226b> b = new ArrayList();

    C0229e() {
    }

    @Override // com.github.catvod.spider.merge.r.InterfaceC0232h
    public final void a(Object obj) {
        String strD = obj == null ? oZP.d("1B1A1B2D") : !obj.getClass().isArray() ? obj.toString() : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof Object[] ? Arrays.deepToString((Object[]) obj) : oZP.d("3600022D083B521B5727053B114F16610F3A071D12221875011607244C331A1D573504305500152B093601");
        synchronized (this) {
            strD.getClass();
            String str = this.a.get();
            if (str != null) {
                this.a.remove();
            } else {
                str = null;
            }
            c(str, strD);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.r.b>] */
    public final void b(InterfaceC0226b interfaceC0226b) {
        this.b.add(interfaceC0226b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.r.b>] */
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
            str2 = oZP.d("30020735157A3B3A3B0D4C391A08572C0926060E1024");
        }
        for (InterfaceC0226b interfaceC0226b : this.b) {
            interfaceC0226b.a();
            interfaceC0226b.b(str, str2);
        }
    }

    public final InterfaceC0232h d(String str) {
        this.a.set(str);
        return this;
    }
}
