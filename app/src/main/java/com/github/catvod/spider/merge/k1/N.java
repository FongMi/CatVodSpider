package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class N extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"ಸೆಕೆಂಡುಗಳ", "ಸೆಕೆಂಡ್"};
    private static final String[] k = {"ನಿಮಿಷಗಳ", "ನಿಮಿಷದ"};
    private static final String[] l = {"ಗಂಟೆಗಳ", "ಗಂಟೆಯ"};
    private static final String[] m = {"ದಿನಗಳ", "ದಿನದ"};
    private static final String[] n = {"ವಾರಗಳ", "ವಾರದ"};
    private static final String[] o = {"ತಿಂಗಳ", "ತಿಂಗಳುಗಳ"};
    private static final String[] p = {"ವರ್ಷಗಳ", "ವರ್ಷದ"};
    private static final N q = new N();

    private N() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static N e() {
        return q;
    }
}
