package com.github.catvod.spider.merge.K;

import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class a extends ThreadLocal<Stack<StringBuilder>> {
    a() {
    }

    @Override // java.lang.ThreadLocal
    protected final Stack<StringBuilder> initialValue() {
        return new Stack<>();
    }
}
