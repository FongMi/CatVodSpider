package com.github.catvod.spider.merge.v0;

import com.github.catvod.spider.merge.y.C1413b;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i implements g {
    private final String b;
    private final List<j> c;

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.v0.j>] */
    public i(C1416e c1416e) {
        this.b = c1416e.u("title").x("simpleText");
        C1416e c1416eU = c1416e.u("content");
        String next = c1416eU.keySet().iterator().next();
        boolean zContains = next.contains("Movie");
        C1413b c1413bT = c1416eU.u(next).t("items");
        this.c = new ArrayList(c1413bT.size());
        for (int i = 0; i < c1413bT.size(); i++) {
            C1416e c1416eO = c1413bT.o(i);
            this.c.add(new j(c1416eO.u(c1416eO.keySet().iterator().next()), zContains));
        }
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
    public final int c() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.v0.g
    public final e d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.github.catvod.spider.merge.v0.g
    public final h e() {
        throw new UnsupportedOperationException();
    }
}
