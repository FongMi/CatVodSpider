package com.github.catvod.spider.merge.r1;

import com.github.catvod.spider.merge.l.C1290c;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j {
    private final com.github.catvod.spider.merge.J1.c a;
    private final LocalDateTime b;

    public j(com.github.catvod.spider.merge.J1.c cVar, LocalDateTime localDateTime) {
        this.a = cVar;
        this.b = localDateTime;
    }

    public static /* synthetic */ boolean b(final j jVar, final String str, Map.Entry entry) {
        jVar.getClass();
        return ((Collection) entry.getValue()).stream().anyMatch(new Predicate() { // from class: com.github.catvod.spider.merge.r1.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.a.e(str, (String) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.time.ZonedDateTime] */
    private b c(int i, ChronoUnit chronoUnit) {
        LocalDateTime localDateTimeMinusDays = chronoUnit == ChronoUnit.YEARS ? this.b.minusYears(i).minusDays(1L) : this.b.minus(i, (TemporalUnit) chronoUnit);
        boolean zIsDateBased = chronoUnit.isDateBased();
        if (zIsDateBased) {
            localDateTimeMinusDays = localDateTimeMinusDays.truncatedTo(ChronoUnit.DAYS);
        }
        return new b(localDateTimeMinusDays.atZone(ZoneId.systemDefault()).toInstant(), zIsDateBased);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (this.a.d().isEmpty()) {
            return str.toLowerCase().contains(str2.toLowerCase());
        }
        String strQuote = Pattern.quote(str2.toLowerCase());
        String strQuote2 = this.a.d().equals(" ") ? "[ \\t\\xA0\\u1680\\u180e\\u2000-\\u200a\\u202f\\u205f\\u3000\\d]" : Pattern.quote(this.a.d());
        StringBuilder sb = new StringBuilder();
        sb.append("(^|");
        sb.append(strQuote2);
        sb.append(")");
        sb.append(strQuote);
        sb.append("($|");
        return com.github.catvod.spider.merge.L1.k.b(C1290c.b(sb, strQuote2, ")"), str.toLowerCase());
    }

    public final b d(final String str) {
        int i;
        for (Map.Entry entry : ((EnumMap) this.a.c()).entrySet()) {
            ChronoUnit chronoUnit = (ChronoUnit) entry.getKey();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str2 = (String) entry2.getKey();
                int iIntValue = ((Integer) entry2.getValue()).intValue();
                if (e(str, str2)) {
                    return c(iIntValue, chronoUnit);
                }
            }
        }
        try {
            i = Integer.parseInt(str.replaceAll("\\D+", ""));
        } catch (NumberFormatException unused) {
            i = 1;
        }
        return c(i, (ChronoUnit) ((EnumMap) this.a.a()).entrySet().stream().filter(new Predicate() { // from class: com.github.catvod.spider.merge.r1.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return j.b(this.a, str, (Map.Entry) obj);
            }
        }).map(new Function() { // from class: com.github.catvod.spider.merge.r1.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ChronoUnit) ((Map.Entry) obj).getKey();
            }
        }).findFirst().orElseThrow(new Supplier() { // from class: com.github.catvod.spider.merge.r1.i
            @Override // java.util.function.Supplier
            public final Object get() {
                return new com.github.catvod.spider.merge.p1.i(C1290c.a("Unable to parse the date: ", str));
            }
        }));
    }
}
