package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.utils.server.Server;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class U implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ U(Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0754f0 c0754f0 = (C0754f0) this.d;
                String strL = (String) this.c;
                c0754f0.getClass();
                if (strL.startsWith("http")) {
                    strL = com.github.catvod.spider.merge.f0.d.l(strL);
                }
                c0754f0.H(strL, true);
                break;
            case 1:
                J0 j0 = (J0) this.d;
                String str = (String) this.c;
                int i = J0.h;
                j0.getClass();
                try {
                    j0.k(str, true);
                    j0.f.f();
                    com.github.catvod.spider.merge.i0.d.b("盘123账号密码为" + j0.f.d() + "|" + j0.f.e());
                } catch (Exception unused) {
                    Init.show("請輸入正確的字符串");
                    return;
                }
                break;
            case 2:
                BaseApi.get().showThreadInputWithQRCode("115 cookie", "", "", Server.u(), (EditText) this.d, (DialogInterface.OnClickListener) this.c, null);
                break;
            default:
                TgYunDouBanPan.i((TgYunDouBanPan) this.d);
                break;
        }
    }
}
