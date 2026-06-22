package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1159m0 {
    private Object a = "Coerced Interface";
    private Object b;
    private int c;

    C1159m0(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1159m0)) {
            return false;
        }
        C1159m0 c1159m0 = (C1159m0) obj;
        return this.a.equals(c1159m0.a) && this.b.equals(c1159m0.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.a.hashCode() ^ this.b.hashCode();
        }
        return this.c;
    }
}
