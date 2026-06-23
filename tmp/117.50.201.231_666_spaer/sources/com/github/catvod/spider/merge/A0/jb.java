package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class jb extends il {
    public final my f = new my(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof jb) && ((jb) obj).f.equals(this.f));
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
