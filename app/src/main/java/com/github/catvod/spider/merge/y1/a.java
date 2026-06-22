package com.github.catvod.spider.merge.y1;

import com.github.catvod.spider.merge.L1.k;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.p1.i;
import com.github.catvod.spider.merge.q1.c;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a extends c {
    private static final a a = new a();

    private a() {
    }

    public static a s() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) {
        return k.d("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/conferences/)|(?:media\\.ccc\\.de/[bc]/))([^/?&#]*)", str, 1);
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        try {
            return k.d("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/conferences/)|(?:media\\.ccc\\.de/[bc]/))([^/?&#]*)", str, 1) != null;
        } catch (i unused) {
            return false;
        }
    }

    @Override // com.github.catvod.spider.merge.q1.c
    public final String q(String str, List list) {
        return C1290c.a("https://media.ccc.de/c/", str);
    }
}
