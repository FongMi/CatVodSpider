package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.oZP;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class O {
    private static final Pattern a = Pattern.compile(oZP.d("2B47487B446A1C46300C387C4A472C6A41085C505F1D080911505E7E446F4A472B2530314A465E7E48"));
    private static final TimeZone b = new Q(false, 0, 0);
    public static final /* synthetic */ int c = 0;

    public static TimeZone a(String str) {
        if (oZP.d("2F").equals(str) || oZP.d("203B34").equals(str)) {
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
