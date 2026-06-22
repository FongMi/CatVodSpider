package com.github.catvod.spider.merge;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޏ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0301 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final C0301 f810;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final List f811;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static final Map f812;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public BigInteger f813;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public BigInteger f814;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public BigInteger f815;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public BigInteger f816;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public C0304 f817;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public String f818;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public long[] f819;

    static {
        C0301 c0301 = new C0301(BigInteger.ZERO, BigInteger.valueOf(7L), new BigInteger(SOY.d("1C34371012111C34371012111C34371012111C34371012111C34371012111C34371012111C34371012111C34371012111C34371012111C37371012111C316310"), 16), new BigInteger(SOY.d("1C34371012111C34371012111C34371012111C34371012111C34371012111C37331715121E31344015114E6A304647151834354441124231354647414E636547"), 16), new BigInteger(SOY.d("4D6B331342414D37374F10141830301541421B6267444D421937694144154A6561444D151C31351446131937634E104E4F6B37444C464F306040124F4B65684E"), 16), new BigInteger(SOY.d("4E6A621710164D65634015441966674341131B66371412144A376047444F1B6A371245401866654E154142676442454E4331654110474234371445471E66334E"), 16), SOY.d("0937320646424C3960"), new long[]{1, 3, 132, 0, 10});
        f810 = c0301;
        ArrayList<C0301> arrayList = new ArrayList();
        f811 = arrayList;
        f812 = new HashMap();
        arrayList.add(c0301);
        for (C0301 c03012 : arrayList) {
            f812.put(Integer.valueOf(Arrays.hashCode(c03012.f819)), c03012);
        }
    }

    public C0301(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, String str, long[] jArr) {
        this.f813 = bigInteger;
        this.f814 = bigInteger2;
        this.f815 = bigInteger3;
        this.f816 = bigInteger4;
        this.f817 = new C0304(bigInteger5, bigInteger6);
        this.f818 = str;
        this.f819 = jArr;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public int m1171() {
        return (this.f816.toString(16).length() + 1) / 2;
    }
}
