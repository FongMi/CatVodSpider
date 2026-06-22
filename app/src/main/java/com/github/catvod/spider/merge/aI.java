package com.github.catvod.spider.merge;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class aI {

    public static class aA extends IllegalStateException {
        public aA(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    public static jk S(i3 i3Var, Iw iw) {
        Rc.HM(i3Var);
        Rc.HM(iw);
        return fZ.l8(i3Var, iw);
    }

    @Nullable
    public static Iw T4(String str, Iw iw) {
        Rc.tT(str);
        return fZ.S(C4.eD(str), iw);
    }

    public static jk l8(String str, Iw iw) {
        Rc.tT(str);
        return S(C4.eD(str), iw);
    }
}
