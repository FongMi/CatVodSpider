package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class tp implements uo {
    public zc a;
    public ArrayList b;
    public int c;
    public boolean d;

    @Override // com.github.catvod.spider.merge.A0.uo
    public final int e(int i) {
        return f(i).a;
    }

    public final to f(int i) {
        if (this.c == -1) {
            k(0);
            this.c = i(0);
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.b;
        if (i >= 0) {
            int i2 = this.c;
            for (int i3 = 1; i3 < i; i3++) {
                int i4 = i2 + 1;
                if (k(i4)) {
                    i2 = i(i4);
                }
            }
            return (to) arrayList.get(i2);
        }
        int i5 = -i;
        if (i5 == 0) {
            return null;
        }
        int size = this.c;
        if (size - i5 < 0) {
            return null;
        }
        for (int i6 = 1; i6 <= i5 && size > 0; i6++) {
            size--;
            k(size);
            if (size >= this.b.size()) {
                size = this.b.size() - 1;
            } else {
                while (size >= 0) {
                    to toVar = (to) arrayList.get(size);
                    if (toVar.a == -1 || toVar.d == 0) {
                        break;
                    }
                    size--;
                }
            }
        }
        if (size < 0) {
            return null;
        }
        return (to) arrayList.get(size);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
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
            int r0 = r4.e(r1)
            r2 = -1
            if (r0 == r2) goto L34
        L21:
            int r0 = r4.c
            int r0 = r0 + r1
            boolean r0 = r4.k(r0)
            if (r0 == 0) goto L33
            int r0 = r4.c
            int r0 = r0 + r1
            int r0 = r4.i(r0)
            r4.c = r0
        L33:
            return
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot consume EOF"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.tp.g():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int h(int i) {
        to toVarN;
        int i2;
        ?? r10;
        ?? r15;
        int iN;
        boolean z;
        int i3 = 0;
        if (this.d) {
            return 0;
        }
        int i4 = 0;
        while (i4 < i) {
            zc zcVar = this.a;
            ss ssVar = zcVar.f;
            if (ssVar == 0) {
                throw new IllegalStateException("nextToken requires a non-null input stream.");
            }
            while (true) {
                boolean z2 = zcVar.m;
                jo joVar = zcVar.h;
                char c = 65535;
                if (z2) {
                    lc lcVar = zcVar.r;
                    int i5 = ((fu) lcVar).d;
                    int i6 = ((fu) lcVar).c;
                    int i7 = ssVar.b;
                    toVarN = joVar.n(zcVar.g, -1, null, 0, i7, i7 - 1, i6, i5);
                    zcVar.i = toVarN;
                    i2 = -1;
                    r10 = 1;
                    break;
                }
                zcVar.i = null;
                zcVar.n = i3;
                zcVar.j = ssVar.b;
                fu fuVar = (fu) zcVar.r;
                zcVar.l = fuVar.d;
                zcVar.k = fuVar.c;
                while (true) {
                    zcVar.o = i3;
                    try {
                        iN = ((fu) zcVar.r).n(ssVar, zcVar.u);
                        i2 = -1;
                        r15 = 1;
                    } catch (ui e) {
                        int i8 = zcVar.j;
                        ss ssVar2 = zcVar.f;
                        String strF = ssVar2.f(bd.d(i8, ssVar2.b));
                        StringBuilder sb = new StringBuilder("token recognition error at: '");
                        StringBuilder sb2 = new StringBuilder();
                        char[] charArray = strF.toCharArray();
                        int length = charArray.length;
                        int i9 = 0;
                        while (i9 < length) {
                            char c2 = charArray[i9];
                            String strValueOf = String.valueOf(c2);
                            if (c2 == c) {
                                strValueOf = "<EOF>";
                            } else if (c2 == '\r') {
                                strValueOf = "\\r";
                            } else if (c2 == '\t') {
                                strValueOf = "\\t";
                            } else if (c2 == '\n') {
                                strValueOf = "\\n";
                            }
                            sb2.append(strValueOf);
                            i9++;
                            c = 65535;
                        }
                        sb.append(sb2.toString());
                        sb.append("'");
                        String string = sb.toString();
                        yb ybVar = zcVar.q;
                        if (ybVar == null) {
                            throw new NullPointerException("delegates");
                        }
                        int i10 = zcVar.k;
                        int i11 = zcVar.l;
                        Iterator it = ybVar.iterator();
                        while (it.hasNext()) {
                            ((wj) it.next()).e(zcVar, null, i10, i11, string, e);
                            i11 = i11;
                            i10 = i10;
                        }
                        r15 = 1;
                        i2 = -1;
                        if (ssVar.e(1) != -1) {
                            ((fu) zcVar.r).l(ssVar);
                        }
                        iN = -3;
                    }
                    if (ssVar.e(r15) == i2) {
                        zcVar.m = r15;
                    }
                    if (zcVar.o == 0) {
                        zcVar.o = iN;
                    }
                    int i12 = zcVar.o;
                    if (i12 == -3) {
                        break;
                    }
                    if (i12 != -2) {
                        if (zcVar.i == null) {
                            z = true;
                            zcVar.i = joVar.n(zcVar.g, i12, null, zcVar.n, zcVar.j, ssVar.b - 1, zcVar.k, zcVar.l);
                        } else {
                            z = true;
                        }
                        toVarN = zcVar.i;
                        r10 = z;
                    } else {
                        i3 = 0;
                        c = 65535;
                    }
                }
                i3 = 0;
            }
            boolean z3 = toVarN instanceof to;
            ArrayList arrayList = this.b;
            if (z3) {
                toVarN.g = arrayList.size();
            }
            arrayList.add(toVarN);
            if (toVarN.a == i2) {
                this.d = r10;
                return i4 + r10;
            }
            i4++;
            i3 = 0;
        }
        return i;
    }

    public final int i(int i) {
        k(i);
        if (i >= this.b.size()) {
            return this.b.size() - 1;
        }
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        while (true) {
            to toVar = (to) obj;
            if (toVar.d == 0 || toVar.a == -1) {
                return i;
            }
            i++;
            k(i);
            obj = arrayList.get(i);
        }
    }

    public final void j(int i) {
        if (this.c == -1) {
            k(0);
            this.c = i(0);
        }
        this.c = i(i);
    }

    public final boolean k(int i) {
        int size = (i - this.b.size()) + 1;
        return size <= 0 || h(size) >= size;
    }
}
