package com.github.catvod.spider.merge;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ٵ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0246 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final Pattern f628 = Pattern.compile(SOY.d("526D385F2815193A300407120E6F0D055E5F45680A54532A536D792D2A2B097E6A54532A507B"));

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final Charset f629;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    static final String f630;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final char[] f631;

    static {
        Charset charsetForName = Charset.forName(SOY.d("2F06175B4C"));
        f629 = charsetForName;
        f630 = charsetForName.name();
        f631 = SOY.d("570D604447434F64664E4D471B30321211111D3A381C1F1B173C3E06050509262400030F0328103437333F14163E3D3D311E1C383B272B00022221212D0A082C").toCharArray();
    }
}
