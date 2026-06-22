package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.y.C1413b;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0899d {
    public static void a(String str) {
        throw new C0900e(str);
    }

    public static String b(String str) {
        HashMap map = new HashMap();
        if (str != null && !str.trim().isEmpty()) {
            Matcher matcher = Pattern.compile("([^=;]+)=([^;]*)").matcher(str);
            while (matcher.find()) {
                String strTrim = matcher.group(1).trim();
                String strTrim2 = matcher.group(2).trim();
                if (!strTrim.isEmpty()) {
                    map.put(strTrim, strTrim2);
                }
            }
        }
        return (String) map.get("__pus");
    }

    public static void c(boolean z) {
        if (z) {
            throw new C0900e("Must be false");
        }
    }

    public static void d(boolean z) {
        if (!z) {
            throw new C0900e("Must be true");
        }
    }

    public static void e(boolean z, String str) {
        if (!z) {
            throw new C0900e(str);
        }
    }

    public static void f(String str) {
        if (str == null || str.length() == 0) {
            throw new C0900e("String must not be empty");
        }
    }

    public static void g(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C0900e(str2);
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new C0900e("Object must not be null");
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new C0900e(String.format("The parameter '%s' must not be null.", str));
        }
    }

    public static String j(C1416e c1416e) {
        C1413b c1413bT;
        if (c1416e == null || (c1413bT = c1416e.t("runs")) == null) {
            return null;
        }
        if (c1413bT.size() == 1) {
            return c1413bT.o(0).x("text");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c1413bT.size(); i++) {
            sb.append(c1413bT.o(i).x("text"));
        }
        return sb.toString();
    }

    public static List k(C1416e c1416e) {
        C1413b c1413bT;
        if (c1416e == null || (c1413bT = c1416e.t("thumbnails")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(c1413bT.size());
        for (int i = 0; i < c1413bT.size(); i++) {
            C1416e c1416eO = c1413bT.o(i);
            if (c1416eO.containsKey("url")) {
                arrayList.add(c1416eO.x("url"));
            }
        }
        return arrayList;
    }

    public static String l(Map map, String str) {
        int iIndexOf;
        int iIndexOf2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null && !str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                String strTrim = str2.trim();
                if (!strTrim.isEmpty() && (iIndexOf2 = strTrim.indexOf(61)) > 0) {
                    linkedHashMap.put(strTrim.substring(0, iIndexOf2), iIndexOf2 < strTrim.length() + (-1) ? strTrim.substring(iIndexOf2 + 1) : "");
                }
            }
        }
        if (map.containsKey("Set-Cookie") || map.containsKey("set-cookie")) {
            List list = (List) map.get("Set-Cookie");
            if (list == null) {
                list = (List) map.get("set-cookie");
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String strTrim2 = ((String) it.next()).split(";")[0].trim();
                    if (!strTrim2.isEmpty() && (iIndexOf = strTrim2.indexOf(61)) > 0) {
                        linkedHashMap.put(strTrim2.substring(0, iIndexOf), iIndexOf < strTrim2.length() + (-1) ? strTrim2.substring(iIndexOf + 1) : "");
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }
}
