package com.github.catvod.spider.merge.u;

import com.github.catvod.spider.merge.a.C0529a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class b0 {
    public static final e a = new e();

    public static class a extends c {
        public final b0[] b;

        public a(b0 b0Var, b0 b0Var2) {
            HashSet hashSet = new HashSet();
            if (b0Var instanceof a) {
                hashSet.addAll(Arrays.asList(((a) b0Var).b));
            } else {
                hashSet.add(b0Var);
            }
            if (b0Var2 instanceof a) {
                hashSet.addAll(Arrays.asList(((a) b0Var2).b));
            } else {
                hashSet.add(b0Var2);
            }
            List listA = b0.a(hashSet);
            if (!listA.isEmpty()) {
                hashSet.add((d) Collections.min(listA));
            }
            this.b = (b0[]) hashSet.toArray(new b0[hashSet.size()]);
        }

        @Override // com.github.catvod.spider.merge.u.b0
        public final boolean c(com.github.catvod.spider.merge.t.x<?, ?> xVar, com.github.catvod.spider.merge.t.y yVar) {
            for (b0 b0Var : this.b) {
                if (!b0Var.c(xVar, yVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.github.catvod.spider.merge.u.b0
        public final b0 d(com.github.catvod.spider.merge.t.x<?, ?> xVar, com.github.catvod.spider.merge.t.y yVar) {
            ArrayList arrayList = new ArrayList();
            b0[] b0VarArr = this.b;
            int length = b0VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    if (i2 == 0) {
                        return this;
                    }
                    if (arrayList.isEmpty()) {
                        return b0.a;
                    }
                    b0 b0VarB = (b0) arrayList.get(0);
                    while (i < arrayList.size()) {
                        b0VarB = b0.b(b0VarB, (b0) arrayList.get(i));
                        i++;
                    }
                    return b0VarB;
                }
                b0 b0Var = b0VarArr[i];
                b0 b0VarD = b0Var.d(xVar, yVar);
                i2 |= b0VarD == b0Var ? 0 : 1;
                if (b0VarD == null) {
                    return null;
                }
                if (b0VarD != b0.a) {
                    arrayList.add(b0VarD);
                }
                i++;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return Arrays.equals(this.b, ((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            b0[] b0VarArr = this.b;
            int iHashCode = a.class.hashCode();
            for (b0 b0Var : b0VarArr) {
                iHashCode = com.github.catvod.spider.merge.F.a.i(iHashCode, b0Var);
            }
            return com.github.catvod.spider.merge.F.a.b(iHashCode, b0VarArr.length);
        }

        public final String toString() {
            return com.github.catvod.spider.merge.F.a.d(Arrays.asList(this.b).iterator(), "&&");
        }
    }

    public static class b extends c {
        public final b0[] b;

        public b(b0 b0Var, b0 b0Var2) {
            HashSet hashSet = new HashSet();
            if (b0Var instanceof b) {
                hashSet.addAll(Arrays.asList(((b) b0Var).b));
            } else {
                hashSet.add(b0Var);
            }
            if (b0Var2 instanceof b) {
                hashSet.addAll(Arrays.asList(((b) b0Var2).b));
            } else {
                hashSet.add(b0Var2);
            }
            List listA = b0.a(hashSet);
            if (!listA.isEmpty()) {
                hashSet.add((d) Collections.max(listA));
            }
            this.b = (b0[]) hashSet.toArray(new b0[hashSet.size()]);
        }

        @Override // com.github.catvod.spider.merge.u.b0
        public final boolean c(com.github.catvod.spider.merge.t.x<?, ?> xVar, com.github.catvod.spider.merge.t.y yVar) {
            for (b0 b0Var : this.b) {
                if (b0Var.c(xVar, yVar)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.github.catvod.spider.merge.u.b0
        public final b0 d(com.github.catvod.spider.merge.t.x<?, ?> xVar, com.github.catvod.spider.merge.t.y yVar) {
            ArrayList arrayList = new ArrayList();
            b0[] b0VarArr = this.b;
            int length = b0VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    if (i2 == 0) {
                        return this;
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    b0 b0VarE = (b0) arrayList.get(0);
                    while (i < arrayList.size()) {
                        b0VarE = b0.e(b0VarE, (b0) arrayList.get(i));
                        i++;
                    }
                    return b0VarE;
                }
                b0 b0Var = b0VarArr[i];
                b0 b0VarD = b0Var.d(xVar, yVar);
                i2 |= b0VarD == b0Var ? 0 : 1;
                e eVar = b0.a;
                if (b0VarD == eVar) {
                    return eVar;
                }
                if (b0VarD != null) {
                    arrayList.add(b0VarD);
                }
                i++;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return Arrays.equals(this.b, ((b) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            b0[] b0VarArr = this.b;
            int iHashCode = b.class.hashCode();
            for (b0 b0Var : b0VarArr) {
                iHashCode = com.github.catvod.spider.merge.F.a.i(iHashCode, b0Var);
            }
            return com.github.catvod.spider.merge.F.a.b(iHashCode, b0VarArr.length);
        }

        public final String toString() {
            return com.github.catvod.spider.merge.F.a.d(Arrays.asList(this.b).iterator(), "||");
        }
    }

    public static abstract class c extends b0 {
    }

    public static class d extends b0 implements Comparable<d> {
        public final int b;

        protected d() {
            this.b = 0;
        }

        public d(int i) {
            this.b = i;
        }

        @Override // com.github.catvod.spider.merge.u.b0
        public final boolean c(com.github.catvod.spider.merge.t.x<?, ?> xVar, com.github.catvod.spider.merge.t.y yVar) {
            return xVar.g(this.b);
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            return this.b - dVar.b;
        }

        @Override // com.github.catvod.spider.merge.u.b0
        public final b0 d(com.github.catvod.spider.merge.t.x<?, ?> xVar, com.github.catvod.spider.merge.t.y yVar) {
            if (xVar.g(this.b)) {
                return b0.a;
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this == obj || this.b == ((d) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return 31 + this.b;
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("{");
            sbA.append(this.b);
            sbA.append(">=prec}?");
            return sbA.toString();
        }
    }

    public static class e extends b0 {
        public final int b;
        public final int c;
        public final boolean d;

        protected e() {
            this.b = -1;
            this.c = -1;
            this.d = false;
        }

        public e(int i, int i2, boolean z) {
            this.b = i;
            this.c = i2;
            this.d = z;
        }

        @Override // com.github.catvod.spider.merge.u.b0
        public final boolean c(com.github.catvod.spider.merge.t.x<?, ?> xVar, com.github.catvod.spider.merge.t.y yVar) {
            xVar.getClass();
            return true;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.h(0, this.b), this.c), this.d ? 1 : 0), 3);
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("{");
            sbA.append(this.b);
            sbA.append(":");
            sbA.append(this.c);
            sbA.append("}?");
            return sbA.toString();
        }
    }

    static List a(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (b0Var instanceof d) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((d) b0Var);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public static b0 b(b0 b0Var, b0 b0Var2) {
        e eVar;
        if (b0Var == null || b0Var == (eVar = a)) {
            return b0Var2;
        }
        if (b0Var2 == null || b0Var2 == eVar) {
            return b0Var;
        }
        a aVar = new a(b0Var, b0Var2);
        b0[] b0VarArr = aVar.b;
        return b0VarArr.length == 1 ? b0VarArr[0] : aVar;
    }

    public static b0 e(b0 b0Var, b0 b0Var2) {
        if (b0Var == null) {
            return b0Var2;
        }
        if (b0Var2 == null) {
            return b0Var;
        }
        e eVar = a;
        b0 b0Var3 = eVar;
        b0Var3 = eVar;
        if (b0Var != eVar && b0Var2 != eVar) {
            b bVar = new b(b0Var, b0Var2);
            b0[] b0VarArr = bVar.b;
            b0Var3 = bVar;
            if (b0VarArr.length == 1) {
                return b0VarArr[0];
            }
        }
        return b0Var3;
    }

    public abstract boolean c(com.github.catvod.spider.merge.t.x<?, ?> xVar, com.github.catvod.spider.merge.t.y yVar);

    public b0 d(com.github.catvod.spider.merge.t.x<?, ?> xVar, com.github.catvod.spider.merge.t.y yVar) {
        return this;
    }
}
