package com.github.catvod.spider.merge.G1;

import java.time.LocalDate;
import java.util.function.Function;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0695n implements Function {
    public static final /* synthetic */ C0695n b = new C0695n(0);
    public static final /* synthetic */ C0695n c = new C0695n(1);
    public static final /* synthetic */ C0695n d = new C0695n(2);
    public static final /* synthetic */ C0695n e = new C0695n(3);
    public final /* synthetic */ int a;

    public /* synthetic */ C0695n(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return G.g0((LocalDate) obj);
            case 1:
                return ((com.github.catvod.spider.merge.D0.e) obj).g("segmentedLikeDislikeButtonViewModel").g("likeButtonViewModel").g("likeButtonViewModel").g("toggleButtonViewModel").g("toggleButtonViewModel").g("defaultButtonViewModel").g("buttonViewModel");
            case 2:
                return Boolean.valueOf(com.github.catvod.spider.merge.F1.B.v((com.github.catvod.spider.merge.D0.c) obj));
            default:
                int i = S.i;
                return ((String) obj).replace("Premieres ", "");
        }
    }
}
