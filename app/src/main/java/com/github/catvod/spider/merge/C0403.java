package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢨ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0403 implements InterfaceC0402 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final String[] f988;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final C0403 f989;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final String[] f990;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final String[] f991;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private final String[] f992;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private final int f993;

    static {
        String[] strArr = new String[0];
        f988 = strArr;
        f989 = new C0403(strArr, strArr, strArr);
    }

    public C0403(String[] strArr, String[] strArr2) {
        this(strArr, strArr2, null);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0402
    /* JADX INFO: renamed from: Ϳ */
    public String mo1541(int i) {
        if (i >= 0) {
            String[] strArr = this.f991;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return SOY.d("3F1D17");
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0402
    /* JADX INFO: renamed from: Ԩ */
    public String mo1542(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f990;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0402
    /* JADX INFO: renamed from: ԩ */
    public String mo1543(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.f992;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String strMo1542 = mo1542(i);
        if (strMo1542 != null) {
            return strMo1542;
        }
        String strMo1541 = mo1541(i);
        return strMo1541 != null ? strMo1541 : Integer.toString(i);
    }

    public C0403(String[] strArr, String[] strArr2, String[] strArr3) {
        this.f990 = strArr == null ? f988 : strArr;
        this.f991 = strArr2 == null ? f988 : strArr2;
        this.f992 = strArr3 == null ? f988 : strArr3;
        this.f993 = Math.max(r3.length, Math.max(r1.length, r2.length)) - 1;
    }
}
