package com.github.catvod.spider.merge.b1;

import java.util.Stack;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0905b extends ThreadLocal<Stack<StringBuilder>> {
    C0905b() {
    }

    @Override // java.lang.ThreadLocal
    protected final Stack<StringBuilder> initialValue() {
        return new Stack<>();
    }
}
