package com.github.catvod.spider.merge.G1;

import java.util.function.Function;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0694m implements Function {
    public static final /* synthetic */ C0694m b = new C0694m(0);
    public static final /* synthetic */ C0694m c = new C0694m(1);
    public static final /* synthetic */ C0694m d = new C0694m(2);
    public static final /* synthetic */ C0694m e = new C0694m(3);
    public final /* synthetic */ int a;

    public /* synthetic */ C0694m(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((com.github.catvod.spider.merge.D0.e) obj).i("text", "");
            case 1:
                return ((com.github.catvod.spider.merge.D0.e) obj).g("engagementPanelSectionListRenderer").g("content").g("macroMarkersListRenderer").b("contents");
            case 2:
                return ((com.github.catvod.spider.merge.D0.e) obj).g("segmentedLikeDislikeButtonRenderer").g("likeButton").g("toggleButtonRenderer");
            default:
                return ((com.github.catvod.spider.merge.D0.e) obj).g("listItemViewModel");
        }
    }
}
