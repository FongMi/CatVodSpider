package com.github.catvod.spider.merge.AB.b;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.merge.AB.o.Z;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0093n implements DialogInterface.OnClickListener {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0093n(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a != 0) {
            Z.f((Z) this.b, (Map) this.c);
        } else {
            x.h((x) this.b, (EditText) this.c);
        }
    }
}
