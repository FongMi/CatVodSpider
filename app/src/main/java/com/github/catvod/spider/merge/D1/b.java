package com.github.catvod.spider.merge.D1;

import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class b implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;

    public /* synthetic */ b(Class cls, int i) {
        this.a = i;
        this.b = cls;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
        }
        return (com.github.catvod.spider.merge.D0.e) this.b.cast(obj);
    }
}
