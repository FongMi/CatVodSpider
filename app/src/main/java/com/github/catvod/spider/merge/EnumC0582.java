package com.github.catvod.spider.merge;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Ϳ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.github.catvod.spider.merge.Ⴡ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class EnumC0582 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final EnumC0582 f1282;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final EnumC0582 f1283;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static final EnumC0582 f1284;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static final EnumC0582 f1285;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static final EnumC0582 f1286;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static final /* synthetic */ EnumC0582[] f1287;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private int f1288;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private String f1289;

    static {
        String strD = SOY.d("3F00033926");
        EnumC0582 enumC0582 = new EnumC0582(strD, 0, 40, strD);
        f1282 = enumC0582;
        String strD2 = SOY.d("2D130338");
        EnumC0582 enumC05822 = new EnumC0582(strD2, 1, 30, strD2);
        f1283 = enumC05822;
        String strD3 = SOY.d("331C1739");
        EnumC0582 enumC05823 = new EnumC0582(strD3, 2, 20, strD3);
        f1284 = enumC05823;
        String strD4 = SOY.d("3E17132333");
        EnumC0582 enumC05824 = new EnumC0582(strD4, 3, 10, strD4);
        f1285 = enumC05824;
        String strD5 = SOY.d("2E00103531");
        EnumC0582 enumC05825 = new EnumC0582(strD5, 4, 0, strD5);
        f1286 = enumC05825;
        f1287 = new EnumC0582[]{enumC0582, enumC05822, enumC05823, enumC05824, enumC05825};
    }

    private EnumC0582(String str, int i, int i2, String str2) {
        this.f1288 = i2;
        this.f1289 = str2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1289;
    }
}
