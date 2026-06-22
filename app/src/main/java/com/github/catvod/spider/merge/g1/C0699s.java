package com.github.catvod.spider.merge.G1;

import com.github.catvod.spider.merge.m1.InterfaceC1314f;
import java.util.function.Predicate;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0699s implements Predicate {
    public static final /* synthetic */ C0699s b = new C0699s(0);
    public static final /* synthetic */ C0699s c = new C0699s(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C0699s(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((InterfaceC1314f) obj) != null;
            default:
                return !com.github.catvod.spider.merge.L1.m.l((com.github.catvod.spider.merge.D0.e) obj);
        }
    }
}
