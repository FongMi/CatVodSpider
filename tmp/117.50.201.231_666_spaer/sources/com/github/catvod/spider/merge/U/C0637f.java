package com.github.catvod.spider.merge.u;

import com.github.catvod.spider.merge.u.C0638g;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0637f implements C0638g.a {
    C0637f() {
    }

    @Override // com.github.catvod.spider.merge.u.C0638g.a
    public final int a(char[] cArr, int i) {
        return (cArr[i + 1] << 16) | cArr[i];
    }

    @Override // com.github.catvod.spider.merge.u.C0638g.a
    public final int size() {
        return 2;
    }
}
