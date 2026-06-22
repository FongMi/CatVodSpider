package com.github.catvod.spider.merge.t;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0144a implements Serializable {
    public final String a;
    public final String b;
    public final String c;

    public C0144a(String str, String str2) {
        this(str, str2, "");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0144a)) {
            return false;
        }
        C0144a c0144a = (C0144a) obj;
        return this.b.equals(c0144a.b) && this.a.equals(c0144a.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        boolean zEquals = str.equals("");
        String str2 = this.b;
        if (zEquals) {
            return str2;
        }
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(str);
        stringBuffer.append("}");
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public C0144a(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException("Local part not allowed to be null");
        }
        str = str == null ? "" : str;
        str3 = str3 == null ? "" : str3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
