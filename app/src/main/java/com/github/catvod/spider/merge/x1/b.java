package com.github.catvod.spider.merge.x1;

import com.github.catvod.spider.merge.G1.S;
import com.github.catvod.spider.merge.m1.C1311c;
import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class b implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((com.github.catvod.spider.merge.D0.e) obj).g((String) this.b).i("url", "");
            case 1:
                String str = (String) this.b;
                com.github.catvod.spider.merge.L1.a aVar = (com.github.catvod.spider.merge.L1.a) obj;
                int i = com.github.catvod.spider.merge.C1.b.d;
                return new C1311c(String.format(str, aVar.c()), aVar.a(), aVar.d(), aVar.b());
            default:
                return S.u((S) this.b, (com.github.catvod.spider.merge.D0.e) obj);
        }
    }
}
