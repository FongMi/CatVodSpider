package com.github.catvod.spider.merge.o0;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e implements InterfaceC1358b {
    private final Map<String, d> a;
    private final List<f> b;

    public e(List<f> list, Map<String, d> map) {
        this.a = map;
        this.b = list;
    }

    @Override // com.github.catvod.spider.merge.o0.InterfaceC1358b
    public final String a(String str) {
        char[] charArray = str.toCharArray();
        for (f fVar : this.b) {
            charArray = this.a.get(fVar.b()).a(charArray, fVar.a());
        }
        return String.valueOf(charArray);
    }
}
