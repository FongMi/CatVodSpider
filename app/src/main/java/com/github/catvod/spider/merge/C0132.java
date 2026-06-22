package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0132 implements Serializable {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final InterfaceC0138[] f326 = new InterfaceC0138[0];

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final ConcurrentMap<C0141, String> f327 = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final String f328;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final TimeZone f329;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private final Locale f330;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private transient InterfaceC0138[] f331;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private transient int f332;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$Ϳ, reason: contains not printable characters */
    private static class C0133 implements InterfaceC0138 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final char f333;

        C0133(char c) {
            this.f333 = c;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f333);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        public int mo479() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$Ԩ, reason: contains not printable characters */
    private static class C0134 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final InterfaceC0136 f334;

        C0134(InterfaceC0136 interfaceC0136) {
            this.f334 = interfaceC0136;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public void mo480(Appendable appendable, int i) {
            this.f334.mo480(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) {
            int i = calendar.get(7);
            this.f334.mo480(appendable, i != 1 ? i - 1 : 7);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return this.f334.mo479();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$Ԫ, reason: contains not printable characters */
    private static class C0135 implements InterfaceC0138 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static final C0135 f335 = new C0135(3);

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        static final C0135 f336 = new C0135(5);

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        static final C0135 f337 = new C0135(6);

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        final int f338;

        C0135(int i) {
            this.f338 = i;
        }

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        static C0135 m481(int i) {
            if (i == 1) {
                return f335;
            }
            if (i == 2) {
                return f336;
            }
            if (i == 3) {
                return f337;
            }
            throw new IllegalArgumentException(SOY.d("133C2717181E1E723F0319151F207119125722"));
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i == 0) {
                appendable.append(SOY.d("20"));
                return;
            }
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            C0132.m460(appendable, i2);
            int i3 = this.f338;
            if (i3 < 5) {
                return;
            }
            if (i3 == 6) {
                appendable.append(':');
            }
            C0132.m460(appendable, (i / 60000) - (i2 * 60));
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return this.f338;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$Ԭ, reason: contains not printable characters */
    private interface InterfaceC0136 extends InterfaceC0138 {
        /* JADX INFO: renamed from: Ϳ */
        void mo480(Appendable appendable, int i);
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$Ԯ, reason: contains not printable characters */
    private static class C0137 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final int f339;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final int f340;

        C0137(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.f339 = i;
            this.f340 = i2;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ */
        public final void mo480(Appendable appendable, int i) throws IOException {
            C0132.m461(appendable, i, this.f340);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            mo480(appendable, calendar.get(this.f339));
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return this.f340;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$֏, reason: contains not printable characters */
    private interface InterfaceC0138 {
        /* JADX INFO: renamed from: Ԩ */
        void mo478(Appendable appendable, Calendar calendar);

        /* JADX INFO: renamed from: ԩ */
        int mo479();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ؠ, reason: contains not printable characters */
    private static class C0139 implements InterfaceC0138 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f341;

        C0139(String str) {
            this.f341 = str;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f341);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return this.f341.length();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ހ, reason: contains not printable characters */
    private static class C0140 implements InterfaceC0138 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final int f342;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final String[] f343;

        C0140(int i, String[] strArr) {
            this.f342 = i;
            this.f343 = strArr;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f343[calendar.get(this.f342)]);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            int length = this.f343.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.f343[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ށ, reason: contains not printable characters */
    private static class C0141 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final TimeZone f344;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final int f345;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private final Locale f346;

        C0141(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f344 = timeZone;
            if (z) {
                this.f345 = Integer.MIN_VALUE | i;
            } else {
                this.f345 = i;
            }
            this.f346 = C0152.m482(locale);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0141)) {
                return false;
            }
            C0141 c0141 = (C0141) obj;
            return this.f344.equals(c0141.f344) && this.f345 == c0141.f345 && this.f346.equals(c0141.f346);
        }

        public int hashCode() {
            return (((this.f345 * 31) + this.f346.hashCode()) * 31) + this.f344.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ނ, reason: contains not printable characters */
    private static class C0142 implements InterfaceC0138 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final Locale f347;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final int f348;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private final String f349;

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        private final String f350;

        C0142(TimeZone timeZone, Locale locale, int i) {
            this.f347 = C0152.m482(locale);
            this.f348 = i;
            this.f349 = C0132.m464(timeZone, false, i, locale);
            this.f350 = C0132.m464(timeZone, true, i, locale);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) == 0) {
                appendable.append(C0132.m464(timeZone, false, this.f348, this.f347));
            } else {
                appendable.append(C0132.m464(timeZone, true, this.f348, this.f347));
            }
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return Math.max(this.f349.length(), this.f350.length());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ރ, reason: contains not printable characters */
    private static class C0143 implements InterfaceC0138 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static final C0143 f351 = new C0143(true);

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        static final C0143 f352 = new C0143(false);

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        final boolean f353;

        C0143(boolean z) {
            this.f353 = z;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            C0132.m460(appendable, i2);
            if (this.f353) {
                appendable.append(':');
            }
            C0132.m460(appendable, (i / 60000) - (i2 * 60));
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return 5;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ބ, reason: contains not printable characters */
    private static class C0144 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final InterfaceC0136 f354;

        C0144(InterfaceC0136 interfaceC0136) {
            this.f354 = interfaceC0136;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ */
        public void mo480(Appendable appendable, int i) {
            this.f354.mo480(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.f354.mo480(appendable, leastMaximum);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return this.f354.mo479();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ޅ, reason: contains not printable characters */
    private static class C0145 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final InterfaceC0136 f355;

        C0145(InterfaceC0136 interfaceC0136) {
            this.f355 = interfaceC0136;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ */
        public void mo480(Appendable appendable, int i) {
            this.f355.mo480(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.f355.mo480(appendable, maximum);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return this.f355.mo479();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ކ, reason: contains not printable characters */
    private static class C0146 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static final C0146 f356 = new C0146();

        C0146() {
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ */
        public final void mo480(Appendable appendable, int i) throws IOException {
            C0132.m460(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            mo480(appendable, calendar.get(2) + 1);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$އ, reason: contains not printable characters */
    private static class C0147 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final int f357;

        C0147(int i) {
            this.f357 = i;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ */
        public final void mo480(Appendable appendable, int i) throws IOException {
            if (i < 100) {
                C0132.m460(appendable, i);
            } else {
                C0132.m461(appendable, i, 2);
            }
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            mo480(appendable, calendar.get(this.f357));
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ވ, reason: contains not printable characters */
    private static class C0148 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static final C0148 f358 = new C0148();

        C0148() {
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ */
        public final void mo480(Appendable appendable, int i) throws IOException {
            C0132.m460(appendable, i % 100);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            mo480(appendable, calendar.get(1) % 100);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$މ, reason: contains not printable characters */
    private static class C0149 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static final C0149 f359 = new C0149();

        C0149() {
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ */
        public final void mo480(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else {
                C0132.m460(appendable, i);
            }
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            mo480(appendable, calendar.get(2) + 1);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ފ, reason: contains not printable characters */
    private static class C0150 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final int f360;

        C0150(int i) {
            this.f360 = i;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ */
        public final void mo480(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else if (i < 100) {
                C0132.m460(appendable, i);
            } else {
                C0132.m461(appendable, i, 1);
            }
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) throws IOException {
            mo480(appendable, calendar.get(this.f360));
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return 4;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˠ$ދ, reason: contains not printable characters */
    private static class C0151 implements InterfaceC0136 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final InterfaceC0136 f361;

        C0151(InterfaceC0136 interfaceC0136) {
            this.f361 = interfaceC0136;
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0136
        /* JADX INFO: renamed from: Ϳ */
        public void mo480(Appendable appendable, int i) {
            this.f361.mo480(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: Ԩ */
        public void mo478(Appendable appendable, Calendar calendar) {
            this.f361.mo480(appendable, calendar.getWeekYear());
        }

        @Override // com.github.catvod.spider.merge.C0132.InterfaceC0138
        /* JADX INFO: renamed from: ԩ */
        public int mo479() {
            return this.f361.mo479();
        }
    }

    protected C0132(String str, TimeZone timeZone, Locale locale) {
        this.f328 = str;
        this.f329 = timeZone;
        this.f330 = C0152.m482(locale);
        m465();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static void m460(Appendable appendable, int i) throws IOException {
        appendable.append((char) ((i / 10) + 48));
        appendable.append((char) ((i % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static void m461(Appendable appendable, int i, int i2) throws IOException {
        if (i < 10000) {
            int i3 = i < 1000 ? i < 100 ? i < 10 ? 1 : 2 : 3 : 4;
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                appendable.append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        appendable.append((char) ((i / 1000) + 48));
                        i %= 1000;
                    }
                    if (i >= 100) {
                        appendable.append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        appendable.append('0');
                    }
                }
                if (i >= 10) {
                    appendable.append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    appendable.append('0');
                }
            }
            appendable.append((char) (i + 48));
            return;
        }
        char[] cArr = new char[10];
        int i5 = 0;
        while (i != 0) {
            cArr[i5] = (char) ((i % 10) + 48);
            i /= 10;
            i5++;
        }
        while (i5 < i2) {
            appendable.append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            } else {
                appendable.append(cArr[i5]);
            }
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private <B extends Appendable> B m462(Calendar calendar, B b) {
        try {
            for (InterfaceC0138 interfaceC0138 : this.f331) {
                interfaceC0138.mo478(b, calendar);
            }
        } catch (IOException e) {
            C0103.m379(e);
        }
        return b;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private String m463(Calendar calendar) {
        return ((StringBuilder) m462(calendar, new StringBuilder(this.f332))).toString();
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    static String m464(TimeZone timeZone, boolean z, int i, Locale locale) {
        C0141 c0141 = new C0141(timeZone, z, i, locale);
        ConcurrentMap<C0141, String> concurrentMap = f327;
        String str = concurrentMap.get(c0141);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String strPutIfAbsent = concurrentMap.putIfAbsent(c0141, displayName);
        return strPutIfAbsent != null ? strPutIfAbsent : displayName;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private void m465() {
        InterfaceC0138[] interfaceC0138Arr = (InterfaceC0138[]) m475().toArray(f326);
        this.f331 = interfaceC0138Arr;
        int length = interfaceC0138Arr.length;
        int iMo479 = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.f332 = iMo479;
                return;
            }
            iMo479 += this.f331[length].mo479();
        }
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private Calendar m466() {
        return Calendar.getInstance(this.f329, this.f330);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0132)) {
            return false;
        }
        C0132 c0132 = (C0132) obj;
        return this.f328.equals(c0132.f328) && this.f329.equals(c0132.f329) && this.f330.equals(c0132.f330);
    }

    public int hashCode() {
        return this.f328.hashCode() + ((this.f329.hashCode() + (this.f330.hashCode() * 13)) * 13);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SOY.d("3C33220230160E3701041D190E37232D"));
        sb.append(this.f328);
        String strD = SOY.d("56");
        sb.append(strD);
        sb.append(this.f330);
        sb.append(strD);
        sb.append(this.f329.getID());
        sb.append(SOY.d("27"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public <B extends Appendable> B m467(Calendar calendar, B b) {
        if (!calendar.getTimeZone().equals(this.f329)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.f329);
        }
        return (B) m462(calendar, b);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public String m468(long j) {
        Calendar calendarM466 = m466();
        calendarM466.setTimeInMillis(j);
        return m463(calendarM466);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    String m469(Object obj) {
        if (obj instanceof Date) {
            return m471((Date) obj);
        }
        if (obj instanceof Calendar) {
            return m470((Calendar) obj);
        }
        if (obj instanceof Long) {
            return m468(((Long) obj).longValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SOY.d("2F3C3A181B001472321A1504096871"));
        sb.append(obj == null ? SOY.d("463C241A1849") : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public String m470(Calendar calendar) {
        return ((StringBuilder) m467(calendar, new StringBuilder(this.f332))).toString();
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public String m471(Date date) {
        Calendar calendarM466 = m466();
        calendarM466.setTime(date);
        return m463(calendarM466);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public Locale m472() {
        return this.f330;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public String m473() {
        return this.f328;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public TimeZone m474() {
        return this.f329;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.github.catvod.spider.merge.ˠ$Ԭ] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.util.List<com.github.catvod.spider.merge.C0132.InterfaceC0138> m475() {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0132.m475():java.util.List");
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    protected String m476(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb.append('\'');
            boolean z = false;
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 != '\'') {
                    if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(cCharAt2);
                } else {
                    int i2 = i + 1;
                    if (i2 >= length || str.charAt(i2) != '\'') {
                        z = !z;
                    } else {
                        sb.append(cCharAt2);
                        i = i2;
                    }
                }
                i++;
            }
        } else {
            sb.append(cCharAt);
            while (true) {
                int i3 = i + 1;
                if (i3 >= length || str.charAt(i3) != cCharAt) {
                    break;
                }
                sb.append(cCharAt);
                i = i3;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    protected InterfaceC0136 m477(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? new C0137(i, i2) : new C0147(i) : new C0150(i);
    }
}
