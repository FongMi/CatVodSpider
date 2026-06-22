package com.github.catvod.spider.merge.G1;

import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class N implements Function {
    public static final /* synthetic */ N b = new N(0);
    public static final /* synthetic */ N c = new N(1);
    public final /* synthetic */ int a;

    public /* synthetic */ N(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                int i = S.i;
                break;
            default:
                int i2 = S.i;
                break;
        }
        return ((com.github.catvod.spider.merge.D0.e) obj).g("thumbnailOverlayBadgeViewModel").b("thumbnailBadges").b();
    }
}
