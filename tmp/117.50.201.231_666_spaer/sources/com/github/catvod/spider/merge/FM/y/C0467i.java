package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0467i implements InterfaceC0468j {
    C0467i() {
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0468j
    public final int a(char[] cArr, int i) {
        return (cArr[i + 1] << 16) | cArr[i];
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0468j
    public final int size() {
        return 2;
    }
}
