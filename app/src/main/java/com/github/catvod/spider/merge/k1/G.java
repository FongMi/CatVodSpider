package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class G extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekúndu", "sekúndum", "second", "seconds"};
    private static final String[] k = {"mínútu", "mínútum", "minute", "minutes"};
    private static final String[] l = {"klukkustund", "klukkustundum", "hour", "hours"};
    private static final String[] m = {"degi", "dögum", "day", "days"};
    private static final String[] n = {"viku", "vikum", "week", "weeks"};
    private static final String[] o = {"mánuði", "mánuðum"};
    private static final String[] p = {"ári", "árum"};
    private static final G q = new G();

    private G() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static G e() {
        return q;
    }
}
