package com.github.catvod.spider.merge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Yg implements Sj {
    private Queue<zE> OL;
    private volatile Sj S;
    private Boolean T4;
    private Method b;
    private final boolean l;
    private final String l8;

    public Yg(String str, Queue<zE> queue, boolean z) {
        this.l8 = str;
        this.OL = queue;
        this.l = z;
    }

    public void OL(Sj sj) {
        this.S = sj;
    }

    public boolean S() {
        return this.S instanceof cL;
    }

    public boolean T4() {
        return this.S == null;
    }

    public void b(mm mmVar) {
        if (l8()) {
            try {
                this.b.invoke(this.S, mmVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Yg.class == obj.getClass() && this.l8.equals(((Yg) obj).l8);
    }

    @Override // com.github.catvod.spider.merge.Sj
    public String getName() {
        return this.l8;
    }

    public int hashCode() {
        return this.l8.hashCode();
    }

    public boolean l8() {
        Boolean bool = this.T4;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.b = this.S.getClass().getMethod("log", mm.class);
            this.T4 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.T4 = Boolean.FALSE;
        }
        return this.T4.booleanValue();
    }
}
