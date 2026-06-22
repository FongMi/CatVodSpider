package com.github.catvod.spider.merge.I;

import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import org.json.JSONException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0770n0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ v0 c;

    public /* synthetic */ RunnableC0770n0(v0 v0Var, int i) {
        this.b = i;
        this.c = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        switch (this.b) {
            case 0:
                v0.h(this.c);
                break;
            default:
                v0 v0Var = this.c;
                v0Var.getClass();
                EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("請輸入UCCookie");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                Init.run(new RunnableC0757h(v0Var, editTextInitEditText, new I(v0Var, editTextInitEditText, 1), 2));
                break;
        }
    }
}
