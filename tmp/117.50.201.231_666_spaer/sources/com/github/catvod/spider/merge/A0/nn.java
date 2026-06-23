package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class nn extends kv {
    public static final yu a = new yu();
    public final SimpleDateFormat d;

    private nn() {
        this.d = new SimpleDateFormat("hh:mm:ss a");
    }

    public /* synthetic */ nn(int i) {
        this();
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        Time time;
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        String strAi = rdVar.ai();
        synchronized (this) {
            TimeZone timeZone = this.d.getTimeZone();
            try {
                try {
                    time = new Time(this.d.parse(strAi).getTime());
                } catch (ParseException e) {
                    throw new yc("Failed parsing '" + strAi + "' as SQL Time; at path " + rdVar.w(true), e);
                }
            } finally {
                this.d.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            aagVar.w();
            return;
        }
        synchronized (this) {
            str = this.d.format((Date) time);
        }
        aagVar.ae(str);
    }
}
