package com.github.catvod.spider.merge.XU;

import com.github.catvod.spider.merge.ZrJ;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class v implements Serializable {
    private String a;
    private String b;
    private String c;

    public v(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException(ZrJ.d("352C282C246509223939682B16376B2C242916342E29683116632928682B0C2F27"));
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
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.b.equals(vVar.b) && this.a.equals(vVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.a.equals("")) {
            return this.b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ZrJ.d("02"));
        stringBuffer.append(this.a);
        stringBuffer.append(ZrJ.d("04"));
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }
}
