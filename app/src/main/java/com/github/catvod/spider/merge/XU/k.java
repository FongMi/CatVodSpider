package com.github.catvod.spider.merge.XU;

import com.github.catvod.spider.merge.ZrJ;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k {
    private k() {
    }

    public static void a(String str) {
        throw new l(str);
    }

    public static void b(boolean z) {
        if (z) {
            throw new l(ZrJ.d("3436383968271C632D2C24361C"));
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new l(ZrJ.d("3436383968271C633F3F3D20"));
        }
    }

    public static void d(boolean z, String str) {
        if (!z) {
            throw new l(str);
        }
    }

    public static void e(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new l(ZrJ.d("2A3739242622592E3E3E3C65172C3F6D2A205926263D3C3C"));
        }
    }

    public static void f(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new l(str2);
        }
    }

    public static void g(@Nullable Object obj) {
        if (obj == null) {
            throw new l(ZrJ.d("362121282B31592E3E3E3C65172C3F6D2A20592D3E2124"));
        }
    }

    public static void h(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new l(String.format(ZrJ.d("2D2B2E6D38240B2226283C200B636C683B62592E3E3E3C65172C3F6D2A20592D3E21246B"), str));
        }
    }
}
