package com.github.catvod.spider.merge.u;

import com.github.catvod.spider.merge.oZP;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0235a implements Serializable {
    private String a;
    private String b;
    private String c;

    public C0235a(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException(oZP.d("390014200075050E05354C3B1A1B572000391A1812254C211A4F15244C3B00031B"));
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
        if (obj == null || !(obj instanceof C0235a)) {
            return false;
        }
        C0235a c0235a = (C0235a) obj;
        return this.b.equals(c0235a.b) && this.a.equals(c0235a.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.a.equals("")) {
            return this.b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(oZP.d("0E"));
        stringBuffer.append(this.a);
        stringBuffer.append(oZP.d("08"));
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }
}
