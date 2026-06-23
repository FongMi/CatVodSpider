package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class vn {
    public static final aar a(jo joVar, yg ygVar) {
        if (ygVar.get(nr.aj) == null) {
            return ygVar.equals(ek.a) ? joVar : new sc(joVar, ygVar, -3, 1);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + ygVar).toString());
    }
}
