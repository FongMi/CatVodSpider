package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0797j extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekundami", "sekundou"};
    private static final String[] k = {"minutami", "minutou"};
    private static final String[] l = {"hodinami", "hodinou"};
    private static final String[] m = {"dny", "včera"};
    private static final String[] n = {"týdnem", "týdny"};
    private static final String[] o = {"měsícem", "měsíci"};
    private static final String[] p = {"rokem", "roky", "lety"};
    private static final C0797j q = new C0797j();

    private C0797j() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0797j e() {
        return q;
    }
}
