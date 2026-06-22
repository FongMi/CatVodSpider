package com.github.catvod.spider.merge.J1;

import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class c {
    private final String a;
    private final Collection<String> b;
    private final Collection<String> c;
    private final Collection<String> d;
    private final Collection<String> e;
    private final Collection<String> f;
    private final Collection<String> g;
    private final Collection<String> h;
    private final Map<ChronoUnit, Map<String, Integer>> i;

    protected c(String str, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        List listAsList = Arrays.asList(strArr);
        List listAsList2 = Arrays.asList(strArr2);
        List listAsList3 = Arrays.asList(strArr3);
        List listAsList4 = Arrays.asList(strArr4);
        List listAsList5 = Arrays.asList(strArr5);
        List listAsList6 = Arrays.asList(strArr6);
        List listAsList7 = Arrays.asList(strArr7);
        this.i = new EnumMap(ChronoUnit.class);
        this.a = str;
        this.b = listAsList;
        this.c = listAsList2;
        this.d = listAsList3;
        this.e = listAsList4;
        this.f = listAsList5;
        this.g = listAsList6;
        this.h = listAsList7;
    }

    public final Map<ChronoUnit, Collection<String>> a() {
        EnumMap enumMap = new EnumMap(ChronoUnit.class);
        enumMap.put(ChronoUnit.SECONDS, this.b);
        enumMap.put(ChronoUnit.MINUTES, this.c);
        enumMap.put(ChronoUnit.HOURS, this.d);
        enumMap.put(ChronoUnit.DAYS, this.e);
        enumMap.put(ChronoUnit.WEEKS, this.f);
        enumMap.put(ChronoUnit.MONTHS, this.g);
        enumMap.put(ChronoUnit.YEARS, this.h);
        return enumMap;
    }

    protected final void b(ChronoUnit chronoUnit, String str) {
        this.i.computeIfAbsent(chronoUnit, new Function() { // from class: com.github.catvod.spider.merge.J1.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new LinkedHashMap();
            }
        }).put(str, 2);
    }

    public final Map<ChronoUnit, Map<String, Integer>> c() {
        return this.i;
    }

    public final String d() {
        return this.a;
    }
}
