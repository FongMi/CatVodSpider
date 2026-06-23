package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1416e;
import java.lang.reflect.Type;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class N implements X, InterfaceC0621w, com.github.catvod.spider.merge.C.w {
    public static final N a = new N();
    private static final DateTimeFormatter b = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter c = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter d = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter e = DateTimeFormat.forPattern("yyyy年M月d日 HH:mm:ss");
    private static final DateTimeFormatter f = DateTimeFormat.forPattern("yyyy年M月d日 H时m分s秒");
    private static final DateTimeFormatter g = DateTimeFormat.forPattern("yyyy년M월d일 HH:mm:ss");
    private static final DateTimeFormatter h = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter i = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter j = DateTimeFormat.forPattern("dd.MM.yyyy HH:mm:ss");
    private static final DateTimeFormatter k = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");
    private static final DateTimeFormatter l = DateTimeFormat.forPattern("yyyyMMdd");
    private static final DateTimeFormatter m = DateTimeFormat.forPattern("yyyy/MM/dd");
    private static final DateTimeFormatter n = DateTimeFormat.forPattern("yyyy年M月d日");
    private static final DateTimeFormatter o = DateTimeFormat.forPattern("yyyy년M월d일");
    private static final DateTimeFormatter p = DateTimeFormat.forPattern("MM/dd/yyyy");
    private static final DateTimeFormatter q = DateTimeFormat.forPattern("dd/MM/yyyy");
    private static final DateTimeFormatter r = DateTimeFormat.forPattern("dd.MM.yyyy");
    private static final DateTimeFormatter s = DateTimeFormat.forPattern("dd-MM-yyyy");
    private static final DateTimeFormatter t = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZone(DateTimeZone.getDefault());
    private static final DateTimeFormatter u = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");

    private void j(h0 h0Var, ReadablePartial readablePartial, String str) {
        h0Var.v((str.equals("yyyy-MM-dd'T'HH:mm:ss") ? u : DateTimeFormat.forPattern(str)).print(readablePartial));
    }

    @Override // com.github.catvod.spider.merge.D.InterfaceC0621w
    public final void b(L l2, Object obj, C0610k c0610k) {
        j(l2.j, (ReadablePartial) obj, c0610k.b());
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        return (T) f(bVar, type, obj, null, 0);
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l2, Object obj, Object obj2, Type type, int i2) {
        h0 h0Var = l2.j;
        if (obj == null) {
            h0Var.s();
            return;
        }
        if (type == null) {
            type = obj.getClass();
        }
        if (type != LocalDateTime.class) {
            h0Var.v(obj.toString());
            return;
        }
        i0 i0Var = i0.UseISO8601DateFormat;
        int i3 = i0Var.b;
        LocalDateTime localDateTime = (LocalDateTime) obj;
        String strM = l2.m();
        if (strM == null) {
            strM = ((i2 & i3) != 0 || l2.j.g(i0Var)) ? "yyyy-MM-dd'T'HH:mm:ss" : l2.p(i0.WriteDateUseDateFormat) ? AbstractC1412a.f : localDateTime.getMillisOfSecond() == 0 ? "yyyy-MM-dd'T'HH:mm:ss.SSS" : "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS";
        }
        if (strM != null) {
            j(h0Var, localDateTime, strM);
        } else {
            h0Var.r(localDateTime.toDateTime(DateTimeZone.forTimeZone(AbstractC1412a.b)).toInstant().getMillis());
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 4;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [T, org.joda.time.LocalDateTime] */
    public final <T> T f(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj, String str, int i2) {
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        if (dVar.p() == 8) {
            dVar.nextToken();
            return null;
        }
        if (dVar.p() == 4) {
            String strK = dVar.K();
            dVar.nextToken();
            if ("".equals(strK)) {
                return null;
            }
            if (type == LocalDateTime.class) {
                return (strK.length() == 10 || strK.length() == 8) ? (T) h(strK, null).toLocalDateTime(LocalTime.MIDNIGHT) : (T) g(strK, null);
            }
            if (type == LocalDate.class) {
                return strK.length() == 23 ? (T) LocalDateTime.parse(strK).toLocalDate() : (T) h(strK, null);
            }
            if (type == LocalTime.class) {
                return strK.length() == 23 ? (T) LocalDateTime.parse(strK).toLocalTime() : (T) LocalTime.parse(strK);
            }
            if (type == DateTime.class) {
                return (T) i(strK, b == null ? t : null);
            }
            if (type == DateTimeZone.class) {
                return (T) DateTimeZone.forID(strK);
            }
            if (type == Period.class) {
                return (T) Period.parse(strK);
            }
            if (type == Duration.class) {
                return (T) Duration.parse(strK);
            }
            if (type == Instant.class) {
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= strK.length()) {
                        z = true;
                        break;
                    }
                    char cCharAt = strK.charAt(i3);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i3++;
                }
                return (!z || strK.length() <= 8 || strK.length() >= 19) ? (T) Instant.parse(strK) : (T) new Instant(Long.parseLong(strK));
            }
            if (type == DateTimeFormatter.class) {
                return (T) DateTimeFormat.forPattern(strK);
            }
        } else {
            if (dVar.p() == 2) {
                long jH = dVar.h();
                dVar.nextToken();
                TimeZone timeZone = AbstractC1412a.b;
                if (timeZone == null) {
                    timeZone = TimeZone.getDefault();
                }
                if (type == DateTime.class) {
                    return (T) new DateTime(jH, DateTimeZone.forTimeZone(timeZone));
                }
                Object r5 = (T) new LocalDateTime(jH, DateTimeZone.forTimeZone(timeZone));
                if (type == LocalDateTime.class) {
                    return r5;
                }
                if (type == LocalDate.class) {
                    return (T) r5.toLocalDate();
                }
                if (type == LocalTime.class) {
                    return (T) r5.toLocalTime();
                }
                if (type == Instant.class) {
                    return (T) new Instant(jH);
                }
                throw new UnsupportedOperationException();
            }
            if (dVar.p() != 12) {
                throw new UnsupportedOperationException();
            }
            C1416e c1416eS = bVar.s();
            if (type == Instant.class) {
                Object obj2 = c1416eS.get("epochSecond");
                if (obj2 instanceof Number) {
                    return (T) Instant.ofEpochSecond(com.github.catvod.spider.merge.H.A.n0((Number) obj2));
                }
                Object obj3 = c1416eS.get("millis");
                if (obj3 instanceof Number) {
                    return (T) Instant.ofEpochMilli(com.github.catvod.spider.merge.H.A.n0((Number) obj3));
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final org.joda.time.LocalDateTime g(java.lang.String r17, org.joda.time.format.DateTimeFormatter r18) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.N.g(java.lang.String, org.joda.time.format.DateTimeFormatter):org.joda.time.LocalDateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final org.joda.time.LocalDate h(java.lang.String r14, org.joda.time.format.DateTimeFormatter r15) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.N.h(java.lang.String, org.joda.time.format.DateTimeFormatter):org.joda.time.LocalDate");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final org.joda.time.DateTime i(java.lang.String r12, org.joda.time.format.DateTimeFormatter r13) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.N.i(java.lang.String, org.joda.time.format.DateTimeFormatter):org.joda.time.DateTime");
    }
}
