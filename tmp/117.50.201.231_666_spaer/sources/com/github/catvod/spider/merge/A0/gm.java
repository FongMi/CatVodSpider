package com.github.catvod.spider.merge.A0;

import java.util.Comparator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class gm implements Comparator {
    public static final gm a = new gm(0);
    public static final gm b = new gm(1);
    public final /* synthetic */ int c;

    public /* synthetic */ gm(int i) {
        this.c = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                ko.f("a", comparable);
                ko.f("b", comparable2);
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                ko.f("a", comparable3);
                ko.f("b", comparable4);
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.c) {
            case 0:
                return b;
            default:
                return a;
        }
    }
}
