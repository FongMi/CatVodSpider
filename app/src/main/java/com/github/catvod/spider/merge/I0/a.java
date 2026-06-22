package com.github.catvod.spider.merge.I0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements Serializable {
    private String b;
    private String c;
    private String d;

    public a(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException("Local part not allowed to be null");
        }
        str = str == null ? "" : str;
        str3 = str3 == null ? "" : str3;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.c.equals(aVar.c) && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    public final String toString() {
        if (this.b.equals("")) {
            return this.c;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(this.b);
        stringBuffer.append("}");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }
}
