package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢪ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0405 {

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public C0558[] f996;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public C0559[] f997;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public final EnumC0420 f999;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public final int f1000;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public int[] f1001;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public InterfaceC0444[] f1002;

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public final List<AbstractC0419> f994 = new ArrayList();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public final List<AbstractC0429> f995 = new ArrayList();

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public final Map<String, C0572> f998 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public final List<C0572> f1003 = new ArrayList();

    public C0405(EnumC0420 enumC0420, int i) {
        this.f999 = enumC0420;
        this.f1000 = i;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public void m1544(AbstractC0419 abstractC0419) {
        if (abstractC0419 != null) {
            abstractC0419.f1041 = this;
            abstractC0419.f1042 = this.f994.size();
        }
        this.f994.add(abstractC0419);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public int m1545(AbstractC0429 abstractC0429) {
        this.f995.add(abstractC0429);
        int size = this.f995.size() - 1;
        abstractC0429.f1058 = size;
        return size;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public AbstractC0429 m1546(int i) {
        if (this.f995.isEmpty()) {
            return null;
        }
        return this.f995.get(i);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public C0245 m1547(int i, C0396 c0396) {
        if (i < 0 || i >= this.f994.size()) {
            throw new IllegalArgumentException(SOY.d("333C2717181E1E72220215031F723F0319151F207F"));
        }
        C0245 c0245M1549 = m1549(this.f994.get(i));
        if (!c0245M1549.m895(-2)) {
            return c0245M1549;
        }
        C0245 c0245 = new C0245(new int[0]);
        c0245.m893(c0245M1549);
        c0245.m899(-2);
        while (c0396 != null && c0396.f987 >= 0 && c0245M1549.m895(-2)) {
            c0245M1549 = m1549(((C0560) this.f994.get(c0396.f987).m1601(0)).f1248);
            c0245.m893(c0245M1549);
            c0245.m899(-2);
            c0396 = c0396.f986;
        }
        if (c0245M1549.m895(-2)) {
            c0245.m890(-1);
        }
        return c0245;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public int m1548() {
        return this.f995.size();
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public C0245 m1549(AbstractC0419 abstractC0419) {
        C0245 c0245 = abstractC0419.f1046;
        if (c0245 != null) {
            return c0245;
        }
        C0245 c0245M1550 = m1550(abstractC0419, null);
        abstractC0419.f1046 = c0245M1550;
        c0245M1550.m900(true);
        return abstractC0419.f1046;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public C0245 m1550(AbstractC0419 abstractC0419, C0396 c0396) {
        return new C0438(this).m1634(abstractC0419, c0396);
    }
}
