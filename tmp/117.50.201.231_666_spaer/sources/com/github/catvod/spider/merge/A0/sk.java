package com.github.catvod.spider.merge.A0;

import java.math.BigDecimal;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class sk {
    public static final xb a;
    public static final xb b;

    static {
        int i = 3;
        a = new xb("REMOVED_TASK", i);
        b = new xb("CLOSED_EMPTY", i);
    }

    public static void c(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static BigDecimal d(String str) {
        c(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }
}
