package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.G.m;
import com.github.catvod.spider.merge.G.o;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class d {

    public static final class A extends D {
        public A() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        public final String toString() {
            return ":last-of-type";
        }
    }

    public static final class B extends q {
        public B(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        protected final int b(i iVar) {
            return iVar.Y() + 1;
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        protected final String c() {
            return "nth-child";
        }
    }

    public static final class C extends q {
        public C(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        protected final int b(i iVar) {
            if (iVar.j0() == null) {
                return 0;
            }
            return iVar.j0().V().size() - iVar.Y();
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        protected final String c() {
            return "nth-last-child";
        }
    }

    public static class D extends q {
        public D(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        protected final int b(i iVar) {
            int i = 0;
            if (iVar.j0() == null) {
                return 0;
            }
            c cVarV = iVar.j0().V();
            for (int iY = iVar.Y(); iY < cVarV.size(); iY++) {
                if (cVarV.get(iY).q0().equals(iVar.q0())) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        protected final String c() {
            return "nth-last-of-type";
        }
    }

    public static class E extends q {
        public E(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        protected final int b(i iVar) {
            int i = 0;
            if (iVar.j0() == null) {
                return 0;
            }
            for (i iVar2 : iVar.j0().V()) {
                if (iVar2.q0().equals(iVar.q0())) {
                    i++;
                }
                if (iVar2 == iVar) {
                    break;
                }
            }
            return i;
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        protected final String c() {
            return "nth-of-type";
        }
    }

    public static final class F extends d {
        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            i iVarJ0 = iVar2.j0();
            return (iVarJ0 == null || (iVarJ0 instanceof com.github.catvod.spider.merge.G.f) || !iVar2.p0().isEmpty()) ? false : true;
        }

        public final String toString() {
            return ":only-child";
        }
    }

    public static final class G extends d {
        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            i iVarJ0 = iVar2.j0();
            if (iVarJ0 == null || (iVarJ0 instanceof com.github.catvod.spider.merge.G.f)) {
                return false;
            }
            Iterator<i> it = iVarJ0.V().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().q0().equals(iVar2.q0())) {
                    i++;
                }
            }
            return i == 1;
        }

        public final String toString() {
            return ":only-of-type";
        }
    }

    public static final class H extends d {
        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            if (iVar instanceof com.github.catvod.spider.merge.G.f) {
                iVar = iVar.T();
            }
            return iVar2 == iVar;
        }

        public final String toString() {
            return ":root";
        }
    }

    public static final class I extends d {
        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            if (iVar2 instanceof o) {
                return true;
            }
            for (com.github.catvod.spider.merge.G.p pVar : iVar2.u0()) {
                o oVar = new o(com.github.catvod.spider.merge.H.h.m(iVar2.r0(), com.github.catvod.spider.merge.H.f.d), iVar2.f(), iVar2.e());
                pVar.E(oVar);
                oVar.M(pVar);
            }
            return false;
        }

        public final String toString() {
            return ":matchText";
        }
    }

    public static final class J extends d {
        private final Pattern a;

        public J(Pattern pattern) {
            this.a = pattern;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return this.a.matcher(iVar2.t0()).find();
        }

        public final String toString() {
            return String.format(":matches(%s)", this.a);
        }
    }

    public static final class K extends d {
        private final Pattern a;

        public K(Pattern pattern) {
            this.a = pattern;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return this.a.matcher(iVar2.i0()).find();
        }

        public final String toString() {
            return String.format(":matchesOwn(%s)", this.a);
        }
    }

    public static final class L extends d {
        private final Pattern a;

        public L(Pattern pattern) {
            this.a = pattern;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return this.a.matcher(iVar2.v0()).find();
        }

        public final String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.a);
        }
    }

    public static final class M extends d {
        private final Pattern a;

        public M(Pattern pattern) {
            this.a = pattern;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            Pattern pattern = this.a;
            StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
            com.github.catvod.spider.merge.F.a.g(new com.github.catvod.spider.merge.G.h(sbB), iVar2);
            return pattern.matcher(com.github.catvod.spider.merge.F.b.h(sbB)).find();
        }

        public final String toString() {
            return String.format(":matchesWholeText(%s)", this.a);
        }
    }

    public static final class N extends d {
        private final String a;

        public N(String str) {
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.h0().equals(this.a);
        }

        public final String toString() {
            return String.format("%s", this.a);
        }
    }

    public static final class O extends d {
        private final String a;

        public O(String str) {
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.h0().endsWith(this.a);
        }

        public final String toString() {
            return String.format("%s", this.a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$a, reason: case insensitive filesystem */
    public static final class C0514a extends d {
        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return true;
        }

        public final String toString() {
            return Marker.ANY_MARKER;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$b, reason: case insensitive filesystem */
    public static final class C0515b extends d {
        private final String a;

        public C0515b(String str) {
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.o(this.a);
        }

        public final String toString() {
            return String.format("[%s]", this.a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$c, reason: case insensitive filesystem */
    public static abstract class AbstractC0516c extends d {
        String a;
        String b;

        public AbstractC0516c(String str, String str2, boolean z) {
            com.github.catvod.spider.merge.E.c.e(str);
            com.github.catvod.spider.merge.E.c.e(str2);
            this.a = com.github.catvod.spider.merge.F.a.f(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            String strE = (!z && z2) ? com.github.catvod.spider.merge.F.a.e(str2) : com.github.catvod.spider.merge.F.a.f(str2);
            this.b = strE;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$d, reason: collision with other inner class name */
    public static final class C0014d extends d {
        private final String a;

        public C0014d(String str) {
            com.github.catvod.spider.merge.E.c.e(str);
            this.a = com.github.catvod.spider.merge.F.a.e(str);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            Iterator<com.github.catvod.spider.merge.G.a> it = iVar2.e().g().iterator();
            while (it.hasNext()) {
                if (com.github.catvod.spider.merge.F.a.e(it.next().a()).startsWith(this.a)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format("[^%s]", this.a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$e, reason: case insensitive filesystem */
    public static final class C0517e extends AbstractC0516c {
        public C0517e(String str, String str2) {
            super(str, str2, true);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.o(this.a) && this.b.equalsIgnoreCase(iVar2.d(this.a).trim());
        }

        public final String toString() {
            return String.format("[%s=%s]", this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$f, reason: case insensitive filesystem */
    public static final class C0518f extends AbstractC0516c {
        public C0518f(String str, String str2) {
            super(str, str2, true);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.o(this.a) && com.github.catvod.spider.merge.F.a.e(iVar2.d(this.a)).contains(this.b);
        }

        public final String toString() {
            return String.format("[%s*=%s]", this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$g, reason: case insensitive filesystem */
    public static final class C0519g extends AbstractC0516c {
        public C0519g(String str, String str2) {
            super(str, str2, false);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.o(this.a) && com.github.catvod.spider.merge.F.a.e(iVar2.d(this.a)).endsWith(this.b);
        }

        public final String toString() {
            return String.format("[%s$=%s]", this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$h, reason: case insensitive filesystem */
    public static final class C0520h extends d {
        String a;
        Pattern b;

        public C0520h(String str, Pattern pattern) {
            this.a = com.github.catvod.spider.merge.F.a.f(str);
            this.b = pattern;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.o(this.a) && this.b.matcher(iVar2.d(this.a)).find();
        }

        public final String toString() {
            return String.format("[%s~=%s]", this.a, this.b.toString());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$i, reason: case insensitive filesystem */
    public static final class C0521i extends AbstractC0516c {
        public C0521i(String str, String str2) {
            super(str, str2, true);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return !this.b.equalsIgnoreCase(iVar2.d(this.a));
        }

        public final String toString() {
            return String.format("[%s!=%s]", this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$j, reason: case insensitive filesystem */
    public static final class C0522j extends AbstractC0516c {
        public C0522j(String str, String str2) {
            super(str, str2, false);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.o(this.a) && com.github.catvod.spider.merge.F.a.e(iVar2.d(this.a)).startsWith(this.b);
        }

        public final String toString() {
            return String.format("[%s^=%s]", this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$k, reason: case insensitive filesystem */
    public static final class C0523k extends d {
        private final String a;

        public C0523k(String str) {
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.a0(this.a);
        }

        public final String toString() {
            return String.format(".%s", this.a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$l, reason: case insensitive filesystem */
    public static final class C0524l extends d {
        private final String a;

        public C0524l(String str) {
            this.a = com.github.catvod.spider.merge.F.a.e(str);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return com.github.catvod.spider.merge.F.a.e(iVar2.X()).contains(this.a);
        }

        public final String toString() {
            return String.format(":containsData(%s)", this.a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$m, reason: case insensitive filesystem */
    public static final class C0525m extends d {
        private final String a;

        public C0525m(String str) {
            StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
            com.github.catvod.spider.merge.F.b.a(sbB, str, false);
            this.a = com.github.catvod.spider.merge.F.a.e(com.github.catvod.spider.merge.F.b.h(sbB));
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return com.github.catvod.spider.merge.F.a.e(iVar2.i0()).contains(this.a);
        }

        public final String toString() {
            return String.format(":containsOwn(%s)", this.a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$n, reason: case insensitive filesystem */
    public static final class C0526n extends d {
        private final String a;

        public C0526n(String str) {
            StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
            com.github.catvod.spider.merge.F.b.a(sbB, str, false);
            this.a = com.github.catvod.spider.merge.F.a.e(com.github.catvod.spider.merge.F.b.h(sbB));
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return com.github.catvod.spider.merge.F.a.e(iVar2.t0()).contains(this.a);
        }

        public final String toString() {
            return String.format(":contains(%s)", this.a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d$o, reason: case insensitive filesystem */
    public static final class C0527o extends d {
        private final String a;

        public C0527o(String str) {
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.v0().contains(this.a);
        }

        public final String toString() {
            return String.format(":containsWholeOwnText(%s)", this.a);
        }
    }

    public static final class p extends d {
        private final String a;

        public p(String str) {
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
            com.github.catvod.spider.merge.F.a.g(new com.github.catvod.spider.merge.G.h(sbB), iVar2);
            return com.github.catvod.spider.merge.F.b.h(sbB).contains(this.a);
        }

        public final String toString() {
            return String.format(":containsWholeText(%s)", this.a);
        }
    }

    public static abstract class q extends d {
        protected final int a;
        protected final int b;

        public q(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            i iVarJ0 = iVar2.j0();
            if (iVarJ0 != null && !(iVarJ0 instanceof com.github.catvod.spider.merge.G.f)) {
                int iB = b(iVar2);
                int i = this.a;
                if (i == 0) {
                    return iB == this.b;
                }
                int i2 = iB - this.b;
                if (i2 * i >= 0 && i2 % i == 0) {
                    return true;
                }
            }
            return false;
        }

        protected abstract int b(i iVar);

        protected abstract String c();

        public String toString() {
            return this.a == 0 ? String.format(":%s(%d)", c(), Integer.valueOf(this.b)) : this.b == 0 ? String.format(":%s(%dn)", c(), Integer.valueOf(this.a)) : String.format(":%s(%dn%+d)", c(), Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    public static final class r extends d {
        private final String a;

        public r(String str) {
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return this.a.equals(iVar2.c0());
        }

        public final String toString() {
            return String.format("#%s", this.a);
        }
    }

    public static final class s extends t {
        public s(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.Y() == this.a;
        }

        public final String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.a));
        }
    }

    public static abstract class t extends d {
        int a;

        public t(int i) {
            this.a = i;
        }
    }

    public static final class u extends t {
        public u(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar2.Y() > this.a;
        }

        public final String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.a));
        }
    }

    public static final class v extends t {
        public v(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar != iVar2 && iVar2.Y() < this.a;
        }

        public final String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.a));
        }
    }

    public static final class w extends d {
        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            for (m mVar : iVar2.i()) {
                if (!(mVar instanceof com.github.catvod.spider.merge.G.d) && !(mVar instanceof com.github.catvod.spider.merge.G.g)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return ":empty";
        }
    }

    public static final class x extends d {
        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            i iVarJ0 = iVar2.j0();
            return (iVarJ0 == null || (iVarJ0 instanceof com.github.catvod.spider.merge.G.f) || iVar2.Y() != 0) ? false : true;
        }

        public final String toString() {
            return ":first-child";
        }
    }

    public static final class y extends E {
        public y() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.I.d.q
        public final String toString() {
            return ":first-of-type";
        }
    }

    public static final class z extends d {
        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            i iVarJ0 = iVar2.j0();
            return (iVarJ0 == null || (iVarJ0 instanceof com.github.catvod.spider.merge.G.f) || iVar2.Y() != iVarJ0.V().size() - 1) ? false : true;
        }

        public final String toString() {
            return ":last-child";
        }
    }

    protected d() {
    }

    public abstract boolean a(i iVar, i iVar2);
}
