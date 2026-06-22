package com.github.catvod.spider.merge.z;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class s extends RuntimeException {
    public final u a;
    public final r b;
    public final l c;
    public f d;
    public int e;

    public s(u uVar, l lVar, r rVar) {
        this.e = -1;
        this.a = uVar;
        this.c = lVar;
        this.b = rVar;
        if (uVar != null) {
            this.e = uVar.c;
        }
    }
}
