package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum fy extends le {
    public fy() {
        super("Initial", 0);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (le.ab(uzVar)) {
            return true;
        }
        if (uzVar.j()) {
            zlVar.be((gx) uzVar);
        } else {
            boolean zK = uzVar.k();
            np npVar = le.d;
            if (!zK) {
                zlVar.n.am = 2;
                zlVar.v = npVar;
                return zlVar.bp(uzVar);
            }
            nk nkVar = (nk) uzVar;
            vz vzVar = zlVar.r;
            String string = nkVar.b.toString();
            vzVar.getClass();
            String strTrim = string.trim();
            if (!vzVar.c) {
                strTrim = qf.c(strTrim);
            }
            String string2 = nkVar.d.toString();
            String string3 = nkVar.e.toString();
            en enVar = new en(strTrim);
            wc.e(string2);
            wc.e(string3);
            enVar.e("#doctype", strTrim);
            enVar.e("publicId", string2);
            enVar.e("systemId", string3);
            if (enVar.a("publicId")) {
                enVar.e("pubSysKey", "PUBLIC");
            } else if (enVar.a("systemId")) {
                enVar.e("pubSysKey", "SYSTEM");
            }
            String str = nkVar.c;
            if (str != null) {
                enVar.e("pubSysKey", str);
            }
            zlVar.n.y(enVar);
            if (nkVar.f || !enVar.au("#doctype").equals("html") || enVar.au("publicId").equalsIgnoreCase("HTML")) {
                zlVar.n.am = 2;
            }
            zlVar.v = npVar;
        }
        return true;
    }
}
