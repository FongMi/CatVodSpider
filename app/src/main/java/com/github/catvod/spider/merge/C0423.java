package com.github.catvod.spider.merge;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢴ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0423 extends AbstractC0552 {

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public final AbstractC0552[] f1053;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public final int[] f1054;

    public C0423(C0568 c0568) {
        this(new AbstractC0552[]{c0568.f1257}, new int[]{c0568.f1258});
    }

    @Override // com.github.catvod.spider.merge.AbstractC0552
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0423) || hashCode() != obj.hashCode()) {
            return false;
        }
        C0423 c0423 = (C0423) obj;
        return Arrays.equals(this.f1054, c0423.f1054) && Arrays.equals(this.f1053, c0423.f1053);
    }

    public String toString() {
        if (mo1608()) {
            return SOY.d("210F");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SOY.d("21"));
        for (int i = 0; i < this.f1054.length; i++) {
            if (i > 0) {
                sb.append(SOY.d("5672"));
            }
            int[] iArr = this.f1054;
            if (iArr[i] == Integer.MAX_VALUE) {
                sb.append(SOY.d("5E"));
            } else {
                sb.append(iArr[i]);
                if (this.f1053[i] != null) {
                    sb.append(' ');
                    sb.append(this.f1053[i].toString());
                } else {
                    sb.append(SOY.d("14273D1A"));
                }
            }
        }
        sb.append(SOY.d("27"));
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0552
    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public AbstractC0552 mo1606(int i) {
        return this.f1053[i];
    }

    @Override // com.github.catvod.spider.merge.AbstractC0552
    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public int mo1607(int i) {
        return this.f1054[i];
    }

    @Override // com.github.catvod.spider.merge.AbstractC0552
    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public boolean mo1608() {
        return this.f1054[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0552
    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public int mo1609() {
        return this.f1054.length;
    }

    public C0423(AbstractC0552[] abstractC0552Arr, int[] iArr) {
        super(AbstractC0552.m1806(abstractC0552Arr, iArr));
        this.f1053 = abstractC0552Arr;
        this.f1054 = iArr;
    }
}
