package com.github.catvod.spider.merge.v;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.v.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final /* synthetic */ class C1396b {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EnumC1397c.values().length];
        b = iArr;
        try {
            iArr[EnumC1397c.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[EnumC1397c.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[EnumC1397c.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[EnumC1397c.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[EnumC1397c.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[EnumC1397c.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[EnumC1397c.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[d.values().length];
        a = iArr2;
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[3] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[4] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[0] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[1] = 5;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
