package com.github.catvod.spider.merge.H0;

import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class k extends HashMap<String, String> {
    final /* synthetic */ o b;

    k(o oVar) {
        this.b = oVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        ((HashMap) this.b.g).put(str == null ? str : str.toLowerCase(), str2);
        return (String) super.put(str, str2);
    }
}
