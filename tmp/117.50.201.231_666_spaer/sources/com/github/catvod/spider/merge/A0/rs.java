package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class rs {
    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String b(xl xlVar) {
        Object objB;
        if (xlVar instanceof acu) {
            return xlVar.toString();
        }
        try {
            objB = xlVar + '@' + a(xlVar);
        } catch (Throwable th) {
            objB = act.b(th);
        }
        if (vx.b(objB) != null) {
            objB = xlVar.getClass().getName() + '@' + a(xlVar);
        }
        return (String) objB;
    }
}
