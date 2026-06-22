package com.github.catvod.spider.merge.bk;

import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bk.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0931e {
    private Toast a;

    public static void a(String str) {
        C0931e c0931e = C0930d.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast toast = c0931e.a;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(Init.context(), str, 1);
        c0931e.a = toastMakeText;
        toastMakeText.show();
    }

    public static void b(final String str) {
        final int i = 1;
        Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.ai.u
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        Notice.b((Notice) str);
                        break;
                    default:
                        C0931e.a((String) str);
                        break;
                }
            }
        });
    }
}
