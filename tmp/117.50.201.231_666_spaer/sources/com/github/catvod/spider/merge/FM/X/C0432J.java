package com.github.catvod.spider.merge.FM.x;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0432J implements InterfaceC0431I {
    private static final String[] d;
    public static final C0432J e;
    private final String[] a;
    private final String[] b;
    private final String[] c;

    static {
        String[] strArr = new String[0];
        d = strArr;
        e = new C0432J(strArr, strArr, strArr);
    }

    public C0432J(String[] strArr, String[] strArr2, String[] strArr3) {
        this.a = strArr;
        this.b = strArr2;
        strArr3 = strArr3 == null ? d : strArr3;
        this.c = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    public final String a(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.c;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String strB = b(i);
        if (strB != null) {
            return strB;
        }
        String strC = c(i);
        return strC != null ? strC : Integer.toString(i);
    }

    public final String b(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.a;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public final String c(int i) {
        if (i >= 0) {
            String[] strArr = this.b;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }
}
