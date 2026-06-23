package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.a.C0529a;
import com.google.protobuf.DescriptorProtos;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e implements Serializable {
    private static final f[] f = new f[0];
    private static final ConcurrentMap<i, String> g = new ConcurrentHashMap(7);
    private final String a;
    private final TimeZone b;
    private final Locale c;
    private transient f[] d;
    private transient int e;

    private static class a implements f {
        private final char a;

        a(char c) {
            this.a = c;
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append(this.a);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return 1;
        }
    }

    private static class b implements d {
        private final d a;

        b(d dVar) {
            this.a = dVar;
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            this.a.a(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            int i = calendar.get(7);
            this.a.a(appendable, i != 1 ? i - 1 : 7);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return this.a.c();
        }
    }

    private static class c implements f {
        static final c b = new c(3);
        static final c c = new c(5);
        static final c d = new c(6);
        final int a;

        c(int i) {
            this.a = i;
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            int i = calendar.get(16) + calendar.get(15);
            if (i == 0) {
                ((StringBuilder) appendable).append((CharSequence) "Z");
                return;
            }
            if (i < 0) {
                ((StringBuilder) appendable).append('-');
                i = -i;
            } else {
                ((StringBuilder) appendable).append('+');
            }
            int i2 = i / 3600000;
            e.a(appendable, i2);
            int i3 = this.a;
            if (i3 < 5) {
                return;
            }
            if (i3 == 6) {
                ((StringBuilder) appendable).append(':');
            }
            e.a(appendable, (i / 60000) - (i2 * 60));
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return this.a;
        }
    }

    private interface d extends f {
        void a(Appendable appendable, int i);
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.C.e$e, reason: collision with other inner class name */
    private static class C0002e implements d {
        private final int a;
        private final int b;

        C0002e(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.a = i;
            this.b = i2;
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            e.b(appendable, i, this.b);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            a(appendable, calendar.get(this.a));
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return this.b;
        }
    }

    private interface f {
        void b(Appendable appendable, Calendar calendar);

        int c();
    }

    private static class g implements f {
        private final String a;

        g(String str) {
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append((CharSequence) this.a);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return this.a.length();
        }
    }

    private static class h implements f {
        private final int a;
        private final String[] b;

        h(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append((CharSequence) this.b[calendar.get(this.a)]);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            int length = this.b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }
    }

    private static class i {
        private final TimeZone a;
        private final int b;
        private final Locale c;

        i(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.a = timeZone;
            if (z) {
                this.b = Integer.MIN_VALUE | i;
            } else {
                this.b = i;
            }
            this.c = com.github.catvod.spider.merge.y.c.a(locale);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && this.b == iVar.b && this.c.equals(iVar.c);
        }

        public final int hashCode() {
            return this.a.hashCode() + ((this.c.hashCode() + (this.b * 31)) * 31);
        }
    }

    private static class j implements f {
        private final Locale a;
        private final int b;
        private final String c;
        private final String d;

        j(TimeZone timeZone, Locale locale, int i) {
            this.a = com.github.catvod.spider.merge.y.c.a(locale);
            this.b = i;
            this.c = e.h(timeZone, false, i, locale);
            this.d = e.h(timeZone, true, i, locale);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append((CharSequence) e.h(calendar.getTimeZone(), calendar.get(16) != 0, this.b, this.a));
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return Math.max(this.c.length(), this.d.length());
        }
    }

    private static class k implements f {
        static final k b = new k(true);
        static final k c = new k(false);
        final boolean a;

        k(boolean z) {
            this.a = z;
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            int i = calendar.get(16) + calendar.get(15);
            if (i < 0) {
                ((StringBuilder) appendable).append('-');
                i = -i;
            } else {
                ((StringBuilder) appendable).append('+');
            }
            int i2 = i / 3600000;
            e.a(appendable, i2);
            if (this.a) {
                ((StringBuilder) appendable).append(':');
            }
            e.a(appendable, (i / 60000) - (i2 * 60));
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return 5;
        }
    }

    private static class l implements d {
        private final d a;

        l(d dVar) {
            this.a = dVar;
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            this.a.a(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.a.a(appendable, leastMaximum);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return this.a.c();
        }
    }

    private static class m implements d {
        private final d a;

        m(d dVar) {
            this.a = dVar;
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            this.a.a(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.a.a(appendable, maximum);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return this.a.c();
        }
    }

    private static class n implements d {
        static final n a = new n();

        n() {
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            e.a(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            e.a(appendable, calendar.get(2) + 1);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return 2;
        }
    }

    private static class o implements d {
        private final int a;

        o(int i) {
            this.a = i;
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            if (i < 100) {
                e.a(appendable, i);
            } else {
                e.b(appendable, i, 2);
            }
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            a(appendable, calendar.get(this.a));
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return 2;
        }
    }

    private static class p implements d {
        static final p a = new p();

        p() {
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            e.a(appendable, i % 100);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            a(appendable, calendar.get(1) % 100);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return 2;
        }
    }

    private static class q implements d {
        static final q a = new q();

        q() {
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            if (i >= 10) {
                e.a(appendable, i);
            } else {
                ((StringBuilder) appendable).append((char) (i + 48));
            }
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            a(appendable, calendar.get(2) + 1);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return 2;
        }
    }

    private static class r implements d {
        private final int a;

        r(int i) {
            this.a = i;
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            if (i < 10) {
                ((StringBuilder) appendable).append((char) (i + 48));
            } else if (i < 100) {
                e.a(appendable, i);
            } else {
                e.b(appendable, i, 1);
            }
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            a(appendable, calendar.get(this.a));
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return 4;
        }
    }

    private static class s implements d {
        private final d a;

        s(d dVar) {
            this.a = dVar;
        }

        @Override // com.github.catvod.spider.merge.C.e.d
        public final void a(Appendable appendable, int i) {
            this.a.a(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final void b(Appendable appendable, Calendar calendar) {
            this.a.a(appendable, calendar.getWeekYear());
        }

        @Override // com.github.catvod.spider.merge.C.e.f
        public final int c() {
            return this.a.c();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0206 A[LOOP:2: B:118:0x0202->B:120:0x0206, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected e(java.lang.String r17, java.util.TimeZone r18, java.util.Locale r19) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.e.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    static void a(Appendable appendable, int i2) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
    }

    static void b(Appendable appendable, int i2, int i3) {
        if (i2 < 10000) {
            int i4 = i2 < 1000 ? i2 < 100 ? i2 < 10 ? 1 : 2 : 3 : 4;
            for (int i5 = i3 - i4; i5 > 0; i5--) {
                ((StringBuilder) appendable).append('0');
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return;
                        }
                        ((StringBuilder) appendable).append((char) ((i2 / DescriptorProtos.Edition.EDITION_2023_VALUE) + 48));
                        i2 %= DescriptorProtos.Edition.EDITION_2023_VALUE;
                    }
                    if (i2 >= 100) {
                        ((StringBuilder) appendable).append((char) ((i2 / 100) + 48));
                        i2 %= 100;
                    } else {
                        ((StringBuilder) appendable).append('0');
                    }
                }
                if (i2 >= 10) {
                    ((StringBuilder) appendable).append((char) ((i2 / 10) + 48));
                    i2 %= 10;
                } else {
                    ((StringBuilder) appendable).append('0');
                }
            }
            ((StringBuilder) appendable).append((char) (i2 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i6 = 0;
        while (i2 != 0) {
            cArr[i6] = (char) ((i2 % 10) + 48);
            i2 /= 10;
            i6++;
        }
        while (i6 < i3) {
            ((StringBuilder) appendable).append('0');
            i3--;
        }
        while (true) {
            i6--;
            if (i6 < 0) {
                return;
            } else {
                ((StringBuilder) appendable).append(cArr[i6]);
            }
        }
    }

    private String c(Calendar calendar) throws IOException {
        StringBuilder sb = new StringBuilder(this.e);
        try {
            for (f fVar : this.d) {
                fVar.b(sb, calendar);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.C.e$i, java.lang.String>] */
    static String h(TimeZone timeZone, boolean z, int i2, Locale locale) {
        i iVar = new i(timeZone, z, i2, locale);
        ?? r1 = g;
        String str = (String) r1.get(iVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i2, locale);
        String str2 = (String) r1.putIfAbsent(iVar, displayName);
        return str2 != null ? str2 : displayName;
    }

    final String d(Object obj) throws IOException {
        if (obj instanceof Date) {
            Calendar calendar = Calendar.getInstance(this.b, this.c);
            calendar.setTime((Date) obj);
            return c(calendar);
        }
        if (!(obj instanceof Calendar)) {
            if (!(obj instanceof Long)) {
                StringBuilder sbA = C0529a.a("Unknown class: ");
                sbA.append(obj == null ? "<null>" : obj.getClass().getName());
                throw new IllegalArgumentException(sbA.toString());
            }
            long jLongValue = ((Long) obj).longValue();
            Calendar calendar2 = Calendar.getInstance(this.b, this.c);
            calendar2.setTimeInMillis(jLongValue);
            return c(calendar2);
        }
        Calendar calendar3 = (Calendar) obj;
        StringBuilder sb = new StringBuilder(this.e);
        if (!calendar3.getTimeZone().equals(this.b)) {
            calendar3 = (Calendar) calendar3.clone();
            calendar3.setTimeZone(this.b);
        }
        try {
            for (f fVar : this.d) {
                fVar.b(sb, calendar3);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    public final Locale e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c);
    }

    public final String f() {
        return this.a;
    }

    public final TimeZone g() {
        return this.b;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 13) + this.b.hashCode()) * 13) + this.a.hashCode();
    }

    protected final d i(int i2, int i3) {
        return i3 != 1 ? i3 != 2 ? new C0002e(i2, i3) : new o(i2) : new r(i2);
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("FastDatePrinter[");
        sbA.append(this.a);
        sbA.append(",");
        sbA.append(this.c);
        sbA.append(",");
        sbA.append(this.b.getID());
        sbA.append("]");
        return sbA.toString();
    }
}
