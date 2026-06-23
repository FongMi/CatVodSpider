package com.github.catvod.spider.merge.t;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.t.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0626c implements InterfaceC0621C {
    protected InterfaceC0620B a;
    protected List<z> b = new ArrayList(100);
    protected int c = -1;
    protected boolean d;

    public C0626c(InterfaceC0620B interfaceC0620B) {
        this.a = interfaceC0620B;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    @Override // com.github.catvod.spider.merge.t.InterfaceC0621C
    public final String a(z zVar, z zVar2) {
        if (zVar != null && zVar2 != null) {
            com.github.catvod.spider.merge.w.h hVarB = com.github.catvod.spider.merge.w.h.b(zVar.c(), zVar2.c());
            int i = hVarB.a;
            int size = hVarB.b;
            if (i >= 0 && size >= 0) {
                l();
                while (k(DescriptorProtos.Edition.EDITION_2023_VALUE) >= 1000) {
                }
                if (size >= this.b.size()) {
                    size = this.b.size() - 1;
                }
                StringBuilder sb = new StringBuilder();
                while (i <= size) {
                    z zVar3 = (z) this.b.get(i);
                    if (zVar3.getType() == -1) {
                        break;
                    }
                    sb.append(zVar3.getText());
                    i++;
                }
                return sb.toString();
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.t.InterfaceC0621C
    public final InterfaceC0620B b() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final int c() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final void e(int i) {
        l();
        this.c = j(i);
    }

    @Override // com.github.catvod.spider.merge.t.InterfaceC0621C
    public z f(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final int g(int i) {
        return f(i).getType();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    @Override // com.github.catvod.spider.merge.t.InterfaceC0621C
    public final z get(int i) {
        if (i >= 0 && i < this.b.size()) {
            return (z) this.b.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("token index ");
        sb.append(i);
        sb.append(" out of range 0..");
        sb.append(this.b.size() - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final int h() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    @Override // com.github.catvod.spider.merge.t.p
    public final void i() {
        int i = this.c;
        if (!(i >= 0 && (!this.d ? i >= this.b.size() : i >= this.b.size() - 1)) && g(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (n(this.c + 1)) {
            this.c = j(this.c + 1);
        }
    }

    protected int j(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    protected final int k(int i) {
        if (this.d) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            z zVarNextToken = this.a.nextToken();
            if (zVarNextToken instanceof F) {
                ((F) zVarNextToken).d(this.b.size());
            }
            this.b.add(zVarNextToken);
            if (zVarNextToken.getType() == -1) {
                this.d = true;
                return i2 + 1;
            }
        }
        return i;
    }

    protected final void l() {
        if (this.c == -1) {
            n(0);
            this.c = j(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    protected final int m(int i) {
        n(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (true) {
            z zVar = (z) this.b.get(i);
            if (zVar.e() == 0 || zVar.getType() == -1) {
                return i;
            }
            i++;
            n(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    protected final boolean n(int i) {
        int size = (i - this.b.size()) + 1;
        return size <= 0 || k(size) >= size;
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    @Override // com.github.catvod.spider.merge.t.p
    public final int size() {
        return this.b.size();
    }
}
