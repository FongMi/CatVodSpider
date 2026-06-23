package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.a.C0531c;
import com.github.catvod.spider.merge.b.C0544h;
import java.io.Serializable;
import java.text.DateFormatSymbols;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d implements Serializable {
    static final Locale g = new Locale("ja", "JP", "JP");
    private static final Comparator<String> h = Comparator.reverseOrder();
    private static final ConcurrentMap<Locale, k>[] i = new ConcurrentMap[17];
    private static final a j = new a();
    private static final b k = new b();
    private static final i l = new i(1);
    private static final i m = new i(3);
    private static final i n = new i(4);
    private static final i o = new i(6);
    private static final i p = new i(5);
    private static final c q = new c();
    private static final i r = new i(8);
    private static final i s = new i(11);
    private static final C0001d t = new C0001d();
    private static final e u = new e();
    private static final i v = new i(10);
    private static final i w = new i(12);
    private static final i x = new i(13);
    private static final i y = new i(14);
    private final String a;
    private final TimeZone b;
    private final Locale c;
    private final int d;
    private final int e;
    private transient List<l> f;

    static class a extends i {
        a() {
            super(1);
        }

        @Override // com.github.catvod.spider.merge.C.d.i
        final int c(d dVar, int i) {
            return i < 100 ? d.d(dVar, i) : i;
        }
    }

    static class b extends i {
        b() {
            super(2);
        }

        @Override // com.github.catvod.spider.merge.C.d.i
        final int c(d dVar, int i) {
            return i - 1;
        }
    }

    static class c extends i {
        c() {
            super(7);
        }

        @Override // com.github.catvod.spider.merge.C.d.i
        final int c(d dVar, int i) {
            if (i == 7) {
                return 1;
            }
            return 1 + i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.C.d$d, reason: collision with other inner class name */
    static class C0001d extends i {
        C0001d() {
            super(11);
        }

        @Override // com.github.catvod.spider.merge.C.d.i
        final int c(d dVar, int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    }

    static class e extends i {
        e() {
            super(10);
        }

        @Override // com.github.catvod.spider.merge.C.d.i
        final int c(d dVar, int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    }

    private static class f extends j {
        private final int b;
        final Locale c;
        private final Map<String, Integer> d;

        f(int i, Calendar calendar, Locale locale) {
            this.b = i;
            this.c = com.github.catvod.spider.merge.y.c.a(locale);
            StringBuilder sbA = C0529a.a("((?iu)");
            this.d = (HashMap) d.c(calendar, locale, i, sbA);
            sbA.setLength(sbA.length() - 1);
            sbA.append(")");
            this.a = Pattern.compile(sbA.toString());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        @Override // com.github.catvod.spider.merge.C.d.j
        final void c(Calendar calendar, String str) {
            String lowerCase = str.toLowerCase(this.c);
            Integer num = (Integer) this.d.get(lowerCase);
            if (num == null) {
                num = (Integer) this.d.get(lowerCase + '.');
            }
            calendar.set(this.b, num.intValue());
        }

        @Override // com.github.catvod.spider.merge.C.d.j
        public final String toString() {
            StringBuilder sbA = C0529a.a("CaseInsensitiveTextStrategy [field=");
            sbA.append(this.b);
            sbA.append(", locale=");
            sbA.append(this.c);
            sbA.append(", lKeyValues=");
            sbA.append(this.d);
            sbA.append(", pattern=");
            sbA.append(this.a);
            sbA.append("]");
            return sbA.toString();
        }
    }

    private static class g extends k {
        private final String a;

        g(String str) {
            super(null);
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.C.d.k
        final boolean b(d dVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            for (int i2 = 0; i2 < this.a.length(); i2++) {
                int index = parsePosition.getIndex() + i2;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
                if (this.a.charAt(i2) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(parsePosition.getIndex() + this.a.length());
            return true;
        }

        public final String toString() {
            return C0544h.b(C0529a.a("CopyQuotedStrategy [formatField="), this.a, "]");
        }
    }

    private static class h extends j {
        private static final h b = new h("(Z|(?:[+-]\\d{2}))");
        private static final h c = new h("(Z|(?:[+-]\\d{2}\\d{2}))");
        private static final h d = new h("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        h(String str) {
            this.a = Pattern.compile(str);
        }

        static k e(int i) {
            if (i == 1) {
                return b;
            }
            if (i == 2) {
                return c;
            }
            if (i == 3) {
                return d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // com.github.catvod.spider.merge.C.d.j
        final void c(Calendar calendar, String str) {
            calendar.setTimeZone(com.github.catvod.spider.merge.C.f.a(str));
        }
    }

    private static class i extends k {
        private final int a;

        i(int i) {
            super(null);
            this.a = i;
        }

        @Override // com.github.catvod.spider.merge.C.d.k
        final boolean a() {
            return true;
        }

        @Override // com.github.catvod.spider.merge.C.d.k
        final boolean b(d dVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i2 = i + index;
                if (length > i2) {
                    length = i2;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int i3 = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.a, c(dVar, i3));
            return true;
        }

        int c(d dVar, int i) {
            return i;
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("NumberStrategy [field=");
            sbA.append(this.a);
            sbA.append("]");
            return sbA.toString();
        }
    }

    private static abstract class j extends k {
        Pattern a;

        j() {
            super(null);
        }

        @Override // com.github.catvod.spider.merge.C.d.k
        final boolean a() {
            return false;
        }

        @Override // com.github.catvod.spider.merge.C.d.k
        final boolean b(d dVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            Matcher matcher = this.a.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
            c(calendar, matcher.group(1));
            return true;
        }

        abstract void c(Calendar calendar, String str);

        public String toString() {
            return getClass().getSimpleName() + " [pattern=" + this.a + "]";
        }
    }

    private static abstract class k {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        boolean a() {
            return false;
        }

        abstract boolean b(d dVar, Calendar calendar, String str, ParsePosition parsePosition, int i);
    }

    private static class l {
        final k a;
        final int b;

        l(k kVar, int i) {
            this.a = kVar;
            this.b = i;
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("StrategyAndWidth [strategy=");
            sbA.append(this.a);
            sbA.append(", width=");
            sbA.append(this.b);
            sbA.append("]");
            return sbA.toString();
        }
    }

    private class m {
        private final Calendar a;
        private int b;

        m(Calendar calendar) {
            this.a = calendar;
        }

        final l a() {
            if (this.b >= d.this.a.length()) {
                return null;
            }
            char cCharAt = d.this.a.charAt(this.b);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i = this.b;
                do {
                    int i2 = this.b + 1;
                    this.b = i2;
                    if (i2 >= d.this.a.length()) {
                        break;
                    }
                } while (d.this.a.charAt(this.b) == cCharAt);
                int i3 = this.b - i;
                return new l(d.b(d.this, cCharAt, i3, this.a), i3);
            }
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (this.b < d.this.a.length()) {
                char cCharAt2 = d.this.a.charAt(this.b);
                if (!z) {
                    if ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z')) {
                        break;
                    }
                }
                if (cCharAt2 == '\'') {
                    int i4 = this.b + 1;
                    this.b = i4;
                    if (i4 == d.this.a.length() || d.this.a.charAt(this.b) != '\'') {
                        z = !z;
                    }
                }
                this.b++;
                sb.append(cCharAt2);
            }
            if (z) {
                throw new IllegalArgumentException("Unterminated quote");
            }
            String string = sb.toString();
            return new l(new g(string), string.length());
        }
    }

    static class n extends j {
        private final Locale b;
        private final Map<String, a> c = new HashMap();

        private static class a {
            final TimeZone a;
            final int b;

            a(TimeZone timeZone, boolean z) {
                this.a = timeZone;
                this.b = z ? timeZone.getDSTSavings() : 0;
            }
        }

        /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C.d$n$a>] */
        n(Locale locale) {
            this.b = com.github.catvod.spider.merge.y.c.a(locale);
            StringBuilder sbA = C0529a.a("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(d.h);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    a aVar = new a(timeZone, false);
                    a aVar2 = aVar;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            aVar2 = new a(timeZone, true);
                        } else if (i == 5) {
                            aVar2 = aVar;
                        }
                        if (strArr[i] != null) {
                            String lowerCase = strArr[i].toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.c.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            for (String str2 : treeSet) {
                sbA.append('|');
                d.f(sbA, str2);
            }
            sbA.append(")");
            this.a = Pattern.compile(sbA.toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C.d$n$a>] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C.d$n$a>] */
        @Override // com.github.catvod.spider.merge.C.d.j
        final void c(Calendar calendar, String str) {
            TimeZone timeZoneA = com.github.catvod.spider.merge.C.f.a(str);
            if (timeZoneA != null) {
                calendar.setTimeZone(timeZoneA);
                return;
            }
            String lowerCase = str.toLowerCase(this.b);
            a aVar = (a) this.c.get(lowerCase);
            if (aVar == null) {
                aVar = (a) this.c.get(lowerCase + '.');
            }
            calendar.set(16, aVar.b);
            calendar.set(15, aVar.a.getRawOffset());
        }

        @Override // com.github.catvod.spider.merge.C.d.j
        public final String toString() {
            StringBuilder sbA = C0529a.a("TimeZoneStrategy [locale=");
            sbA.append(this.b);
            sbA.append(", tzNames=");
            sbA.append(this.c);
            sbA.append(", pattern=");
            sbA.append(this.a);
            sbA.append("]");
            return sbA.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.d$l>] */
    protected d(String str, TimeZone timeZone, Locale locale) {
        int i2;
        this.a = str;
        this.b = timeZone;
        Locale localeA = com.github.catvod.spider.merge.y.c.a(locale);
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
        m mVar = new m(calendar);
        while (true) {
            l lVarA = mVar.a();
            if (lVarA == null) {
                return;
            } else {
                this.f.add(lVarA);
            }
        }
    }

    static k b(d dVar, char c2, int i2, Calendar calendar) {
        int i3;
        dVar.getClass();
        if (c2 != 'y') {
            if (c2 != 'z') {
                switch (c2) {
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
                        switch (c2) {
                            case 'K':
                                return v;
                            case 'M':
                                return i2 >= 3 ? dVar.g(2, calendar) : k;
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
                                switch (c2) {
                                    case 'W':
                                        return n;
                                    case 'X':
                                        return h.e(i2);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i2 == 2) {
                                            return h.d;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c2 + "' not supported");
                                }
                                i3 = 15;
                                break;
                        }
                        break;
                }
            } else {
                i3 = 15;
            }
            return dVar.g(i3, calendar);
        }
        return i2 > 2 ? l : j;
    }

    static Map c(Calendar calendar, Locale locale, int i2, StringBuilder sb) {
        HashMap map = new HashMap();
        Locale localeA = com.github.catvod.spider.merge.y.c.a(locale);
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

    static int d(d dVar, int i2) {
        int i3 = dVar.d + i2;
        return i2 >= dVar.e ? i3 : i3 + 100;
    }

    static /* synthetic */ StringBuilder f(StringBuilder sb, String str) {
        j(sb, str);
        return sb;
    }

    private k g(int i2, Calendar calendar) {
        ConcurrentMap<Locale, k> concurrentMap;
        ConcurrentMap<Locale, k>[] concurrentMapArr = i;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i2] == null) {
                concurrentMapArr[i2] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i2];
        }
        k nVar = concurrentMap.get(this.c);
        if (nVar == null) {
            nVar = i2 == 15 ? new n(this.c) : new f(i2, calendar, this.c);
            k kVarPutIfAbsent = concurrentMap.putIfAbsent(this.c, nVar);
            if (kVarPutIfAbsent != null) {
                return kVarPutIfAbsent;
            }
        }
        return nVar;
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.d.j(java.lang.StringBuilder, java.lang.String):java.lang.StringBuilder");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c);
    }

    public final Date h(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateI = i(str, parsePosition);
        if (dateI != null) {
            return dateI;
        }
        if (!this.c.equals(g)) {
            throw new ParseException(C0531c.a("Unparseable date: ", str), parsePosition.getErrorIndex());
        }
        StringBuilder sbA = C0529a.a("(The ");
        sbA.append(this.c);
        sbA.append(" locale does not support dates before 1868 AD)\nUnparseable date: \"");
        sbA.append(str);
        throw new ParseException(sbA.toString(), parsePosition.getErrorIndex());
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 13) + this.b.hashCode()) * 13) + this.a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[EDGE_INSN: B:23:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:3:0x0011->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:3:0x0011->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.d$l>] */
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
            java.util.List<com.github.catvod.spider.merge.C.d$l> r1 = r9.f
            java.util.ListIterator r1 = r1.listIterator()
        L11:
            boolean r2 = r1.hasNext()
            r8 = 0
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            com.github.catvod.spider.merge.C.d$l r2 = (com.github.catvod.spider.merge.C.d.l) r2
            com.github.catvod.spider.merge.C.d$k r3 = r2.a
            boolean r3 = r3.a()
            if (r3 == 0) goto L42
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L2d
            goto L42
        L2d:
            java.lang.Object r3 = r1.next()
            com.github.catvod.spider.merge.C.d$l r3 = (com.github.catvod.spider.merge.C.d.l) r3
            com.github.catvod.spider.merge.C.d$k r3 = r3.a
            r1.previous()
            boolean r3 = r3.a()
            if (r3 == 0) goto L42
            int r3 = r2.b
            r7 = r3
            goto L43
        L42:
            r7 = 0
        L43:
            com.github.catvod.spider.merge.C.d$k r2 = r2.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.d.i(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("FastDateParser[");
        sbA.append(this.a);
        sbA.append(", ");
        sbA.append(this.c);
        sbA.append(", ");
        sbA.append(this.b.getID());
        sbA.append("]");
        return sbA.toString();
    }
}
