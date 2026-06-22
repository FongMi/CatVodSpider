package com.github.catvod.spider.merge;

import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class ii extends k {
    public ii() {
        super("Apache Common Logging");
        l8(LogFactory.class);
    }

    @Override // com.github.catvod.spider.merge.k
    /* JADX INFO: renamed from: S */
    public rv OL(Class<?> cls) {
        try {
            return new L(cls);
        } catch (Exception unused) {
            return new rs(cls);
        }
    }

    @Override // com.github.catvod.spider.merge.k
    protected void l8(Class<?> cls) {
        super.l8(cls);
        T4(ii.class);
    }
}
