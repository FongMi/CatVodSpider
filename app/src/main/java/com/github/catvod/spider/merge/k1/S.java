package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class S extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekundes", "sekundę", "sekundžių"};
    private static final String[] k = {"minutes", "minutę", "minučių"};
    private static final String[] l = {"valandas", "valandą", "valandų"};
    private static final String[] m = {"dienas", "dieną"};
    private static final String[] n = {"savaites", "savaitę"};
    private static final String[] o = {"mėnesius", "mėnesių", "mėnesį"};
    private static final String[] p = {"metus", "metų"};
    private static final S q = new S();

    private S() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static S e() {
        return q;
    }
}
