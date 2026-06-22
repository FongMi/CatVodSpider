package com.github.catvod.spider.merge.Bk;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class m extends a {
    public static final m a = new m();

    @Override // com.github.catvod.spider.merge.Bk.a
    public final boolean E(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // com.github.catvod.spider.merge.Bk.a
    public final int F(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
