package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.y.C1416e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class t extends g {
    public static t a = new t();

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 12;
    }

    @Override // com.github.catvod.spider.merge.C.g
    public final <T> T f(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj, String str, int i) {
        if (type == C1416e.class && bVar.i() == null) {
            return (T) bVar.s();
        }
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        if (dVar.p() == 8) {
            dVar.o(16);
            return null;
        }
        boolean z = (type instanceof Class) && "java.util.Collections$UnmodifiableMap".equals(((Class) type).getName());
        Map<Object, Object> mapH = (dVar.w() & com.github.catvod.spider.merge.B.c.OrderedField.b) != 0 ? h(type, dVar.w()) : g(type);
        com.github.catvod.spider.merge.B.k kVarF = bVar.f();
        try {
            bVar.z(kVarF, mapH, obj);
            Map map = (T) i(bVar, type, obj, mapH, i);
            if (z) {
                map = (T) Collections.unmodifiableMap(map);
            }
            return (T) map;
        } finally {
            bVar.B(kVarF);
        }
    }

    public final Map<Object, Object> g(Type type) {
        return h(type, AbstractC1412a.h);
    }

    public final Map<Object, Object> h(Type type, int i) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class) {
            return (com.github.catvod.spider.merge.B.c.OrderedField.b & i) != 0 ? new LinkedHashMap() : new HashMap();
        }
        if (type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            return EnumMap.class.equals(rawType) ? new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]) : h(rawType, i);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new C1415d("unsupport type " + type);
        }
        if ("java.util.Collections$UnmodifiableMap".equals(cls.getName())) {
            return new HashMap();
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new C1415d("unsupport type " + type, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0356, code lost:
    
        return r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ca, code lost:
    
        r4.o(16);
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f5 A[Catch: all -> 0x03d3, TRY_LEAVE, TryCatch #0 {all -> 0x03d3, blocks: (B:129:0x0297, B:131:0x029d, B:132:0x02a2, B:134:0x02a8, B:136:0x02ae, B:138:0x02b6, B:140:0x02bf, B:142:0x02cb, B:149:0x02dd, B:151:0x02ec, B:153:0x02f5, B:155:0x02fc, B:156:0x0303, B:143:0x02ce, B:146:0x02d7, B:150:0x02e0, B:157:0x0304, B:158:0x0322, B:159:0x0323, B:161:0x0329, B:163:0x032f, B:165:0x033b, B:167:0x0343, B:169:0x034f, B:172:0x0357, B:173:0x035e, B:175:0x0364, B:177:0x0368, B:179:0x038e, B:181:0x0396, B:183:0x03ad, B:185:0x03b8, B:186:0x03d2, B:178:0x038a), top: B:193:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02fc A[Catch: all -> 0x03d3, TRY_ENTER, TryCatch #0 {all -> 0x03d3, blocks: (B:129:0x0297, B:131:0x029d, B:132:0x02a2, B:134:0x02a8, B:136:0x02ae, B:138:0x02b6, B:140:0x02bf, B:142:0x02cb, B:149:0x02dd, B:151:0x02ec, B:153:0x02f5, B:155:0x02fc, B:156:0x0303, B:143:0x02ce, B:146:0x02d7, B:150:0x02e0, B:157:0x0304, B:158:0x0322, B:159:0x0323, B:161:0x0329, B:163:0x032f, B:165:0x033b, B:167:0x0343, B:169:0x034f, B:172:0x0357, B:173:0x035e, B:175:0x0364, B:177:0x0368, B:179:0x038e, B:181:0x0396, B:183:0x03ad, B:185:0x03b8, B:186:0x03d2, B:178:0x038a), top: B:193:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c1 A[Catch: all -> 0x0253, TryCatch #1 {all -> 0x0253, blocks: (B:31:0x00b6, B:35:0x00c9, B:39:0x00dc, B:63:0x0166, B:65:0x0176, B:67:0x017e, B:72:0x0189, B:84:0x01b9, B:86:0x01c1, B:88:0x01ca, B:89:0x01ce, B:91:0x01da, B:93:0x01de, B:94:0x01e1, B:75:0x019c, B:78:0x01a7, B:81:0x01ae, B:96:0x01eb, B:98:0x01f0, B:99:0x01f3, B:101:0x01fb, B:103:0x0204, B:109:0x021f, B:102:0x0200, B:42:0x00ed, B:43:0x0105, B:46:0x010a, B:50:0x0118, B:52:0x0120, B:55:0x0130, B:56:0x0148, B:57:0x0149, B:58:0x014e, B:59:0x014f, B:61:0x0157, B:114:0x022c, B:115:0x024c, B:116:0x024d, B:117:0x0252), top: B:194:0x00b6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object i(com.github.catvod.spider.merge.B.b r17, java.lang.reflect.Type r18, java.lang.Object r19, java.util.Map r20, int r21) {
        /*
            Method dump skipped, instruction units count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.t.i(com.github.catvod.spider.merge.B.b, java.lang.reflect.Type, java.lang.Object, java.util.Map, int):java.lang.Object");
    }
}
