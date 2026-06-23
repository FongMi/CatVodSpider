package com.github.catvod.spider.merge.FM.o;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.b.N;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class p implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                y.b((y) this.b, (Map) this.c);
                break;
            case 1:
                y yVar = (y) this.b;
                Map map = (Map) this.c;
                yVar.getClass();
                map.put("model", "1");
                map.put("flag", "请使用微信或者浏览器扫码下方二维码远程输入");
                Init.execute(new N(yVar, map, 1));
                break;
            default:
                com.github.catvod.spider.merge.FM.b.u.h((com.github.catvod.spider.merge.FM.b.u) this.b, (EditText) this.c);
                break;
        }
    }
}
