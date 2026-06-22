package com.github.catvod.spider.merge.XU;

import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class m extends ThreadLocal<Stack<StringBuilder>> {
    m() {
    }

    @Override // java.lang.ThreadLocal
    protected final Stack<StringBuilder> initialValue() {
        return new Stack<>();
    }
}
