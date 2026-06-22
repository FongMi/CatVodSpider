package com.github.catvod.spider.merge.z1;

import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.C1311c;
import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class c implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) obj;
                return new C1311c(C1290c.a((String) this.b, eVar.i("path", null)), -1, eVar.e("width", -1), 4);
            default:
                return (com.github.catvod.spider.merge.D0.e) ((Class) this.b).cast(obj);
        }
    }
}
