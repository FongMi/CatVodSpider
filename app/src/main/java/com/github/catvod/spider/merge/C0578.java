package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0579;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ႀ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0578 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final C0576 f1270;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final InterfaceC0402 f1271;

    public C0578(C0576 c0576, InterfaceC0402 interfaceC0402) {
        this.f1270 = c0576;
        this.f1271 = interfaceC0402;
    }

    public String toString() {
        if (this.f1270.f1265 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (C0579 c0579 : this.f1270.m1841()) {
            C0579[] c0579Arr = c0579.f1274;
            int length = c0579Arr != null ? c0579Arr.length : 0;
            for (int i = 0; i < length; i++) {
                C0579 c05792 = c0579.f1274[i];
                if (c05792 != null && c05792.f1272 != Integer.MAX_VALUE) {
                    sb.append(m1847(c0579));
                    String strM1846 = m1846(i);
                    sb.append(SOY.d("57"));
                    sb.append(strM1846);
                    sb.append(SOY.d("576C"));
                    sb.append(m1847(c05792));
                    sb.append('\n');
                }
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected String m1846(int i) {
        return this.f1271.mo1543(i - 1);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected String m1847(C0579 c0579) {
        int i = c0579.f1272;
        StringBuilder sb = new StringBuilder();
        sb.append(c0579.f1275 ? SOY.d("40") : "");
        sb.append(SOY.d("09"));
        sb.append(i);
        sb.append(c0579.f1278 ? SOY.d("24") : "");
        String string = sb.toString();
        if (!c0579.f1275) {
            return string;
        }
        C0579.C0580[] c0580Arr = c0579.f1279;
        String strD = SOY.d("476C");
        if (c0580Arr != null) {
            return string + strD + Arrays.toString(c0579.f1279);
        }
        return string + strD + c0579.f1276;
    }
}
