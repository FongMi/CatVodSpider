package com.github.catvod.spider.merge.r1;

import com.github.catvod.spider.merge.I.t0;
import java.io.Serializable;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b implements Serializable {
    private final Instant b;
    private final boolean c;

    public b(Instant instant, boolean z) {
        this.b = instant;
        this.c = z;
    }

    public static b a(String str) throws com.github.catvod.spider.merge.p1.i {
        if (str == null) {
            return null;
        }
        try {
            return new b(Instant.parse(str), false);
        } catch (DateTimeParseException e) {
            throw new com.github.catvod.spider.merge.p1.i(t0.a("Could not parse date: \"", str, "\""), e);
        }
    }

    public static b b(String str) throws com.github.catvod.spider.merge.p1.i {
        if (str == null) {
            return null;
        }
        try {
            return new b(OffsetDateTime.parse(str).toInstant(), false);
        } catch (DateTimeParseException e) {
            throw new com.github.catvod.spider.merge.p1.i(t0.a("Could not parse date: \"", str, "\""), e);
        }
    }

    public final String toString() {
        return "DateWrapper{instant=" + this.b + ", isApproximation=" + this.c + "}";
    }
}
