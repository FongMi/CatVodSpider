package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.C0775q;
import com.github.catvod.spider.merge.I.RunnableC0747c;
import com.github.catvod.spider.merge.I.v0;
import java.io.File;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1207c implements Runnable {
    public static final /* synthetic */ RunnableC1207c c = new RunnableC1207c(0);
    public static final /* synthetic */ RunnableC1207c d = new RunnableC1207c(1);
    public static final /* synthetic */ RunnableC1207c e = new RunnableC1207c(2);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1207c(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                com.github.catvod.spider.merge.T.b bVar = v0.r().m;
                bVar.a();
                bVar.j();
                break;
            case 1:
                String str2 = ConfigCenter.m;
                com.github.catvod.spider.merge.i0.m.w("请到json文件中配置");
                break;
            default:
                String str3 = ConfigCenter.m;
                final C0775q c0775qR = C0775q.r();
                c0775qR.getClass();
                final EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("输入线程数");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                final int i = 0;
                Init.run(new RunnableC0747c(editTextInitEditText, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.I.l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        switch (i) {
                            case 0:
                                C0775q.i((C0775q) c0775qR, editTextInitEditText);
                                break;
                            default:
                                TgYunDouBanPan tgYunDouBanPan = (TgYunDouBanPan) c0775qR;
                                EditText editText = editTextInitEditText;
                                int i3 = TgYunDouBanPan.t;
                                tgYunDouBanPan.getClass();
                                String string = editText.getText().toString();
                                if (!com.github.catvod.spider.merge.P0.e.b(string)) {
                                    com.github.catvod.spider.merge.g.b.g(new File(com.github.catvod.spider.merge.g.b.a("tv", ".tgsou_api_session")), string);
                                    com.github.catvod.spider.merge.g.b.g(new File(Init.context().getFilesDir().getAbsolutePath() + "/193316_session_0.txt"), string);
                                    com.github.catvod.spider.merge.i0.m.w("正在强制启动tgsou 稍等重试 或退出软件重进");
                                    NetPan.initTg(true, NetPan.k);
                                    break;
                                }
                                break;
                        }
                    }
                }, 0));
                break;
        }
    }
}
