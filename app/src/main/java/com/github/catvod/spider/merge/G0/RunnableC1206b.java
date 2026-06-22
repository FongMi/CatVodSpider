package com.github.catvod.spider.merge.g0;

import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.RunnableC0759i;
import com.github.catvod.spider.merge.I.S;
import com.github.catvod.utils.merge.UcDriveApi;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1206b implements Runnable {
    public static final /* synthetic */ RunnableC1206b c = new RunnableC1206b(0);
    public static final /* synthetic */ RunnableC1206b d = new RunnableC1206b(1);
    public static final /* synthetic */ RunnableC1206b e = new RunnableC1206b(2);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1206b(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                UcDriveApi v0VarR = UcDriveApi.r();
                v0VarR.getClass();
                EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("输入uc ut");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                Init.run(new RunnableC0759i(v0VarR, editTextInitEditText, new S(editTextInitEditText, 1), 1));
                break;
            case 1:
                String str2 = ConfigCenter.m;
                com.github.catvod.spider.merge.i0.m.w("请到json文件中配置");
                break;
            default:
                String str3 = ConfigCenter.m;
                new Thread(RunnableC1211g.f).start();
                break;
        }
    }
}
