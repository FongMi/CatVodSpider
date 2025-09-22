package com.github.catvod.spider.merge;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* renamed from: com.github.catvod.spider.merge.tY */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public abstract class AbstractC0148tY {

    /* renamed from: q */
    protected String f742q;

    /* renamed from: xC */
    private final Map<Object, InterfaceC0074MS> f743xC = new ConcurrentHashMap();

    public AbstractC0148tY(String str) {
        this.f742q = str;
    }

    /* renamed from: QU */
    public InterfaceC0074MS m715QU(Class<?> cls) {
        return this.f743xC.computeIfAbsent(cls, new Function() { // from class: com.github.catvod.spider.merge.HU
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f422q.m716u(obj);
            }
        });
    }

    /* renamed from: q */
    protected void mo467q(Class<?> cls) {
    }

    /* renamed from: xC, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC0074MS m716u(Class<?> cls);
}
