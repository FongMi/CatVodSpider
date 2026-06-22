package com.github.catvod.spider.merge.x1;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                return new j((com.github.catvod.spider.merge.D0.e) this.b, (String) entry.getKey(), (com.github.catvod.spider.merge.D0.e) entry.getValue());
            default:
                return (com.github.catvod.spider.merge.D0.e) ((Class) this.b).cast(obj);
        }
    }
}
