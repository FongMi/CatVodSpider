package com.github.catvod.spider.merge.v0;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.v0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1398a implements g {
    private String b;
    protected List<String> c;

    public AbstractC1398a(C1416e c1416e) {
        this.b = c1416e.u("title").x("simpleText");
        C0899d.j(c1416e.u("shortBylineText"));
    }

    @Override // com.github.catvod.spider.merge.v0.g
    public final j a() {
        throw new UnsupportedOperationException();
    }

    @Override // com.github.catvod.spider.merge.v0.f
    public final String b() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.v0.g
    public e d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.github.catvod.spider.merge.v0.g
    public h e() {
        throw new UnsupportedOperationException();
    }

    public final List<String> f() {
        return this.c;
    }
}
