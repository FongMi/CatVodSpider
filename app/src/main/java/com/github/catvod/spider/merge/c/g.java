package com.github.catvod.spider.merge.C;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class g extends com.github.catvod.spider.merge.J.b {
    public static final g a = new g();

    @Override // com.github.catvod.spider.merge.J.b
    public final boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // com.github.catvod.spider.merge.J.b
    public final int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
