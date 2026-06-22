package com.github.catvod.spider.merge;

import io.github.logtube.Logtube;
import io.github.logtube.core.IEventLogger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Z extends U {
    private final IEventLogger S;

    public Z(IEventLogger iEventLogger) {
        this.S = iEventLogger;
    }

    public Z(Class<?> cls) {
        this(cls == null ? "null" : cls.getName());
    }

    public Z(String str) {
        this(Logtube.getLogger(str));
    }
}
