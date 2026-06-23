package com.github.catvod.spider.merge.m;

import android.content.DialogInterface;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.b.RunnableC0535A;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0584C implements DialogInterface.OnClickListener {
    public final /* synthetic */ C0588G a;
    public final /* synthetic */ Map b;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.C$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements DialogInterface.OnClickListener {
        public final /* synthetic */ C0588G a;
        public final /* synthetic */ Map b;

        public /* synthetic */ AnonymousClass1(C0588G c0588g, Map map) {
            this.a = c0588g;
            this.b = map;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C0588G c0588g = this.a;
            Map map = this.b;
            c0588g.getClass();
            map.put("model", "1");
            Init.execute(new RunnableC0535A(c0588g, map, 1));
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0584C(C0588G c0588g, Map map) {
        this.a = c0588g;
        this.b = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0588G c0588g = this.a;
        Map map = this.b;
        c0588g.getClass();
        map.put("model", "1");
        map.put("flag", "请使用浏览器或者微信扫描二维码");
        Init.execute(new RunnableC0535A(c0588g, map, 1));
    }
}
