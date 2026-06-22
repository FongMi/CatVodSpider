package com.github.catvod.spider.merge.z1;

import java.util.function.Predicate;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class d implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;

    public /* synthetic */ d(Class cls, int i) {
        this.a = i;
        this.b = cls;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
        }
        return this.b.isInstance(obj);
    }
}
