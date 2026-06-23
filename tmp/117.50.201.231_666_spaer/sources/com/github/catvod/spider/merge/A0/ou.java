package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ou {
    public static xo a(xo xoVar, xp xpVar) {
        ko.f("key", xpVar);
        if (ko.b(xoVar.getKey(), xpVar)) {
            return xoVar;
        }
        return null;
    }

    public static yg b(xo xoVar, xp xpVar) {
        ko.f("key", xpVar);
        return ko.b(xoVar.getKey(), xpVar) ? ek.a : xoVar;
    }
}
