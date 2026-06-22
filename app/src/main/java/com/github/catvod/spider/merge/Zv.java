package com.github.catvod.spider.merge;

import org.jboss.logging.Logger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Zv extends U {
    private final transient Logger S;

    public Zv(Logger logger) {
        this.S = logger;
    }

    public Zv(Class<?> cls) {
        this(cls == null ? "null" : cls.getName());
    }

    public Zv(String str) {
        this(Logger.getLogger(str));
    }
}
