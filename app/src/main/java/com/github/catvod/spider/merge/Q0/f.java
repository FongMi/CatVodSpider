package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.n0.C1346a;
import com.github.catvod.spider.merge.n0.C1349d;
import com.github.catvod.spider.merge.w0.InterfaceC1402a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f extends AbstractC1379a<f, com.github.catvod.spider.merge.v0.d> {
    private final String b;
    private Map<Integer, InterfaceC1402a> c = new HashMap();

    public f(String str) {
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.github.catvod.spider.merge.w0.a>] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.github.catvod.spider.merge.w0.a>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.github.catvod.spider.merge.w0.a>] */
    public final String c() {
        int length;
        ArrayList<InterfaceC1402a> arrayList = null;
        if (this.c.isEmpty()) {
            return null;
        }
        if (this.c.isEmpty()) {
            length = 0;
        } else {
            arrayList = new ArrayList(this.c.values());
            arrayList.sort(new Comparator() { // from class: com.github.catvod.spider.merge.q0.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((InterfaceC1402a) obj).a() - ((InterfaceC1402a) obj2).a();
                }
            });
            Iterator it = arrayList.iterator();
            length = 0;
            while (it.hasNext()) {
                length += ((InterfaceC1402a) it.next()).length();
            }
        }
        byte[] bArr = new byte[arrayList != null ? length + 2 : length];
        if (arrayList != null) {
            bArr[0] = 18;
            bArr[1] = (byte) length;
            int length2 = 2;
            for (InterfaceC1402a interfaceC1402a : arrayList) {
                System.arraycopy(interfaceC1402a.data(), 0, bArr, length2, interfaceC1402a.length());
                length2 += interfaceC1402a.length();
            }
        }
        return ((C1349d) C1346a.a()).a(bArr).replace("=", "%253D");
    }

    public final String d() {
        return this.b;
    }
}
