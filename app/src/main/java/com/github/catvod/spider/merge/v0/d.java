package com.github.catvod.spider.merge.v0;

import com.github.catvod.spider.merge.x0.C1404a;
import com.github.catvod.spider.merge.x0.EnumC1406c;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class d {
    private final List<g> a;

    public d(List list, Map map) {
        this.a = list;
        EnumC1406c enumC1406c = EnumC1406c.AUTO_CORRECTION;
        if (map.containsKey(enumC1406c)) {
            ((C1404a) map.get(enumC1406c)).getClass();
        }
    }

    public final List<g> a() {
        return this.a;
    }
}
