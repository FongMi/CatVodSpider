package com.github.catvod.spider.merge.d0;

import android.app.DownloadManager;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0964j implements BiConsumer {
    public final /* synthetic */ DownloadManager.Request a;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.a.addRequestHeader((String) obj, (String) obj2);
    }
}
