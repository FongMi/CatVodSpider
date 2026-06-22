package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.D.C0610k;
import com.github.catvod.spider.merge.D.InterfaceC0621w;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class s extends g implements X, InterfaceC0621w {
    public static final s a = new s();
    private static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter c = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter e = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm:ss");
    private static final DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年M月d日 H时m分s秒");
    private static final DateTimeFormatter g = DateTimeFormatter.ofPattern("yyyy년M월d일 HH:mm:ss");
    private static final DateTimeFormatter h = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter i = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter j = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static final DateTimeFormatter k = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static final DateTimeFormatter l = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter m = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private static final DateTimeFormatter n = DateTimeFormatter.ofPattern("yyyy年M月d日");
    private static final DateTimeFormatter o = DateTimeFormatter.ofPattern("yyyy년M월d일");
    private static final DateTimeFormatter p = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private static final DateTimeFormatter q = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter r = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter s = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final DateTimeFormatter t = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());
    private static final DateTimeFormatter u = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public static Object g(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        return LocalDateTime.parse(obj.toString(), DateTimeFormatter.ofPattern(str));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.time.ZonedDateTime] */
    private void i(h0 h0Var, TemporalAccessor temporalAccessor, String str) {
        if ("unixtime".equals(str)) {
            if (temporalAccessor instanceof ChronoZonedDateTime) {
                h0Var.q((int) ((ChronoZonedDateTime) temporalAccessor).toEpochSecond());
                return;
            } else if (temporalAccessor instanceof LocalDateTime) {
                h0Var.q((int) ((LocalDateTime) temporalAccessor).atZone(AbstractC1412a.b.toZoneId()).toEpochSecond());
                return;
            }
        }
        if ("millis".equals(str)) {
            Instant instant = null;
            if (temporalAccessor instanceof ChronoZonedDateTime) {
                instant = ((ChronoZonedDateTime) temporalAccessor).toInstant();
            } else if (temporalAccessor instanceof LocalDateTime) {
                instant = ((LocalDateTime) temporalAccessor).atZone(AbstractC1412a.b.toZoneId()).toInstant();
            }
            if (instant != null) {
                h0Var.r(instant.toEpochMilli());
                return;
            }
        }
        h0Var.v((str == "yyyy-MM-dd'T'HH:mm:ss" ? u : DateTimeFormatter.ofPattern(str)).format(temporalAccessor));
    }

    @Override // com.github.catvod.spider.merge.D.InterfaceC0621w
    public final void b(L l2, Object obj, C0610k c0610k) {
        i(l2.j, (TemporalAccessor) obj, c0610k.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.time.ZonedDateTime] */
    @Override // com.github.catvod.spider.merge.D.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.github.catvod.spider.merge.D.L r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, int r7) {
        /*
            r2 = this;
            com.github.catvod.spider.merge.D.h0 r5 = r3.j
            if (r4 != 0) goto L8
            r5.s()
            goto L6d
        L8:
            if (r6 != 0) goto Le
            java.lang.Class r6 = r4.getClass()
        Le:
            java.lang.Class<java.time.LocalDateTime> r0 = java.time.LocalDateTime.class
            if (r6 != r0) goto L66
            com.github.catvod.spider.merge.D.i0 r6 = com.github.catvod.spider.merge.D.i0.UseISO8601DateFormat
            int r0 = r6.b
            java.time.LocalDateTime r4 = (java.time.LocalDateTime) r4
            java.lang.String r1 = r3.m()
            if (r1 != 0) goto L4a
            r7 = r7 & r0
            if (r7 != 0) goto L48
            com.github.catvod.spider.merge.D.h0 r7 = r3.j
            boolean r6 = r7.g(r6)
            if (r6 == 0) goto L2a
            goto L48
        L2a:
            com.github.catvod.spider.merge.D.i0 r6 = com.github.catvod.spider.merge.D.i0.WriteDateUseDateFormat
            boolean r3 = r3.p(r6)
            if (r3 == 0) goto L35
            java.lang.String r1 = com.github.catvod.spider.merge.y.AbstractC1412a.f
            goto L4a
        L35:
            int r3 = r4.getNano()
            if (r3 != 0) goto L3c
            goto L48
        L3c:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 % r6
            if (r3 != 0) goto L45
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            goto L4a
        L45:
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS"
            goto L4a
        L48:
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss"
        L4a:
            if (r1 == 0) goto L50
            r2.i(r5, r4, r1)
            goto L6d
        L50:
            java.util.TimeZone r3 = com.github.catvod.spider.merge.y.AbstractC1412a.b
            java.time.ZoneId r3 = r3.toZoneId()
            java.time.ZonedDateTime r3 = r4.atZone(r3)
            java.time.Instant r3 = r3.toInstant()
            long r3 = r3.toEpochMilli()
            r5.r(r3)
            goto L6d
        L66:
            java.lang.String r3 = r4.toString()
            r5.v(r3)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.s.d(com.github.catvod.spider.merge.D.L, java.lang.Object, java.lang.Object, java.lang.reflect.Type, int):void");
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    @Override // com.github.catvod.spider.merge.C.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T f(com.github.catvod.spider.merge.B.b r18, java.lang.reflect.Type r19, java.lang.Object r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.s.f(com.github.catvod.spider.merge.B.b, java.lang.reflect.Type, java.lang.Object, java.lang.String, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.time.LocalDate h(java.lang.String r14, java.time.format.DateTimeFormatter r15) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.s.h(java.lang.String, java.time.format.DateTimeFormatter):java.time.LocalDate");
    }
}
