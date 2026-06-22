package com.github.catvod.spider.merge.z;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0290i implements InterfaceC0291j {
    C0290i() {
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0291j
    public final int a(char[] cArr, int i) {
        return (cArr[i + 1] << 16) | cArr[i];
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0291j
    public final int size() {
        return 2;
    }
}
