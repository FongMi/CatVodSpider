package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class mx {
    public static void a(int i) {
        add addVar = new add(2, 36, 1);
        if (2 > i || i > addVar.b) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new add(2, 36, 1));
        }
    }

    public static final boolean b(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
