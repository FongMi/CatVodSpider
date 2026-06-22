package com.github.catvod.spider.merge.G1;

import java.util.function.Predicate;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0687f implements Predicate {
    public static final /* synthetic */ C0687f b = new C0687f(0);
    public static final /* synthetic */ C0687f c = new C0687f(1);
    public static final /* synthetic */ C0687f d = new C0687f(2);
    public final /* synthetic */ int a;

    public /* synthetic */ C0687f(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((com.github.catvod.spider.merge.D0.e) obj).containsKey("thumbnailOverlayBadgeViewModel");
            case 1:
                return "engagement-panel-macro-markers-description-chapters".equals(((com.github.catvod.spider.merge.D0.e) obj).g("engagementPanelSectionListRenderer").i("panelIdentifier", null));
            default:
                int i = S.i;
                return !com.github.catvod.spider.merge.L1.m.j((String) obj);
        }
    }
}
