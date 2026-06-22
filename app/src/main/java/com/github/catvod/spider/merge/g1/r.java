package com.github.catvod.spider.merge.G1;

import java.util.function.Predicate;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class r implements Predicate {
    public static final /* synthetic */ r b = new r(0);
    public static final /* synthetic */ r c = new r(1);
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((String) obj).contains("Age-restricted");
            default:
                return !com.github.catvod.spider.merge.L1.m.l((com.github.catvod.spider.merge.D0.e) obj);
        }
    }
}
