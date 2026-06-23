package com.github.catvod.spider.merge.A0;

import android.text.TextUtils;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ah {
    public static int[] a(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static String b(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int iMax = Math.max(iLastIndexOf, i);
                    sb.delete(iMax, i3);
                    i2 -= i3 - iMax;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static final Object c(yg ygVar, ha haVar, xl xlVar) {
        yg context = xlVar.getContext();
        yg ygVarPlus = context.plus(ygVar);
        nr nrVar = (nr) ygVarPlus.get(nr.aj);
        if (nrVar != null && !nrVar.f()) {
            throw ((bi) nrVar).q();
        }
        if (ygVarPlus == context) {
            cj cjVar = new cj(ygVarPlus, xlVar);
            return da.b(cjVar, cjVar, haVar);
        }
        jo joVar = jo.c;
        if (!ko.b((xn) ygVarPlus.get(joVar), (xn) context.get(joVar))) {
            acv acvVar = new acv(ygVarPlus, xlVar);
            acvVar.am();
            lk.b(haVar, acvVar, acvVar);
            return acvVar.ao();
        }
        fz fzVar = new fz(ygVarPlus, xlVar);
        Object objD = zr.d(ygVarPlus, null);
        try {
            return da.b(fzVar, fzVar, haVar);
        } finally {
            zr.c(ygVarPlus, objD);
        }
    }
}
