package com.github.catvod.spider.merge.AB.o;

import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class E {
    private Toast a;

    public static void a(String str) {
        E e = D.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast toast = e.a;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(Init.context(), str, 1);
        e.a = toastMakeText;
        toastMakeText.show();
    }

    public static void b(String str) {
        Init.run(new com.github.catvod.spider.merge.AB.b.O(str, 4));
    }
}
