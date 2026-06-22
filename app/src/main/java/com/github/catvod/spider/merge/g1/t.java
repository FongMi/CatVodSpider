package com.github.catvod.spider.merge.G1;

import java.util.function.Predicate;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class t implements Predicate {
    public static final /* synthetic */ t b = new t(0);
    public static final /* synthetic */ t c = new t(1);
    public static final /* synthetic */ t d = new t(2);
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((C0682a) obj) != null;
            case 1:
                int i = J.f;
                return ((com.github.catvod.spider.merge.D0.e) obj).containsKey("thumbnailOverlayTimeStatusRenderer");
            default:
                return S.t((com.github.catvod.spider.merge.D0.e) obj);
        }
    }
}
