package com.github.catvod.spider.merge.G1;

import java.util.function.Function;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0692k implements Function {
    public static final /* synthetic */ C0692k b = new C0692k(0);
    public static final /* synthetic */ C0692k c = new C0692k(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C0692k(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((com.github.catvod.spider.merge.D0.e) obj).g("macroMarkersListItemRenderer");
            default:
                int i = S.i;
                return ((com.github.catvod.spider.merge.D0.e) obj).g("text").b("attachmentRuns");
        }
    }
}
