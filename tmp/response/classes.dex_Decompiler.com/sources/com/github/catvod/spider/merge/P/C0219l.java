package com.github.catvod.spider.merge.p;

import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.b.RunnableC0117c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0219l {
    private Toast a;

    public static void a(String str) {
        C0219l c0219l = C0218k.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast toast = c0219l.a;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(Init.context(), str, 1);
        c0219l.a = toastMakeText;
        toastMakeText.show();
    }

    public static void b(String str) {
        Init.run(new RunnableC0117c(str, 5));
    }
}
