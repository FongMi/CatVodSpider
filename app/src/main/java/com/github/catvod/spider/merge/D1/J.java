package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.l.C1290c;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class J extends P {
    private final StringBuilder d = new StringBuilder();
    private String e;

    J() {
        this.a = 4;
    }

    @Override // com.github.catvod.spider.merge.d1.P
    final P h() {
        super.h();
        P.i(this.d);
        this.e = null;
        return this;
    }

    final J k(char c) {
        String str = this.e;
        if (str != null) {
            this.d.append(str);
            this.e = null;
        }
        this.d.append(c);
        return this;
    }

    final J l(String str) {
        String str2 = this.e;
        if (str2 != null) {
            this.d.append(str2);
            this.e = null;
        }
        if (this.d.length() == 0) {
            this.e = str;
        } else {
            this.d.append(str);
        }
        return this;
    }

    final String m() {
        String str = this.e;
        return str != null ? str : this.d.toString();
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("<!--");
        String string = this.e;
        if (string == null) {
            string = this.d.toString();
        }
        return C1290c.b(sbB, string, "-->");
    }
}
