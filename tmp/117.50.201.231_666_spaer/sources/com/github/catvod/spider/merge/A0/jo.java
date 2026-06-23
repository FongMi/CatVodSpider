package com.github.catvod.spider.merge.A0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class jo implements xp, kj, ki, ub, CookieJar, aar, aah, bc {
    public static final jo a = new jo(0);
    public static final jo b = new jo(1);
    public static final /* synthetic */ jo c = new jo(2);
    public static final /* synthetic */ jo d = new jo(3);
    public static final /* synthetic */ jo e = new jo(4);
    public static final jo f = new jo(5);
    public static final jo g = new jo(6);
    public static final jo h = new jo(7);
    public static final jo i = new jo(8);
    public static volatile jo j;
    public final /* synthetic */ int k;

    public /* synthetic */ jo(int i2) {
        this.k = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.ki
    public int l(char[] cArr, int i2) {
        switch (this.k) {
            case 9:
                return cArr[i2];
            default:
                return (cArr[i2 + 1] << 16) | cArr[i2];
        }
    }

    public List loadForRequest(HttpUrl httpUrl) {
        List list = (List) yi.c.get(httpUrl.host());
        return list != null ? list : new ArrayList();
    }

    @Override // com.github.catvod.spider.merge.A0.ub
    public Object m() {
        switch (this.k) {
            case 11:
                return new TreeSet();
            case 12:
                return new LinkedHashSet();
            case 13:
                return new ArrayDeque();
            case 14:
                return new ArrayList();
            case 15:
                return new ConcurrentSkipListMap();
            case 16:
                return new ConcurrentHashMap();
            case 17:
                return new TreeMap();
            case 18:
                return new LinkedHashMap();
            default:
                return new my(true);
        }
    }

    public to n(aam aamVar, int i2, String str, int i3, int i4, int i5, int i6, int i7) {
        to toVar = new to();
        toVar.c = -1;
        toVar.g = -1;
        toVar.e = aamVar;
        toVar.a = i2;
        toVar.d = i3;
        toVar.h = i4;
        toVar.i = i5;
        Object obj = aamVar.a;
        if (obj != null) {
            toVar.b = ((fu) ((abh) ((ja) obj)).r).c;
            toVar.c = ((fu) ((abh) ((ja) obj)).r).d;
        }
        toVar.b = i6;
        toVar.c = i7;
        if (str != null) {
            toVar.f = str;
        }
        return toVar;
    }

    @Override // com.github.catvod.spider.merge.A0.kj
    public int o() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.A0.kj
    public void p() {
    }

    public void saveFromResponse(HttpUrl httpUrl, List list) {
        yi.c.put(httpUrl.host(), list);
    }

    @Override // com.github.catvod.spider.merge.A0.ki
    public int size() {
        switch (this.k) {
            case 9:
                return 1;
            default:
                return 2;
        }
    }

    public String toString() {
        switch (this.k) {
            case 8:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }
}
