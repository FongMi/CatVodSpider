package com.github.catvod.spider.merge.KW;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0821i implements InterfaceC0822j {
    C0821i() {
    }

    @Override // com.github.catvod.spider.merge.KW.InterfaceC0822j
    public final int a(char[] cArr, int i) {
        return (cArr[i + 1] << 16) | cArr[i];
    }

    @Override // com.github.catvod.spider.merge.KW.InterfaceC0822j
    public final int size() {
        return 2;
    }
}
