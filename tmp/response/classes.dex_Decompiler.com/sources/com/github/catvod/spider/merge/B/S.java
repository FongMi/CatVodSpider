package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.p.C0206C;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class S implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ S(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                U.m((U) this.b, (JSONObject) this.c);
                break;
            default:
                ((C0206C) this.b).x((Map) this.c);
                break;
        }
    }
}
