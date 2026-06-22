package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class t0 {
    public AbstractC0294m a;

    static {
        Collections.unmodifiableList(Arrays.asList(oZP.d("3C212100201C31"), oZP.d("303F2408201A3B"), oZP.d("272E390629"), oZP.d("273A3B04"), oZP.d("253D32052516343B32"), oZP.d("343B380C"), oZP.d("342C2308231B"), oZP.d("262A23"), oZP.d("3B20231E3F1021"), oZP.d("22263B052F14272B"), oZP.d("253D3202291130213404")));
        Collections.unmodifiableMap(new s0());
    }

    protected t0(AbstractC0294m abstractC0294m) {
        if (abstractC0294m == null) {
            throw new NullPointerException(oZP.d("010E05260921550C162F023A014F15244C3B00031B6F"));
        }
        this.a = abstractC0294m;
    }

    public abstract int a();

    public boolean b() {
        return this instanceof C0296o;
    }

    public com.github.catvod.spider.merge.B.k c() {
        return null;
    }

    public abstract boolean d(int i, int i2);
}
