package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၽ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0573 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final List<String> f1261 = Collections.unmodifiableList(Arrays.asList(SOY.d("331C0737383E3E"), SOY.d("3F02023F383834"), SOY.d("28131F3131"), SOY.d("28071D33"), SOY.d("2A0014323D343B0614"), SOY.d("3B061E3B"), SOY.d("3B11053F3B39"), SOY.d("291705"), SOY.d("341D052927322E"), SOY.d("2D1B1D3237362816"), SOY.d("2A00143531333F1C1233")));

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final Map<Class<? extends AbstractC0573>, Integer> f1262 = Collections.unmodifiableMap(new C0574());

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public AbstractC0419 f1263;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ၽ$Ϳ, reason: contains not printable characters */
    static class C0574 extends HashMap<Class<? extends AbstractC0573>, Integer> {
        C0574() {
            put(C0431.class, 1);
            put(C0557.class, 2);
            put(C0560.class, 3);
            put(C0551.class, 4);
            put(C0424.class, 5);
            put(C0422.class, 6);
            put(C0567.class, 7);
            put(C0544.class, 8);
            put(C0575.class, 9);
            put(C0550.class, 10);
        }
    }

    protected AbstractC0573(AbstractC0419 abstractC0419) {
        if (abstractC0419 == null) {
            throw new NullPointerException(SOY.d("0E33231111035A3130181A180E72331354190F3E3D58"));
        }
        this.f1263 = abstractC0419;
    }

    /* JADX INFO: renamed from: Ϳ */
    public abstract int mo1603();

    /* JADX INFO: renamed from: Ԩ */
    public boolean mo1604() {
        return false;
    }

    /* JADX INFO: renamed from: ԩ */
    public C0245 mo1610() {
        return null;
    }

    /* JADX INFO: renamed from: Ԫ */
    public abstract boolean mo1605(int i, int i2, int i3);
}
