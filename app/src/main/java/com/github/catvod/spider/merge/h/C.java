package com.github.catvod.spider.merge.H;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class C {
    public static final Pattern a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");
    public static final E b = new E(0, 0, false);

    public static E a(String str) {
        boolean zEquals = "Z".equals(str);
        E e = b;
        if (zEquals || "UTC".equals(str)) {
            return e;
        }
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(2);
        boolean z = false;
        int i = strGroup != null ? Integer.parseInt(strGroup) : 0;
        String strGroup2 = matcher.group(4);
        int i2 = strGroup2 != null ? Integer.parseInt(strGroup2) : 0;
        if (i == 0 && i2 == 0) {
            return e;
        }
        String strGroup3 = matcher.group(1);
        if (strGroup3 != null && strGroup3.charAt(0) == '-') {
            z = true;
        }
        return new E(i, i2, z);
    }
}
