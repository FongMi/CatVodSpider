package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.utils.server.Server;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0757h implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0757h(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0775q.d((C0775q) this.c, (String) this.d, (com.github.catvod.spider.merge.L.c) this.e);
                break;
            case 1:
                final O o = (O) this.c;
                EditText editText = (EditText) this.d;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.e;
                o.getClass();
                BaseApi.get().showThreadInputWithQRCode("设置光鸭Token", "", "光鸭云盘扫码", Server.u(), editText, onClickListener, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.I.J
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        O.a(o);
                    }
                });
                break;
            case 2:
                v0 v0Var = (v0) this.c;
                EditText editText2 = (EditText) this.d;
                DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) this.e;
                v0Var.getClass();
                BaseApi.get().showThreadInputWithQRCode("輸入UC Cookie", "", "uc浏览器扫码", Server.u(), editText2, onClickListener2, new DialogInterfaceOnClickListenerC0763k(v0Var, 2));
                break;
            default:
                C0 c0 = (C0) this.c;
                EditText editText3 = (EditText) this.d;
                DialogInterface.OnClickListener onClickListener3 = (DialogInterface.OnClickListener) this.e;
                int i = C0.i;
                c0.getClass();
                BaseApi baseApi = BaseApi.get();
                StringBuilder sbB = t0.b("当前为 ");
                sbB.append(c0.f.e());
                sbB.append("|");
                sbB.append(c0.f.f());
                baseApi.showThreadInputWithQRCode("设置迅雷网盘账号密码", sbB.toString(), "", Server.u(), editText3, onClickListener3, null);
                break;
        }
    }
}
