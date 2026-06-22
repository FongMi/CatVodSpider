package com.github.catvod.spider.merge.y0;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1435a {
    private static final Pattern a = Pattern.compile("&fmt=[^&]*");
    private static final Pattern b = Pattern.compile("&tlang=[^&]*");

    public C1435a(String str) {
        b.matcher(a.matcher(str).replaceAll("")).replaceAll("");
    }
}
