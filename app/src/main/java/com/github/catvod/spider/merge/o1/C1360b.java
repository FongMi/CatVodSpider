package com.github.catvod.spider.merge.o1;

import com.github.catvod.spider.merge.r1.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.o1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1360b {
    private final String a;
    private final String b;
    private final Map<String, List<String>> c;
    private final byte[] d;
    private final e e;

    C1360b(C1359a c1359a) {
        String str = c1359a.a;
        String str2 = c1359a.b;
        Map map = c1359a.c;
        byte[] bArr = c1359a.d;
        e eVar = c1359a.e;
        boolean z = c1359a.f;
        if (str == null) {
            throw new NullPointerException("Request's httpMethod is null");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Request's url is null");
        }
        this.b = str2;
        this.d = bArr;
        this.e = eVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (z && eVar != null) {
            String strB = eVar.b();
            if (!eVar.a().isEmpty()) {
                strB = eVar.c() + ", " + strB + ";q=0.9";
            }
            linkedHashMap.putAll(Collections.singletonMap("Accept-Language", Collections.singletonList(strB)));
        }
        this.c = Collections.unmodifiableMap(linkedHashMap);
    }

    public final byte[] a() {
        return this.d;
    }

    public final Map<String, List<String>> b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1360b.class != obj.getClass()) {
            return false;
        }
        C1360b c1360b = (C1360b) obj;
        if (this.a.equals(c1360b.a) && this.b.equals(c1360b.b) && this.c.equals(c1360b.c) && Arrays.equals(this.d, c1360b.d)) {
            e eVar = this.e;
            e eVar2 = c1360b.e;
            if (eVar == eVar2 || (eVar != null && eVar.equals(eVar2))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e}) * 31);
    }
}
