package com.github.catvod.spider.merge.m;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class C0136d implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int i = Integer.parseInt(((String) obj).substring(2));
                int i2 = Integer.parseInt(((String) obj2).substring(2));
                if (i == i2) {
                    return 0;
                }
                return i < i2 ? -1 : 1;
            default:
                return ((File) obj).getName().compareTo(((File) obj2).getName());
        }
    }
}
