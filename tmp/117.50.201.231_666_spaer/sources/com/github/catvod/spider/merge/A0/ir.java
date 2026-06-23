package com.github.catvod.spider.merge.A0;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class ir implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        rt rtVar = (rt) obj;
        CharSequence charSequence = (CharSequence) obj2;
        wc.e(rtVar.a);
        if (!rtVar.c) {
            rtVar.a.append(rtVar.b);
        }
        rtVar.a.append((Object) charSequence);
        rtVar.c = false;
    }
}
