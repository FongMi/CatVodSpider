package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.oZP;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class c {
    private c() {
    }

    public static void a(String str) {
        throw new d(str);
    }

    public static void b(boolean z) {
        if (z) {
            throw new d(oZP.d("381A04354C37104F1120002610"));
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new d(oZP.d("381A04354C37104F03331930"));
        }
    }

    public static void d(boolean z, String str) {
        if (!z) {
            throw new d(str);
        }
    }

    public static void e(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new d(oZP.d("261B052802325502023218751B0003610E30550A1A31182C"));
        }
    }

    public static void f(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new d(str2);
        }
    }

    public static void g(@Nullable Object obj) {
        if (obj == null) {
            throw new d(oZP.d("3A0D1D240F215502023218751B0003610E305501022D00"));
        }
    }

    public static void h(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new d(String.format(oZP.d("210712611C34070E1A241830074F50641F725502023218751B0003610E305501022D007B"), str));
        }
    }
}
