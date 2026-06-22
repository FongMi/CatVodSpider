package com.github.catvod.spider.merge.v0;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.y.C1413b;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h extends AbstractC1398a {
    private final String d;
    private final int e;

    public h(C1416e c1416e) {
        super(c1416e);
        this.d = c1416e.x("playlistId");
        C1413b c1413bT = c1416e.t("thumbnails");
        this.c = new LinkedList();
        for (int i = 0; i < c1413bT.size(); i++) {
            this.c.addAll(C0899d.k(c1413bT.o(i)));
        }
        this.e = c1416e.containsKey("videoCount") ? Integer.parseInt(c1416e.x("videoCount")) : -1;
    }

    @Override // com.github.catvod.spider.merge.v0.g
    public final int c() {
        return 3;
    }

    @Override // com.github.catvod.spider.merge.v0.AbstractC1398a, com.github.catvod.spider.merge.v0.g
    public final h e() {
        return this;
    }

    public final String g() {
        return this.d;
    }

    public final int h() {
        return this.e;
    }
}
