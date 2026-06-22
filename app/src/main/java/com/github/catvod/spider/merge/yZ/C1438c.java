package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.yZ.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1438c implements H {
    protected G a;
    protected List<E> b = new ArrayList(100);
    protected int c = -1;
    protected boolean d;

    public C1438c(G g) {
        this.a = g;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.yZ.H
    public final G b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    @Override // com.github.catvod.spider.merge.yZ.H
    public final String c(E e, E e2) {
        if (e != null && e2 != null) {
            com.github.catvod.spider.merge.Bk.j jVarB = com.github.catvod.spider.merge.Bk.j.b(e.c(), e2.c());
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
                    E e3 = (E) this.b.get(i);
                    if (e3.getType() == -1) {
                        break;
                    }
                    sb.append(e3.getText());
                    i++;
                }
                return sb.toString();
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final int d() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final void e(int i) {
        m();
        this.c = k(i);
    }

    @Override // com.github.catvod.spider.merge.yZ.H
    public E f(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final int g(int i) {
        return f(i).getType();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    @Override // com.github.catvod.spider.merge.yZ.H
    public final E get(int i) {
        if (i >= 0 && i < this.b.size()) {
            return (E) this.b.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ZrJ.d("0D2C20282665102D2F283065"));
        sb.append(i);
        sb.append(ZrJ.d("592C3E39682A1F63392C26221C637B6366"));
        sb.append(this.b.size() - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final int i() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    @Override // com.github.catvod.spider.merge.yZ.s
    public final void j() {
        int i = this.c;
        if (!(i >= 0 && (!this.d ? i >= this.b.size() : i >= this.b.size() - 1)) && g(1) == -1) {
            throw new IllegalStateException(ZrJ.d("1A2225232731592024233B3014266B080703"));
        }
        if (o(this.c + 1)) {
            this.c = k(this.c + 1);
        }
    }

    protected int k(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    protected final int l(int i) {
        if (this.d) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            E eNextToken = this.a.nextToken();
            if (eNextToken instanceof K) {
                ((K) eNextToken).d(this.b.size());
            }
            this.b.add(eNextToken);
            if (eNextToken.getType() == -1) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    protected final int n(int i) {
        o(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (true) {
            E e = (E) this.b.get(i);
            if (e.e() == 0 || e.getType() == -1) {
                return i;
            }
            i++;
            o(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    protected final boolean o(int i) {
        int size = (i - this.b.size()) + 1;
        return size <= 0 || l(size) >= size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    @Override // com.github.catvod.spider.merge.yZ.s
    public final int size() {
        return this.b.size();
    }
}
