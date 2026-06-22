package com.github.catvod.spider.merge.e;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0157f implements Comparator<C0154c> {
    private final String a;
    private final String b;

    public C0157f(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static void a(String str, String str2, List<C0154c> list) {
        Collections.sort(list, new C0157f(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(com.github.catvod.spider.merge.e.C0154c r10, com.github.catvod.spider.merge.e.C0154c r11) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.e.C0157f.compare(java.lang.Object, java.lang.Object):int");
    }
}
