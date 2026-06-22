package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.oZP;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class b {
    private static final Map<String, Class<?>> a;
    private static final Map<Class<?>, Class<?>> b;
    private static final Map<Class<?>, Class<?>> c;
    private static final Map<String, String> d;
    public static final /* synthetic */ int e = 0;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    static {
        String.valueOf('.');
        String.valueOf('$');
        HashMap map = new HashMap();
        a = map;
        Class cls = Boolean.TYPE;
        String strD = oZP.d("1700182D09341B");
        map.put(strD, cls);
        Class cls2 = Byte.TYPE;
        String strD2 = oZP.d("17160324");
        map.put(strD2, cls2);
        Class cls3 = Character.TYPE;
        String strD3 = oZP.d("16071633");
        map.put(strD3, cls3);
        Class cls4 = Short.TYPE;
        String strD4 = oZP.d("0607183318");
        map.put(strD4, cls4);
        Class cls5 = Integer.TYPE;
        String strD5 = oZP.d("1C0103");
        map.put(strD5, cls5);
        Class cls6 = Long.TYPE;
        String strD6 = oZP.d("19001926");
        map.put(strD6, cls6);
        Class cls7 = Double.TYPE;
        String strD7 = oZP.d("110002230030");
        map.put(strD7, cls7);
        Class cls8 = Float.TYPE;
        String strD8 = oZP.d("1303182018");
        map.put(strD8, cls8);
        map.put(oZP.d("03001E25"), Void.TYPE);
        HashMap map2 = new HashMap();
        b = map2;
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
        c = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            Class<?> cls10 = (Class) entry.getKey();
            Class<?> cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                c.put(cls11, cls10);
            }
        }
        HashMap map3 = new HashMap();
        map3.put(strD5, oZP.d("3C"));
        map3.put(strD, oZP.d("2F"));
        map3.put(strD8, oZP.d("33"));
        map3.put(strD6, oZP.d("3F"));
        map3.put(strD4, oZP.d("26"));
        map3.put(strD2, oZP.d("37"));
        map3.put(strD7, oZP.d("31"));
        map3.put(strD3, oZP.d("36"));
        HashMap map4 = new HashMap();
        for (Map.Entry entry2 : map3.entrySet()) {
            map4.put(entry2.getValue(), entry2.getKey());
        }
        Collections.unmodifiableMap(map3);
        d = Collections.unmodifiableMap(map4);
    }

    public static String a(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String name = cls.getName();
        if (h.c(name)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (name.startsWith(oZP.d("2E"))) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                sb.append(oZP.d("2E32"));
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
            Map<String, String> map = d;
            if (map.containsKey(name)) {
                name = map.get(name);
            }
        }
        int iLastIndexOf = name.lastIndexOf(46);
        int iIndexOf = name.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = name.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace('$', '.');
        }
        return strSubstring + ((Object) sb);
    }
}
