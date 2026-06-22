package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.n.C0197c;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0108J implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0108J(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0110L c0110l = (C0110L) this.b;
                String strL = (String) this.c;
                c0110l.getClass();
                if (strL.startsWith(C0098a.a(new byte[]{22, 57, -21, 91}, new byte[]{126, 77, -97, 43, -109, 51, -6, 89}))) {
                    strL = C0197c.l(strL, null);
                }
                c0110l.L(strL);
                break;
            default:
                U.l((U) this.b, (JSONObject) this.c);
                break;
        }
    }
}
