package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ts implements xl {
    public static final ts a = new ts();

    @Override // com.github.catvod.spider.merge.A0.xl
    public final yg getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
