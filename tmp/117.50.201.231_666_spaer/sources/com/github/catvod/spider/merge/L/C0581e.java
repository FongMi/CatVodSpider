package com.github.catvod.spider.merge.l;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.l.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class C0581e implements Comparator {
    public static final /* synthetic */ C0581e a = new C0581e();

    private /* synthetic */ C0581e() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }
}
