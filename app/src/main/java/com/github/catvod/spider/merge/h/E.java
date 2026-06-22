package com.github.catvod.spider.merge.H;

import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class E extends TimeZone {
    public final int a;
    public final String b;

    public E(int i, int i2, boolean z) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + " hours out of range");
        }
        if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + " minutes out of range");
        }
        int i3 = ((i * 60) + i2) * 60000;
        this.a = z ? -i3 : i3;
        StringBuilder sb = new StringBuilder(9);
        sb.append("GMT");
        sb.append(z ? '-' : '+');
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        sb.append(':');
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
        this.b = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return this.b == ((E) obj).b;
        }
        return false;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return this.b;
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.a;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return "[GmtTimeZone id=\"" + this.b + "\",offset=" + this.a + ']';
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
