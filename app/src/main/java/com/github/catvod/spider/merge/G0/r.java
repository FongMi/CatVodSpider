package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.utils.server.Server;
import java.io.File;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ TgYunDouBanPan b;
    public final /* synthetic */ String c;
    public final /* synthetic */ EditText d;
    public final /* synthetic */ DialogInterface.OnClickListener e;

    public /* synthetic */ r(TgYunDouBanPan tgYunDouBanPan, String str, EditText editText, DialogInterface.OnClickListener onClickListener) {
        this.b = tgYunDouBanPan;
        this.c = str;
        this.d = editText;
        this.e = onClickListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final TgYunDouBanPan tgYunDouBanPan = this.b;
        String str = this.c;
        EditText editText = this.d;
        DialogInterface.OnClickListener onClickListener = this.e;
        int i = TgYunDouBanPan.t;
        tgYunDouBanPan.getClass();
        BaseApi baseApi = BaseApi.get();
        StringBuilder sbB = t0.b("輸入tg-api-session(v1) \n  \n 当前为：");
        sbB.append(com.github.catvod.spider.merge.g.b.e(new File(str)));
        baseApi.showThreadInputWithQRCode(sbB.toString(), "", "tg客户端扫码", Server.u(), editText, onClickListener, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.g0.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TgYunDouBanPan.g(tgYunDouBanPan);
            }
        });
    }
}
