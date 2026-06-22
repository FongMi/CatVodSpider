package com.github.catvod.spider.merge.z0;

import com.github.catvod.spider.merge.A0.c;
import com.github.catvod.spider.merge.A0.f;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1452b {
    private final C1451a a;
    private final List<c> b;

    public C1452b(C1451a c1451a, List list) {
        this.a = c1451a;
        this.b = list;
    }

    public final List<com.github.catvod.spider.merge.A0.a> a() {
        LinkedList linkedList = new LinkedList();
        for (c cVar : this.b) {
            if (cVar instanceof com.github.catvod.spider.merge.A0.a) {
                linkedList.add((com.github.catvod.spider.merge.A0.a) cVar);
            }
        }
        return linkedList;
    }

    public final C1451a b() {
        return this.a;
    }

    public final List<f> c() {
        LinkedList linkedList = new LinkedList();
        for (c cVar : this.b) {
            if (cVar instanceof f) {
                linkedList.add((f) cVar);
            }
        }
        return linkedList;
    }
}
