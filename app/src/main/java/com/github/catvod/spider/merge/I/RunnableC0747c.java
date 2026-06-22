package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.utils.server.Server;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0747c implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0747c(Object obj, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                EditText editText = (EditText) this.c;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.d;
                BaseApi baseApi = BaseApi.get();
                StringBuilder sbB = t0.b("当前为");
                sbB.append(C0773p.a.b);
                baseApi.showThreadInputWithQRCode("设置阿里线程数", sbB.toString(), "", Server.u(), editText, onClickListener, null);
                break;
            case 1:
                C0775q.g((C0775q) this.c, (String) this.d);
                break;
            case 2:
                G.e((G) this.c, (com.github.catvod.spider.merge.O.b) this.d);
                break;
            case 3:
                C0754f0.h((C0754f0) this.c, (String) this.d);
                break;
            case 4:
                v0 v0Var = (v0) this.c;
                String strL = (String) this.d;
                v0Var.getClass();
                if (strL.startsWith("http")) {
                    strL = com.github.catvod.spider.merge.f0.d.l(strL);
                }
                v0Var.J(strL, true);
                break;
            default:
                Init.d((Init) this.c, (Boolean) this.d);
                break;
        }
    }
}
