package com.github.catvod.spider.merge.G1;

import java.util.function.Function;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0693l implements Function {
    public static final /* synthetic */ C0693l b = new C0693l(0);
    public static final /* synthetic */ C0693l c = new C0693l(1);
    public static final /* synthetic */ C0693l d = new C0693l(2);
    public final /* synthetic */ int a;

    public /* synthetic */ C0693l(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((com.github.catvod.spider.merge.D0.e) obj).g("metadataRowRenderer").b("contents").stream().filter(new com.github.catvod.spider.merge.A1.c(com.github.catvod.spider.merge.D0.e.class, 3)).map(new com.github.catvod.spider.merge.A1.a(com.github.catvod.spider.merge.D0.e.class, 3));
            case 1:
                int i = J.f;
                return ((com.github.catvod.spider.merge.D0.e) obj).g("thumbnailOverlayTimeStatusRenderer");
            default:
                int i2 = S.i;
                return ((com.github.catvod.spider.merge.D0.e) obj).g("clientResource").i("imageName", null);
        }
    }
}
