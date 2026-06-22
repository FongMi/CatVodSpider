package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʵ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0107 extends C0129 {
    public C0107(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static C0107 m383(int i, int i2) {
        return new C0107(i, i2, false);
    }

    @Override // com.github.catvod.spider.merge.C0129
    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected String mo384(int i) {
        char[] chars = Character.toChars(i);
        StringBuilder sb = new StringBuilder();
        String strD = SOY.d("2627");
        sb.append(strD);
        sb.append(AbstractC0108.m385(chars[0]));
        sb.append(strD);
        sb.append(AbstractC0108.m385(chars[1]));
        return sb.toString();
    }
}
