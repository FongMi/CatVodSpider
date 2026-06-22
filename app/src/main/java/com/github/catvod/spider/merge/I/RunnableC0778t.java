package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.utils.server.Server;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0778t implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0778t(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0781w c0781w = (C0781w) this.e;
                EditText editText = (EditText) this.c;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.d;
                c0781w.getClass();
                BaseApi baseApi = BaseApi.get();
                StringBuilder sbB = t0.b("当前为");
                sbB.append(c0781w.b.a());
                baseApi.showThreadInputWithQRCode("设置摆渡线程数", sbB.toString(), "", Server.u(), editText, onClickListener, null);
                break;
            case 1:
                C0754f0 c0754f0 = (C0754f0) this.e;
                EditText editText2 = (EditText) this.c;
                DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) this.d;
                c0754f0.getClass();
                BaseApi baseApi2 = BaseApi.get();
                StringBuilder sbB2 = t0.b("当前为");
                sbB2.append(c0754f0.m.c());
                baseApi2.showThreadInputWithQRCode("设置夸克线程数", sbB2.toString(), "", Server.u(), editText2, onClickListener2, null);
                break;
            default:
                Q0 q0 = (Q0) this.e;
                String[] strArr = (String[]) this.c;
                String str = (String) this.d;
                q0.getClass();
                try {
                    Thread.sleep(3000L);
                    break;
                } catch (InterruptedException unused) {
                }
                if (!NetPan.isYunSelf115(strArr[0])) {
                    q0.a(str);
                }
                break;
        }
    }
}
