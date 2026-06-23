package com.github.catvod.spider.merge.FM.A;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class m extends a {
    public static final m a = new m();

    @Override // com.github.catvod.spider.merge.FM.A.a
    public final boolean E(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // com.github.catvod.spider.merge.FM.A.a
    public final int F(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
