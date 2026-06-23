package com.github.catvod.spider.merge.A0;

import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class jp {
    public final int a;
    public final int b;
    public final int c;

    public jp(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jp.class != obj.getClass()) {
            return false;
        }
        jp jpVar = (jp) obj;
        return this.a == jpVar.a && this.b == jpVar.b && this.c == jpVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return this.b + "," + this.c + ":" + this.a;
    }
}
