package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.DialogInterfaceOnClickListenerC0763k;
import com.github.catvod.spider.merge.I.J0;
import com.github.catvod.spider.merge.I.v0;
import com.github.catvod.utils.server.Server;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1212h implements Runnable {
    public static final /* synthetic */ RunnableC1212h c = new RunnableC1212h(0);
    public static final /* synthetic */ RunnableC1212h d = new RunnableC1212h(1);
    public static final /* synthetic */ RunnableC1212h e = new RunnableC1212h(2);
    public static final /* synthetic */ RunnableC1212h f = new RunnableC1212h(3);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1212h(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                final v0 v0VarR = v0.r();
                v0VarR.getClass();
                final EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("输入线程数");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                final DialogInterfaceOnClickListenerC0763k dialogInterfaceOnClickListenerC0763k = new DialogInterfaceOnClickListenerC0763k(editTextInitEditText, 1);
                Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.I.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        v0 v0Var = v0VarR;
                        EditText editText = editTextInitEditText;
                        DialogInterface.OnClickListener onClickListener = dialogInterfaceOnClickListenerC0763k;
                        v0Var.getClass();
                        BaseApi baseApi = BaseApi.get();
                        StringBuilder sbB = t0.b("当前为");
                        sbB.append(v0Var.m.b());
                        baseApi.showThreadInputWithQRCode("设置uc线程数", sbB.toString(), "", Server.u(), editText, onClickListener, null);
                    }
                });
                break;
            case 1:
                String str2 = ConfigCenter.m;
                com.github.catvod.spider.merge.R.c cVar = J0.a().f;
                cVar.a();
                cVar.f();
                break;
            case 2:
                String str3 = ConfigCenter.m;
                BaseApi.get().setNetPanIso();
                break;
            default:
                String str4 = ConfigCenter.m;
                BaseApi.get().showSingBoxInputWithOption();
                break;
        }
    }
}
