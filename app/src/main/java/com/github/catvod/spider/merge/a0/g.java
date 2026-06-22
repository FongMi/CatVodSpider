package com.github.catvod.spider.merge.A0;

import com.github.catvod.spider.merge.y.C1416e;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g extends f {
    public g(C1416e c1416e, boolean z, String str) {
        super(c1416e, z, str);
        c1416e.s("audioSampleRate");
        c1416e.s("averageBitrate");
        if (c1416e.containsKey("audioQuality")) {
            try {
                com.github.catvod.spider.merge.B0.a.valueOf(c1416e.x("audioQuality").split("_")[r1.length - 1].toLowerCase());
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
