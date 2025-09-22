package com.github.catvod.spider.merge;

import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.AV */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0055AV {

    /* renamed from: com.github.catvod.spider.merge.AV$p */
    public static class p extends IllegalStateException {
        public p(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    @Nullable
    /* renamed from: QU */
    public static C0127lK m118QU(String str, C0127lK c0127lK) {
        C0111bw.m557i(str);
        return C0162zx.m786xC(C0078NH.m290E(str), c0127lK);
    }

    /* renamed from: q */
    public static C0116dX m119q(String str, C0127lK c0127lK) {
        C0111bw.m557i(str);
        return m120xC(C0078NH.m290E(str), c0127lK);
    }

    /* renamed from: xC */
    public static C0116dX m120xC(AbstractC0123i abstractC0123i, C0127lK c0127lK) {
        C0111bw.m559se(abstractC0123i);
        C0111bw.m559se(c0127lK);
        return C0162zx.m785q(abstractC0123i, c0127lK);
    }
}
