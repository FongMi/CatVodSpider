package com.github.catvod.spider.merge.a;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0532d implements FileFilter {
    C0532d() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
