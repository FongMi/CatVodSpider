package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o extends e {
    private final boolean f;
    private final String g;

    o(String str, String str2, boolean z, EnumC1316h enumC1316h, final String str3, boolean z2) throws Throwable {
        super(str2, z, enumC1316h, 1);
        com.github.catvod.spider.merge.L1.c.a(str3).orElseThrow(new Supplier() { // from class: com.github.catvod.spider.merge.I1.m
            @Override // java.util.function.Supplier
            public final Object get() {
                return new com.github.catvod.spider.merge.p1.i(C1290c.a("not a valid locale language code: ", str3));
            }
        });
        this.g = str3;
        this.f = z2;
    }

    @Override // com.github.catvod.spider.merge.I1.e
    public final boolean b(e eVar) {
        if (super.b(eVar) && (eVar instanceof o)) {
            o oVar = (o) eVar;
            if (this.g.equals(oVar.g) && this.f == oVar.f) {
                return true;
            }
        }
        return false;
    }
}
