package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၿ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0576 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public final Map<C0579, C0579> f1264 = new HashMap();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public volatile C0579 f1265;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public final int f1266;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final AbstractC0429 f1267;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private final boolean f1268;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ၿ$Ϳ, reason: contains not printable characters */
    class C0577 implements Comparator<C0579> {
        C0577() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(C0579 c0579, C0579 c05792) {
            return c0579.f1272 - c05792.f1272;
        }
    }

    public C0576(AbstractC0429 abstractC0429, int i) {
        this.f1267 = abstractC0429;
        this.f1266 = i;
        boolean z = false;
        if ((abstractC0429 instanceof C0570) && ((C0570) abstractC0429).f1260) {
            C0579 c0579 = new C0579(new C0407());
            c0579.f1274 = new C0579[0];
            c0579.f1275 = false;
            c0579.f1278 = false;
            this.f1265 = c0579;
            z = true;
        }
        this.f1268 = z;
    }

    public String toString() {
        return m1844(C0403.f989);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public final C0579 m1840(int i) {
        if (!m1842()) {
            throw new IllegalStateException(SOY.d("353C3D0F54070837321310121431345630313B21711B150E5A313E180016133C711754070837321310121431345607031B20255607031B263458"));
        }
        if (i < 0 || i >= this.f1265.f1274.length) {
            return null;
        }
        return this.f1265.f1274[i];
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public List<C0579> m1841() {
        ArrayList arrayList = new ArrayList(this.f1264.keySet());
        Collections.sort(arrayList, new C0577());
        return arrayList;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public final boolean m1842() {
        return this.f1268;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final void m1843(int i, C0579 c0579) {
        if (!m1842()) {
            throw new IllegalStateException(SOY.d("353C3D0F54070837321310121431345630313B21711B150E5A313E180016133C711754070837321310121431345607031B20255607031B263458"));
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f1265) {
            if (i >= this.f1265.f1274.length) {
                this.f1265.f1274 = (C0579[]) Arrays.copyOf(this.f1265.f1274, i + 1);
            }
            this.f1265.f1274[i] = c0579;
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public String m1844(InterfaceC0402 interfaceC0402) {
        return this.f1265 == null ? "" : new C0578(this, interfaceC0402).toString();
    }
}
