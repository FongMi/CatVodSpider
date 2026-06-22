package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˇ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0121 extends AbstractC0581<Object> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final C0121 f308 = new C0121();

    @Override // com.github.catvod.spider.merge.InterfaceC0587
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public boolean mo412(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0587
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public int mo413(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
