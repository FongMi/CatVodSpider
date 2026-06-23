package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class nf {
    public static final char[] a = {',', '>', '+', '~', ' '};
    public static final String[] b = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final Pattern c = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern d = Pattern.compile("([+-])?(\\d+)");
    public final lj e;
    public final String f;
    public final ArrayList g = new ArrayList();

    public nf(String str) {
        wc.c(str);
        String strTrim = str.trim();
        this.f = strTrim;
        this.e = new lj(strTrim);
    }

    public static dr h(String str) {
        try {
            return new nf(str).r();
        } catch (IllegalArgumentException e) {
            throw new fr(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(char r12) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.nf.i(char):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.A0.dr j() {
        /*
            Method dump skipped, instruction units count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.nf.j():com.github.catvod.spider.merge.A0.dr");
    }

    public final int k() {
        boolean z = true;
        String strTrim = l().trim();
        String[] strArr = ws.a;
        if (strTrim == null || strTrim.length() == 0) {
            z = false;
            break;
        }
        int length = strTrim.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(strTrim.codePointAt(i))) {
                z = false;
                break;
            }
        }
        if (z) {
            return Integer.parseInt(strTrim);
        }
        throw new gg("Index must be numeric");
    }

    public final String l() {
        return this.e.f('(', ')');
    }

    public final dr m(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        String strE = lj.e(l());
        wc.d(strE, str.concat("(text) query must not be empty"));
        return z ? new et(strE, 4) : new et(strE, 5);
    }

    public final dr n(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        String strE = lj.e(l());
        wc.d(strE, str.concat("(text) query must not be empty"));
        return z ? new et(strE, 6, false) : new et(strE, 7, false);
    }

    public final dw o(boolean z, boolean z2) {
        int i;
        int i2;
        String strD = qf.d(l());
        Matcher matcher = c.matcher(strD);
        Matcher matcher2 = d.matcher(strD);
        if ("odd".equals(strD)) {
            i2 = 2;
            i = 1;
        } else {
            if ("even".equals(strD)) {
                i2 = 2;
            } else if (matcher.matches()) {
                i2 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                if (matcher.group(4) != null) {
                    i = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                }
            } else {
                if (!matcher2.matches()) {
                    throw new fr("Could not parse nth-index '%s': unexpected format", strD);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i2 = 0;
            }
            i = 0;
        }
        return z2 ? z ? new dw(i2, i, 2) : new dw(i2, i, 3) : z ? new dw(i2, i, 1) : new dw(i2, i, 0);
    }

    public final dr p(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        String strL = l();
        wc.d(strL, str.concat("(regex) query must not be empty"));
        return z ? new dy(Pattern.compile(strL), 1) : new dy(Pattern.compile(strL), 0);
    }

    public final dr q(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        String strL = l();
        wc.d(strL, str.concat("(regex) query must not be empty"));
        return z ? new dy(Pattern.compile(strL), 2) : new dy(Pattern.compile(strL), 3);
    }

    public final dr r() {
        lj ljVar = this.e;
        ljVar.i();
        char[] cArr = a;
        boolean zM = ljVar.m(cArr);
        ArrayList arrayList = this.g;
        if (zM) {
            arrayList.add(new rj(8));
            i(ljVar.g());
        } else {
            arrayList.add(j());
        }
        while (!ljVar.j()) {
            boolean zI = ljVar.i();
            if (ljVar.m(cArr)) {
                i(ljVar.g());
            } else if (zI) {
                i(' ');
            } else {
                arrayList.add(j());
            }
        }
        return arrayList.size() == 1 ? (dr) arrayList.get(0) : new th(arrayList);
    }

    public final String toString() {
        return this.f;
    }
}
