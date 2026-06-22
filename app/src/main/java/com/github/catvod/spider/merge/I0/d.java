package com.github.catvod.spider.merge.i0;

import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.L;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d {
    private Toast a;

    public static void a(String str) {
        d dVar = c.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast toast = dVar.a;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(Init.context(), str, 1);
        dVar.a = toastMakeText;
        toastMakeText.show();
    }

    public static void b(String str) {
        Init.run(new L(str, 4));
    }
}
