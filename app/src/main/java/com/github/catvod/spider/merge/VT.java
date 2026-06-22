package com.github.catvod.spider.merge;

import org.apache.log4j.Logger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class VT extends U {
    private final Logger S;

    public VT(Logger logger) {
        this.S = logger;
    }

    public VT(Class<?> cls) {
        this(cls == null ? "null" : cls.getName());
    }

    public VT(String str) {
        this(Logger.getLogger(str));
    }
}
