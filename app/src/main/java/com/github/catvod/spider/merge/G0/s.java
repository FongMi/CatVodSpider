package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.TgYunPanLocal;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class s implements Consumer {
    public final /* synthetic */ TgYunPanLocal a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ s(TgYunPanLocal tgYunPanLocal, String str, List list) {
        this.a = tgYunPanLocal;
        this.b = str;
        this.c = list;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        TgYunPanLocal.f(this.a, this.b, this.c, (String) obj);
    }
}
