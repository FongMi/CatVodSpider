package com.github.catvod.spider.merge.f1;

import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1144i1 extends C1150k {
    C1186v0[] t;
    private String u;
    private final transient CopyOnWriteArrayList<C1121c2> v = new CopyOnWriteArrayList<>();

    C1144i1(C1186v0 c1186v0, String str) {
        this.u = str;
        this.t = new C1186v0[]{c1186v0};
    }

    C1144i1(C1186v0[] c1186v0Arr) {
        this.u = c1186v0Arr[0].b();
        this.t = c1186v0Arr;
    }

    C1144i1(C1186v0[] c1186v0Arr, String str) {
        this.u = str;
        this.t = c1186v0Arr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x014e, code lost:
    
        r2 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0151, code lost:
    
        if (r5 != r2) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0153, code lost:
    
        r8 = r7;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0156, code lost:
    
        if (r12 != r2) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x015b, code lost:
    
        if (r10 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x015d, code lost:
    
        r10 = new int[r22.length - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0163, code lost:
    
        r10[r9] = r7;
        r9 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x010d A[EDGE_INSN: B:162:0x010d->B:98:0x010d BREAK  A[LOOP:4: B:63:0x00ad->B:96:0x0101], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int D1(com.github.catvod.spider.merge.f1.C1185v r21, com.github.catvod.spider.merge.f1.C1186v0[] r22, java.lang.Object[] r23) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1144i1.D1(com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.v0[], java.lang.Object[]):int");
    }

    static String E1(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i != objArr.length; i++) {
            Object obj = objArr[i];
            String name = obj == null ? "null" : obj instanceof Boolean ? "boolean" : obj instanceof String ? "string" : obj instanceof Number ? "number" : obj instanceof n2 ? obj instanceof G2 ? "undefined" : obj instanceof L2 ? ((L2) obj).c().getClass().getName() : obj instanceof InterfaceC1098N ? "function" : "object" : C1147j0.i(obj.getClass());
            if (i != 0) {
                sb.append(',');
            }
            sb.append(name);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[LOOP:0: B:7:0x0011->B:91:?, LOOP_END, SYNTHETIC] */
    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.github.catvod.spider.merge.f1.C1185v r12, com.github.catvod.spider.merge.f1.n2 r13, com.github.catvod.spider.merge.f1.n2 r14, java.lang.Object[] r15) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1144i1.b(com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.Object[]):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    final String q1(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        boolean z = (i2 & 1) != 0;
        if (!z) {
            sb.append("function ");
            sb.append(this.u);
            sb.append("() {");
        }
        sb.append("/*\n");
        sb.append(toString());
        sb.append(z ? "*/\n" : "*/}\n");
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final String t1() {
        return this.u;
    }

    public final String toString() {
        String strB;
        StringBuilder sb = new StringBuilder();
        int length = this.t.length;
        for (int i = 0; i != length; i++) {
            if (this.t[i].e()) {
                Method methodH = this.t[i].h();
                sb.append(C1147j0.i(methodH.getReturnType()));
                sb.append(' ');
                strB = methodH.getName();
            } else {
                strB = this.t[i].b();
            }
            sb.append(strB);
            sb.append(C1147j0.j(this.t[i].c));
            sb.append('\n');
        }
        return sb.toString();
    }
}
