package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class m2 implements Serializable {
    public final String b;
    public final String c;
    public final int d;

    public m2(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    private void a(StringBuilder sb) {
        sb.append(this.b);
        sb.append(':');
        int i = this.d;
        if (i <= -1) {
            i = 0;
        }
        sb.append(i);
        sb.append(":0");
    }

    public final void b(StringBuilder sb) {
        sb.append("\tat ");
        sb.append(this.b);
        if (this.d > -1) {
            sb.append(':');
            sb.append(this.d);
        }
        if (this.c != null) {
            sb.append(" (");
            sb.append(this.c);
            sb.append(')');
        }
    }

    public final void c(StringBuilder sb) {
        String str = this.c;
        if (str != null) {
            sb.append(str);
            sb.append("()");
        }
        sb.append('@');
        sb.append(this.b);
        if (this.d > -1) {
            sb.append(':');
            sb.append(this.d);
        }
    }

    public final void d(StringBuilder sb) {
        sb.append("    at ");
        String str = this.c;
        if (str == null || "anonymous".equals(str) || "undefined".equals(this.c)) {
            a(sb);
            return;
        }
        sb.append(this.c);
        sb.append(" (");
        a(sb);
        sb.append(')');
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        c(sb);
        return sb.toString();
    }
}
