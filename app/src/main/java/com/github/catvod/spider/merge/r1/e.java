package com.github.catvod.spider.merge.r1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.l.C1290c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e implements Serializable {
    public static final e d = new e("en", "GB");
    private final String b;
    private final String c;

    public e(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public static List<e> d(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (final String str : strArr) {
            arrayList.add((e) com.github.catvod.spider.merge.L1.c.a(str).map(new Function() { // from class: com.github.catvod.spider.merge.r1.c
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Locale locale = (Locale) obj;
                    return new e(locale.getLanguage(), locale.getCountry());
                }
            }).orElseThrow(new Supplier() { // from class: com.github.catvod.spider.merge.r1.d
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new IllegalArgumentException(C1290c.a("Not a localization code: ", str));
                }
            }));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String a() {
        String str = this.c;
        return str == null ? "" : str;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        String str = this.b;
        String str2 = this.c;
        return C1290c.a(str, str2 == null ? "" : C1290c.a("-", str2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.b.equals(eVar.b)) {
            String str = this.c;
            String str2 = eVar.c;
            if (str == str2 || (str != null && str.equals(str2))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return t0.a("Localization[", c(), "]");
    }
}
