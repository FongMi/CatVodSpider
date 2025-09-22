package com.github.catvod.spider.merge;

import org.pmw.tinylog.Logger;

/* renamed from: com.github.catvod.spider.merge.p8 */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0137p8 extends AbstractC0085Q {

    /* renamed from: QU */
    private final String f733QU;

    /* renamed from: xC */
    private final int f734xC;

    public C0137p8(Class<?> cls) {
        this(cls == null ? "null" : cls.getName());
    }

    public C0137p8(String str) {
        this.f733QU = str;
        this.f734xC = Logger.getLevel(str).ordinal();
    }
}
