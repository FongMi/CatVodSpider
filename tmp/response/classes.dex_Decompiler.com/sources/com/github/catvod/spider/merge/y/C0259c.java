package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class C0259c implements InterfaceC0253H {
    protected InterfaceC0252G a;
    protected List<InterfaceC0250E> b = new ArrayList(100);
    protected int c = -1;
    protected boolean d;

    public C0259c(InterfaceC0252G interfaceC0252G) {
        this.a = interfaceC0252G;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0253H
    public final InterfaceC0252G b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    @Override // com.github.catvod.spider.merge.y.InterfaceC0253H
    public final String c(InterfaceC0250E interfaceC0250E, InterfaceC0250E interfaceC0250E2) {
        if (interfaceC0250E != null && interfaceC0250E2 != null) {
            com.github.catvod.spider.merge.B.j jVarB = com.github.catvod.spider.merge.B.j.b(interfaceC0250E.c(), interfaceC0250E2.c());
            int i = jVarB.a;
            int size = jVarB.b;
            if (i >= 0 && size >= 0) {
                m();
                while (l(1000) >= 1000) {
                }
                if (size >= this.b.size()) {
                    size = this.b.size() - 1;
                }
                StringBuilder sb = new StringBuilder();
                while (i <= size) {
                    InterfaceC0250E interfaceC0250E3 = (InterfaceC0250E) this.b.get(i);
                    if (interfaceC0250E3.getType() == -1) {
                        break;
                    }
                    sb.append(interfaceC0250E3.getText());
                    i++;
                }
                return sb.toString();
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final int d() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final void e(int i) {
        m();
        this.c = k(i);
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0253H
    public InterfaceC0250E f(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final int g(int i) {
        return f(i).getType();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    @Override // com.github.catvod.spider.merge.y.InterfaceC0253H
    public final InterfaceC0250E get(int i) {
        if (i >= 0 && i < this.b.size()) {
            return (InterfaceC0250E) this.b.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(oZP.d("01001C2402751C0113241475"));
        sb.append(i);
        sb.append(oZP.d("550002354C3A134F05200232104F476F42"));
        sb.append(this.b.size() - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final int i() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    @Override // com.github.catvod.spider.merge.y.s
    public final void j() {
        int i = this.c;
        if (!(i >= 0 && (!this.d ? i >= this.b.size() : i >= this.b.size() - 1)) && g(1) == -1) {
            throw new IllegalStateException(oZP.d("160E192F0321550C182F1F20180A57042313"));
        }
        if (o(this.c + 1)) {
            this.c = k(this.c + 1);
        }
    }

    protected int k(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    protected final int l(int i) {
        if (this.d) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0250E interfaceC0250ENextToken = this.a.nextToken();
            if (interfaceC0250ENextToken instanceof InterfaceC0256K) {
                ((InterfaceC0256K) interfaceC0250ENextToken).d(this.b.size());
            }
            this.b.add(interfaceC0250ENextToken);
            if (interfaceC0250ENextToken.getType() == -1) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    protected final int n(int i) {
        o(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (true) {
            InterfaceC0250E interfaceC0250E = (InterfaceC0250E) this.b.get(i);
            if (interfaceC0250E.e() == 0 || interfaceC0250E.getType() == -1) {
                return i;
            }
            i++;
            o(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    protected final boolean o(int i) {
        int size = (i - this.b.size()) + 1;
        return size <= 0 || l(size) >= size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    @Override // com.github.catvod.spider.merge.y.s
    public final int size() {
        return this.b.size();
    }
}
