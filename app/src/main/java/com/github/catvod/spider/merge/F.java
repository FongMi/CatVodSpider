package com.github.catvod.spider.merge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class F extends U {
    private final transient Logger S;

    public F(Logger logger) {
        this.S = logger;
    }

    public F(Class<?> cls) {
        this(LogManager.getLogger(cls));
    }
}
