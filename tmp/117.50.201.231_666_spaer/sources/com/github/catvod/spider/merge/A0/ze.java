package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ze {
    public static volatile lr a = lr.a;
    public final StringBuffer b;
    public final as c;
    public final lr d;

    public ze(as asVar) {
        lr lrVar = a;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.b = stringBuffer;
        this.d = lrVar;
        this.c = asVar;
        if (lrVar.d) {
            lr.t(asVar);
            if (lrVar.e) {
                stringBuffer.append(sp.c(as.class));
            } else {
                stringBuffer.append(as.class.getName());
            }
        }
        if (lrVar.f) {
            lr.t(asVar);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(asVar)));
        }
        stringBuffer.append(lrVar.g);
        if (lrVar.j) {
            stringBuffer.append(lrVar.k);
        }
    }

    public final String toString() {
        boolean z = true;
        StringBuffer stringBuffer = this.b;
        as asVar = this.c;
        lr lrVar = this.d;
        String str = lrVar.k;
        int i = fx.a;
        boolean z2 = false;
        if (str.length() <= stringBuffer.length()) {
            int length = stringBuffer.length() - str.length();
            int length2 = str.length();
            int i2 = 0;
            int length3 = stringBuffer.length() - length;
            int length4 = str.length();
            if (length < 0 || length2 < 0 || length3 < length2 || length4 < length2) {
                z = false;
                z2 = z;
            } else {
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    int i4 = length + 1;
                    int i5 = i2 + 1;
                    if (stringBuffer.charAt(length) != str.charAt(i2)) {
                        break;
                    }
                    length = i4;
                    length2 = i3;
                    i2 = i5;
                }
                z = false;
                z2 = z;
            }
        }
        if (z2) {
            stringBuffer.setLength(stringBuffer.length() - lrVar.k.length());
        }
        stringBuffer.append(lrVar.h);
        lr.u(asVar);
        return stringBuffer.toString();
    }
}
