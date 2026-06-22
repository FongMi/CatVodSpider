package com.github.catvod.spider.merge.Bk;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.ZrJ;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p {
    public static C0724g a(com.github.catvod.spider.merge.UY.m mVar) {
        C0724g c0724g = new C0724g();
        while (true) {
            mVar = mVar.g0();
            if (mVar == null) {
                break;
            }
            c0724g.add(mVar);
        }
        if (c0724g.size() > 0) {
            return c0724g;
        }
        return null;
    }

    public static int b(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.Wb.e eVar) {
        Iterator<com.github.catvod.spider.merge.UY.m> it = mVar.k0().V().iterator();
        int i = 1;
        while (it.hasNext()) {
            com.github.catvod.spider.merge.UY.m next = it.next();
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

    public static C0724g d(com.github.catvod.spider.merge.UY.m mVar) {
        C0724g c0724g = new C0724g();
        while (true) {
            mVar = mVar.n0();
            if (mVar == null) {
                break;
            }
            c0724g.add(mVar);
        }
        if (c0724g.size() > 0) {
            return c0724g;
        }
        return null;
    }

    public static void e(com.github.catvod.spider.merge.UY.m mVar, int i) {
        mVar.R(ZrJ.d("3C0F141E09083C1C1F0C0F1A300D0F0810"), String.valueOf(i));
    }

    public static void f(com.github.catvod.spider.merge.UY.m mVar, int i) {
        mVar.R(ZrJ.d("3C0F141E09083C1C1F0C0F1A380F0712061034"), String.valueOf(i));
    }
}
