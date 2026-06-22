package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class K1 extends AbstractC1106W {
    private CharSequence j;

    K1(CharSequence charSequence) {
        this.j = charSequence;
    }

    private static int q1(int i, String str, Object[] objArr) {
        String strY1 = C1157l2.y1(objArr);
        double dM1 = C1157l2.m1(objArr, 1);
        if (i != 42 && i != 43 && strY1.length() == 0) {
            return dM1 > ((double) str.length()) ? str.length() : (int) dM1;
        }
        if (i != 42 && i != 43 && dM1 > str.length()) {
            return -1;
        }
        if (dM1 < 0.0d) {
            dM1 = 0.0d;
        } else if (dM1 > str.length() || (i == 43 && (Double.isNaN(dM1) || dM1 > str.length()))) {
            dM1 = str.length();
        }
        if (43 != i) {
            return i == 42 ? str.startsWith(strY1, (int) dM1) ? 0 : -1 : str.indexOf(strY1, (int) dM1);
        }
        if (objArr.length == 0 || objArr.length == 1 || (objArr.length == 2 && objArr[1] == G2.b)) {
            dM1 = str.length();
        }
        return str.substring(0, (int) dM1).endsWith(strY1) ? 0 : -1;
    }

    private static String r1(C1185v c1185v, n2 n2Var, C1104U c1104u, String str, String str2, Object[] objArr) {
        C1162n0.i(n2Var, c1104u);
        String strX1 = C1157l2.x1(n2Var);
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append(str);
        if (str2 != null && str2.length() > 0) {
            String strReplace = C1157l2.y1(objArr).replace("\"", "&quot;");
            sb.append(' ');
            sb.append(str2);
            sb.append("=\"");
            sb.append(strReplace);
            sb.append('\"');
        }
        sb.append('>');
        sb.append(strX1);
        sb.append("</");
        sb.append(str);
        sb.append('>');
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "String";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void Z0(C1104U c1104u) {
        T0(c1104u, "String", -1, "fromCharCode", 1);
        T0(c1104u, "String", -2, "fromCodePoint", 1);
        T0(c1104u, "String", -3, "raw", 1);
        T0(c1104u, "String", -5, "charAt", 2);
        T0(c1104u, "String", -6, "charCodeAt", 2);
        T0(c1104u, "String", -7, "indexOf", 2);
        T0(c1104u, "String", -8, "lastIndexOf", 2);
        T0(c1104u, "String", -9, "split", 3);
        T0(c1104u, "String", -10, "substring", 3);
        T0(c1104u, "String", -11, "toLowerCase", 1);
        T0(c1104u, "String", -12, "toUpperCase", 1);
        T0(c1104u, "String", -13, "substr", 3);
        T0(c1104u, "String", -14, "concat", 2);
        T0(c1104u, "String", -15, "slice", 3);
        T0(c1104u, "String", -30, "equalsIgnoreCase", 2);
        T0(c1104u, "String", -31, "match", 2);
        T0(c1104u, "String", -32, "search", 2);
        T0(c1104u, "String", -33, "replace", 2);
        T0(c1104u, "String", -34, "replaceAll", 2);
        T0(c1104u, "String", -35, "localeCompare", 2);
        T0(c1104u, "String", -36, "toLocaleLowerCase", 1);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int a1(String str) {
        return str.equals("length") ? 458753 : 0;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int b1(w2 w2Var) {
        return x2.c.equals(w2Var) ? 49 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final java.lang.Object c(com.github.catvod.spider.merge.f1.C1104U r19, com.github.catvod.spider.merge.f1.C1185v r20, com.github.catvod.spider.merge.f1.n2 r21, com.github.catvod.spider.merge.f1.n2 r22, java.lang.Object[] r23) {
        /*
            Method dump skipped, instruction units count: 1952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.K1.c(com.github.catvod.spider.merge.f1.U, com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.Object[]):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "toSource":
                return 3;
            case "toString":
                return 2;
            case "constructor":
                return 1;
            case "startsWith":
                return 42;
            case "fontcolor":
                return 26;
            case "toLocaleLowerCase":
                return 36;
            case "anchor":
                return 28;
            case "charAt":
                return 5;
            case "concat":
                return 14;
            case "codePointAt":
                return 46;
            case "equals":
                return 29;
            case "replaceAll":
                return 34;
            case "toLowerCase":
                return 11;
            case "trimEnd":
                return 51;
            case "padEnd":
                return 48;
            case "repeat":
                return 45;
            case "search":
                return 32;
            case "strike":
                return 19;
            case "substr":
                return 13;
            case "toLocaleUpperCase":
                return 37;
            case "trimRight":
                return 40;
            case "trimStart":
                return 50;
            case "lastIndexOf":
                return 8;
            case "toUpperCase":
                return 12;
            case "at":
                return 52;
            case "big":
                return 21;
            case "sub":
                return 24;
            case "sup":
                return 23;
            case "bold":
                return 16;
            case "link":
                return 27;
            case "trim":
                return 38;
            case "includes":
                return 41;
            case "blink":
                return 22;
            case "fixed":
                return 18;
            case "match":
                return 31;
            case "slice":
                return 15;
            case "small":
                return 20;
            case "split":
                return 9;
            case "valueOf":
                return 4;
            case "normalize":
                return 44;
            case "equalsIgnoreCase":
                return 30;
            case "fontsize":
                return 25;
            case "charCodeAt":
                return 6;
            case "substring":
                return 10;
            case "padStart":
                return 47;
            case "localeCompare":
                return 35;
            case "replace":
                return 33;
            case "trimLeft":
                return 39;
            case "endsWith":
                return 43;
            case "indexOf":
                return 7;
            case "italics":
                return 17;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final String e1(int i) {
        if (i == 1) {
            return "length";
        }
        super.e1(i);
        throw null;
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    public final int f0(int i) {
        if (i < 0 || i >= this.j.length()) {
            return super.f0(i);
        }
        C1185v.h();
        return 7;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final Object f1(int i) {
        if (i != 1) {
            super.f1(i);
            throw null;
        }
        int length = this.j.length();
        Class<?> cls = C1157l2.a;
        return Integer.valueOf(length);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int g1() {
        return 1;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        if (i == 49) {
            i1("String", i, x2.c, "[Symbol.iterator]", 0);
            return;
        }
        switch (i) {
            case 1:
                str = "constructor";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 2:
                str2 = "toString";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 3:
                str2 = "toSource";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 4:
                str2 = "valueOf";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 5:
                str = "charAt";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 6:
                str = "charCodeAt";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 7:
                str = "indexOf";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 8:
                str = "lastIndexOf";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 9:
                str3 = "split";
                str4 = str3;
                i2 = 2;
                k1("String", i, str4, null, i2);
                return;
            case 10:
                str3 = "substring";
                str4 = str3;
                i2 = 2;
                k1("String", i, str4, null, i2);
                return;
            case 11:
                str2 = "toLowerCase";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 12:
                str2 = "toUpperCase";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 13:
                str3 = "substr";
                str4 = str3;
                i2 = 2;
                k1("String", i, str4, null, i2);
                return;
            case 14:
                str = "concat";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 15:
                str3 = "slice";
                str4 = str3;
                i2 = 2;
                k1("String", i, str4, null, i2);
                return;
            case 16:
                str2 = "bold";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 17:
                str2 = "italics";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 18:
                str2 = "fixed";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 19:
                str2 = "strike";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 20:
                str2 = "small";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 21:
                str2 = "big";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 22:
                str2 = "blink";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 23:
                str2 = "sup";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 24:
                str2 = "sub";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 25:
                str2 = "fontsize";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 26:
                str2 = "fontcolor";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 27:
                str2 = "link";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 28:
                str2 = "anchor";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 29:
                str = "equals";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 30:
                str = "equalsIgnoreCase";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 31:
                str = "match";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 32:
                str = "search";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 33:
                str3 = "replace";
                str4 = str3;
                i2 = 2;
                k1("String", i, str4, null, i2);
                return;
            case 34:
                str3 = "replaceAll";
                str4 = str3;
                i2 = 2;
                k1("String", i, str4, null, i2);
                return;
            case 35:
                str = "localeCompare";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 36:
                str2 = "toLocaleLowerCase";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 37:
                str2 = "toLocaleUpperCase";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 38:
                str2 = "trim";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 39:
                str2 = "trimLeft";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 40:
                str2 = "trimRight";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 41:
                str = "includes";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 42:
                str = "startsWith";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 43:
                str = "endsWith";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 44:
                str2 = "normalize";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 45:
                str = "repeat";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 46:
                str = "codePointAt";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 47:
                str = "padStart";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 48:
                str = "padEnd";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
            case 49:
            default:
                throw new IllegalArgumentException(String.valueOf(i));
            case 50:
                str2 = "trimStart";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 51:
                str2 = "trimEnd";
                str4 = str2;
                i2 = 0;
                k1("String", i, str4, null, i2);
                return;
            case 52:
                str = "at";
                str4 = str;
                i2 = 1;
                k1("String", i, str4, null, i2);
                return;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2
    protected final Object[] o0(boolean z, boolean z2) {
        C1185v.i();
        return super.o0(z, z2);
    }

    final int p1() {
        return this.j.length();
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2
    protected final p2 q0(C1185v c1185v, Object obj) {
        boolean z = obj instanceof w2;
        return super.q0(c1185v, obj);
    }

    public final CharSequence s1() {
        return this.j;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void t(int i, n2 n2Var, Object obj) {
        if (i < 0 || i >= this.j.length()) {
            super.t(i, n2Var, obj);
        }
    }

    public final String toString() {
        CharSequence charSequence = this.j;
        return charSequence instanceof String ? (String) charSequence : charSequence.toString();
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final Object w(int i, n2 n2Var) {
        return (i < 0 || i >= this.j.length()) ? super.w(i, n2Var) : String.valueOf(this.j.charAt(i));
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final boolean z(int i, n2 n2Var) {
        if (i < 0 || i >= this.j.length()) {
            return super.z(i, n2Var);
        }
        return true;
    }
}
