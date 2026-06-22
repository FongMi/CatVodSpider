package com.github.catvod.spider.merge.o0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class h implements d {
    h() {
    }

    @Override // com.github.catvod.spider.merge.o0.d
    public final char[] a(char[] cArr, String str) {
        int i = Integer.parseInt(str);
        int length = cArr.length - i;
        char[] cArr2 = new char[length];
        System.arraycopy(cArr, 0, cArr2, 0, i);
        System.arraycopy(cArr, i * 2, cArr2, i, length - i);
        return cArr2;
    }
}
