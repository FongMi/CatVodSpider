package com.github.catvod.spider.merge.FM.t;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0412a implements Serializable {
    private String a;
    private String b;
    private String c;

    public C0412a(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException("Local part not allowed to be null");
        }
        str = str == null ? "" : str;
        str3 = str3 == null ? "" : str3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0412a)) {
            return false;
        }
        C0412a c0412a = (C0412a) obj;
        return this.b.equals(c0412a.b) && this.a.equals(c0412a.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.a.equals("")) {
            return this.b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(this.a);
        stringBuffer.append("}");
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }
}
