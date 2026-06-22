package com.github.catvod.spider.merge;

import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;

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
                        Notice.b(str);
                        break;
                    default:
                        C0931e.a((String) str);
                        break;
                }
            }
        });
    }
}
