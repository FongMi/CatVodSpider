package com.github.catvod.spider.merge.G1;

import java.util.function.Predicate;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0696o implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ C0696o(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((com.github.catvod.spider.merge.D0.e) obj).containsKey(this.b);
            default:
                return this.b.equals((String) obj);
        }
    }
}
