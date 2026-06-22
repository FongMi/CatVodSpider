package com.github.catvod.spider.merge.af;

import com.github.catvod.spider.merge.nIe;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class n implements Serializable {
    private String a;
    private String b;
    private String c;

    public n(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException(nIe.d("0E093022256F3207213769212D12732225232D113627693B2D4631266921370A3F"));
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
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.b.equals(nVar.b) && this.a.equals(nVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.a.equals("")) {
            return this.b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nIe.d("39"));
        stringBuffer.append(this.a);
        stringBuffer.append(nIe.d("3F"));
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }
}
