package com.github.catvod.spider.merge.I;

import android.widget.EditText;
import android.widget.Toast;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0746b0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0746b0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0754f0 c0754f0 = (C0754f0) this.c;
                c0754f0.getClass();
                EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("請輸入夸克Cookie");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                int i = 0;
                Init.run(new T(c0754f0, editTextInitEditText, new V(c0754f0, editTextInitEditText, i), i));
                break;
            case 1:
                ((MainActivity) this.c).m();
                break;
            case 2:
                Toast.makeText(Init.context(), (String) this.c, 1).show();
                break;
            default:
                Notice.a((Notice) this.c);
                break;
        }
    }
}
