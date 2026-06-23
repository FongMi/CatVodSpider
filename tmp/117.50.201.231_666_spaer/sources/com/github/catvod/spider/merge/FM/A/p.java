package com.github.catvod.spider.merge.FM.A;

import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class p {
    public static C0274g a(com.github.catvod.spider.merge.FM.K.m mVar) {
        C0274g c0274g = new C0274g();
        while (true) {
            mVar = mVar.g0();
            if (mVar == null) {
                break;
            }
            c0274g.add(mVar);
        }
        if (c0274g.size() > 0) {
            return c0274g;
        }
        return null;
    }

    public static int b(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.V.e eVar) {
        Iterator<com.github.catvod.spider.merge.FM.K.m> it = mVar.k0().V().iterator();
        int i = 1;
        while (it.hasNext()) {
            com.github.catvod.spider.merge.FM.K.m next = it.next();
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

    public static C0274g d(com.github.catvod.spider.merge.FM.K.m mVar) {
        C0274g c0274g = new C0274g();
        while (true) {
            mVar = mVar.n0();
            if (mVar == null) {
                break;
            }
            c0274g.add(mVar);
        }
        if (c0274g.size() > 0) {
            return c0274g;
        }
        return null;
    }

    public static void e(com.github.catvod.spider.merge.FM.K.m mVar, int i) {
        mVar.R("EL_SAME_TAG_INDEX", String.valueOf(i));
    }

    public static void f(com.github.catvod.spider.merge.FM.K.m mVar, int i) {
        mVar.R("EL_SAME_TAG_ALL_NUM", String.valueOf(i));
    }
}
