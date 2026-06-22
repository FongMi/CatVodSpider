package com.github.catvod.spider.merge;

import java.util.IdentityHashMap;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢯ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0418 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    @Deprecated
    public static final int f1035 = C0412.f1023;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    @Deprecated
    public static final UUID f1036 = C0412.f1029;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static final C0579 f1037;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final C0405 f1038;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected final C0553 f1039;

    static {
        C0579 c0579 = new C0579(new C0407());
        f1037 = c0579;
        c0579.f1272 = Integer.MAX_VALUE;
    }

    public AbstractC0418(C0405 c0405, C0553 c0553) {
        this.f1038 = c0405;
        this.f1039 = c0553;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public AbstractC0552 m1592(AbstractC0552 abstractC0552) {
        AbstractC0552 abstractC0552M1809;
        C0553 c0553 = this.f1039;
        if (c0553 == null) {
            return abstractC0552;
        }
        synchronized (c0553) {
            abstractC0552M1809 = AbstractC0552.m1809(abstractC0552, this.f1039, new IdentityHashMap());
        }
        return abstractC0552M1809;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public abstract void mo1593();
}
