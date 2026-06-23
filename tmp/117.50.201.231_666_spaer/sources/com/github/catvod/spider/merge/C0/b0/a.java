package com.github.catvod.spider.merge.C0.b0;

import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class a extends ThreadLocal<Stack<StringBuilder>> {
    a() {
    }

    @Override // java.lang.ThreadLocal
    protected final Stack<StringBuilder> initialValue() {
        return new Stack<>();
    }
}
