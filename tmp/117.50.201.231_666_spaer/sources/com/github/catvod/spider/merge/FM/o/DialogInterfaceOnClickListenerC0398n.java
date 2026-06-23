package com.github.catvod.spider.merge.FM.o;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.b.RunnableC0299A;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0398n implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0398n(y yVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = yVar;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                y.a(this.b, (Map) this.c, (String) this.d);
                break;
            default:
                y yVar = this.b;
                EditText editText = (EditText) this.c;
                EditText editText2 = (EditText) this.d;
                yVar.getClass();
                Init.execute(new RunnableC0299A(yVar, editText, editText2, 1));
                break;
        }
    }
}
