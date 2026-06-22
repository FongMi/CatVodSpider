package com.github.catvod.spider.merge.d0;

import com.github.catvod.en.NetPan;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0965k implements Consumer {
    public final /* synthetic */ NetPan a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;

    public /* synthetic */ C0965k(NetPan netPan, String str, Map map) {
        this.a = netPan;
        this.b = str;
        this.c = map;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        NetPan.a(this.a, this.b, this.c, (String) obj);
    }
}
