package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class kl extends kv {
    public static final gt a = new gt();
    public final SimpleDateFormat d;

    private kl() {
        this.d = new SimpleDateFormat("MMM d, yyyy");
    }

    public /* synthetic */ kl(int i) {
        this();
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        Date date;
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        String strAi = rdVar.ai();
        synchronized (this) {
            TimeZone timeZone = this.d.getTimeZone();
            try {
                try {
                    date = new Date(this.d.parse(strAi).getTime());
                } catch (ParseException e) {
                    throw new yc("Failed parsing '" + strAi + "' as SQL Date; at path " + rdVar.w(true), e);
                }
            } finally {
                this.d.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            aagVar.w();
            return;
        }
        synchronized (this) {
            str = this.d.format((java.util.Date) date);
        }
        aagVar.ae(str);
    }
}
