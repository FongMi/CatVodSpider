package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.oZP;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class p {
    public static C0074g a(com.github.catvod.spider.merge.L.m mVar) {
        C0074g c0074g = new C0074g();
        while (true) {
            mVar = mVar.g0();
            if (mVar == null) {
                break;
            }
            c0074g.add(mVar);
        }
        if (c0074g.size() > 0) {
            return c0074g;
        }
        return null;
    }

    public static int b(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.W.e eVar) {
        Iterator<com.github.catvod.spider.merge.L.m> it = mVar.k0().V().iterator();
        int i = 1;
        while (it.hasNext()) {
            com.github.catvod.spider.merge.L.m next = it.next();
            if (mVar.t0().equals(next.t0()) && eVar.a().contains(next)) {
                if (mVar == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public static String c(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static C0074g d(com.github.catvod.spider.merge.L.m mVar) {
        C0074g c0074g = new C0074g();
        while (true) {
            mVar = mVar.n0();
            if (mVar == null) {
                break;
            }
            c0074g.add(mVar);
        }
        if (c0074g.size() > 0) {
            return c0074g;
        }
        return null;
    }

    public static void e(com.github.catvod.spider.merge.L.m mVar, int i) {
        mVar.R(oZP.d("302328122D18303023002B0A3C21330434"), String.valueOf(i));
    }

    public static void f(com.github.catvod.spider.merge.L.m mVar, int i) {
        mVar.R(oZP.d("302328122D18303023002B0A34233B1E220038"), String.valueOf(i));
    }
}
