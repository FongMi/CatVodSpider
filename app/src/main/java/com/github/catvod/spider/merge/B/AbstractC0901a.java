package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m.p;
import com.github.catvod.spider.merge.m1.k;
import com.github.catvod.spider.merge.o1.C1359a;
import com.github.catvod.spider.merge.o1.C1360b;
import com.github.catvod.spider.merge.o1.C1361c;
import com.github.catvod.spider.merge.p1.i;
import com.github.catvod.spider.merge.q1.C1380a;
import com.github.catvod.spider.merge.r1.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0901a {
    public static int k(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = i + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = i3 + 1;
        return (bArr[i5 + 1] << 24) | i4 | ((bArr[i5] & 255) << 16);
    }

    public abstract C1361c a(C1360b c1360b);

    public C1380a b(String str) {
        if (m.j(str)) {
            throw new IllegalArgumentException("The url is null or empty");
        }
        String strD = m.d(str);
        return c(strD, m.e(strD));
    }

    public C1380a c(String str, String str2) throws i {
        if (str == null) {
            throw new NullPointerException("URL cannot be null");
        }
        if (!l(str)) {
            throw new i(C1290c.a("URL not accepted: ", str));
        }
        String strG = g(str);
        return new C1380a(str, j(strG, str2), strG);
    }

    public C1361c d(String str) {
        return f(str, null, k.c());
    }

    public C1361c e(String str, Map map) {
        return f(str, map, k.c());
    }

    public C1361c f(String str, Map map, e eVar) {
        C1359a c1359a = new C1359a();
        c1359a.h(str);
        c1359a.j(map);
        c1359a.k(eVar);
        return a(c1359a.g());
    }

    public abstract String g(String str);

    public abstract p h();

    public abstract String i(String str);

    public String j(String str, String str2) {
        return i(str);
    }

    public abstract boolean l(String str);

    public C1361c m(String str, Map map, byte[] bArr) {
        return n(str, map, bArr, k.c());
    }

    public C1361c n(String str, Map map, byte[] bArr, e eVar) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("Content-Type", Collections.singletonList("application/json"));
        C1359a c1359a = new C1359a();
        c1359a.l(str, bArr);
        c1359a.j(map2);
        c1359a.k(eVar);
        return a(c1359a.g());
    }
}
