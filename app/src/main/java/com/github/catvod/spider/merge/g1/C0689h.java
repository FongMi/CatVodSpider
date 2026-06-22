package com.github.catvod.spider.merge.G1;

import java.util.function.Supplier;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0689h implements Supplier {
    public static final /* synthetic */ C0689h b = new C0689h(0);
    public static final /* synthetic */ C0689h c = new C0689h(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C0689h(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new com.github.catvod.spider.merge.p1.i("Could not get thumbnailOverlayBadgeViewModel");
            default:
                int i = S.i;
                return new com.github.catvod.spider.merge.p1.i("Could not get uploader name");
        }
    }
}
