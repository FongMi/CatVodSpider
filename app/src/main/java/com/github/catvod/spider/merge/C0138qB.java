package com.github.catvod.spider.merge;

import io.github.logtube.Logtube;
import io.github.logtube.core.IEventLogger;

/* renamed from: com.github.catvod.spider.merge.qB */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0138qB extends AbstractC0085Q {

    /* renamed from: xC */
    private final IEventLogger f735xC;

    public C0138qB(IEventLogger iEventLogger) {
        this.f735xC = iEventLogger;
    }

    public C0138qB(Class<?> cls) {
        this(cls == null ? "null" : cls.getName());
    }

    public C0138qB(String str) {
        this(Logtube.getLogger(str));
    }
}
