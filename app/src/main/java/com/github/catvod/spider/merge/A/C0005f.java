package com.github.catvod.spider.merge.A;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0005f {
    public final /* synthetic */ int a;

    public final int a(char[] cArr, int i) {
        switch (this.a) {
            case 0:
                return cArr[i];
            default:
                return (cArr[i + 1] << 16) | cArr[i];
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }
}
