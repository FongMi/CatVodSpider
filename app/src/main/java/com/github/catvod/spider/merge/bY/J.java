package com.github.catvod.spider.merge.bY;

import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class J implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ J(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                L l = (L) this.b;
                String strL = (String) this.c;
                l.getClass();
                if (strL.startsWith(com.github.catvod.spider.merge.XI.f.a(new byte[]{28, 114, 115, -102}, new byte[]{116, 6, 7, -22, -45, -38, -15, 76}))) {
                    strL = com.github.catvod.spider.merge.nU.c.l(strL, null);
                }
                l.L(strL);
                break;
            default:
                U.l((U) this.b, (JSONObject) this.c);
                break;
        }
    }
}
