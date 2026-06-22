package com.github.catvod.spider.merge;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˎ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0128 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final Pattern f319 = Pattern.compile(SOY.d("247A6E4C5C48137B163B205E457A0A5D592A536D792A102B1E6D78495C4D457A0D122813457B784950"));

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final TimeZone f320 = new C0235(false, 0, 0);

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static TimeZone m425() {
        return f320;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static TimeZone m426(String str) {
        if (SOY.d("20").equals(str) || SOY.d("2F0612").equals(str)) {
            return f320;
        }
        Matcher matcher = f319.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        int iM427 = m427(matcher.group(2));
        int iM4272 = m427(matcher.group(4));
        return (iM427 == 0 && iM4272 == 0) ? f320 : new C0235(m428(matcher.group(1)), iM427, iM4272);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static int m427(String str) {
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static boolean m428(String str) {
        return str != null && str.charAt(0) == '-';
    }
}
