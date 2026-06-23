package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class xq extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        try {
            int iAc = rdVar.ac();
            if (iAc <= 65535 && iAc >= -32768) {
                return Short.valueOf((short) iAc);
            }
            throw new yc("Lossy conversion from " + iAc + " to short; at path " + rdVar.w(true));
        } catch (NumberFormatException e) {
            throw new yc(e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            aagVar.w();
        } else {
            aagVar.ac(r4.shortValue());
        }
    }
}
