package com.github.catvod.spider.merge.A0;

import com.github.catvod.spider.LocalFile;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class dz implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i = LocalFile.a;
                break;
            default:
                int i2 = LocalFile.a;
                break;
        }
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }
}
