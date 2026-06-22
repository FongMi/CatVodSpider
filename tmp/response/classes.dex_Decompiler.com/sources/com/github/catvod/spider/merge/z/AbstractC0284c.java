package com.github.catvod.spider.merge.z;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class AbstractC0284c extends com.github.catvod.spider.merge.B.c<C0283b> {
    public AbstractC0284c(com.github.catvod.spider.merge.B.a aVar) {
        super(aVar, 2);
    }

    @Override // com.github.catvod.spider.merge.B.c
    protected final C0283b a(Object obj) {
        if (obj instanceof C0283b) {
            return (C0283b) obj;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.B.c
    protected final C0283b[] c(int i) {
        return new C0283b[i];
    }

    @Override // com.github.catvod.spider.merge.B.c
    protected final C0283b[][] d(int i) {
        return new C0283b[i][];
    }
}
