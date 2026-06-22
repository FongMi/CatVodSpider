package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class t implements Serializable {
    static final Locale g;
    private static final Comparator<String> h;
    private static final ConcurrentMap<Locale, AbstractC0715o>[] i;
    private static final C0705e j;
    private static final C0706f k;
    private static final C0713m l;
    private static final C0713m m;
    private static final C0713m n;
    private static final C0713m o;
    private static final C0713m p;
    private static final C0707g q;
    private static final C0713m r;
    private static final C0713m s;
    private static final C0708h t;
    private static final C0709i u;
    private static final C0713m v;
    private static final C0713m w;
    private static final C0713m x;
    private static final C0713m y;
    private final String a;
    private final TimeZone b;
    private final Locale c;
    private final int d;
    private final int e;
    private transient List<C0716p> f;

    static {
        String strD = ZrJ.d("1322");
        String strD2 = ZrJ.d("3313");
        g = new Locale(strD, strD2, strD2);
        h = Comparator.reverseOrder();
        i = new ConcurrentMap[17];
        j = new C0705e();
        k = new C0706f();
        l = new C0713m(1);
        m = new C0713m(3);
        n = new C0713m(4);
        o = new C0713m(6);
        p = new C0713m(5);
        q = new C0707g();
        r = new C0713m(8);
        s = new C0713m(11);
        t = new C0708h();
        u = new C0709i();
        v = new C0713m(10);
        w = new C0713m(12);
        x = new C0713m(13);
        y = new C0713m(14);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.HN.p>] */
    protected t(String str, TimeZone timeZone, Locale locale) {
        int i2;
        this.a = str;
        this.b = timeZone;
        Locale localeA = com.github.catvod.spider.merge.VE.c.a(locale);
        this.c = localeA;
        Calendar calendar = Calendar.getInstance(timeZone, localeA);
        if (localeA.equals(g)) {
            i2 = 0;
        } else {
            calendar.setTime(new Date());
            i2 = calendar.get(1) - 80;
        }
        int i3 = (i2 / 100) * 100;
        this.d = i3;
        this.e = i2 - i3;
        this.f = new ArrayList();
        C0717q c0717q = new C0717q(this, calendar);
        while (true) {
            C0716p c0716pA = c0717q.a();
            if (c0716pA == null) {
                return;
            } else {
                this.f.add(c0716pA);
            }
        }
    }

    static AbstractC0715o b(t tVar, char c, int i2, Calendar calendar) {
        int i3;
        tVar.getClass();
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case 'D':
                        return o;
                    case 'E':
                        i3 = 7;
                        break;
                    case 'F':
                        return r;
                    case 'G':
                        i3 = 0;
                        break;
                    case 'H':
                        return s;
                    default:
                        switch (c) {
                            case 'K':
                                return v;
                            case 'M':
                                return i2 >= 3 ? tVar.g(2, calendar) : k;
                            case 'S':
                                return y;
                            case 'a':
                                i3 = 9;
                                break;
                            case 'd':
                                return p;
                            case 'h':
                                return u;
                            case 'k':
                                return t;
                            case 'm':
                                return w;
                            case 's':
                                return x;
                            case 'u':
                                return q;
                            case 'w':
                                return m;
                            default:
                                switch (c) {
                                    case 'W':
                                        return n;
                                    case 'X':
                                        return C0712l.e(i2);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i2 == 2) {
                                            return C0712l.d;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException(ZrJ.d("3F2C392029315964") + c + ZrJ.d("5E6325223C650A363B3D27370D262F"));
                                }
                                i3 = 15;
                                break;
                        }
                        break;
                }
            } else {
                i3 = 15;
            }
            return tVar.g(i3, calendar);
        }
        return i2 > 2 ? l : j;
    }

    static Map c(Calendar calendar, Locale locale, int i2, StringBuilder sb) {
        HashMap map = new HashMap();
        Locale localeA = com.github.catvod.spider.merge.VE.c.a(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i2, 0, localeA);
        TreeSet treeSet = new TreeSet(h);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(localeA);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            j(sb, (String) it.next());
            sb.append('|');
        }
        return map;
    }

    static int d(t tVar, int i2) {
        int i3 = tVar.d + i2;
        return i2 >= tVar.e ? i3 : i3 + 100;
    }

    static /* synthetic */ StringBuilder f(StringBuilder sb, String str) {
        j(sb, str);
        return sb;
    }

    private AbstractC0715o g(int i2, Calendar calendar) {
        ConcurrentMap<Locale, AbstractC0715o> concurrentMap;
        ConcurrentMap<Locale, AbstractC0715o>[] concurrentMapArr = i;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i2] == null) {
                concurrentMapArr[i2] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i2];
        }
        AbstractC0715o sVar = concurrentMap.get(this.c);
        if (sVar == null) {
            sVar = i2 == 15 ? new s(this.c) : new C0710j(i2, calendar, this.c);
            AbstractC0715o abstractC0715oPutIfAbsent = concurrentMap.putIfAbsent(this.c, sVar);
            if (abstractC0715oPutIfAbsent != null) {
                return abstractC0715oPutIfAbsent;
            }
        }
        return sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.StringBuilder j(java.lang.StringBuilder r6, java.lang.String r7) {
        /*
            r0 = 0
        L1:
            int r1 = r7.length()
            r2 = 63
            r3 = 46
            if (r0 >= r1) goto L38
            char r1 = r7.charAt(r0)
            r4 = 36
            r5 = 92
            if (r1 == r4) goto L2f
            if (r1 == r3) goto L2f
            if (r1 == r2) goto L2f
            r2 = 94
            if (r1 == r2) goto L2f
            r2 = 91
            if (r1 == r2) goto L2f
            if (r1 == r5) goto L2f
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L2f
            r2 = 124(0x7c, float:1.74E-43)
            if (r1 == r2) goto L2f
            switch(r1) {
                case 40: goto L2f;
                case 41: goto L2f;
                case 42: goto L2f;
                case 43: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L32
        L2f:
            r6.append(r5)
        L32:
            r6.append(r1)
            int r0 = r0 + 1
            goto L1
        L38:
            int r7 = r6.length()
            int r7 = r7 + (-1)
            char r7 = r6.charAt(r7)
            if (r7 != r3) goto L47
            r6.append(r2)
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.HN.t.j(java.lang.StringBuilder, java.lang.String):java.lang.StringBuilder");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.a) && this.b.equals(tVar.b) && this.c.equals(tVar.c);
    }

    public final Date h(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateI = i(str, parsePosition);
        if (dateI != null) {
            return dateI;
        }
        if (!this.c.equals(g)) {
            throw new ParseException(com.github.catvod.spider.merge.bY.y.a(ZrJ.d("2C2D3B2C3A361C2229212D651D223F287265"), str), parsePosition.getErrorIndex());
        }
        StringBuilder sbB = C0925t.b(ZrJ.d("5117232868"));
        sbB.append(this.c);
        sbB.append(ZrJ.d("592F242E29291C632F222D36592D243968360C333B223A3159272A392D3659212E2B27371C637A757E7D59020F64421017332A3F3B2018212728682118372E776867"));
        sbB.append(str);
        throw new ParseException(sbB.toString(), parsePosition.getErrorIndex());
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 13) + this.b.hashCode()) * 13) + this.a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[EDGE_INSN: B:23:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:3:0x0011->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:3:0x0011->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.HN.p>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date i(java.lang.String r10, java.text.ParsePosition r11) {
        /*
            r9 = this;
            java.util.TimeZone r0 = r9.b
            java.util.Locale r1 = r9.c
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0, r1)
            r0.clear()
            java.util.List<com.github.catvod.spider.merge.HN.p> r1 = r9.f
            java.util.ListIterator r1 = r1.listIterator()
        L11:
            boolean r2 = r1.hasNext()
            r8 = 0
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            com.github.catvod.spider.merge.HN.p r2 = (com.github.catvod.spider.merge.HN.C0716p) r2
            com.github.catvod.spider.merge.HN.o r3 = r2.a
            boolean r3 = r3.a()
            if (r3 == 0) goto L42
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L2d
            goto L42
        L2d:
            java.lang.Object r3 = r1.next()
            com.github.catvod.spider.merge.HN.p r3 = (com.github.catvod.spider.merge.HN.C0716p) r3
            com.github.catvod.spider.merge.HN.o r3 = r3.a
            r1.previous()
            boolean r3 = r3.a()
            if (r3 == 0) goto L42
            int r3 = r2.b
            r7 = r3
            goto L43
        L42:
            r7 = 0
        L43:
            com.github.catvod.spider.merge.HN.o r2 = r2.a
            r3 = r9
            r4 = r0
            r5 = r10
            r6 = r11
            boolean r2 = r2.b(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L11
            goto L51
        L50:
            r8 = 1
        L51:
            if (r8 == 0) goto L58
            java.util.Date r10 = r0.getTime()
            goto L59
        L58:
            r10 = 0
        L59:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.HN.t.i(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("3F2238390C240D261B2C3A361C3110"));
        sbB.append(this.a);
        String strD = ZrJ.d("5563");
        sbB.append(strD);
        sbB.append(this.c);
        sbB.append(strD);
        sbB.append(this.b.getID());
        sbB.append(ZrJ.d("24"));
        return sbB.toString();
    }
}
