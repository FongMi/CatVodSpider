package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class T extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekundes", "sekundēm"};
    private static final String[] k = {"minūtes", "minūtēm", "minūtes"};
    private static final String[] l = {"stundas", "stundām"};
    private static final String[] m = {"dienas", "dienām"};
    private static final String[] n = {"nedēļas", "nedēļām"};
    private static final String[] o = {"mēneša", "mēnešiem"};
    private static final String[] p = {"gada", "gadiem"};
    private static final T q = new T();

    private T() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static T e() {
        return q;
    }
}
