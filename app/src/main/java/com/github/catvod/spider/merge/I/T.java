package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.utils.server.Server;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class T implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ DialogInterface.OnClickListener d;
    public final /* synthetic */ Object e;

    public /* synthetic */ T(Object obj, EditText editText, DialogInterface.OnClickListener onClickListener, int i) {
        this.b = i;
        this.e = obj;
        this.c = editText;
        this.d = onClickListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0754f0 c0754f0 = (C0754f0) this.e;
                EditText editText = this.c;
                DialogInterface.OnClickListener onClickListener = this.d;
                c0754f0.getClass();
                BaseApi.get().showThreadInputWithQRCode("夸克Cookie", "", "夸克浏览器扫码", Server.u(), editText, onClickListener, new S(c0754f0, 0));
                break;
            default:
                Q0 q0 = (Q0) this.e;
                EditText editText2 = this.c;
                DialogInterface.OnClickListener onClickListener2 = this.d;
                q0.getClass();
                BaseApi baseApi = BaseApi.get();
                StringBuilder sbB = t0.b("当前为 ");
                sbB.append(q0.e.b);
                baseApi.showThreadInputWithQRCode("115 cookie", sbB.toString(), "", Server.u(), editText2, onClickListener2, null);
                break;
        }
    }
}
