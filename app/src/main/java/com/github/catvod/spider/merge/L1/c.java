package com.github.catvod.spider.merge.L1;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {
    public static Optional<Locale> a(String str) {
        Locale locale;
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                locale = new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            } else {
                if (strArrSplit.length <= 1) {
                    if (strArrSplit.length == 1) {
                        locale = new Locale(strArrSplit[0]);
                    }
                    return Optional.empty();
                }
                locale = new Locale(strArrSplit[0], strArrSplit[1]);
            }
            return Optional.of(locale);
        }
        if (str.contains("_")) {
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                locale = new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            } else {
                if (strArrSplit2.length <= 1) {
                    if (strArrSplit2.length == 1) {
                        locale = new Locale(strArrSplit2[0]);
                    }
                    return Optional.empty();
                }
                locale = new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
        } else {
            locale = new Locale(str);
        }
        return Optional.of(locale);
    }
}
