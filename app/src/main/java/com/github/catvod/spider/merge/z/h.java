package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.A.AbstractC0007h;
import com.github.catvod.spider.merge.A.C0022x;
import com.github.catvod.spider.merge.P.C0081a;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class h implements l {
    public final v a;
    public final ArrayList b = new ArrayList(100);
    public int c = -1;
    public boolean d;

    public h(C0081a c0081a) {
        this.a = c0081a;
    }

    @Override // com.github.catvod.spider.merge.z.l
    public final int a(int i) {
        return b(i).a;
    }

    public final f b(int i) {
        if (this.c == -1) {
            g(0);
            this.c = e(0);
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.b;
        if (i >= 0) {
            int iE = this.c;
            for (int i2 = 1; i2 < i; i2++) {
                int i3 = iE + 1;
                if (g(i3)) {
                    iE = e(i3);
                }
            }
            return (f) arrayList.get(iE);
        }
        int i4 = -i;
        if (i4 == 0) {
            return null;
        }
        int size = this.c;
        if (size - i4 < 0) {
            return null;
        }
        for (int i5 = 1; i5 <= i4 && size > 0; i5++) {
            size--;
            g(size);
            if (size >= this.b.size()) {
                size = this.b.size() - 1;
            } else {
                while (size >= 0) {
                    f fVar = (f) arrayList.get(size);
                    if (fVar.a == -1 || fVar.d == 0) {
                        break;
                    }
                    size--;
                }
            }
        }
        if (size < 0) {
            return null;
        }
        return (f) arrayList.get(size);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r4 = this;
            int r0 = r4.c
            r1 = 1
            if (r0 < 0) goto L1a
            boolean r2 = r4.d
            java.util.ArrayList r3 = r4.b
            if (r2 == 0) goto L13
            int r2 = r3.size()
            int r2 = r2 - r1
            if (r0 >= r2) goto L1a
            goto L21
        L13:
            int r2 = r3.size()
            if (r0 >= r2) goto L1a
            goto L21
        L1a:
            int r0 = r4.a(r1)
            r2 = -1
            if (r0 == r2) goto L34
        L21:
            int r0 = r4.c
            int r0 = r0 + r1
            boolean r0 = r4.g(r0)
            if (r0 == 0) goto L33
            int r0 = r4.c
            int r0 = r0 + r1
            int r0 = r4.e(r0)
            r4.c = r0
        L33:
            return
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot consume EOF"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.z.h.c():void");
    }

    public final int d(int i) {
        f fVar;
        int iG;
        int i2;
        if (this.d) {
            return 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            m mVar = (m) this.a;
            d dVar = mVar.d;
            if (dVar == null) {
                throw new IllegalStateException("nextToken requires a non-null input stream.");
            }
            while (true) {
                boolean z = mVar.k;
                g gVar = mVar.f;
                if (z) {
                    AbstractC0007h abstractC0007h = mVar.b;
                    int i4 = ((C0022x) abstractC0007h).g;
                    int i5 = ((C0022x) abstractC0007h).f;
                    int i6 = dVar.b;
                    com.github.catvod.spider.merge.C.h hVar = mVar.e;
                    gVar.getClass();
                    fVar = new f(hVar, -1, 0, i6, i6 - 1);
                    fVar.b = i5;
                    fVar.c = i4;
                    mVar.g = fVar;
                    break;
                }
                mVar.g = null;
                mVar.l = 0;
                mVar.h = dVar.b;
                C0022x c0022x = (C0022x) mVar.b;
                mVar.j = c0022x.g;
                mVar.i = c0022x.f;
                do {
                    mVar.m = 0;
                    try {
                        iG = ((C0022x) mVar.b).g(dVar, mVar.o);
                    } catch (n e) {
                        mVar.c(e);
                        if (dVar.a(1) != -1) {
                            ((C0022x) mVar.b).e(dVar);
                        }
                        iG = -3;
                    }
                    if (dVar.a(1) == -1) {
                        mVar.k = true;
                    }
                    if (mVar.m == 0) {
                        mVar.m = iG;
                    }
                    i2 = mVar.m;
                    if (i2 == -3) {
                        break;
                    }
                } while (i2 == -2);
                if (mVar.g == null) {
                    int i7 = mVar.l;
                    int i8 = mVar.h;
                    int i9 = dVar.b - 1;
                    int i10 = mVar.i;
                    int i11 = mVar.j;
                    com.github.catvod.spider.merge.C.h hVar2 = mVar.e;
                    gVar.getClass();
                    f fVar2 = new f(hVar2, i2, i7, i8, i9);
                    fVar2.b = i10;
                    fVar2.c = i11;
                    mVar.g = fVar2;
                }
                fVar = mVar.g;
            }
            boolean z2 = fVar instanceof f;
            ArrayList arrayList = this.b;
            if (z2) {
                fVar.g = arrayList.size();
            }
            arrayList.add(fVar);
            if (fVar.a == -1) {
                this.d = true;
                return i3 + 1;
            }
        }
        return i;
    }

    public final int e(int i) {
        g(i);
        if (i >= this.b.size()) {
            return this.b.size() - 1;
        }
        ArrayList arrayList = this.b;
        while (true) {
            f fVar = (f) arrayList.get(i);
            if (fVar.d == 0) {
                return i;
            }
            if (fVar.a == -1) {
                return i;
            }
            i++;
            g(i);
        }
    }

    public final void f(int i) {
        if (this.c == -1) {
            g(0);
            this.c = e(0);
        }
        this.c = e(i);
    }

    public final boolean g(int i) {
        int size = (i - this.b.size()) + 1;
        return size <= 0 || d(size) >= size;
    }
}
