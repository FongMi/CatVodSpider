package com.github.catvod.spider.merge.A;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract /* synthetic */ class T {
    public static ArrayList a(C0004e c0004e) {
        S s = new S();
        for (C0001b c0001b : c0004e.c) {
            BitSet bitSet = (BitSet) s.get(c0001b);
            if (bitSet == null) {
                bitSet = new BitSet();
                s.put(c0001b, bitSet);
            }
            bitSet.set(c0001b.b);
        }
        return (ArrayList) s.values();
    }

    public static /* synthetic */ AssertionError b(String str, AssertionError assertionError) {
        try {
            return (AssertionError) AssertionError.class.getDeclaredConstructor(String.class, Throwable.class).newInstance(str, assertionError);
        } catch (Exception unused) {
            return new AssertionError(str);
        }
    }

    public static Object c(String str, Class cls) {
        return new Gson().fromJson(str, cls);
    }

    public static String d(int i, String str) {
        return str + i;
    }

    public static String e(String str, long j) {
        return str + j;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static HashMap i(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put(str, str2);
        map.put(str3, str4);
        return map;
    }

    public static /* synthetic */ void j(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void k(String str, String str2, String str3, String str4, ArrayList arrayList) {
        arrayList.add(new com.github.catvod.spider.merge.b.j(str, str2, str3, str4));
    }
}
