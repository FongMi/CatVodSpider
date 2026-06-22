package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.އ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0286 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final List<String> f714 = Arrays.asList(SOY.d("172265"), SOY.d("173927"), SOY.d("0D3F27"), SOY.d("1C3E27"), SOY.d("1B2438"), SOY.d("13213E"), SOY.d("172236"), SOY.d("0E21"), SOY.d("172262"), SOY.d("1B3332"), SOY.d("1C3E3015"), SOY.d("176630"), SOY.d("1B2234"), SOY.d("153536"));

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final List<String> f715 = Arrays.asList(SOY.d("092025"), SOY.d("1B2122"), SOY.d("092130"), SOY.d("0C2625"));

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String m1047(String str) {
        String strD = SOY.d("54");
        return str.contains(strD) ? str.substring(str.lastIndexOf(strD) + 1) : str;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static String m1048(double d) {
        if (d <= 0.0d) {
            return "";
        }
        String strD = SOY.d("5F7C63105104");
        return d > 1.099511627776E12d ? String.format(Locale.getDefault(), strD, Double.valueOf(d / 1.099511627776E12d), SOY.d("2E10")) : d > 1.073741824E9d ? String.format(Locale.getDefault(), strD, Double.valueOf(d / 1.073741824E9d), SOY.d("3D10")) : d > 1048576.0d ? String.format(Locale.getDefault(), strD, Double.valueOf(d / 1048576.0d), SOY.d("3710")) : String.format(Locale.getDefault(), strD, Double.valueOf(d / 1024.0d), SOY.d("3110"));
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static boolean m1049(String str) {
        return f714.contains(m1047(str));
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static boolean m1050(String str) {
        return f715.contains(str);
    }
}
