package com.github.catvod.spider.merge.FM.q;

import android.util.Log;
import com.github.catvod.spider.merge.FM.g.C0354j;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.q.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0408g {
    private final C0404c c;
    private final int a = 2;
    private final boolean b = true;
    private final String d = "PRETTY_LOGGER";

    C0408g(C0407f c0407f) {
        this.c = c0407f.a;
    }

    private void b(String str, String str2) {
        str2.getClass();
        this.c.getClass();
        if (str == null) {
            str = "NO_TAG";
        }
        Log.println(3, str, str2);
    }

    private void c(String str, String str2) {
        str2.getClass();
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            b(str, C0354j.b("│ ", str3));
        }
    }

    private void d(String str) {
        b(str, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.q.C0408g.a(java.lang.String, java.lang.String):void");
    }
}
