package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.y.C1415d;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class z implements w {
    public final Class<y> a;

    public z(Class<y> cls) {
        this.a = cls;
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        try {
            return (T) bVar.n(this.a.newInstance(), obj);
        } catch (Exception unused) {
            throw new C1415d("craete instance error");
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 12;
    }
}
