package com.github.catvod.spider.merge.f1;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class H0 extends AbstractC1106W {
    private static final SimpleDateFormat k = new SimpleDateFormat("zzz");
    private static final SimpleDateFormat l = new SimpleDateFormat("MMMM d, yyyy h:mm:ss a z");
    private static final SimpleDateFormat m = new SimpleDateFormat("MMMM d, yyyy");
    private static final SimpleDateFormat n = new SimpleDateFormat("h:mm:ss a z");
    private double j;

    private H0() {
    }

    private static int A1(double d) {
        int i;
        int iF1 = F1(d);
        int iQ1 = ((int) (q1(d) - r1(iF1))) - 59;
        if (iQ1 < 0) {
            return iQ1 < -28 ? 0 : 1;
        }
        if (v1(iF1)) {
            if (iQ1 == 0) {
                return 1;
            }
            iQ1--;
        }
        int i2 = iQ1 / 30;
        switch (i2) {
            case 0:
                return 2;
            case 1:
                i = 31;
                break;
            case 2:
                i = 61;
                break;
            case 3:
                i = 92;
                break;
            case 4:
                i = 122;
                break;
            case 5:
                i = 153;
                break;
            case 6:
                i = 184;
                break;
            case 7:
                i = 214;
                break;
            case 8:
                i = 245;
                break;
            case 9:
                i = 275;
                break;
            case 10:
                return 11;
            default:
                C1162n0.c();
                throw null;
        }
        return iQ1 >= i ? i2 + 2 : i2 + 1;
    }

    private static int B1(double d) {
        double dFloor = Math.floor(d / 1000.0d) % 60.0d;
        if (dFloor < 0.0d) {
            dFloor += 60.0d;
        }
        return (int) dFloor;
    }

    private static double C1(double d) {
        if (Double.isNaN(d) || d == Double.POSITIVE_INFINITY || d == Double.NEGATIVE_INFINITY || Math.abs(d) > 8.64E15d) {
            return Double.NaN;
        }
        double d2 = d + 0.0d;
        return d > 0.0d ? Math.floor(d2) : Math.ceil(d2);
    }

    private static double D1(double d) {
        double d2 = d % 8.64E7d;
        return d2 < 0.0d ? d2 + 8.64E7d : d2;
    }

    private static int E1(double d) {
        double dQ1 = (q1(d) + 4.0d) % 7.0d;
        if (dQ1 < 0.0d) {
            dQ1 += 7.0d;
        }
        return (int) dQ1;
    }

    private static int F1(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return 0;
        }
        double dFloor = Math.floor(d / 3.1556952E10d) + 1970.0d;
        double dR1 = r1(dFloor) * 8.64E7d;
        if (dR1 > d) {
            dFloor -= 1.0d;
        } else {
            if ((((Double.isInfinite(dFloor) || Double.isNaN(dFloor)) ? Double.NaN : v1((int) dFloor) ? 366.0d : 365.0d) * 8.64E7d) + dR1 <= d) {
                dFloor += 1.0d;
            }
        }
        return (int) dFloor;
    }

    private static void G1(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            C1162n0.c();
            throw null;
        }
        int i3 = i2 - 1;
        int i4 = 1000000000;
        if (i < 10) {
            i4 = 1;
        } else if (i < 1000000000) {
            i4 = 1;
            while (true) {
                int i5 = i4 * 10;
                if (i < i5) {
                    break;
                }
                i3--;
                i4 = i5;
            }
        } else {
            i3 -= 9;
        }
        while (i3 > 0) {
            sb.append('0');
            i3--;
        }
        while (i4 != 1) {
            sb.append((char) ((i / i4) + 48));
            i %= i4;
            i4 /= 10;
        }
        sb.append((char) (i + 48));
    }

    private static void H1(StringBuilder sb, int i) {
        int i2 = i * 3;
        for (int i3 = 0; i3 != 3; i3++) {
            sb.append("JanFebMarAprMayJunJulAugSepOctNovDec".charAt(i2 + i3));
        }
    }

    private static void I1(StringBuilder sb, int i) {
        int i2 = i * 3;
        for (int i3 = 0; i3 != 3; i3++) {
            sb.append("SunMonTueWedThuFriSat".charAt(i2 + i3));
        }
    }

    private static String J1(C1185v c1185v, double d, int i) {
        StringBuilder sb = new StringBuilder(60);
        double dW1 = w1(c1185v, d);
        if (i != 3) {
            I1(sb, E1(dW1));
            sb.append(' ');
            H1(sb, A1(dW1));
            sb.append(' ');
            G1(sb, p1(dW1), 2);
            sb.append(' ');
            int iF1 = F1(dW1);
            if (iF1 < 0) {
                sb.append('-');
                iF1 = -iF1;
            }
            G1(sb, iF1, 4);
            if (i != 4) {
                sb.append(' ');
            }
        }
        if (i != 4) {
            G1(sb, u1(dW1), 2);
            sb.append(':');
            G1(sb, z1(dW1), 2);
            sb.append(':');
            G1(sb, B1(dW1), 2);
            double rawOffset = c1185v.r().getRawOffset();
            double dS1 = s1(c1185v, d);
            Double.isNaN(rawOffset);
            Double.isNaN(rawOffset);
            int iFloor = (int) Math.floor((rawOffset + dS1) / 60000.0d);
            int i2 = (iFloor % 60) + ((iFloor / 60) * 100);
            if (i2 > 0) {
                sb.append(" GMT+");
            } else {
                sb.append(" GMT-");
                i2 = -i2;
            }
            G1(sb, i2, 4);
            if (d < 0.0d) {
                d = x1(y1(t1(F1(dW1)), A1(d), p1(d)), D1(d));
            }
            sb.append(" (");
            Date date = new Date((long) d);
            SimpleDateFormat simpleDateFormat = k;
            synchronized (simpleDateFormat) {
                sb.append(simpleDateFormat.format(date));
            }
            sb.append(')');
        }
        return sb.toString();
    }

    private static double K1(Object[] objArr) {
        double[] dArr = new double[7];
        for (int i = 0; i < 7; i++) {
            if (i < objArr.length) {
                double dP1 = C1157l2.p1(objArr[i]);
                if (Double.isNaN(dP1) || Double.isInfinite(dP1)) {
                    return Double.NaN;
                }
                dArr[i] = C1157l2.l1(objArr[i]);
            } else if (i == 2) {
                dArr[i] = 1.0d;
            } else {
                dArr[i] = 0.0d;
            }
        }
        if (dArr[0] >= 0.0d && dArr[0] <= 99.0d) {
            dArr[0] = dArr[0] + 1900.0d;
        }
        return L1(dArr[0], dArr[1], dArr[2], dArr[3], dArr[4], dArr[5], dArr[6]);
    }

    private static double L1(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return x1(y1(d, d2, d3), (((((d4 * 60.0d) + d5) * 60.0d) + d6) * 1000.0d) + d7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double M1(com.github.catvod.spider.merge.f1.C1185v r46, java.lang.String r47) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.H0.M1(com.github.catvod.spider.merge.f1.v, java.lang.String):double");
    }

    static void O1(n2 n2Var) {
        H0 h0 = new H0();
        h0.j = Double.NaN;
        h0.Y0(47, n2Var, false);
    }

    private static double P1(C1185v c1185v, double d) {
        double rawOffset = c1185v.r().getRawOffset();
        Double.isNaN(rawOffset);
        double d2 = d - rawOffset;
        return d2 - s1(c1185v, d2);
    }

    private static int Q1(double d) {
        double d2 = d % 1000.0d;
        if (d2 < 0.0d) {
            d2 += 1000.0d;
        }
        return (int) d2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int p1(double r3) {
        /*
            int r0 = F1(r3)
            double r3 = q1(r3)
            double r1 = (double) r0
            double r1 = r1(r1)
            double r3 = r3 - r1
            int r3 = (int) r3
            int r3 = r3 + (-59)
            r4 = 31
            if (r3 >= 0) goto L1f
            r0 = -28
            if (r3 >= r0) goto L1a
            int r3 = r3 + r4
        L1a:
            int r3 = r3 + 28
            int r3 = r3 + 1
            return r3
        L1f:
            boolean r0 = v1(r0)
            if (r0 == 0) goto L2c
            if (r3 != 0) goto L2a
            r3 = 29
            return r3
        L2a:
            int r3 = r3 + (-1)
        L2c:
            int r0 = r3 / 30
            r1 = 275(0x113, float:3.85E-43)
            r2 = 30
            switch(r0) {
                case 0: goto L67;
                case 1: goto L5e;
                case 2: goto L5b;
                case 3: goto L56;
                case 4: goto L53;
                case 5: goto L4e;
                case 6: goto L49;
                case 7: goto L46;
                case 8: goto L41;
                case 9: goto L3e;
                case 10: goto L3a;
                default: goto L35;
            }
        L35:
            com.github.catvod.spider.merge.f1.C1162n0.c()
            r3 = 0
            throw r3
        L3a:
            int r3 = r3 - r1
            int r3 = r3 + 1
            return r3
        L3e:
            r4 = 275(0x113, float:3.85E-43)
            goto L60
        L41:
            r0 = 245(0xf5, float:3.43E-43)
            r4 = 245(0xf5, float:3.43E-43)
            goto L5e
        L46:
            r4 = 214(0xd6, float:3.0E-43)
            goto L60
        L49:
            r0 = 184(0xb8, float:2.58E-43)
            r4 = 184(0xb8, float:2.58E-43)
            goto L5e
        L4e:
            r0 = 153(0x99, float:2.14E-43)
            r4 = 153(0x99, float:2.14E-43)
            goto L5e
        L53:
            r4 = 122(0x7a, float:1.71E-43)
            goto L60
        L56:
            r0 = 92
            r4 = 92
            goto L5e
        L5b:
            r4 = 61
            goto L60
        L5e:
            r2 = 31
        L60:
            int r3 = r3 - r4
            if (r3 >= 0) goto L64
            int r3 = r3 + r2
        L64:
            int r3 = r3 + 1
            return r3
        L67:
            int r3 = r3 + 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.H0.p1(double):int");
    }

    private static double q1(double d) {
        return Math.floor(d / 8.64E7d);
    }

    private static double r1(double d) {
        return Math.floor((d - 1601.0d) / 400.0d) + ((Math.floor((d - 1969.0d) / 4.0d) + ((d - 1970.0d) * 365.0d)) - Math.floor((d - 1901.0d) / 100.0d));
    }

    private static double s1(C1185v c1185v, double d) {
        if (d < 0.0d) {
            d = x1(y1(t1(F1(d)), A1(d), p1(d)), D1(d));
        }
        return c1185v.r().inDaylightTime(new Date((long) d)) ? 3600000.0d : 0.0d;
    }

    private static int t1(int i) {
        int iR1 = (((int) r1(i)) + 4) % 7;
        if (iR1 < 0) {
            iR1 += 7;
        }
        if (v1(i)) {
            switch (iR1) {
                case 0:
                    return 1984;
                case 1:
                    return 1996;
                case 2:
                    return 1980;
                case 3:
                    return 1992;
                case 4:
                    return 1976;
                case 5:
                    return 1988;
                case 6:
                    return 1972;
            }
        }
        switch (iR1) {
            case 0:
                return 1978;
            case 1:
                return 1973;
            case 2:
                return 1985;
            case 3:
                return 1986;
            case 4:
                return 1981;
            case 5:
                return 1971;
            case 6:
                return 1977;
        }
        C1162n0.c();
        throw null;
    }

    private static int u1(double d) {
        double dFloor = Math.floor(d / 3600000.0d) % 24.0d;
        if (dFloor < 0.0d) {
            dFloor += 24.0d;
        }
        return (int) dFloor;
    }

    private static boolean v1(int i) {
        return i % 4 == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    private static double w1(C1185v c1185v, double d) {
        double rawOffset = c1185v.r().getRawOffset();
        Double.isNaN(rawOffset);
        return rawOffset + d + s1(c1185v, d);
    }

    private static double x1(double d, double d2) {
        return (d * 8.64E7d) + d2;
    }

    private static double y1(double d, double d2, double d3) {
        int i;
        int i2;
        double dFloor = Math.floor(d2 / 12.0d) + d;
        double d4 = d2 % 12.0d;
        if (d4 < 0.0d) {
            d4 += 12.0d;
        }
        double dFloor2 = Math.floor((r1(dFloor) * 8.64E7d) / 8.64E7d);
        int i3 = (int) d4;
        int i4 = (int) dFloor;
        int i5 = i3 * 30;
        if (i3 >= 7) {
            i2 = i3 / 2;
        } else {
            if (i3 < 2) {
                i = i5 + i3;
                if (i3 >= 2 && v1(i4)) {
                    i++;
                }
                double d5 = i;
                Double.isNaN(d5);
                return ((dFloor2 + d5) + d3) - 1.0d;
            }
            i2 = (i3 - 1) / 2;
        }
        i = (i2 - 1) + i5;
        if (i3 >= 2) {
            i++;
        }
        double d52 = i;
        Double.isNaN(d52);
        return ((dFloor2 + d52) + d3) - 1.0d;
    }

    private static int z1(double d) {
        double dFloor = Math.floor(d / 60000.0d) % 60.0d;
        if (dFloor < 0.0d) {
            dFloor += 60.0d;
        }
        return (int) dFloor;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Date";
    }

    final double N1() {
        return this.j;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void Z0(C1104U c1104u) {
        T0(c1104u, "Date", -3, "now", 0);
        T0(c1104u, "Date", -2, "parse", 1);
        T0(c1104u, "Date", -1, "UTC", 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.github.catvod.spider.merge.f1.C1104U r21, com.github.catvod.spider.merge.f1.C1185v r22, com.github.catvod.spider.merge.f1.n2 r23, com.github.catvod.spider.merge.f1.n2 r24, java.lang.Object[] r25) {
        /*
            Method dump skipped, instruction units count: 1512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.H0.c(com.github.catvod.spider.merge.f1.U, com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.Object[]):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "toLocaleString":
                return 5;
            case "getUTCMilliseconds":
                return 28;
            case "toSource":
                return 9;
            case "toString":
                return 2;
            case "setMilliseconds":
                return 31;
            case "constructor":
                return 1;
            case "toDateString":
                return 4;
            case "toGMTString":
            case "toUTCString":
                return 8;
            case "toTimeString":
                return 3;
            case "getSeconds":
                return 25;
            case "getDay":
                return 19;
            case "setUTCHours":
                return 38;
            case "setUTCMonth":
                return 42;
            case "setUTCMilliseconds":
                return 32;
            case "setFullYear":
                return 43;
            case "setUTCFullYear":
                return 44;
            case "getUTCHours":
                return 22;
            case "getUTCMonth":
                return 16;
            case "getFullYear":
                return 13;
            case "toJSON":
                return 47;
            case "getTimezoneOffset":
                return 29;
            case "setMinutes":
                return 35;
            case "getDate":
                return 17;
            case "getTime":
                return 11;
            case "getYear":
                return 12;
            case "getUTCDate":
                return 18;
            case "getUTCMinutes":
                return 24;
            case "valueOf":
                return 10;
            case "setSeconds":
                return 33;
            case "getUTCFullYear":
                return 14;
            case "getUTCDay":
                return 20;
            case "setUTCMinutes":
                return 36;
            case "toISOString":
                return 46;
            case "getUTCSeconds":
                return 26;
            case "toLocaleDateString":
                return 7;
            case "setHours":
                return 37;
            case "setMonth":
                return 41;
            case "toLocaleTimeString":
                return 6;
            case "getMilliseconds":
                return 27;
            case "setUTCSeconds":
                return 34;
            case "setUTCDate":
                return 40;
            case "getHours":
                return 21;
            case "getMonth":
                return 15;
            case "setDate":
                return 39;
            case "setTime":
                return 30;
            case "setYear":
                return 45;
            case "getMinutes":
                return 23;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2 = 0;
        switch (i) {
            case 1:
                i2 = 7;
                str = "constructor";
                j1("Date", i, str, i2);
                return;
            case 2:
                str = "toString";
                j1("Date", i, str, i2);
                return;
            case 3:
                str = "toTimeString";
                j1("Date", i, str, i2);
                return;
            case 4:
                str = "toDateString";
                j1("Date", i, str, i2);
                return;
            case 5:
                str = "toLocaleString";
                j1("Date", i, str, i2);
                return;
            case 6:
                str = "toLocaleTimeString";
                j1("Date", i, str, i2);
                return;
            case 7:
                str = "toLocaleDateString";
                j1("Date", i, str, i2);
                return;
            case 8:
                str = "toUTCString";
                j1("Date", i, str, i2);
                return;
            case 9:
                str = "toSource";
                j1("Date", i, str, i2);
                return;
            case 10:
                str = "valueOf";
                j1("Date", i, str, i2);
                return;
            case 11:
                str = "getTime";
                j1("Date", i, str, i2);
                return;
            case 12:
                str = "getYear";
                j1("Date", i, str, i2);
                return;
            case 13:
                str = "getFullYear";
                j1("Date", i, str, i2);
                return;
            case 14:
                str = "getUTCFullYear";
                j1("Date", i, str, i2);
                return;
            case 15:
                str = "getMonth";
                j1("Date", i, str, i2);
                return;
            case 16:
                str = "getUTCMonth";
                j1("Date", i, str, i2);
                return;
            case 17:
                str = "getDate";
                j1("Date", i, str, i2);
                return;
            case 18:
                str = "getUTCDate";
                j1("Date", i, str, i2);
                return;
            case 19:
                str = "getDay";
                j1("Date", i, str, i2);
                return;
            case 20:
                str = "getUTCDay";
                j1("Date", i, str, i2);
                return;
            case 21:
                str = "getHours";
                j1("Date", i, str, i2);
                return;
            case 22:
                str = "getUTCHours";
                j1("Date", i, str, i2);
                return;
            case 23:
                str = "getMinutes";
                j1("Date", i, str, i2);
                return;
            case 24:
                str = "getUTCMinutes";
                j1("Date", i, str, i2);
                return;
            case 25:
                str = "getSeconds";
                j1("Date", i, str, i2);
                return;
            case 26:
                str = "getUTCSeconds";
                j1("Date", i, str, i2);
                return;
            case 27:
                str = "getMilliseconds";
                j1("Date", i, str, i2);
                return;
            case 28:
                str = "getUTCMilliseconds";
                j1("Date", i, str, i2);
                return;
            case 29:
                str = "getTimezoneOffset";
                j1("Date", i, str, i2);
                return;
            case 30:
                str2 = "setTime";
                str = str2;
                i2 = 1;
                j1("Date", i, str, i2);
                return;
            case 31:
                str2 = "setMilliseconds";
                str = str2;
                i2 = 1;
                j1("Date", i, str, i2);
                return;
            case 32:
                str2 = "setUTCMilliseconds";
                str = str2;
                i2 = 1;
                j1("Date", i, str, i2);
                return;
            case 33:
                str3 = "setSeconds";
                str = str3;
                i2 = 2;
                j1("Date", i, str, i2);
                return;
            case 34:
                str3 = "setUTCSeconds";
                str = str3;
                i2 = 2;
                j1("Date", i, str, i2);
                return;
            case 35:
                str4 = "setMinutes";
                str = str4;
                i2 = 3;
                j1("Date", i, str, i2);
                return;
            case 36:
                str4 = "setUTCMinutes";
                str = str4;
                i2 = 3;
                j1("Date", i, str, i2);
                return;
            case 37:
                str5 = "setHours";
                str = str5;
                i2 = 4;
                j1("Date", i, str, i2);
                return;
            case 38:
                str5 = "setUTCHours";
                str = str5;
                i2 = 4;
                j1("Date", i, str, i2);
                return;
            case 39:
                str2 = "setDate";
                str = str2;
                i2 = 1;
                j1("Date", i, str, i2);
                return;
            case 40:
                str2 = "setUTCDate";
                str = str2;
                i2 = 1;
                j1("Date", i, str, i2);
                return;
            case 41:
                str3 = "setMonth";
                str = str3;
                i2 = 2;
                j1("Date", i, str, i2);
                return;
            case 42:
                str3 = "setUTCMonth";
                str = str3;
                i2 = 2;
                j1("Date", i, str, i2);
                return;
            case 43:
                str4 = "setFullYear";
                str = str4;
                i2 = 3;
                j1("Date", i, str, i2);
                return;
            case 44:
                str4 = "setUTCFullYear";
                str = str4;
                i2 = 3;
                j1("Date", i, str, i2);
                return;
            case 45:
                str2 = "setYear";
                str = str2;
                i2 = 1;
                j1("Date", i, str, i2);
                return;
            case 46:
                str = "toISOString";
                j1("Date", i, str, i2);
                return;
            case 47:
                str2 = "toJSON";
                str = str2;
                i2 = 1;
                j1("Date", i, str, i2);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final Object m(Class<?> cls) {
        if (cls == null) {
            cls = C1157l2.l;
        }
        return super.m(cls);
    }
}
