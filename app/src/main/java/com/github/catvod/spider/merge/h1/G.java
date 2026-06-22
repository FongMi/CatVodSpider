package com.github.catvod.spider.merge.h1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class G extends E {
    private String r;

    public G() {
        this.b = 134;
    }

    public G(int i, int i2) {
        this.b = 134;
        this.i = i;
        this.j = i2;
    }

    public final String getName() {
        return this.r;
    }

    public final void m0(String str) {
        String strTrim = str == null ? null : str.trim();
        if (strTrim == null || "".equals(strTrim)) {
            throw new IllegalArgumentException("invalid label name");
        }
        this.r = strTrim;
    }
}
