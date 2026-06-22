package com.github.catvod.spider.merge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˤ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0162 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final String f396 = String.valueOf('.');

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final String f397 = String.valueOf('$');

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final Map<String, Class<?>> f398;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final Map<Class<?>, Class<?>> f399;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static final Map<Class<?>, Class<?>> f400;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static final Map<String, String> f401;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private static final Map<String, String> f402;

    static {
        HashMap map = new HashMap();
        f398 = map;
        Class cls = Boolean.TYPE;
        String strD = SOY.d("183D3E1A111614");
        map.put(strD, cls);
        Class cls2 = Byte.TYPE;
        String strD2 = SOY.d("182B2513");
        map.put(strD2, cls2);
        Class cls3 = Character.TYPE;
        String strD3 = SOY.d("193A3004");
        map.put(strD3, cls3);
        Class cls4 = Short.TYPE;
        String strD4 = SOY.d("093A3E0400");
        map.put(strD4, cls4);
        Class cls5 = Integer.TYPE;
        String strD5 = SOY.d("133C25");
        map.put(strD5, cls5);
        Class cls6 = Long.TYPE;
        String strD6 = SOY.d("163D3F11");
        map.put(strD6, cls6);
        Class cls7 = Double.TYPE;
        String strD7 = SOY.d("1E3D24141812");
        map.put(strD7, cls7);
        Class cls8 = Float.TYPE;
        String strD8 = SOY.d("1C3E3E1700");
        map.put(strD8, cls8);
        map.put(SOY.d("0C3D3812"), Void.TYPE);
        HashMap map2 = new HashMap();
        f399 = map2;
        map2.put(cls, Boolean.class);
        map2.put(Byte.TYPE, Byte.class);
        map2.put(Character.TYPE, Character.class);
        map2.put(Short.TYPE, Short.class);
        map2.put(cls5, Integer.class);
        map2.put(cls6, Long.class);
        map2.put(Double.TYPE, Double.class);
        map2.put(cls8, Float.class);
        Class cls9 = Void.TYPE;
        map2.put(cls9, cls9);
        f400 = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            Class<?> cls10 = (Class) entry.getKey();
            Class<?> cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                f400.put(cls11, cls10);
            }
        }
        HashMap map3 = new HashMap();
        map3.put(strD5, SOY.d("33"));
        map3.put(strD, SOY.d("20"));
        map3.put(strD8, SOY.d("3C"));
        map3.put(strD6, SOY.d("30"));
        map3.put(strD4, SOY.d("29"));
        map3.put(strD2, SOY.d("38"));
        map3.put(strD7, SOY.d("3E"));
        map3.put(strD3, SOY.d("39"));
        HashMap map4 = new HashMap();
        for (Map.Entry entry2 : map3.entrySet()) {
            map4.put(entry2.getValue(), entry2.getKey());
        }
        f401 = Collections.unmodifiableMap(map3);
        f402 = Collections.unmodifiableMap(map4);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String m567(Class<?> cls) {
        return cls == null ? "" : m569(cls.getName());
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static String m568(Object obj, String str) {
        return obj == null ? str : m567(obj.getClass());
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static String m569(String str) {
        if (C0131.m442(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith(SOY.d("21"))) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append(SOY.d("210F"));
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            Map<String, String> map = f402;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iIndexOf = str.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace('$', '.');
        }
        return strSubstring + ((Object) sb);
    }
}
