package com.github.catvod.spider.merge;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Ⴭ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0585<Key1, Key2, Value> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    Map<Key1, Map<Key2, Value>> f1300 = new LinkedHashMap();

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public Value m1855(Key1 key1, Key2 key2) {
        Map<Key2, Value> map = this.f1300.get(key1);
        if (map == null) {
            return null;
        }
        return map.get(key2);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public Value m1856(Key1 key1, Key2 key2, Value value) {
        Value value2;
        Map<Key2, Value> linkedHashMap = this.f1300.get(key1);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            this.f1300.put(key1, linkedHashMap);
            value2 = null;
        } else {
            value2 = linkedHashMap.get(key2);
        }
        linkedHashMap.put(key2, value);
        return value2;
    }
}
