package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import okio.Path;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract /* synthetic */ class wb {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static ArrayList b(jn jnVar) {
        abn abnVar = new abn();
        for (jk jkVar : jnVar.c) {
            BitSet bitSet = (BitSet) abnVar.get(jkVar);
            if (bitSet == null) {
                bitSet = new BitSet();
                abnVar.put(jkVar, bitSet);
            }
            bitSet.set(jkVar.f);
        }
        return (ArrayList) abnVar.values();
    }

    public static String c(String str, int i) {
        return str + i;
    }

    public static String d(String str, long j) {
        return str + j;
    }

    public static String e(Path path, String str) {
        return str + path;
    }

    public static HashMap f(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static /* synthetic */ void g(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ int h(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
