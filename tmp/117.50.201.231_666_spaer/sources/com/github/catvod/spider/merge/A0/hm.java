package com.github.catvod.spider.merge.A0;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class hm {
    public static final char[] a;
    public static final int[] b = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final sf c;
    public final kx d;
    public final w k;
    public final um l;
    public wk m;
    public String q;
    public String r;
    public int s;
    public wa e = wa.c;
    public uz f = null;
    public boolean g = false;
    public String h = null;
    public final StringBuilder i = new StringBuilder(1024);
    public final StringBuilder j = new StringBuilder(1024);
    public final im n = new im(5);
    public final nk o = new nk();
    public final gx p = new gx();
    public int t = 0;
    public final int[] u = new int[1];
    public final int[] v = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        a = cArr;
        Arrays.sort(cArr);
    }

    public hm(zl zlVar) {
        w wVar = new w(2, zlVar);
        this.k = wVar;
        this.m = wVar;
        this.l = new um(3, zlVar);
        this.c = zlVar.l;
        this.d = (kx) zlVar.k.d;
    }

    public final void aa() {
        uz.h(this.j);
    }

    public final void ab(char c) {
        if (this.h == null) {
            this.h = String.valueOf(c);
        } else {
            StringBuilder sb = this.i;
            if (sb.length() == 0) {
                sb.append(this.h);
            }
            sb.append(c);
        }
        this.n.getClass();
        this.c.ak();
    }

    public final void ac(uz uzVar) {
        if (this.g) {
            throw new gg("Must be false");
        }
        this.f = uzVar;
        this.g = true;
        uzVar.getClass();
        sf sfVar = this.c;
        sfVar.ak();
        this.t = sfVar.ak();
        int i = uzVar.g;
        if (i == 2) {
            this.q = ((w) uzVar).c;
            this.r = null;
        } else if (i == 3) {
            um umVar = (um) uzVar;
            if (umVar.f != null) {
                Object[] objArr = {umVar.d};
                kx kxVar = this.d;
                if (kxVar.a()) {
                    kxVar.add(new abb(sfVar, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void ad(String str) {
        if (this.h == null) {
            this.h = str;
        } else {
            StringBuilder sb = this.i;
            if (sb.length() == 0) {
                sb.append(this.h);
            }
            sb.append(str);
        }
        this.n.getClass();
        this.c.ak();
    }

    public final void ae(StringBuilder sb) {
        if (this.h == null) {
            this.h = sb.toString();
        } else {
            StringBuilder sb2 = this.i;
            if (sb2.length() == 0) {
                sb2.append(this.h);
            }
            sb2.append((CharSequence) sb);
        }
        this.n.getClass();
        this.c.ak();
    }

    public final void af() {
        ac(this.p);
    }

    public final void ag() {
        ac(this.o);
    }

    public final void ah() {
        wk wkVar = this.m;
        if (wkVar.q) {
            wkVar.ac();
        }
        ac(this.m);
    }

    public final void ai(wa waVar) {
        kx kxVar = this.d;
        if (kxVar.a()) {
            kxVar.add(new abb(this.c, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{waVar}));
        }
    }

    public final void aj(wa waVar) {
        kx kxVar = this.d;
        if (kxVar.a()) {
            sf sfVar = this.c;
            kxVar.add(new abb(sfVar, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(sfVar.aa()), waVar}));
        }
    }

    public final boolean ak() {
        if (this.q != null) {
            wk wkVar = this.m;
            String str = wkVar.c;
            if (str == null || str.length() == 0) {
                throw new gg("Must be false");
            }
            if (wkVar.c.equalsIgnoreCase(this.q)) {
                return true;
            }
        }
        return false;
    }

    public final void al(wa waVar) {
        if (waVar == wa.j) {
            this.s = this.c.ak();
        }
        this.e = waVar;
    }

    public final void w(wa waVar) {
        al(waVar);
        this.c.q();
    }

    public final void x(String str, Object... objArr) {
        kx kxVar = this.d;
        if (kxVar.a()) {
            kxVar.add(new abb(this.c, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    public final int[] y(Character ch, boolean z) {
        int i;
        char c;
        char c2;
        char c3;
        char c4;
        int i2;
        String strP;
        char c5;
        int iIntValue;
        int i3;
        char c6;
        sf sfVar = this.c;
        if (sfVar.ab()) {
            return null;
        }
        if (ch != null && ch.charValue() == sfVar.aa()) {
            return null;
        }
        char[] cArr = a;
        sfVar.r();
        if (!sfVar.ab() && Arrays.binarySearch(cArr, sfVar.e[sfVar.f]) >= 0) {
            return null;
        }
        if (sfVar.g - sfVar.f < 1024) {
            sfVar.h = 0;
        }
        sfVar.r();
        sfVar.j = sfVar.f;
        boolean zAd = sfVar.ad("#");
        char c7 = 'A';
        int[] iArr = this.u;
        if (zAd) {
            boolean zAe = sfVar.ae("X");
            if (zAe) {
                sfVar.r();
                int i4 = sfVar.f;
                while (true) {
                    i3 = sfVar.f;
                    if (i3 >= sfVar.g || (((c6 = sfVar.e[i3]) < '0' || c6 > '9') && ((c6 < c7 || c6 > 'F') && (c6 < 'a' || c6 > 'f')))) {
                        break;
                    }
                    sfVar.f = i3 + 1;
                    c7 = 'A';
                }
                strP = sf.p(sfVar.e, sfVar.c, i4, i3 - i4);
            } else {
                sfVar.r();
                int i5 = sfVar.f;
                while (true) {
                    i2 = sfVar.f;
                    if (i2 >= sfVar.g || (c5 = sfVar.e[i2]) < '0' || c5 > '9') {
                        break;
                    }
                    sfVar.f = i2 + 1;
                }
                strP = sf.p(sfVar.e, sfVar.c, i5, i2 - i5);
            }
            if (strP.length() == 0) {
                x("numeric reference with no numerals", new Object[0]);
                sfVar.am();
                return null;
            }
            sfVar.j = -1;
            if (!sfVar.ad(";")) {
                x("missing semicolon on [&#%s]", strP);
            }
            try {
                iIntValue = Integer.valueOf(strP, zAe ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || iIntValue > 1114111) {
                x("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                iArr[0] = 65533;
            } else {
                if (iIntValue >= 128 && iIntValue < 160) {
                    x("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                    iIntValue = b[iIntValue - 128];
                }
                iArr[0] = iIntValue;
            }
            return iArr;
        }
        sfVar.r();
        int i6 = sfVar.f;
        while (true) {
            int i7 = sfVar.f;
            if (i7 >= sfVar.g || (((c4 = sfVar.e[i7]) < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !Character.isLetter(c4)))) {
                break;
            }
            sfVar.f++;
        }
        while (true) {
            i = sfVar.f;
            if (i >= sfVar.g || (c3 = sfVar.e[i]) < '0' || c3 > '9') {
                break;
            }
            sfVar.f = i + 1;
        }
        String strP2 = sf.p(sfVar.e, sfVar.c, i6, i - i6);
        boolean zAf = sfVar.af(';');
        char[] cArr2 = ec.a;
        ff ffVar = ff.base;
        int iBinarySearch = Arrays.binarySearch(ffVar.e, strP2);
        if ((iBinarySearch >= 0 ? ffVar.f[iBinarySearch] : -1) == -1) {
            ff ffVar2 = ff.extended;
            int iBinarySearch2 = Arrays.binarySearch(ffVar2.e, strP2);
            if ((iBinarySearch2 >= 0 ? ffVar2.f[iBinarySearch2] : -1) == -1 || !zAf) {
                sfVar.am();
                if (zAf) {
                    x("invalid named reference [%s]", strP2);
                }
                if (z) {
                    return null;
                }
                Iterator it = ec.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strP2 = "";
                        break;
                    }
                    String str = (String) it.next();
                    if (strP2.startsWith(str)) {
                        strP2 = str;
                        break;
                    }
                }
                if (strP2.isEmpty()) {
                    return null;
                }
                sfVar.ad(strP2);
            }
        }
        if (z && (sfVar.ai() || ((!sfVar.ab() && (c2 = sfVar.e[sfVar.f]) >= '0' && c2 <= '9') || sfVar.ag('=', '-', '_')))) {
            sfVar.am();
            return null;
        }
        sfVar.j = -1;
        if (!sfVar.ad(";")) {
            x("missing semicolon on [&%s]", strP2);
        }
        String str2 = (String) ec.b.get(strP2);
        int[] iArr2 = this.v;
        if (str2 != null) {
            iArr2[0] = str2.codePointAt(0);
            iArr2[1] = str2.codePointAt(1);
            c = 2;
        } else {
            ff ffVar3 = ff.extended;
            int iBinarySearch3 = Arrays.binarySearch(ffVar3.e, strP2);
            int i8 = iBinarySearch3 >= 0 ? ffVar3.f[iBinarySearch3] : -1;
            if (i8 != -1) {
                iArr2[0] = i8;
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == 1) {
            iArr[0] = iArr2[0];
            return iArr;
        }
        if (c == 2) {
            return iArr2;
        }
        throw new gg("Unexpected characters returned for ".concat(strP2));
    }

    public final wk z(boolean z) {
        wk wkVar;
        if (z) {
            wkVar = this.k;
            wkVar.a();
        } else {
            wkVar = this.l;
            wkVar.a();
        }
        this.m = wkVar;
        return wkVar;
    }
}
