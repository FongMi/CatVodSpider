package com.github.catvod.spider.merge;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ǀ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0033 implements InterfaceC0366 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static Pattern f200 = Pattern.compile(SOY.d("26367B2A5A4826367A"));

    @Override // com.github.catvod.spider.merge.InterfaceC0366
    public String name() {
        return SOY.d("14273C");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0366
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0367 mo275(C0019 c0019) {
        Matcher matcher = f200.matcher(C0131.m444(C0182.m643(SOY.d("1B3E3D22110F0E")).mo275(c0019).m1425(), ""));
        return matcher.find() ? C0367.m1420(Double.valueOf(new BigDecimal(matcher.group()).doubleValue())) : C0367.m1420(null);
    }
}
