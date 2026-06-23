package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class adm extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        try {
            int iAc = rdVar.ac();
            if (iAc <= 255 && iAc >= -128) {
                return Byte.valueOf((byte) iAc);
            }
            throw new yc("Lossy conversion from " + iAc + " to byte; at path " + rdVar.w(true));
        } catch (NumberFormatException e) {
            throw new yc(e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            aagVar.w();
        } else {
            aagVar.ac(r4.byteValue());
        }
    }
}
