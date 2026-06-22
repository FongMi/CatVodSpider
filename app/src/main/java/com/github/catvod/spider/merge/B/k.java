package com.github.catvod.spider.merge.B;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k {
    public Object a;
    public final k b;
    public final Object c;
    public final int d;
    public Type e;
    private transient String f;

    public k(k kVar, Object obj, Object obj2) {
        this.b = kVar;
        this.a = obj;
        this.c = obj2;
        this.d = kVar == null ? 0 : kVar.d + 1;
    }

    public final String toString() {
        StringBuilder sb;
        String string;
        if (this.f == null) {
            if (this.b == null) {
                string = "$";
            } else {
                if (this.c instanceof Integer) {
                    sb = new StringBuilder();
                    sb.append(this.b.toString());
                    sb.append("[");
                    sb.append(this.c);
                    sb.append("]");
                } else {
                    sb = new StringBuilder();
                    sb.append(this.b.toString());
                    sb.append(".");
                    sb.append(this.c);
                }
                string = sb.toString();
            }
            this.f = string;
        }
        return this.f;
    }
}
