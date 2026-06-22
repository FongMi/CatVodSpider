package com.github.catvod.spider.merge.M;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0079z extends B {
    public C0079z() {
        super("InTable", 8);
    }

    @Override // com.github.catvod.spider.merge.M.B
    public final boolean c(N n, C0032b c0032b) {
        B b;
        if (n.a == 5 && com.github.catvod.bean.b.c(c0032b.f().d.b, A.A)) {
            c0032b.s = new ArrayList();
            c0032b.m = c0032b.l;
            c0032b.l = B.j;
            return c0032b.D(n);
        }
        if (n.a()) {
            c0032b.t((H) n);
            return true;
        }
        if (n.b()) {
            c0032b.h(this);
            return false;
        }
        boolean zE = n.e();
        C0069u c0069u = B.d;
        if (!zE) {
            if (!n.d()) {
                if (!n.c()) {
                    d(n, c0032b);
                    return true;
                }
                if (c0032b.g("html")) {
                    c0032b.h(this);
                }
                return true;
            }
            String str = ((K) n).c;
            if (str.equals("table")) {
                if (!c0032b.q(str)) {
                    c0032b.h(this);
                    return false;
                }
                c0032b.B("table");
                c0032b.M();
            } else {
                if (com.github.catvod.bean.b.c(str, A.z)) {
                    c0032b.h(this);
                    return false;
                }
                if (!str.equals("template")) {
                    d(n, c0032b);
                    return true;
                }
                c0032b.E(n, c0069u);
            }
            return true;
        }
        L l = (L) n;
        String str2 = l.c;
        if (str2.equals("caption")) {
            c0032b.e();
            c0032b.q.add(null);
            c0032b.r(l);
            b = B.k;
        } else {
            if (!str2.equals("colgroup")) {
                if (str2.equals("col")) {
                    c0032b.e();
                    c0032b.G("colgroup");
                } else if (com.github.catvod.bean.b.c(str2, A.s)) {
                    c0032b.e();
                    c0032b.r(l);
                    b = B.m;
                } else {
                    if (!com.github.catvod.bean.b.c(str2, A.t)) {
                        if (str2.equals("table")) {
                            c0032b.h(this);
                            if (!c0032b.q(str2)) {
                                return false;
                            }
                            c0032b.B(str2);
                            if (c0032b.M()) {
                                return c0032b.D(n);
                            }
                            c0032b.r(l);
                            return true;
                        }
                        if (com.github.catvod.bean.b.c(str2, A.u)) {
                            c0032b.g = n;
                            return c0069u.c(n, c0032b);
                        }
                        if (str2.equals("input")) {
                            if (!l.l() || !l.l.d("type").equalsIgnoreCase("hidden")) {
                                d(n, c0032b);
                                return true;
                            }
                            c0032b.u(l);
                        } else {
                            if (!str2.equals("form")) {
                                d(n, c0032b);
                                return true;
                            }
                            c0032b.h(this);
                            if (c0032b.p != null || c0032b.y("template")) {
                                return false;
                            }
                            c0032b.v(l, false, false);
                        }
                        return true;
                    }
                    c0032b.e();
                    c0032b.G("tbody");
                }
                return c0032b.D(n);
            }
            c0032b.e();
            c0032b.r(l);
            b = B.l;
        }
        c0032b.l = b;
        return true;
    }

    public final void d(N n, C0032b c0032b) {
        c0032b.h(this);
        c0032b.v = true;
        c0032b.E(n, B.g);
        c0032b.v = false;
    }
}
