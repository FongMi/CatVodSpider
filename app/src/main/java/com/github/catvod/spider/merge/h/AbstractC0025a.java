package com.github.catvod.spider.merge.H;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class AbstractC0025a {
    public static final C0027c a;

    static {
        Pattern pattern = C.a;
        C0027c.a("yyyy-MM-dd'T'HH:mm:ss");
        a = C0027c.a("yyyy-MM-dd'T'HH:mm:ssZZ");
        C0027c.a("yyyy-MM-dd");
        C0027c.a("yyyy-MM-ddZZ");
        C0027c.a("'T'HH:mm:ss");
        C0027c.a("'T'HH:mm:ssZZ");
        C0027c.a("HH:mm:ss");
        C0027c.a("HH:mm:ssZZ");
    }
}
