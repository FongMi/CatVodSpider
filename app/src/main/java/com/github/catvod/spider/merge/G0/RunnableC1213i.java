package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.C0754f0;
import com.github.catvod.spider.merge.I.Q0;
import com.github.catvod.spider.merge.I.RunnableC0778t;
import com.github.catvod.spider.merge.I.T;
import com.github.catvod.spider.merge.I.V;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1213i implements Runnable {
    public static final /* synthetic */ RunnableC1213i c = new RunnableC1213i(0);
    public static final /* synthetic */ RunnableC1213i d = new RunnableC1213i(1);
    public static final /* synthetic */ RunnableC1213i e = new RunnableC1213i(2);
    public static final /* synthetic */ RunnableC1213i f = new RunnableC1213i(3);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1213i(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                Init.get().exeFileProxy(Init.context(), Boolean.FALSE);
                com.github.catvod.spider.merge.i0.m.w("正在启动filebrowser 账号密码都是admin 请稍后在浏览器输入 " + ConfigCenter.m + " 访问");
                break;
            case 1:
                String str2 = ConfigCenter.m;
                Q0 q0C = Q0.c();
                q0C.getClass();
                EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("請輸入115 安全删除码");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                Init.run(new T(q0C, editTextInitEditText, new V(q0C, editTextInitEditText, 1), 1));
                break;
            case 2:
                String str3 = ConfigCenter.m;
                BaseApi.get().showNetPanOrderInputWithOption();
                break;
            default:
                String str4 = ConfigCenter.m;
                C0754f0 c0754f0O = C0754f0.o();
                c0754f0O.getClass();
                final EditText editTextInitEditText2 = BaseApi.get().initEditText();
                editTextInitEditText2.setHint("输入线程数");
                editTextInitEditText2.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText2.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                Init.run(new RunnableC0778t(c0754f0O, editTextInitEditText2, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.I.W
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C0754f0.c(editTextInitEditText2);
                    }
                }, 1));
                break;
        }
    }
}
