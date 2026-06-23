package com.github.catvod.spider.merge.A0;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aak extends pj {
    @Override // com.github.catvod.spider.merge.A0.pj
    public final Random d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        ko.e("current(...)", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
