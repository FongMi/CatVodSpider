package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Youtube;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class z implements Predicate {
    public static final /* synthetic */ z b = new z(0);
    public static final /* synthetic */ z c = new z(1);
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((com.github.catvod.spider.merge.A0.f) obj).e();
            default:
                int i = Youtube.t;
                return ((com.github.catvod.spider.merge.A0.f) obj).k().ordinal() > 4;
        }
    }
}
