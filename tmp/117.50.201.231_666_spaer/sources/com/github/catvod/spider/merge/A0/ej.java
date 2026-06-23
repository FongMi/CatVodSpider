package com.github.catvod.spider.merge.A0;

import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class ej implements fd, EventListener.Factory {
    public final /* synthetic */ Object a;

    @Override // com.github.catvod.spider.merge.A0.fd
    public /* synthetic */ void b(fw fwVar, int i) {
    }

    @Override // com.github.catvod.spider.merge.A0.fd
    public void c(fw fwVar, int i) {
        boolean z = fwVar instanceof abt;
        StringBuilder sb = (StringBuilder) this.a;
        if (z) {
            sb.append(((abt) fwVar).f());
        } else if (fwVar instanceof tk) {
            sb.append(((tk) fwVar).f());
        } else if (fwVar instanceof rm) {
            sb.append(((rm) fwVar).f());
        }
    }

    public EventListener create(Call call) {
        return Util.Ϳ((EventListener) this.a, call);
    }
}
