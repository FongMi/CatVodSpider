package com.github.catvod.spider.merge.B;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class m extends a {
    public static final m a = new m();

    @Override // com.github.catvod.spider.merge.B.a
    public final boolean E(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // com.github.catvod.spider.merge.B.a
    public final int F(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
