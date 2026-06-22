package com.github.catvod.spider.merge.o0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class i implements d {
    i() {
    }

    @Override // com.github.catvod.spider.merge.o0.d
    public final char[] a(char[] cArr, String str) {
        int i = Integer.parseInt(str);
        char c = cArr[0];
        cArr[0] = cArr[i % cArr.length];
        cArr[i] = c;
        return cArr;
    }
}
