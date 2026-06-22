package com.github.catvod.spider.merge.E;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class a {
    private static volatile i d = i.q;
    private final StringBuffer a;
    private final Object b;
    private final i c;

    public a(Object obj) {
        i iVar = d;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.a = stringBuffer;
        this.c = iVar;
        this.b = obj;
        iVar.m(stringBuffer, obj);
    }

    public final a a(Object obj) {
        this.c.a(this.a, obj);
        return this;
    }

    public final a b(String str, boolean z) {
        this.c.b(this.a, str, z);
        return this;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            this.a.append(this.c.s());
        } else {
            this.c.h(this.a, obj);
        }
        return this.a.toString();
    }
}
