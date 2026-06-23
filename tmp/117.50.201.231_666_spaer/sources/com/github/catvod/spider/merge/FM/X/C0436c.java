package com.github.catvod.spider.merge.FM.x;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0436c implements InterfaceC0430H {
    protected InterfaceC0429G a;
    protected List<InterfaceC0427E> b = new ArrayList(100);
    protected int c = -1;
    protected boolean d;

    public C0436c(InterfaceC0429G interfaceC0429G) {
        this.a = interfaceC0429G;
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0430H
    public final InterfaceC0429G b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0430H
    public final String c(InterfaceC0427E interfaceC0427E, InterfaceC0427E interfaceC0427E2) {
        if (interfaceC0427E != null && interfaceC0427E2 != null) {
            com.github.catvod.spider.merge.FM.A.j jVarB = com.github.catvod.spider.merge.FM.A.j.b(interfaceC0427E.c(), interfaceC0427E2.c());
            int i = jVarB.a;
            int size = jVarB.b;
            if (i >= 0 && size >= 0) {
                m();
                while (l(DescriptorProtos.Edition.EDITION_2023_VALUE) >= 1000) {
                }
                if (size >= this.b.size()) {
                    size = this.b.size() - 1;
                }
                StringBuilder sb = new StringBuilder();
                while (i <= size) {
                    InterfaceC0427E interfaceC0427E3 = (InterfaceC0427E) this.b.get(i);
                    if (interfaceC0427E3.getType() == -1) {
                        break;
                    }
                    sb.append(interfaceC0427E3.getText());
                    i++;
                }
                return sb.toString();
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final int d() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final void f(int i) {
        m();
        this.c = k(i);
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0430H
    public InterfaceC0427E g(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0430H
    public final InterfaceC0427E get(int i) {
        if (i >= 0 && i < this.b.size()) {
            return (InterfaceC0427E) this.b.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("token index ");
        sb.append(i);
        sb.append(" out of range 0..");
        sb.append(this.b.size() - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final int h(int i) {
        return g(i).getType();
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final int i() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    @Override // com.github.catvod.spider.merge.FM.x.s
    public final void j() {
        int i = this.c;
        if (!(i >= 0 && (!this.d ? i >= this.b.size() : i >= this.b.size() - 1)) && h(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (o(this.c + 1)) {
            this.c = k(this.c + 1);
        }
    }

    protected int k(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    protected final int l(int i) {
        if (this.d) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0427E interfaceC0427ENextToken = this.a.nextToken();
            if (interfaceC0427ENextToken instanceof InterfaceC0433K) {
                ((InterfaceC0433K) interfaceC0427ENextToken).d(this.b.size());
            }
            this.b.add(interfaceC0427ENextToken);
            if (interfaceC0427ENextToken.getType() == -1) {
                this.d = true;
                return i2 + 1;
            }
        }
        return i;
    }

    protected final void m() {
        if (this.c == -1) {
            o(0);
            this.c = k(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    protected final int n(int i) {
        o(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (true) {
            InterfaceC0427E interfaceC0427E = (InterfaceC0427E) this.b.get(i);
            if (interfaceC0427E.e() == 0 || interfaceC0427E.getType() == -1) {
                return i;
            }
            i++;
            o(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    protected final boolean o(int i) {
        int size = (i - this.b.size()) + 1;
        return size <= 0 || l(size) >= size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    @Override // com.github.catvod.spider.merge.FM.x.s
    public final int size() {
        return this.b.size();
    }
}
