package com.github.catvod.spider.merge.AB.b;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.AB.o.W;
import com.github.catvod.spider.merge.AB.o.Z;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class C implements DialogInterface.OnClickListener {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a == 0) {
            J.e((J) this.b, (EditText) this.c);
            return;
        }
        Z z = (Z) this.b;
        Map map = (Map) this.c;
        z.getClass();
        map.put("model", "");
        map.put("flag", "请输入天翼云盘账号密码");
        Init.execute(new W(z, map, 2));
    }
}
