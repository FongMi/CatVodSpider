package com.github.catvod.spider.merge.G1;

import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class M implements Function {
    public static final /* synthetic */ M b = new M(0);
    public static final /* synthetic */ M c = new M(1);
    public final /* synthetic */ int a;

    public /* synthetic */ M(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                int i = S.i;
                return ((com.github.catvod.spider.merge.D0.e) obj).g("thumbnailBadgeViewModel").i("text", null);
            default:
                int i2 = S.i;
                return ((com.github.catvod.spider.merge.D0.e) obj).g("thumbnailBadgeViewModel");
        }
    }
}
