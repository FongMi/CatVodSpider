package com.github.catvod.spider.merge;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class rO {
    private final boolean T4;
    private final boolean b;
    public static final rO l8 = new rO(false, false);
    public static final rO S = new rO(true, true);

    public rO(boolean z, boolean z2) {
        this.T4 = z;
        this.b = z2;
    }

    public boolean OL() {
        return this.T4;
    }

    Rz S(Rz rz) {
        if (rz != null && !this.b) {
            rz.Q();
        }
        return rz;
    }

    public String T4(String str) {
        String strTrim = str.trim();
        return !this.T4 ? kA.l8(strTrim) : strTrim;
    }

    public boolean b() {
        return this.b;
    }

    public String l8(String str) {
        String strTrim = str.trim();
        return !this.b ? kA.l8(strTrim) : strTrim;
    }
}
