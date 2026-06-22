package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʲ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0103 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final String[] f280 = {SOY.d("1D37253515020937"), SOY.d("1D372538110F0E17291511070E3B3E18"), SOY.d("1D37252215051D3725330C141F22251F1B19"), SOY.d("1D3725330C141F22251F1B19"), SOY.d("1D3725251B02083134330C141F22251F1B19"), SOY.d("1D3725241B180E1130030712"), SOY.d("1D3725351502093735340D3202313406001E153C"), SOY.d("1D37253811040E3735"), SOY.d("1D37253A1D19113735330C141F22251F1B19"), SOY.d("1D37253811040E3735330C141F22251F1B19"), SOY.d("1D37253A1D191137353515020937"), SOY.d("1D3725221C05152530141812")};

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String m375(Throwable th) {
        if (th == null) {
            return "";
        }
        return C0162.m568(th, null) + SOY.d("4072") + C0131.m435(th.getMessage());
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static Throwable m376(Throwable th) {
        List<Throwable> listM378 = m378(th);
        if (listM378.isEmpty()) {
            return null;
        }
        return listM378.get(listM378.size() - 1);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static String m377(Throwable th) {
        Throwable thM376 = m376(th);
        if (thM376 != null) {
            th = thM376;
        }
        return m375(th);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static List<Throwable> m378(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static <R> R m379(Throwable th) {
        return (R) m380(th);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static <R, T extends Throwable> R m380(Throwable th) throws Throwable {
        throw th;
    }
}
