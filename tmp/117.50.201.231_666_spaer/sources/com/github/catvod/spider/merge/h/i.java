package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0544h;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
abstract class i {
    int a;
    private int b;
    private int c = -1;

    static final class a extends b {
        a(String str) {
            k(str);
        }

        @Override // com.github.catvod.spider.merge.H.i.b
        public final String toString() {
            return C0544h.b(C0529a.a("<![CDATA["), l(), "]]>");
        }
    }

    static class b extends i {
        private String d;

        b() {
            this.a = 5;
        }

        @Override // com.github.catvod.spider.merge.H.i
        final i h() {
            super.h();
            this.d = null;
            return this;
        }

        final b k(String str) {
            this.d = str;
            return this;
        }

        final String l() {
            return this.d;
        }

        public String toString() {
            return this.d;
        }
    }

    static final class c extends i {
        private final StringBuilder d = new StringBuilder();
        private String e;

        c() {
            this.a = 4;
        }

        @Override // com.github.catvod.spider.merge.H.i
        final i h() {
            super.h();
            i.i(this.d);
            this.e = null;
            return this;
        }

        final c k(char c) {
            String str = this.e;
            if (str != null) {
                this.d.append(str);
                this.e = null;
            }
            this.d.append(c);
            return this;
        }

        final c l(String str) {
            String str2 = this.e;
            if (str2 != null) {
                this.d.append(str2);
                this.e = null;
            }
            if (this.d.length() == 0) {
                this.e = str;
            } else {
                this.d.append(str);
            }
            return this;
        }

        final String m() {
            String str = this.e;
            return str != null ? str : this.d.toString();
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("<!--");
            String string = this.e;
            if (string == null) {
                string = this.d.toString();
            }
            return C0544h.b(sbA, string, "-->");
        }
    }

    static final class d extends i {
        final StringBuilder d = new StringBuilder();
        String e = null;
        final StringBuilder f = new StringBuilder();
        final StringBuilder g = new StringBuilder();
        boolean h = false;

        d() {
            this.a = 1;
        }

        @Override // com.github.catvod.spider.merge.H.i
        final i h() {
            super.h();
            i.i(this.d);
            this.e = null;
            i.i(this.f);
            i.i(this.g);
            this.h = false;
            return this;
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("<!doctype ");
            sbA.append(this.d.toString());
            sbA.append(">");
            return sbA.toString();
        }
    }

    static final class e extends i {
        e() {
            this.a = 6;
        }

        @Override // com.github.catvod.spider.merge.H.i
        final i h() {
            super.h();
            return this;
        }

        public final String toString() {
            return "";
        }
    }

    static final class f extends h {
        f() {
            this.a = 3;
        }

        public final String toString() {
            return C0544h.b(C0529a.a("</"), A(), ">");
        }
    }

    static final class g extends h {
        g() {
            this.a = 2;
        }

        @Override // com.github.catvod.spider.merge.H.i.h, com.github.catvod.spider.merge.H.i
        final /* bridge */ /* synthetic */ i h() {
            h();
            return this;
        }

        public final String toString() {
            StringBuilder sbA;
            String strA;
            if (!u() || this.n.size() <= 0) {
                sbA = C0529a.a("<");
                strA = A();
            } else {
                sbA = C0529a.a("<");
                sbA.append(A());
                sbA.append(" ");
                strA = this.n.toString();
            }
            return C0544h.b(sbA, strA, ">");
        }

        @Override // com.github.catvod.spider.merge.H.i.h
        /* JADX INFO: renamed from: y */
        final h h() {
            super.h();
            this.n = null;
            return this;
        }
    }

    static abstract class h extends i {

        @Nullable
        protected String d;

        @Nullable
        protected String e;

        @Nullable
        private String g;

        @Nullable
        private String j;

        @Nullable
        com.github.catvod.spider.merge.G.b n;
        private final StringBuilder f = new StringBuilder();
        private boolean h = false;
        private final StringBuilder i = new StringBuilder();
        private boolean k = false;
        private boolean l = false;
        boolean m = false;

        h() {
        }

        private void r() {
            this.k = true;
            String str = this.j;
            if (str != null) {
                this.i.append(str);
                this.j = null;
            }
        }

        final String A() {
            String str = this.d;
            return str != null ? str : "[unset]";
        }

        final void k(char c) {
            this.h = true;
            String str = this.g;
            if (str != null) {
                this.f.append(str);
                this.g = null;
            }
            this.f.append(c);
        }

        final void l(String str) {
            String strReplace = str.replace((char) 0, (char) 65533);
            this.h = true;
            String str2 = this.g;
            if (str2 != null) {
                this.f.append(str2);
                this.g = null;
            }
            if (this.f.length() == 0) {
                this.g = strReplace;
            } else {
                this.f.append(strReplace);
            }
        }

        final void m(char c) {
            r();
            this.i.append(c);
        }

        final void n(String str) {
            r();
            if (this.i.length() == 0) {
                this.j = str;
            } else {
                this.i.append(str);
            }
        }

        final void o(int[] iArr) {
            r();
            for (int i : iArr) {
                this.i.appendCodePoint(i);
            }
        }

        final void p(char c) {
            q(String.valueOf(c));
        }

        final void q(String str) {
            String strReplace = str.replace((char) 0, (char) 65533);
            String str2 = this.d;
            if (str2 != null) {
                strReplace = str2.concat(strReplace);
            }
            this.d = strReplace;
            this.e = com.github.catvod.spider.merge.H.f.a(strReplace);
        }

        final void s() {
            if (this.h) {
                x();
            }
        }

        final boolean t(String str) {
            com.github.catvod.spider.merge.G.b bVar = this.n;
            return bVar != null && bVar.n(str);
        }

        final boolean u() {
            return this.n != null;
        }

        final h v(String str) {
            this.d = str;
            this.e = com.github.catvod.spider.merge.H.f.a(str);
            return this;
        }

        final String w() {
            String str = this.d;
            com.github.catvod.spider.merge.E.c.b(str == null || str.length() == 0);
            return this.d;
        }

        final void x() {
            if (this.n == null) {
                this.n = new com.github.catvod.spider.merge.G.b();
            }
            if (this.h && this.n.size() < 512) {
                String strTrim = (this.f.length() > 0 ? this.f.toString() : this.g).trim();
                if (strTrim.length() > 0) {
                    this.n.d(strTrim, this.k ? this.i.length() > 0 ? this.i.toString() : this.j : this.l ? "" : null);
                }
            }
            i.i(this.f);
            this.g = null;
            this.h = false;
            i.i(this.i);
            this.j = null;
            this.k = false;
            this.l = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.H.i
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public h h() {
            super.h();
            this.d = null;
            this.e = null;
            i.i(this.f);
            this.g = null;
            this.h = false;
            i.i(this.i);
            this.j = null;
            this.l = false;
            this.k = false;
            this.m = false;
            this.n = null;
            return this;
        }

        final void z() {
            this.l = true;
        }
    }

    i() {
    }

    static void i(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    final void a(int i) {
        this.c = i;
    }

    final boolean b() {
        return this.a == 5;
    }

    final boolean c() {
        return this.a == 4;
    }

    final boolean d() {
        return this.a == 1;
    }

    final boolean e() {
        return this.a == 6;
    }

    final boolean f() {
        return this.a == 3;
    }

    final boolean g() {
        return this.a == 2;
    }

    i h() {
        this.b = -1;
        this.c = -1;
        return this;
    }

    final void j(int i) {
        this.b = i;
    }
}
