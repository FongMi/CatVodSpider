package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.C0;
import com.github.catvod.spider.merge.I.C0775q;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.utils.merge.Yun115Api;
import com.github.catvod.spider.merge.I.RunnableC0743a;
import com.github.catvod.spider.merge.I.RunnableC0757h;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1208d implements Runnable {
    public static final /* synthetic */ RunnableC1208d c = new RunnableC1208d(0);
    public static final /* synthetic */ RunnableC1208d d = new RunnableC1208d(1);
    public static final /* synthetic */ RunnableC1208d e = new RunnableC1208d(2);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1208d(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                Yun115Api q0C = Yun115Api.c();
                q0C.getClass();
                Init.run(new O0(q0C, 0));
                break;
            case 1:
                String str2 = ConfigCenter.m;
                C0 c0G = C0.g();
                c0G.getClass();
                final EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("输入迅雷网盘账号密码 格式：18888888888|123456");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                Init.run(new RunnableC0757h(c0G, editTextInitEditText, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.I.x0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = editTextInitEditText;
                        C0 c0 = y0.a;
                        String string = editText.getText().toString();
                        c0.getClass();
                        Init.execute(new RunnableC0753f(c0, string, 2));
                    }
                }, 3));
                break;
            default:
                String str3 = ConfigCenter.m;
                C0775q c0775qR = C0775q.r();
                c0775qR.getClass();
                Init.run(new RunnableC0743a(c0775qR, 0));
                break;
        }
    }
}
