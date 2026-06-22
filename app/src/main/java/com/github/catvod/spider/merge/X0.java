package com.github.catvod.spider.merge;

import org.pmw.tinylog.Logger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class X0 extends U {
    private final int S;
    private final String T4;

    public X0(Class<?> cls) {
        this(cls == null ? "null" : cls.getName());
    }

    public X0(String str) {
        this.T4 = str;
        this.S = Logger.getLevel(str).ordinal();
    }
}
