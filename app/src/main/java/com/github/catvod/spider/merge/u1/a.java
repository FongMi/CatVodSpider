package com.github.catvod.spider.merge.u1;

import com.github.catvod.spider.merge.F1.n;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.C1311c;
import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.L1.a aVar = (com.github.catvod.spider.merge.L1.a) obj;
                return new C1311c(C1290c.a(this.b, aVar.c()), aVar.a(), aVar.d(), aVar.b());
            default:
                String str = this.b;
                int i = n.b;
                return str;
        }
    }
}
