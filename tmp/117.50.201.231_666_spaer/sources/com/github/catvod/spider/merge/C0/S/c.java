package com.github.catvod.spider.merge.C0.S;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c<Key1, Key2, Value> {
    Map<Key1, Map<Key2, Value>> a = new LinkedHashMap();

    public final Value a(Key1 key1, Key2 key2) {
        Map map = (Map) this.a.get(key1);
        if (map == null) {
            return null;
        }
        return (Value) map.get(key2);
    }

    public final Value b(Key1 key1, Key2 key2, Value value) {
        Value value2;
        Map<Key2, Value> linkedHashMap = (Map) this.a.get(key1);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            this.a.put(key1, linkedHashMap);
            value2 = null;
        } else {
            value2 = linkedHashMap.get(key2);
        }
        linkedHashMap.put(key2, value);
        return value2;
    }
}
