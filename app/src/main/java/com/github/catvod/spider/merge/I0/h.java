package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.I.t0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h {
    private String a;
    private String b;
    private String c;
    private String d;
    private int e = -1;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean f(String str) {
        if (str != null && !str.isEmpty()) {
            Matcher matcher = Pattern.compile("^(https?|socks[45]?):\\/\\/(?:([^:@\\s]+):([^@\\s]+)@)?([^:@\\s]+):(\\d+)$").matcher(str);
            if (matcher.find()) {
                this.a = matcher.group(1);
                this.b = matcher.group(2);
                this.c = matcher.group(3);
                this.d = matcher.group(4);
                try {
                    this.e = Integer.parseInt(matcher.group(5));
                    return true;
                } catch (NumberFormatException unused) {
                    return false;
                }
            }
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -1;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbB = t0.b("UniversalProxyParser{scheme='");
        sbB.append(this.a);
        sbB.append('\'');
        sbB.append(", username='");
        sbB.append(this.b);
        sbB.append('\'');
        sbB.append(", password='");
        sbB.append(this.c != null ? "******" : "null");
        sbB.append('\'');
        sbB.append(", host='");
        sbB.append(this.d);
        sbB.append('\'');
        sbB.append(", port=");
        sbB.append(this.e);
        sbB.append(", hasCredentials=");
        sbB.append((this.b == null || this.c == null) ? false : true);
        sbB.append('}');
        return sbB.toString();
    }
}
