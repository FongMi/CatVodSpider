package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.utils.server.Server;
import org.json.JSONException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0772o0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ v0 c;

    public /* synthetic */ RunnableC0772o0(v0 v0Var, int i) {
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
                final v0 v0Var = this.c;
                v0Var.getClass();
                final EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("請輸入UC Token");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                final DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.I.l0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        v0.l(v0Var, editTextInitEditText);
                    }
                };
                Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.I.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        final v0 v0Var2 = v0Var;
                        EditText editText = editTextInitEditText;
                        DialogInterface.OnClickListener onClickListener2 = onClickListener;
                        v0Var2.getClass();
                        BaseApi.get().showThreadInputWithQRCode("輸入UC Token", "", "uc浏览器扫码", Server.u(), editText, onClickListener2, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.I.k0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                v0.b(v0Var2);
                            }
                        });
                    }
                });
                break;
        }
    }
}
