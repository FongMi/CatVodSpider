package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum kc extends vs {
    public kc() {
        super("LONG_OR_DOUBLE", 2);
    }

    public static Double b(String str, rd rdVar) throws uc {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                if (rdVar.o != 1) {
                    throw new uc("JSON forbids NaN and infinities: " + dValueOf + "; at path " + rdVar.w(true));
                }
            }
            return dValueOf;
        } catch (NumberFormatException e) {
            throw new tv("Cannot parse " + str + "; at path " + rdVar.w(true), e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.vs
    public final Number a(rd rdVar) throws IOException {
        String strAi = rdVar.ai();
        if (strAi.indexOf(46) >= 0) {
            return b(strAi, rdVar);
        }
        try {
            return Long.valueOf(Long.parseLong(strAi));
        } catch (NumberFormatException unused) {
            return b(strAi, rdVar);
        }
    }
}
