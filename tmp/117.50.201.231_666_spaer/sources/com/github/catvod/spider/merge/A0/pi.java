package com.github.catvod.spider.merge.A0;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class pi extends AbstractList implements List, fe {
    public abstract int i();

    public abstract Object j(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return j(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return i();
    }
}
