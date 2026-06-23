package com.github.catvod.spider.merge.AB.b;

import android.widget.EditText;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.AB.o.Z;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0087h implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ RunnableC0087h(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            x.i((x) this.b, (com.github.catvod.spider.merge.AB.d.d) this.c);
            return;
        }
        if (i == 1) {
            ((J) this.b).D((String) this.c);
            return;
        }
        if (i == 2) {
            Q.k((Q) this.b, (String) this.c);
            return;
        }
        if (i == 3) {
            Bili.d((Bili) this.b, (com.github.catvod.spider.merge.AB.g.b) this.c);
        } else if (i != 4) {
            Z.k((Z) this.b, (EditText) this.c);
        } else {
            ((Z) this.b).u((Map) this.c);
        }
    }
}
