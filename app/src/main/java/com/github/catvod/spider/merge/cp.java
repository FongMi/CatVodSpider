package com.github.catvod.spider.merge;

import org.tinylog.configuration.Configuration;
import org.tinylog.format.AdvancedMessageFormatter;
import org.tinylog.format.MessageFormatter;
import org.tinylog.provider.LoggingProvider;
import org.tinylog.provider.ProviderRegistry;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class cp extends U {
    private static final LoggingProvider S = ProviderRegistry.getLoggingProvider();
    private static final MessageFormatter T4 = new AdvancedMessageFormatter(Configuration.getLocale(), Configuration.isEscapingEnabled());
    private final String OL;
    private final int b;

    public cp(Class<?> cls) {
        this(cls == null ? "null" : cls.getName());
    }

    public cp(String str) {
        this.OL = str;
        this.b = S.getMinimumLevel().ordinal();
    }
}
