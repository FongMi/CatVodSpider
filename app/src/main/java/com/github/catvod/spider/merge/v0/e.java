package com.github.catvod.spider.merge.v0;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.AbstractList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e extends AbstractC1398a {
    private final String d;
    private final String e;

    public e(C1416e c1416e) {
        super(c1416e);
        this.d = c1416e.x("channelId");
        this.e = C0899d.j(c1416e.u("videoCountText"));
        if (c1416e.containsKey("subscriberCountText")) {
            c1416e.u("subscriberCountText").x("simpleText");
        }
        C0899d.j(c1416e.u("descriptionSnippet"));
        this.c = (AbstractList) C0899d.k(c1416e.u("thumbnail"));
    }

    @Override // com.github.catvod.spider.merge.v0.g
    public final int c() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.v0.AbstractC1398a, com.github.catvod.spider.merge.v0.g
    public final e d() {
        return this;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.e;
    }
}
