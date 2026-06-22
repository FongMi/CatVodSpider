package com.github.catvod.spider.merge.I;

import android.widget.EditText;
import android.widget.Toast;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class O0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ O0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.b) {
            case 0:
                Q0 q0 = (Q0) this.c;
                q0.getClass();
                EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("請輸入115 cookie");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                Init.run(new U(editTextInitEditText, new DialogInterfaceOnClickListenerC0767m(q0, editTextInitEditText, i), 2));
                return;
            case 1:
                com.github.catvod.spider.merge.R.c cVar = (com.github.catvod.spider.merge.R.c) this.c;
                cVar.getClass();
                int i2 = J0.h;
                H0.a.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("p123_user"), cVar.toString());
                return;
            case 2:
                ((MainActivity) this.c).k();
                return;
            case 3:
                TgYunDouBanPan tgYunDouBanPan = (TgYunDouBanPan) this.c;
                int i3 = TgYunDouBanPan.t;
                tgYunDouBanPan.getClass();
                try {
                    String strL = com.github.catvod.spider.merge.f0.d.l("http://127.0.0.1:9999/login");
                    if (strL.contains("已登录")) {
                        com.github.catvod.spider.merge.i0.m.w("tg已登录");
                        return;
                    }
                    if (com.github.catvod.spider.merge.P0.e.b(strL)) {
                        com.github.catvod.spider.merge.i0.m.w("正在强制启动tgsou 稍等重试");
                        NetPan.initTg(true, NetPan.k);
                        return;
                    } else if (strL.contains("tg://")) {
                        Init.run(new RunnableC0753f(tgYunDouBanPan, strL, 3));
                        return;
                    } else {
                        com.github.catvod.spider.merge.i0.m.w("正在强制启动tgsou 稍等重试");
                        return;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                String str = (String) this.c;
                List<String> list = com.github.catvod.spider.merge.i0.m.a;
                Toast.makeText(Init.context(), str, 1).show();
                return;
        }
    }
}
