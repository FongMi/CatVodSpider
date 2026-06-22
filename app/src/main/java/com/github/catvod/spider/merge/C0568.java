package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၸ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0568 extends AbstractC0552 {

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public final AbstractC0552 f1257;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public final int f1258;

    C0568(AbstractC0552 abstractC0552, int i) {
        super(abstractC0552 != null ? AbstractC0552.m1805(abstractC0552, i) : AbstractC0552.m1804());
        this.f1257 = abstractC0552;
        this.f1258 = i;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public static C0568 m1839(AbstractC0552 abstractC0552, int i) {
        return (i == Integer.MAX_VALUE && abstractC0552 == null) ? AbstractC0552.f1232 : new C0568(abstractC0552, i);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0552
    public boolean equals(Object obj) {
        AbstractC0552 abstractC0552;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0568) || hashCode() != obj.hashCode()) {
            return false;
        }
        C0568 c0568 = (C0568) obj;
        return this.f1258 == c0568.f1258 && (abstractC0552 = this.f1257) != null && abstractC0552.equals(c0568.f1257);
    }

    public String toString() {
        AbstractC0552 abstractC0552 = this.f1257;
        String string = abstractC0552 != null ? abstractC0552.toString() : "";
        if (string.length() == 0) {
            int i = this.f1258;
            return i == Integer.MAX_VALUE ? SOY.d("5E") : String.valueOf(i);
        }
        return String.valueOf(this.f1258) + SOY.d("5A") + string;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0552
    /* JADX INFO: renamed from: ԭ */
    public AbstractC0552 mo1606(int i) {
        return this.f1257;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0552
    /* JADX INFO: renamed from: Ԯ */
    public int mo1607(int i) {
        return this.f1258;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0552
    /* JADX INFO: renamed from: ރ */
    public int mo1609() {
        return 1;
    }
}
