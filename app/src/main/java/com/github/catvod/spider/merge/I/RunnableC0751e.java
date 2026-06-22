package com.github.catvod.spider.merge.I;

import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.TgYunDouBanPan;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0751e implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0751e(Object obj, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0775q.b((C0775q) this.c, (com.github.catvod.spider.merge.L.c) this.d);
                break;
            case 1:
                G.b((G) this.c, (com.github.catvod.spider.merge.O.b) this.d);
                break;
            case 2:
                ((O) this.c).z((String) this.d, true);
                break;
            case 3:
                BaseApi baseApi = (BaseApi) this.c;
                String str = (String) this.d;
                baseApi.getClass();
                try {
                    baseApi.setNetPanOrder(str, true);
                    com.github.catvod.spider.merge.i0.d.b("网盘顺序、画质设置成功 当前为" + BaseApi.get().c);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                TgYunDouBanPan.i((TgYunDouBanPan) this.c);
                break;
        }
    }
}
