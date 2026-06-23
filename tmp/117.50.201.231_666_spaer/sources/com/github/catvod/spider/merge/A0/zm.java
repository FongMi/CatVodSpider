package com.github.catvod.spider.merge.A0;

import java.util.Comparator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class zm implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ zm(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((abf) obj).a - ((abf) obj2).a;
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
