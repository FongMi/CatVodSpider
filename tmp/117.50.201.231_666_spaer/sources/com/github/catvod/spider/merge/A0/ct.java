package com.github.catvod.spider.merge.A0;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ct implements vq {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ct(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.github.catvod.spider.merge.A0.vq
    public final kv a(oa oaVar, fj fjVar) {
        switch (this.b) {
            case 0:
                if (fjVar.a == Number.class) {
                    return (rv) this.c;
                }
                return null;
            case 1:
                if (fjVar.a == Object.class) {
                    return new on(oaVar, (vs) this.c);
                }
                return null;
            default:
                Class cls = fjVar.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (gs) this.c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.b) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + Marker.ANY_NON_NULL_MARKER + GregorianCalendar.class.getName() + ",adapter=" + ((gs) this.c) + "]";
            default:
                return super.toString();
        }
    }
}
