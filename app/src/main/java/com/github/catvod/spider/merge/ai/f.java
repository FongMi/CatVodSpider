package com.github.catvod.spider.merge.ai;

import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class f implements FileFilter {
    f() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals(nIe.d("0F133F37200B271E7D2F262C29"));
    }
}
