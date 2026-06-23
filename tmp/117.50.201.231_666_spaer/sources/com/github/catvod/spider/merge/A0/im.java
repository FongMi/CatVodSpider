package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class im extends uz implements Cloneable {
    public String b;

    @Override // com.github.catvod.spider.merge.A0.uz
    public final void a() {
        this.b = null;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final im clone() {
        try {
            return (im) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.b;
    }
}
