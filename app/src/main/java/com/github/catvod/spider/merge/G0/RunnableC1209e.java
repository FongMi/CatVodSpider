package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.C0;
import com.github.catvod.spider.merge.I.C0781w;
import com.github.catvod.spider.merge.I.Q0;
import com.github.catvod.spider.merge.I.RunnableC0778t;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1209e implements Runnable {
    public static final /* synthetic */ RunnableC1209e c = new RunnableC1209e(0);
    public static final /* synthetic */ RunnableC1209e d = new RunnableC1209e(1);
    public static final /* synthetic */ RunnableC1209e e = new RunnableC1209e(2);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1209e(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                com.github.catvod.spider.merge.b0.c cVar = Q0.c().e;
                cVar.a();
                cVar.c();
                break;
            case 1:
                String str2 = ConfigCenter.m;
                com.github.catvod.spider.merge.W.a aVar = C0.g().f;
                aVar.a();
                aVar.g();
                com.github.catvod.spider.merge.i0.m.w("已清除迅雷本地账号");
                break;
            default:
                String str3 = ConfigCenter.m;
                final C0781w c0781wA = C0781w.a();
                c0781wA.getClass();
                final EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("输入线程数");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                Init.run(new RunnableC0778t(c0781wA, editTextInitEditText, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.I.s
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C0781w c0781w = c0781wA;
                        EditText editText = editTextInitEditText;
                        c0781w.getClass();
                        Init.execute(new RunnableC0779u(c0781w, editText.getText().toString(), 0));
                    }
                }, 0));
                break;
        }
    }
}
