package com.github.catvod.spider.merge.FM.o;

import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.l.RunnableC0374g;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0394j {
    private Toast a;

    public static void a(String str) {
        C0394j c0394j = C0393i.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast toast = c0394j.a;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(Init.context(), str, 1);
        c0394j.a = toastMakeText;
        toastMakeText.show();
    }

    public static void b(String str) {
        Init.run(new RunnableC0374g(str, 4));
    }
}
