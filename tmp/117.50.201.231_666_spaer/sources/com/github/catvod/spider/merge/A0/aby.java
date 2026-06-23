package com.github.catvod.spider.merge.A0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aby implements aac, Serializable {
    public zy a;
    public volatile Object b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public aby(fo foVar) {
        ko.f("initializer", foVar);
        this.a = (zy) foVar;
        this.b = jo.h;
        this.c = this;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.catvod.spider.merge.A0.fo, com.github.catvod.spider.merge.A0.zy, java.lang.Object] */
    public final Object d() {
        Object objInvoke;
        Object obj = this.b;
        jo joVar = jo.h;
        if (obj != joVar) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == joVar) {
                ?? r1 = this.a;
                ko.c(r1);
                objInvoke = r1.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.b != jo.h ? String.valueOf(d()) : "Lazy value not initialized yet.";
    }
}
