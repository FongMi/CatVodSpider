package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class M extends N {
    private final String a;

    public M(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        return lVar2.d0().equals(this.a);
    }

    public final String toString() {
        return String.format("%s", this.a);
    }
}
