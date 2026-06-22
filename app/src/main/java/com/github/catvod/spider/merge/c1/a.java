package com.github.catvod.spider.merge.C1;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class a {
    public static StringBuilder a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ Map b(Object obj) {
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry("Range", obj);
        Map.Entry[] entryArr = {simpleEntry};
        HashMap map = new HashMap(1);
        for (int i = 0; i < 1; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.d("duplicate key: ", key));
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
