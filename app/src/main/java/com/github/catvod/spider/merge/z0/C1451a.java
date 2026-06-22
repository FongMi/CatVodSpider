package com.github.catvod.spider.merge.z0;

import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.C1413b;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1451a extends com.github.catvod.spider.merge.t0.b {
    private boolean h;

    public C1451a(C1416e c1416e) {
        super(c1416e);
        this.e = c1416e.x("title");
        this.f = c1416e.x("author");
        this.g = c1416e.o("isLive");
        if (c1416e.containsKey("keywords")) {
            C1413b c1413bT = c1416e.t("keywords");
            c1413bT.getClass();
            ArrayList arrayList = new ArrayList(c1413bT.size());
            o oVar = o.v;
            Iterator<Object> it = c1413bT.iterator();
            while (it.hasNext()) {
                arrayList.add(A.d(it.next(), String.class, oVar));
            }
        } else {
            new ArrayList();
        }
        c1416e.x("shortDescription");
        c1416e.q("averageRating");
        c1416e.w("viewCount");
        this.h = c1416e.o("isLiveContent");
    }

    public C1451a(String str) {
        this.b = str;
    }

    public final boolean j() {
        return (f() || (this.h && g() == 0)) ? false : true;
    }
}
