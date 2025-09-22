package com.github.catvod.spider.merge;

import org.tinylog.configuration.Configuration;
import org.tinylog.format.AdvancedMessageFormatter;
import org.tinylog.format.MessageFormatter;
import org.tinylog.provider.LoggingProvider;
import org.tinylog.provider.ProviderRegistry;

/* renamed from: com.github.catvod.spider.merge.jm */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0125jm extends AbstractC0085Q {

    /* renamed from: UJ */
    private final int f702UJ;

    /* renamed from: u */
    private final String f703u;

    /* renamed from: xC */
    private static final LoggingProvider f701xC = ProviderRegistry.getLoggingProvider();

    /* renamed from: QU */
    private static final MessageFormatter f700QU = new AdvancedMessageFormatter(Configuration.getLocale(), Configuration.isEscapingEnabled());

    public C0125jm(Class<?> cls) {
        this(cls == null ? "null" : cls.getName());
    }

    public C0125jm(String str) {
        this.f703u = str;
        this.f702UJ = f701xC.getMinimumLevel().ordinal();
    }
}
