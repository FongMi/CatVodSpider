package com.github.catvod.spider.merge.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1429s extends AbstractC1409A {
    private final String e;
    private final String f;
    private final String[] g;
    private final int h;
    private final boolean i;

    public C1429s(String str, boolean z, String str2, String str3, String[] strArr, boolean z2) {
        super(str, z);
        this.e = str2;
        this.f = str3;
        this.g = strArr;
        this.i = z2;
        int length = str2 != null ? str2.length() + 0 : 0;
        length = str3 != null ? length + str3.length() : length;
        if (strArr != null) {
            for (String str4 : strArr) {
                length += str4.length();
            }
        }
        this.h = length;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1420i
    public final boolean a(N n, Object obj, Object obj2, Object obj3) {
        int length;
        Object objB = b(n, obj, obj3);
        if (objB == null) {
            return false;
        }
        String string = objB.toString();
        if (string.length() < this.h) {
            return this.i;
        }
        String str = this.e;
        if (str == null) {
            length = 0;
        } else {
            if (!string.startsWith(str)) {
                return this.i;
            }
            length = this.e.length() + 0;
        }
        String[] strArr = this.g;
        if (strArr != null) {
            for (String str2 : strArr) {
                int iIndexOf = string.indexOf(str2, length);
                if (iIndexOf == -1) {
                    return this.i;
                }
                length = iIndexOf + str2.length();
            }
        }
        String str3 = this.f;
        return (str3 == null || string.endsWith(str3)) ? !this.i : this.i;
    }
}
