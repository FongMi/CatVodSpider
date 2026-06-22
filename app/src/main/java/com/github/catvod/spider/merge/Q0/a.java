package com.github.catvod.spider.merge.Q0;

import com.github.catvod.spider.merge.f1.C1116b1;
import com.github.catvod.spider.merge.f1.C1128e1;
import com.github.catvod.spider.merge.f1.C1140h1;
import com.github.catvod.spider.merge.f1.C1156l1;
import com.github.catvod.spider.merge.f1.C1185v;
import com.github.catvod.spider.merge.f1.G2;
import com.github.catvod.spider.merge.f1.n2;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a {
    public static int a(double d) {
        int i = (int) d;
        if (i == d) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        long j = 9218868437227405312L & jDoubleToLongBits;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0 ? -1074 : ((int) (j >> 52)) - 1075;
        if (i2 <= -53 || i2 > 31) {
            return 0;
        }
        long j2 = 4503599627370495L & jDoubleToLongBits;
        if (!(j == 0)) {
            j2 += 4503599627370496L;
        }
        return ((jDoubleToLongBits & Long.MIN_VALUE) != 0 ? -1 : 1) * ((int) (i2 < 0 ? j2 >> (-i2) : j2 << i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ea, code lost:
    
        if (r0[r3] == 'l') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00f0, code lost:
    
        if (r0[r3] != 'L') goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f4, code lost:
    
        if (r13 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f6, code lost:
    
        if (r14 != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00f8, code lost:
    
        if (r15 != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00fa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00fc, code lost:
    
        if (r7 != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00fe, code lost:
    
        if (r13 == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0100, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ae, code lost:
    
        if (r3 >= r0.length) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b2, code lost:
    
        if (r0[r3] < '0') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b6, code lost:
    
        if (r0[r3] > '9') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00bb, code lost:
    
        if (r0[r3] == 'e') goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00bf, code lost:
    
        if (r0[r3] != 'E') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c4, code lost:
    
        if (r0[r3] != '.') goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00c6, code lost:
    
        if (r15 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c8, code lost:
    
        if (r14 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00cb, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00cc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00cd, code lost:
    
        if (r7 != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d3, code lost:
    
        if (r0[r3] == 'd') goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00d9, code lost:
    
        if (r0[r3] == 'D') goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00dd, code lost:
    
        if (r0[r3] == 'f') goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e3, code lost:
    
        if (r0[r3] != 'F') goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00e5, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q0.a.b(java.lang.String):boolean");
    }

    public Object c(C1185v c1185v, n2 n2Var, Object obj, Class cls) {
        G2 g2;
        return (obj == null || obj == (g2 = G2.b) || (obj instanceof n2)) ? obj : (cls == null || !cls.isPrimitive()) ? obj.getClass().isArray() ? new C1116b1(n2Var, obj) : d(n2Var, obj, cls) : cls == Void.TYPE ? g2 : cls == Character.TYPE ? Integer.valueOf(((Character) obj).charValue()) : obj;
    }

    public n2 d(n2 n2Var, Object obj, Class cls) {
        return List.class.isAssignableFrom(obj.getClass()) ? new C1128e1(n2Var, obj) : Map.class.isAssignableFrom(obj.getClass()) ? new C1140h1(n2Var, obj) : new C1156l1(n2Var, obj, cls);
    }
}
