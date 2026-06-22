package com.github.catvod.spider.merge.I1;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c implements Serializable {
    public static final c d = new c("", 3);
    private final String b;
    private final int c;

    public c(String str, int i) {
        this.c = i;
        this.b = str == null ? "" : str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.c == cVar.c) {
            String str = this.b;
            String str2 = cVar.b;
            if (str == str2 || (str != null && str.equals(str2))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c)});
    }
}
