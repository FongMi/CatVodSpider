package com.github.catvod.spider.merge;

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
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0260 implements Serializable {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    static final Locale f658;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final Comparator<String> f659;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final ConcurrentMap<Locale, AbstractC0271>[] f660;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final AbstractC0271 f661;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static final AbstractC0271 f662;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static final AbstractC0271 f663;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private static final AbstractC0271 f664;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private static final AbstractC0271 f665;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private static final AbstractC0271 f666;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private static final AbstractC0271 f667;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private static final AbstractC0271 f668;

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private static final AbstractC0271 f669;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private static final AbstractC0271 f670;

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private static final AbstractC0271 f671;

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private static final AbstractC0271 f672;

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private static final AbstractC0271 f673;

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private static final AbstractC0271 f674;

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private static final AbstractC0271 f675;

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    private static final AbstractC0271 f676;

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    private final String f677;

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    private final TimeZone f678;

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    private final Locale f679;

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    private final int f680;

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    private final int f681;

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    private transient List<C0272> f682;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$Ϳ, reason: contains not printable characters */
    static class C0261 extends C0269 {
        C0261(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.C0260.C0269
        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        int mo1012(C0260 c0260, int i) {
            return i < 100 ? c0260.m1000(i) : i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$Ԩ, reason: contains not printable characters */
    static class C0262 extends C0269 {
        C0262(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.C0260.C0269
        /* JADX INFO: renamed from: ԩ */
        int mo1012(C0260 c0260, int i) {
            return i - 1;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$Ԫ, reason: contains not printable characters */
    static class C0263 extends C0269 {
        C0263(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.C0260.C0269
        /* JADX INFO: renamed from: ԩ */
        int mo1012(C0260 c0260, int i) {
            if (i == 7) {
                return 1;
            }
            return 1 + i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$Ԭ, reason: contains not printable characters */
    static class C0264 extends C0269 {
        C0264(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.C0260.C0269
        /* JADX INFO: renamed from: ԩ */
        int mo1012(C0260 c0260, int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$Ԯ, reason: contains not printable characters */
    static class C0265 extends C0269 {
        C0265(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.C0260.C0269
        /* JADX INFO: renamed from: ԩ */
        int mo1012(C0260 c0260, int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$֏, reason: contains not printable characters */
    private static class C0266 extends AbstractC0270 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final int f683;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        final Locale f684;

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        private final Map<String, Integer> f685;

        C0266(int i, Calendar calendar, Locale locale) {
            super(null);
            this.f683 = i;
            this.f684 = C0152.m482(locale);
            StringBuilder sb = new StringBuilder();
            sb.append(SOY.d("527A6E1F015E"));
            this.f685 = C0260.m1001(calendar, locale, i, sb);
            sb.setLength(sb.length() - 1);
            sb.append(SOY.d("53"));
            m1019(sb);
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0270
        public String toString() {
            return SOY.d("393322133D1909373F051D0313243422110F0E01250415031F3528562F1113373D1249") + this.f683 + SOY.d("56723D19171616376C") + this.f684 + SOY.d("56723D3D110E2C333D03110447") + this.f685 + SOY.d("5672211700031F203F4B") + this.f691 + SOY.d("27");
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0270
        /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
        void mo1013(C0260 c0260, Calendar calendar, String str) {
            String lowerCase = str.toLowerCase(this.f684);
            Integer num = this.f685.get(lowerCase);
            if (num == null) {
                num = this.f685.get(lowerCase + '.');
            }
            calendar.set(this.f683, num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$ؠ, reason: contains not printable characters */
    private static class C0267 extends AbstractC0271 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f686;

        C0267(String str) {
            super(null);
            this.f686 = str;
        }

        public String toString() {
            return SOY.d("393D210F250215263412270308332513130E5A093719061A1B26171F111B1E6F") + this.f686 + SOY.d("27");
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0271
        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        boolean mo1014() {
            return false;
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0271
        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        boolean mo1015(C0260 c0260, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            for (int i2 = 0; i2 < this.f686.length(); i2++) {
                int index = parsePosition.getIndex() + i2;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
                if (this.f686.charAt(i2) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(this.f686.length() + parsePosition.getIndex());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$ހ, reason: contains not printable characters */
    private static class C0268 extends AbstractC0270 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private static final AbstractC0271 f687 = new C0268(SOY.d("52082D5E4B4D21797C2B281301602C5F5D"));

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private static final AbstractC0271 f688 = new C0268(SOY.d("52082D5E4B4D21797C2B281301602C2A100C482F785F"));

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        private static final AbstractC0271 f689 = new C0268(SOY.d("52082D5E4B4D21797C2B281301602C5E4B4D407B0D120F45077B78"));

        C0268(String str) {
            super(null);
            m1018(str);
        }

        /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
        static AbstractC0271 m1017(int i) {
            if (i == 1) {
                return f687;
            }
            if (i == 2) {
                return f688;
            }
            if (i == 3) {
                return f689;
            }
            throw new IllegalArgumentException(SOY.d("133C2717181E1E723F0319151F207119125722"));
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0270
        /* JADX INFO: renamed from: ԫ */
        void mo1013(C0260 c0260, Calendar calendar, String str) {
            calendar.setTimeZone(C0128.m426(str));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$ށ, reason: contains not printable characters */
    private static class C0269 extends AbstractC0271 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final int f690;

        C0269(int i) {
            super(null);
            this.f690 = i;
        }

        public String toString() {
            return SOY.d("34273C1411052926231700121D2B712D121E1F3E354B") + this.f690 + SOY.d("27");
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0271
        /* JADX INFO: renamed from: Ϳ */
        boolean mo1014() {
            return true;
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0271
        /* JADX INFO: renamed from: Ԩ */
        boolean mo1015(C0260 c0260, Calendar calendar, String str, ParsePosition parsePosition, int i) {
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
            calendar.set(this.f690, mo1012(c0260, i3));
            return true;
        }

        /* JADX INFO: renamed from: ԩ */
        int mo1012(C0260 c0260, int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$ނ, reason: contains not printable characters */
    private static abstract class AbstractC0270 extends AbstractC0271 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        Pattern f691;

        private AbstractC0270() {
            super(null);
        }

        public String toString() {
            return getClass().getSimpleName() + SOY.d("5A09211700031F203F4B") + this.f691 + SOY.d("27");
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0271
        /* JADX INFO: renamed from: Ϳ */
        boolean mo1014() {
            return false;
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0271
        /* JADX INFO: renamed from: Ԩ */
        boolean mo1015(C0260 c0260, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            Matcher matcher = this.f691.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
            mo1013(c0260, calendar, matcher.group(1));
            return true;
        }

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        void m1018(String str) {
            this.f691 = Pattern.compile(str);
        }

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        void m1019(StringBuilder sb) {
            m1018(sb.toString());
        }

        /* JADX INFO: renamed from: ԫ */
        abstract void mo1013(C0260 c0260, Calendar calendar, String str);

        /* synthetic */ AbstractC0270(C0261 c0261) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$ރ, reason: contains not printable characters */
    private static abstract class AbstractC0271 {
        private AbstractC0271() {
        }

        /* JADX INFO: renamed from: Ϳ */
        boolean mo1014() {
            return false;
        }

        /* JADX INFO: renamed from: Ԩ */
        abstract boolean mo1015(C0260 c0260, Calendar calendar, String str, ParsePosition parsePosition, int i);

        /* synthetic */ AbstractC0271(C0261 c0261) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$ބ, reason: contains not printable characters */
    private static class C0272 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        final AbstractC0271 f692;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        final int f693;

        C0272(AbstractC0271 abstractC0271, int i) {
            this.f692 = abstractC0271;
            this.f693 = i;
        }

        public String toString() {
            return SOY.d("2926231700121D2B101810201336251E542C0926231700121D2B6C") + this.f692 + SOY.d("5672261F1003126F") + this.f693 + SOY.d("27");
        }

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        int m1020(ListIterator<C0272> listIterator) {
            if (!this.f692.mo1014() || !listIterator.hasNext()) {
                return 0;
            }
            AbstractC0271 abstractC0271 = listIterator.next().f692;
            listIterator.previous();
            if (abstractC0271.mo1014()) {
                return this.f693;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$ޅ, reason: contains not printable characters */
    private class C0273 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final Calendar f694;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private int f695;

        C0273(Calendar calendar) {
            this.f694 = calendar;
        }

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private C0272 m1021(char c) {
            int i = this.f695;
            do {
                int i2 = this.f695 + 1;
                this.f695 = i2;
                if (i2 >= C0260.this.f677.length()) {
                    break;
                }
            } while (C0260.this.f677.charAt(this.f695) == c);
            int i3 = this.f695 - i;
            return new C0272(C0260.this.m1004(c, i3, this.f694), i3);
        }

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private C0272 m1022() {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (this.f695 < C0260.this.f677.length()) {
                char cCharAt = C0260.this.f677.charAt(this.f695);
                if (!z && C0260.m1006(cCharAt)) {
                    break;
                }
                if (cCharAt == '\'') {
                    int i = this.f695 + 1;
                    this.f695 = i;
                    if (i == C0260.this.f677.length() || C0260.this.f677.charAt(this.f695) != '\'') {
                        z = !z;
                    }
                }
                this.f695++;
                sb.append(cCharAt);
            }
            if (z) {
                throw new IllegalArgumentException(SOY.d("2F3C2513061A133C300211135A2324190012"));
            }
            String string = sb.toString();
            return new C0272(new C0267(string), string.length());
        }

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        C0272 m1023() {
            if (this.f695 >= C0260.this.f677.length()) {
                return null;
            }
            char cCharAt = C0260.this.f677.charAt(this.f695);
            return C0260.m1006(cCharAt) ? m1021(cCharAt) : m1022();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$ކ, reason: contains not printable characters */
    static class C0274 extends AbstractC0270 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final Locale f697;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private final Map<String, C0275> f698;

        /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݳ$ކ$Ϳ, reason: contains not printable characters */
        private static class C0275 {

            /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
            final TimeZone f699;

            /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
            final int f700;

            C0275(TimeZone timeZone, boolean z) {
                this.f699 = timeZone;
                this.f700 = z ? timeZone.getDSTSavings() : 0;
            }
        }

        C0274(Locale locale) {
            super(null);
            this.f698 = new HashMap();
            this.f697 = C0152.m482(locale);
            StringBuilder sb = new StringBuilder();
            sb.append(SOY.d("527A6E1F015E21797C2B281301662C0A333A2E097A5B292B1E29605A460A400E350D460A"));
            TreeSet<String> treeSet = new TreeSet(C0260.f659);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase(SOY.d("3D1F05"))) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    C0275 c0275 = new C0275(timeZone, false);
                    C0275 c02752 = c0275;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            c02752 = new C0275(timeZone, true);
                        } else if (i == 5) {
                            c02752 = c0275;
                        }
                        if (strArr[i] != null) {
                            String lowerCase = strArr[i].toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.f698.put(lowerCase, c02752);
                            }
                        }
                    }
                }
            }
            for (String str2 : treeSet) {
                sb.append('|');
                C0260.m1007(sb, str2);
            }
            sb.append(SOY.d("53"));
            m1019(sb);
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0270
        public String toString() {
            return SOY.d("2E3B3C132E181437020206160E37360F542C163D3217181247") + this.f697 + SOY.d("5672250C3A161737224B") + this.f698 + SOY.d("5672211700031F203F4B") + this.f691 + SOY.d("27");
        }

        @Override // com.github.catvod.spider.merge.C0260.AbstractC0270
        /* JADX INFO: renamed from: ԫ */
        void mo1013(C0260 c0260, Calendar calendar, String str) {
            TimeZone timeZoneM426 = C0128.m426(str);
            if (timeZoneM426 != null) {
                calendar.setTimeZone(timeZoneM426);
                return;
            }
            String lowerCase = str.toLowerCase(this.f697);
            C0275 c0275 = this.f698.get(lowerCase);
            if (c0275 == null) {
                c0275 = this.f698.get(lowerCase + '.');
            }
            calendar.set(16, c0275.f700);
            calendar.set(15, c0275.f699.getRawOffset());
        }
    }

    static {
        String strD = SOY.d("1033");
        String strD2 = SOY.d("3002");
        f658 = new Locale(strD, strD2, strD2);
        f659 = Comparator.reverseOrder();
        f660 = new ConcurrentMap[17];
        f661 = new C0261(1);
        f662 = new C0262(2);
        f663 = new C0269(1);
        f664 = new C0269(3);
        f665 = new C0269(4);
        f666 = new C0269(6);
        f667 = new C0269(5);
        f668 = new C0263(7);
        f669 = new C0269(8);
        f670 = new C0269(11);
        f671 = new C0264(11);
        f672 = new C0265(10);
        f673 = new C0269(10);
        f674 = new C0269(12);
        f675 = new C0269(13);
        f676 = new C0269(14);
    }

    protected C0260(String str, TimeZone timeZone, Locale locale, Date date) {
        int i;
        this.f677 = str;
        this.f678 = timeZone;
        Locale localeM482 = C0152.m482(locale);
        this.f679 = localeM482;
        Calendar calendar = Calendar.getInstance(timeZone, localeM482);
        if (date != null) {
            calendar.setTime(date);
            i = calendar.get(1);
        } else if (localeM482.equals(f658)) {
            i = 0;
        } else {
            calendar.setTime(new Date());
            i = calendar.get(1) - 80;
        }
        int i2 = (i / 100) * 100;
        this.f680 = i2;
        this.f681 = i - i2;
        m1005(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public int m1000(int i) {
        int i2 = this.f680 + i;
        return i >= this.f681 ? i2 : i2 + 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static Map<String, Integer> m1001(Calendar calendar, Locale locale, int i, StringBuilder sb) {
        HashMap map = new HashMap();
        Locale localeM482 = C0152.m482(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, localeM482);
        TreeSet treeSet = new TreeSet(f659);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(localeM482);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            m1007(sb, (String) it.next()).append('|');
        }
        return map;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private static ConcurrentMap<Locale, AbstractC0271> m1002(int i) {
        ConcurrentMap<Locale, AbstractC0271> concurrentMap;
        ConcurrentMap<Locale, AbstractC0271>[] concurrentMapArr = f660;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i] == null) {
                concurrentMapArr[i] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i];
        }
        return concurrentMap;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private AbstractC0271 m1003(int i, Calendar calendar) {
        ConcurrentMap<Locale, AbstractC0271> concurrentMapM1002 = m1002(i);
        AbstractC0271 c0274 = concurrentMapM1002.get(this.f679);
        if (c0274 == null) {
            c0274 = i == 15 ? new C0274(this.f679) : new C0266(i, calendar, this.f679);
            AbstractC0271 abstractC0271PutIfAbsent = concurrentMapM1002.putIfAbsent(this.f679, c0274);
            if (abstractC0271PutIfAbsent != null) {
                return abstractC0271PutIfAbsent;
            }
        }
        return c0274;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public AbstractC0271 m1004(char c, int i, Calendar calendar) {
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case 'D':
                        return f666;
                    case 'E':
                        return m1003(7, calendar);
                    case 'F':
                        return f669;
                    case 'G':
                        return m1003(0, calendar);
                    case 'H':
                        return f670;
                    default:
                        switch (c) {
                            case 'K':
                                return f673;
                            case 'M':
                                return i >= 3 ? m1003(2, calendar) : f662;
                            case 'S':
                                return f676;
                            case 'a':
                                return m1003(9, calendar);
                            case 'd':
                                return f667;
                            case 'h':
                                return f672;
                            case 'k':
                                return f671;
                            case 'm':
                                return f674;
                            case 's':
                                return f675;
                            case 'u':
                                return f668;
                            case 'w':
                                return f664;
                            default:
                                switch (c) {
                                    case 'W':
                                        return f665;
                                    case 'X':
                                        return C0268.m1017(i);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i == 2) {
                                            return C0268.f689;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException(SOY.d("3C3D231B15035A75") + c + SOY.d("5D723F190057092721061B050E3735"));
                                }
                                break;
                        }
                        break;
                }
            }
            return m1003(15, calendar);
        }
        return i > 2 ? f663 : f661;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private void m1005(Calendar calendar) {
        this.f682 = new ArrayList();
        C0273 c0273 = new C0273(calendar);
        while (true) {
            C0272 c0272M1023 = c0273.m1023();
            if (c0272M1023 == null) {
                return;
            } else {
                this.f682.add(c0272M1023);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public static boolean m1006(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.StringBuilder m1007(java.lang.StringBuilder r6, java.lang.String r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0260.m1007(java.lang.StringBuilder, java.lang.String):java.lang.StringBuilder");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0260)) {
            return false;
        }
        C0260 c0260 = (C0260) obj;
        return this.f677.equals(c0260.f677) && this.f678.equals(c0260.f678) && this.f679.equals(c0260.f679);
    }

    public int hashCode() {
        return this.f677.hashCode() + ((this.f678.hashCode() + (this.f679.hashCode() * 13)) * 13);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SOY.d("3C33220230160E37011706041F200A"));
        sb.append(this.f677);
        String strD = SOY.d("5672");
        sb.append(strD);
        sb.append(this.f679);
        sb.append(strD);
        sb.append(this.f678.getID());
        sb.append(SOY.d("27"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public Date m1008(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateM1009 = m1009(str, parsePosition);
        if (dateM1009 != null) {
            return dateM1009;
        }
        if (!this.f679.equals(f658)) {
            throw new ParseException(SOY.d("2F3C211706041F33331A11571E3325134E57") + str, parsePosition.getErrorIndex());
        }
        throw new ParseException(SOY.d("5206391354") + this.f679 + SOY.d("5A3E3E15151B1F72351911045A3C3E0254040F22211906035A36300211045A3034101B051F72604E424F5A13155F7E221422300407121B303D1354131B26344C5455") + str, parsePosition.getErrorIndex());
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public Date m1009(String str, ParsePosition parsePosition) {
        Calendar calendar = Calendar.getInstance(this.f678, this.f679);
        calendar.clear();
        if (m1010(str, parsePosition, calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    public boolean m1010(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<C0272> listIterator = this.f682.listIterator();
        while (listIterator.hasNext()) {
            C0272 next = listIterator.next();
            if (!next.f692.mo1015(this, calendar, str, parsePosition, next.m1020(listIterator))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public Object m1011(String str, ParsePosition parsePosition) {
        return m1009(str, parsePosition);
    }
}
