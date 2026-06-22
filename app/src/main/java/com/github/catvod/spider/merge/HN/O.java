package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class O {
    private static final Pattern a = Pattern.compile(ZrJ.d("276B7477607A106A0C001C6C466B10666518507C63112C191D7C6272607F466B17291421466A62726C"));
    private static final TimeZone b = new Q(false, 0, 0);
    public static final /* synthetic */ int c = 0;

    public static TimeZone a(String str) {
        if (ZrJ.d("23").equals(str) || ZrJ.d("2C1708").equals(str)) {
            return b;
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
            return b;
        }
        String strGroup3 = matcher.group(1);
        if (strGroup3 != null && strGroup3.charAt(0) == '-') {
            z = true;
        }
        return new Q(z, i, i2);
    }
}
