package com.github.catvod.spider.merge.I;

import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0743a implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ C0775q c;

    public /* synthetic */ RunnableC0743a(C0775q c0775q, int i) {
        this.b = i;
        this.c = c0775q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0775q c0775q = this.c;
                c0775q.getClass();
                EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("請輸入Token");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                Init.run(new RunnableC0759i(c0775q, editTextInitEditText, new DialogInterfaceOnClickListenerC0767m(c0775q, editTextInitEditText, 0), 0));
                break;
            default:
                this.c.p();
                break;
        }
    }
}
