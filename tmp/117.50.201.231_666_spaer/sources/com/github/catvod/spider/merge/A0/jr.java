package com.github.catvod.spider.merge.A0;

import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class jr {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static final Logger d = LoggerFactory.getLogger((Class<?>) jr.class);

    static {
        int i = 17;
        int i2 = 14;
        Class[] clsArr = {pp.class, pq.class, qf.class, sk.class, acs.class, act.class, rk.class, l.class, xy.class, bh.class, tw.class, ou.class, bj.class, rs.class};
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (clsArr[i3].newInstance() != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (Exception e) {
                d.info(abx.a(e), (Throwable) e);
                i3++;
                i = 17;
                i2 = 14;
            }
        }
        Class[] clsArr2 = new Class[i];
        clsArr2[0] = vu.class;
        clsArr2[1] = xj.class;
        clsArr2[2] = zb.class;
        clsArr2[3] = zr.class;
        clsArr2[4] = lk.class;
        clsArr2[5] = mx.class;
        clsArr2[6] = oe.class;
        clsArr2[7] = oh.class;
        clsArr2[8] = hk.class;
        clsArr2[9] = abx.class;
        clsArr2[10] = cl.class;
        clsArr2[11] = hj.class;
        clsArr2[12] = bo.class;
        clsArr2[13] = da.class;
        clsArr2[i2] = vn.class;
        clsArr2[15] = ks.class;
        clsArr2[16] = or.class;
        for (int i4 = 0; i4 < i; i4++) {
            try {
                if (clsArr2[i4].newInstance() != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (Exception e2) {
                d.info(abx.a(e2), (Throwable) e2);
            }
        }
        Class[] clsArr3 = {po.class, ah.class, aai.class, abd.class, sx.class, oj.class};
        for (int i5 = 0; i5 < 6; i5++) {
            try {
                if (clsArr3[i5].newInstance() != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (Exception e3) {
                d.info(abx.a(e3), (Throwable) e3);
            }
        }
    }
}
