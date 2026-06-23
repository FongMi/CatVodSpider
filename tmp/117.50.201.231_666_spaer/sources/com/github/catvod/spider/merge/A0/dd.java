package com.github.catvod.spider.merge.A0;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class dd {
    public static List a(Object obj) {
        if ((obj instanceof wi) && !(obj instanceof fe)) {
            e("kotlin.collections.MutableList", obj);
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            ko.i(e, dd.class.getName());
            throw e;
        }
    }

    public static void b(Object obj) {
        if (obj == null || d(2, obj)) {
            return;
        }
        e("kotlin.jvm.functions.Function2", obj);
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class c(re reVar) {
        ko.f("<this>", reVar);
        Class cls = ((so) ((sn) reVar)).d;
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return cls;
    }

    public static boolean d(int i, Object obj) {
        if (obj instanceof qv) {
            return (obj instanceof rb ? ((rb) obj).getArity() : obj instanceof fo ? 0 : obj instanceof qw ? 1 : obj instanceof ha ? 2 : -1) == i;
        }
        return false;
    }

    public static void e(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        ko.i(classCastException, dd.class.getName());
        throw classCastException;
    }
}
