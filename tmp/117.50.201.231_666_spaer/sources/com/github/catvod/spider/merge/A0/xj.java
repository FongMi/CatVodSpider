package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class xj {
    public static final xb a = new xb("COMPLETING_ALREADY", 3);
    public static final xb b = new xb("COMPLETING_WAITING_CHILDREN", 3);
    public static final xb c = new xb("COMPLETING_RETRY", 3);
    public static final xb d = new xb("TOO_LATE_TO_CANCEL", 3);
    public static final xb e = new xb("SEALED", 3);
    public static final eb f = new eb(false);
    public static final eb g = new eb(true);

    public static int h(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static aaf i(add addVar, int i) {
        ko.f("<this>", addVar);
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            if (addVar.c <= 0) {
                i = -i;
            }
            return new aaf(addVar.a, addVar.b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static final Object j(Object obj) {
        v vVar;
        fm fmVar = (fm) (!(obj instanceof fm) ? null : obj);
        return (fmVar == null || (vVar = fmVar.a) == null) ? obj : vVar;
    }

    public static add k(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new add(i, i2 - 1, 1);
        }
        add addVar = add.d;
        return add.d;
    }
}
