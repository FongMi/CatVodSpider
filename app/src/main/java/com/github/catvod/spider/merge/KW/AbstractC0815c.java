package com.github.catvod.spider.merge.KW;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0815c extends com.github.catvod.spider.merge.Bk.c<C0814b> {
    public AbstractC0815c(com.github.catvod.spider.merge.Bk.a aVar) {
        super(aVar, 2);
    }

    @Override // com.github.catvod.spider.merge.Bk.c
    protected final C0814b a(Object obj) {
        if (obj instanceof C0814b) {
            return (C0814b) obj;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.Bk.c
    protected final C0814b[] c(int i) {
        return new C0814b[i];
    }

    @Override // com.github.catvod.spider.merge.Bk.c
    protected final C0814b[][] d(int i) {
        return new C0814b[i][];
    }
}
