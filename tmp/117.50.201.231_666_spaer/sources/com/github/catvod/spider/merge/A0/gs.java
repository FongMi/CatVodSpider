package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class gs extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        int iAc;
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        rdVar.q();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (rdVar.ak() != 4) {
            String strAe = rdVar.ae();
            iAc = rdVar.ac();
            strAe.getClass();
            switch (strAe) {
                case "dayOfMonth":
                    i3 = iAc;
                    break;
                case "minute":
                    i5 = iAc;
                    break;
                case "second":
                    i6 = iAc;
                    break;
                case "year":
                    i = iAc;
                    break;
                case "month":
                    i2 = iAc;
                    break;
                case "hourOfDay":
                    i4 = iAc;
                    break;
            }
        }
        rdVar.u();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            aagVar.w();
            return;
        }
        aagVar.q();
        aagVar.u("year");
        aagVar.ac(r4.get(1));
        aagVar.u("month");
        aagVar.ac(r4.get(2));
        aagVar.u("dayOfMonth");
        aagVar.ac(r4.get(5));
        aagVar.u("hourOfDay");
        aagVar.ac(r4.get(11));
        aagVar.u("minute");
        aagVar.ac(r4.get(12));
        aagVar.u("second");
        aagVar.ac(r4.get(13));
        aagVar.t();
    }
}
