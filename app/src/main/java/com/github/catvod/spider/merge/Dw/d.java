package com.github.catvod.spider.merge.Dw;

import java.util.Stack;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d extends ThreadLocal<Stack<StringBuilder>> {
    @Override // java.lang.ThreadLocal
    protected final Stack<StringBuilder> initialValue() {
        return new Stack<>();
    }
}
