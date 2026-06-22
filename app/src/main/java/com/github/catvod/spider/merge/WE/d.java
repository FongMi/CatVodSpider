package com.github.catvod.spider.merge.WE;

import com.github.catvod.spider.merge.ZrJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class d implements g {
    private final ThreadLocal<String> a = new ThreadLocal<>();
    private final List<b> b = new ArrayList();

    d() {
    }

    @Override // com.github.catvod.spider.merge.WE.g
    public final void a(Object obj) {
        String strD = obj == null ? ZrJ.d("17362721") : !obj.getClass().isArray() ? obj.toString() : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof Object[] ? Arrays.deepToString((Object[]) obj) : ZrJ.d("3A2C3E212C2B5E376B2B212B1D632A6D2B2A0B312E2E3C650D3A3B28682316316B392020592C29272D260D");
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.WE.b>] */
    public final void b(b bVar) {
        this.b.add(bVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.WE.b>] */
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
            str2 = ZrJ.d("3C2E3B39316A37160701682916246B202D360A222C28");
        }
        for (b bVar : this.b) {
            bVar.a();
            bVar.b(str, str2);
        }
    }

    public final g d(String str) {
        this.a.set(str);
        return this;
    }
}
