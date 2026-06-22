package com.github.catvod.spider.merge;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class rs extends U {
    private final transient Log S;
    private final String T4;

    public rs(Log log, String str) {
        this.S = log;
        this.T4 = str;
    }

    public rs(Class<?> cls) {
        this(LogFactory.getLog(cls), cls == null ? "null" : cls.getName());
    }
}
