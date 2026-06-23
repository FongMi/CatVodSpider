package com.github.catvod.spider.merge.AB.o;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.AB.b.RunnableC0088i;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class P implements DialogInterface.OnClickListener {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ P(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        if (i2 == 0) {
            Z.b((Z) this.b, (Map) this.c);
            return;
        }
        if (i2 != 1) {
            com.github.catvod.spider.merge.AB.b.Q.e((com.github.catvod.spider.merge.AB.b.Q) this.b, (EditText) this.c);
            return;
        }
        Z z = (Z) this.b;
        Map map = (Map) this.c;
        z.getClass();
        map.put("model", "1");
        map.put("flag", "请使用微信或者浏览器扫码下方二维码远程输入");
        Init.execute(new RunnableC0088i(z, map, 4));
    }
}
